package com.hcaptcha.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.fragment.app.FragmentActivity;
import ii.e;
import ii.h;
import ii.k;
import java.util.ArrayList;
import java.util.Iterator;
import qk.d;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Activity f49854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f49855h;
    public HCaptchaConfig i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f49856j;
    public final Handler f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f49853c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f49851a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HCaptchaException f49852b = null;

    public a(Activity activity, e eVar) {
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        this.f49854g = activity;
        this.f49856j = eVar;
    }

    public final void a(HCaptchaConfig hCaptchaConfig) {
        d.f246926a = hCaptchaConfig.getDiagnosticLog().booleanValue();
        HCaptcha$1 hCaptcha$1 = new HCaptcha$1(this);
        try {
            boolean zEquals = Boolean.TRUE.equals(hCaptchaConfig.getHideDialog());
            e eVar = this.f49856j;
            Activity activity = this.f49854g;
            if (!zEquals) {
                if (!(activity instanceof FragmentActivity)) {
                    throw new IllegalStateException("Visual hCaptcha challenge verification requires FragmentActivity.");
                }
                this.f49855h = HCaptchaDialogFragment.A(hCaptchaConfig, eVar, hCaptcha$1);
                this.i = hCaptchaConfig;
                return;
            }
            ii.b builder = hCaptchaConfig.toBuilder();
            builder.f161483r = HCaptchaSize.INVISIBLE;
            builder.f161482q = true;
            builder.e = Boolean.FALSE;
            builder.d = true;
            HCaptchaConfig hCaptchaConfigA = builder.a();
            this.i = hCaptchaConfigA;
            this.f49855h = new c(activity, hCaptchaConfigA, eVar, hCaptcha$1);
        } catch (AndroidRuntimeException unused) {
            hCaptcha$1.a(new HCaptchaException(HCaptchaError.ERROR, null));
        }
    }

    public final void b() {
        boolean z = false;
        if (this.f49851a != null) {
            Iterator it8 = this.f49853c.iterator();
            while (it8.hasNext()) {
                ((ji.c) it8.next()).onSuccess(this.f49851a);
                z = true;
            }
        }
        if (this.f49852b != null) {
            Iterator it9 = this.d.iterator();
            while (it9.hasNext()) {
                ((ji.a) it9.next()).a(this.f49852b);
                z = true;
            }
        }
        if (z) {
            this.f49851a = null;
            this.f49852b = null;
        }
    }
}
