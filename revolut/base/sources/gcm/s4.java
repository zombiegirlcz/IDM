package gcm;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class s4 implements ecm.a2 {
    public static final Logger d = Logger.getLogger(s4.class.getName());
    public static final r4 e = new r4();
    public static final l1 f = new l1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f142867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4 f142868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f142869c;

    public s4() {
        String str = System.getenv("GRPC_PROXY_EXP");
        this.f142867a = (Supplier) Preconditions.checkNotNull(f);
        this.f142868b = (r4) Preconditions.checkNotNull(e);
        if (str == null) {
            this.f142869c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f142869c = new InetSocketAddress(strArrSplit[0], i);
    }

    @Override // ecm.a2
    public final ecm.z1 a(SocketAddress socketAddress) {
        URL url2;
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = this.f142869c;
            if (inetSocketAddress != null) {
                int i = ecm.f0.e;
                twg.c cVar = new twg.c();
                cVar.R(inetSocketAddress);
                cVar.T((InetSocketAddress) socketAddress);
                return cVar.g();
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) socketAddress;
            Logger logger = d;
            try {
                URI uri2 = new URI("https", null, inetSocketAddress2.getHostString(), inetSocketAddress2.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.f142867a.get();
                if (proxySelector == null) {
                    logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri2);
                if (listSelect.size() > 1) {
                    logger.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() != Proxy.Type.DIRECT) {
                    InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                    String hostString = inetSocketAddress3.getHostString();
                    InetAddress address = inetSocketAddress3.getAddress();
                    int port = inetSocketAddress3.getPort();
                    this.f142868b.getClass();
                    try {
                        url2 = new URL("https", hostString, port, "");
                    } catch (MalformedURLException unused) {
                        logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", hostString});
                        url2 = null;
                    }
                    PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostString, address, port, "https", "", null, url2, Authenticator.RequestorType.PROXY);
                    if (inetSocketAddress3.isUnresolved()) {
                        inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                    }
                    int i2 = ecm.f0.e;
                    twg.c cVar2 = new twg.c();
                    cVar2.T(inetSocketAddress2);
                    cVar2.R(inetSocketAddress3);
                    if (passwordAuthenticationRequestPasswordAuthentication == null) {
                        return cVar2.g();
                    }
                    cVar2.U(passwordAuthenticationRequestPasswordAuthentication.getUserName());
                    cVar2.Q(passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                    return cVar2.g();
                }
            } catch (URISyntaxException e2) {
                logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                return null;
            }
        }
        return null;
    }
}
