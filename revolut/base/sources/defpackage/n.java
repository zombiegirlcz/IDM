package defpackage;

import a0.d;
import android.content.Context;
import ch.qos.logback.classic.Level;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onfido.api.client.q;
import com.youTransactor.uCube.mdm.TerminalIdType;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;

/* JADX INFO: loaded from: classes15.dex */
public final class n {
    public static final n e;
    public static final char[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TerminalIdType f210814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f210815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f210816c;
    public boolean d;

    static {
        n nVar = new n();
        nVar.f210814a = TerminalIdType.C3;
        nVar.f210815b = "mdm-dev.youtransactor.com";
        e = nVar;
        f = new char[]{'g', 'm', 'x', 's', 'a', 's'};
    }

    public final HttpURLConnection a(String str, String str2, String str3) throws ProtocolException {
        StringBuilder sb6 = new StringBuilder("https://");
        sb6.append(str);
        URL url2 = new URL(d.u(sb6, this.f210815b, "/MDM/jaxrs", str2));
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection()));
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f210816c);
        }
        httpURLConnection.setRequestMethod(str3);
        httpURLConnection.setConnectTimeout(Level.INFO_INT);
        httpURLConnection.setReadTimeout(30000);
        v1.a("init request: " + url2.toString() + " (" + str3 + ")");
        return httpURLConnection;
    }

    public final void b(Context context) {
        KeyStore keyStore;
        try {
            this.f210816c = new q(1);
            File fileStreamPath = context.getFileStreamPath("keystore_client.jks");
            boolean zExists = fileStreamPath.exists();
            char[] cArr = f;
            if (zExists) {
                keyStore = KeyStore.getInstance("PKCS12");
                keyStore.load(new FileInputStream(fileStreamPath), cArr);
            } else {
                keyStore = null;
            }
            boolean z = (keyStore == null || keyStore.getKey("MDM-client", cArr) == null) ? false : true;
            this.d = z;
            if (z) {
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("X509");
                keyManagerFactory.init(keyStore, cArr);
                this.f210816c = new q(keyManagerFactory);
            }
        } catch (Exception e2) {
            v1.b("load keystore error", e2);
        }
    }
}
