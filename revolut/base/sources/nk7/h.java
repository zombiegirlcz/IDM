package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimsListScreenContract$InputData f216682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f216683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216684c;

    public h(q qVar, r rVar, CFACClaimsListScreenContract$InputData cFACClaimsListScreenContract$InputData) {
        this.f216682a = cFACClaimsListScreenContract$InputData;
        int i = 29;
        this.f216683b = e4m.b.b(new ms1.s(qVar, this, 1, i));
        this.f216684c = e4m.b.b(new ms1.s(qVar, this, 0, i));
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
