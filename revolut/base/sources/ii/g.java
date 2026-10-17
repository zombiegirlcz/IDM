package ii;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaError;
import java.io.Serializable;
import k9.n;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Handler f161497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient k f161499c;

    public g(Handler handler, HCaptchaConfig hCaptchaConfig, k kVar) {
        String strC;
        this.f161497a = handler;
        this.f161499c = kVar;
        try {
            strC = new n().c(hCaptchaConfig);
        } catch (JsonProcessingException unused) {
            strC = null;
        }
        this.f161498b = strC;
    }

    @JavascriptInterface
    public String getConfig() {
        return this.f161498b;
    }

    @JavascriptInterface
    public void onError(int i) {
        this.f161497a.post(new d0.c(this, HCaptchaError.fromId(i), 22));
    }

    @JavascriptInterface
    public void onLoaded() {
        this.f161497a.post(new f(this.f161499c, 1));
    }

    @JavascriptInterface
    public void onOpen() {
        this.f161497a.post(new f(this.f161499c, 0));
    }

    @JavascriptInterface
    public void onPass(String str) {
        this.f161497a.post(new d0.c(this, str, 21));
    }
}
