package kyk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements qji.a, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KycDetailsNationalityContract$InputData f190937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseFlow f190938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f190939c;
    public final f d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f190940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f190941h;

    public f(v vVar, BaseFlow baseFlow, KycDetailsNationalityContract$InputData kycDetailsNationalityContract$InputData) {
        this.f190939c = vVar;
        this.f190937a = kycDetailsNationalityContract$InputData;
        this.f190938b = baseFlow;
        int i = 13;
        this.e = e4m.b.b(new kr9.m(vVar, this, 0, i));
        this.f = e4m.b.b(new kr9.m(vVar, this, 1, i));
        this.f190940g = e4m.b.b(new kr9.m(vVar, this, 3, i));
        this.f190941h = e4m.b.b(new kr9.m(vVar, this, 2, i));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f190939c, this.d, 4);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
