package gu2;

import gmk.j;
import gs2.t;
import kotlin.jvm.internal.Intrinsics;
import ku2.h;
import ofm.i;
import skm.p0;
import te0.w;
import zkm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends fsi.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hu2.a f146684h;
    public final h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hu2.a captchaAvailabilityProvider, h captchaResolver) {
        super(new fsi.b("CAPTCHA_VIEW_DELEGATE_ID"));
        Intrinsics.checkNotNullParameter(captchaAvailabilityProvider, "captchaAvailabilityProvider");
        Intrinsics.checkNotNullParameter(captchaResolver, "captchaResolver");
        this.f146684h = captchaAvailabilityProvider;
        this.i = captchaResolver;
    }

    @Override // fsi.a
    public final void u() {
        p0 p0Var = p0.f264001a;
        ufm.b bVarO0 = w.o0(o.f323119a, new a(this, null, 0));
        i iVar = new i(new gqk.b(new j(this, 19), 19), new gqk.b(new t(9), 20), 0);
        bVarO0.q(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        this.f137706c.a(iVar);
    }
}
