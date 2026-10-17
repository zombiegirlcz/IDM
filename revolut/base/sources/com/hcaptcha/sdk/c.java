package com.hcaptcha.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.revolut.revolut.feature_fourthline_impl.R;
import ii.e;
import ii.k;
import r10.q;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HCaptcha$1 f49857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f49858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f49859c;
    public boolean d;
    public boolean e;

    public c(Activity activity, HCaptchaConfig hCaptchaConfig, e eVar, HCaptcha$1 hCaptcha$1) {
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        if (eVar == null) {
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        this.f49857a = hCaptcha$1;
        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(activity);
        hCaptchaWebView.setId(R.id.webView);
        hCaptchaWebView.setVisibility(8);
        if (hCaptchaWebView.getParent() == null) {
            ((ViewGroup) activity.getWindow().getDecorView().getRootView()).addView(hCaptchaWebView);
        }
        this.f49858b = new q(new Handler(Looper.getMainLooper()), activity, hCaptchaConfig, eVar, this, hCaptchaWebView);
    }

    @Override // ji.a
    public final void a(HCaptchaException hCaptchaException) {
        if (hCaptchaException == null) {
            throw new NullPointerException("exception is marked non-null but is null");
        }
        q qVar = this.f49858b;
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) qVar.f250849b;
        ((ii.a) hCaptchaConfig.getRetryPredicate()).getClass();
        if (HCaptchaConfig.lambda$$default$retryPredicate$41a513e9$1(hCaptchaConfig, hCaptchaException)) {
            ((HCaptchaWebView) qVar.d).loadUrl("javascript:resetAndExecute();");
        } else {
            this.f49857a.a(hCaptchaException);
        }
    }

    @Override // ji.c
    public final void onSuccess(Object obj2) {
        this.f49857a.c((String) obj2);
    }

    @Override // ii.k
    public final void w() {
        this.f49859c = true;
        boolean z = this.e;
        q qVar = this.f49858b;
        if (!z) {
            if (this.d) {
                this.d = false;
                ((HCaptchaWebView) qVar.d).loadUrl("javascript:resetAndExecute();");
                return;
            }
            return;
        }
        this.e = false;
        HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) qVar.d;
        if (hCaptchaWebView.getParent() != null) {
            hCaptchaWebView.loadUrl("javascript:reset();");
        }
        HCaptchaWebView hCaptchaWebView2 = (HCaptchaWebView) qVar.d;
        if (hCaptchaWebView2.getParent() != null) {
            ((ViewGroup) hCaptchaWebView2.getParent()).removeView(hCaptchaWebView2);
        }
    }

    @Override // ii.k
    public final void x(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        if (this.f49859c) {
            ((HCaptchaWebView) this.f49858b.d).loadUrl("javascript:resetAndExecute();");
        } else {
            this.d = true;
        }
    }

    @Override // ji.b
    public final void y() {
        this.f49857a.b();
    }
}
