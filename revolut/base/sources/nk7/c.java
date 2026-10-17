package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimDetailsScreenContract$InputData f216667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216669c;
    public final e4m.e d;

    public c(q qVar, r rVar, CFACClaimDetailsScreenContract$InputData cFACClaimDetailsScreenContract$InputData) {
        this.f216668b = qVar;
        this.f216667a = cFACClaimDetailsScreenContract$InputData;
        int i = 28;
        this.f216669c = e4m.b.b(new ms1.s(qVar, this, 1, i));
        this.d = e4m.b.b(new ms1.s(qVar, this, 0, i));
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
