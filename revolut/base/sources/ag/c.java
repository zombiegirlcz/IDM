package ag;

import android.widget.ImageView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ix0.d2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.cbeff.ISO781611;
import org.json.JSONException;
import org.json.JSONObject;
import skm.a2;
import skm.e0;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4676c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f4677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4678h;

    public c(HttpURLConnection httpURLConnection, m mVar, e eVar, LinkedHashSet linkedHashSet, r rVar, ScheduledExecutorService scheduledExecutorService) {
        this.f4676c = httpURLConnection;
        this.d = mVar;
        this.e = eVar;
        this.f4675b = linkedHashSet;
        this.f = rVar;
        this.f4677g = scheduledExecutorService;
        this.f4678h = new Random();
        this.f4674a = false;
    }

    @Override // ix0.d2
    public void D(boolean z) {
        a2 a2Var = (a2) this.f4677g;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f4677g = null;
        if (this.f4674a || !z) {
            return;
        }
        this.f4677g = e0.C((CoroutineScope) this.f4675b, null, null, new av7.l((az0.u) this.f4678h, this, continuation, 6), 3);
    }

    public void a(int i, long j2) {
        if (i == 0) {
            new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.");
            d();
        } else {
            ((ScheduledExecutorService) this.f4677g).schedule(new b(this, i, j2), ((Random) this.f4678h).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public void b(InputStream inputStream) throws IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strR = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strR = a0.d.r(strR, line);
            if (line.contains("}")) {
                int iIndexOf = strR.indexOf(123);
                int iLastIndexOf = strR.lastIndexOf(ISO781611.SMT_TAG);
                strR = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strR.substring(iIndexOf, iLastIndexOf + 1);
                if (!strR.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strR);
                    } catch (JSONException e) {
                        new FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause());
                        d();
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        r rVar = (r) this.f;
                        new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.");
                        rVar.a();
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.f4675b).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long jG = ((m) this.d).f4709h.g();
                        long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j2 > jG) {
                            a(3, j2);
                        }
                    }
                    strR = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f4676c;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                if (!this.f4674a) {
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th10) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
            throw th10;
        }
    }

    public synchronized void d() {
        Iterator it8 = ((LinkedHashSet) this.f4675b).iterator();
        while (it8.hasNext()) {
            ((r) it8.next()).a();
        }
    }

    public void e(boolean z) {
        this.f4674a = z;
    }

    public c(az0.u uVar, CoroutineScope scope, ImageView view, Function1 function1, Function0 function0, Image image) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f4678h = uVar;
        this.f4675b = scope;
        this.f4676c = view;
        this.d = function1;
        this.e = function0;
        this.f = image;
    }
}
