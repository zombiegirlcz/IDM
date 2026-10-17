package yjk;

import ffk.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg6.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cha.b f314537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f314538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zfk.c f314539n;

    public c(cha.b familyPlansInteractor, t pricingPlanInteractor, zfk.c planSubscriberExtension) {
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planSubscriberExtension, "planSubscriberExtension");
        this.f314537l = familyPlansInteractor;
        this.f314538m = pricingPlanInteractor;
        this.f314539n = planSubscriberExtension;
    }

    @Override // yjk.a
    public final void Z2(Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        V2(new v(this, onSuccess, null, 4), new yi5.b(29));
    }
}
