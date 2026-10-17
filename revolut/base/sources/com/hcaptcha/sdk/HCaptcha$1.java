package com.hcaptcha.sdk;

import ag.q;
import ii.h;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
class HCaptcha$1 extends HCaptchaStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f49844a;

    public HCaptcha$1(a aVar) {
        this.f49844a = aVar;
    }

    @Override // com.hcaptcha.sdk.HCaptchaStateListener
    public final void a(HCaptchaException hCaptchaException) {
        a aVar = this.f49844a;
        aVar.f49852b = hCaptchaException;
        aVar.b();
    }

    @Override // com.hcaptcha.sdk.HCaptchaStateListener
    public final void b() {
        Iterator it8 = this.f49844a.e.iterator();
        while (it8.hasNext()) {
            ((ji.b) it8.next()).y();
        }
    }

    @Override // com.hcaptcha.sdk.HCaptchaStateListener
    public final void c(String str) {
        a aVar = this.f49844a;
        aVar.f.postDelayed(new q(aVar, 22), TimeUnit.SECONDS.toMillis(aVar.i.getTokenExpiration()));
        aVar.f49851a = new h(str, 0);
        aVar.b();
    }
}
