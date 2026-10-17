package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements qji.a, kk7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceFlowContract$InputData f216720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f216722c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public r(q qVar, CFACInsuranceFlowContract$InputData cFACInsuranceFlowContract$InputData) {
        this.f216721b = qVar;
        this.f216720a = cFACInsuranceFlowContract$InputData;
        int i = 3;
        this.d = e4m.b.b(new e(this, 0, i));
        this.e = e4m.b.b(new e(this, 2, i));
        this.f = e4m.b.b(new e(this, 1, i));
    }

    @Override // kk7.a
    public final x b() {
        return new x(this.f216721b, this.f216722c, 1);
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
