package g1m;

import android.net.Uri;
import android.os.Build;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import ulm.a1;
import ulm.b1;
import ulm.e0;

/* JADX INFO: loaded from: classes23.dex */
public final class i implements e {

    @NotNull
    public static final g Companion = new g();
    public static final String i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139741a = i.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f139742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f139743c;
    public final int d;
    public boolean e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OkHttpClient f139744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri.Builder f139745h;

    static {
        String str = String.format("snowplow/%s android/%s", Arrays.copyOf(new Object[]{"andr-6.2.0", Build.VERSION.RELEASE}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        i = str;
    }

    public i(h hVar) {
        int iHashCode;
        b1.Companion.getClass();
        this.f139742b = a1.b("application/json; charset=utf-8");
        String str = hVar.f139735a;
        Uri uri2 = Uri.parse(str);
        if (uri2.getScheme() == null) {
            str = "https://" + str;
        } else {
            String scheme = uri2.getScheme();
            if (scheme == null || ((iHashCode = scheme.hashCode()) == 3213448 ? !scheme.equals("http") : !(iHashCode == 99617003 && scheme.equals("https")))) {
                str = "https://" + str;
            }
        }
        d dVar = hVar.f139737c;
        this.f139743c = dVar;
        this.d = hVar.e;
        String str2 = hVar.f139739h;
        this.e = hVar.i;
        this.f = hVar.f139740j;
        bem.c cVar = new bem.c(hVar.d);
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        Intrinsics.checkNotNullExpressionValue(builderBuildUpon, "parse(networkUri).buildUpon()");
        this.f139745h = builderBuildUpon;
        if (dVar == d.GET) {
            builderBuildUpon.appendPath("i");
        } else if (str2 == null) {
            builderBuildUpon.appendEncodedPath("com.snowplowanalytics.snowplow/tp2");
        } else {
            builderBuildUpon.appendEncodedPath(str2);
        }
        OkHttpClient okHttpClient = hVar.f;
        if (okHttpClient == null) {
            OkHttpClient.a aVar = new OkHttpClient.a();
            SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) cVar.f14878c;
            if (sSLSocketFactory == null) {
                Intrinsics.r("sslSocketFactory");
                throw null;
            }
            X509TrustManager x509TrustManager = (X509TrustManager) cVar.f14877b;
            if (x509TrustManager == null) {
                Intrinsics.r("trustManager");
                throw null;
            }
            aVar.g(sSLSocketFactory, x509TrustManager);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.d(15L, timeUnit);
            aVar.f(15L, timeUnit);
            e0 cookieJar = hVar.f139738g;
            cookieJar = cookieJar == null ? new c(hVar.f139736b) : cookieJar;
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            aVar.k = cookieJar;
            okHttpClient = new OkHttpClient(aVar);
        }
        this.f139744g = okHttpClient;
    }
}
