package ulm;

import ch.qos.logback.core.CoreConstants;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f281138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f281139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f281140c;

    public t1(a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f281138a = address;
        this.f281139b = proxy;
        this.f281140c = socketAddress;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(t1Var.f281138a, this.f281138a) && Intrinsics.f(t1Var.f281139b, this.f281139b) && Intrinsics.f(t1Var.f281140c, this.f281140c);
    }

    public final int hashCode() {
        return this.f281140c.hashCode() + ((this.f281139b.hashCode() + ((this.f281138a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb6 = new StringBuilder();
        x0 x0Var = this.f281138a.f281058h;
        String str = x0Var.d;
        InetSocketAddress inetSocketAddress = this.f281140c;
        InetAddress address = inetSocketAddress.getAddress();
        String strC = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : vlm.g.c(hostAddress);
        if (kotlin.text.d0.K(str, CoreConstants.COLON_CHAR)) {
            a0.d.C(sb6, "[", str, "]");
        } else {
            sb6.append(str);
        }
        if (x0Var.e != inetSocketAddress.getPort() || str.equals(strC)) {
            sb6.append(":");
            sb6.append(x0Var.e);
        }
        if (!str.equals(strC)) {
            if (this.f281139b.equals(Proxy.NO_PROXY)) {
                sb6.append(" at ");
            } else {
                sb6.append(" via proxy ");
            }
            if (strC == null) {
                sb6.append("<unresolved>");
            } else if (kotlin.text.d0.K(strC, CoreConstants.COLON_CHAR)) {
                a0.d.C(sb6, "[", strC, "]");
            } else {
                sb6.append(strC);
            }
            sb6.append(":");
            sb6.append(inetSocketAddress.getPort());
        }
        return sb6.toString();
    }
}
