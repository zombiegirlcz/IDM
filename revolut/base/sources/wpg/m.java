package wpg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements xki.c, xbb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WithdrawMoneyFlowContract$InputData f299294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f299295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f299296c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public m(l lVar, WithdrawMoneyFlowContract$InputData withdrawMoneyFlowContract$InputData) {
        this.f299295b = lVar;
        this.f299294a = withdrawMoneyFlowContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new whc.t(lVar, this, 0, i));
        this.e = e4m.b.b(new whc.t(lVar, this, 1, i));
        this.f = e4m.b.b(new whc.t(lVar, this, 2, i));
    }

    @Override // xbb.a
    public final r6e.i b() {
        return new r6e.i(this.f299295b, this.f299296c, 3);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
