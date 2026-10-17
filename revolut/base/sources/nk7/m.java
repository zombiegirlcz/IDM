package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceDetailsScreenContract$InputData f216696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f216697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216698c;

    public m(q qVar, r rVar, CFACInsuranceDetailsScreenContract$InputData cFACInsuranceDetailsScreenContract$InputData) {
        this.f216696a = cFACInsuranceDetailsScreenContract$InputData;
        int i = 1;
        this.f216697b = e4m.b.b(new k(qVar, this, 1, i));
        this.f216698c = e4m.b.b(new k(qVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
