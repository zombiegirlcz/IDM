package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceDocumentsScreenContract$InputData f216699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f216700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216701c;

    public n(q qVar, r rVar, CFACInsuranceDocumentsScreenContract$InputData cFACInsuranceDocumentsScreenContract$InputData) {
        this.f216699a = cFACInsuranceDocumentsScreenContract$InputData;
        int i = 2;
        this.f216700b = e4m.b.b(new k(qVar, this, 1, i));
        this.f216701c = e4m.b.b(new k(qVar, this, 0, i));
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
