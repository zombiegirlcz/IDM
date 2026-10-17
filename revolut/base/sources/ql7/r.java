package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClaimsDetailsScreenContract$InputData f247443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247445c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247447h;
    public final e4m.e i;

    public r(k0 k0Var, s sVar, BaseScreen baseScreen, ClaimsDetailsScreenContract$InputData claimsDetailsScreenContract$InputData) {
        this.f247443a = claimsDetailsScreenContract$InputData;
        this.f247444b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 4;
        this.f247445c = e4m.b.b(new l(k0Var, this, 3, i));
        this.d = e4m.b.b(new l(k0Var, this, 2, i));
        this.e = e4m.b.b(new l(k0Var, this, 1, i));
        this.f = e4m.b.b(new l(k0Var, this, 0, i));
        this.f247446g = e4m.b.b(new l(k0Var, this, 4, i));
        this.f247447h = e4m.b.b(new l(k0Var, this, 6, i));
        this.i = e4m.b.b(new l(k0Var, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f247446g.get());
    }
}
