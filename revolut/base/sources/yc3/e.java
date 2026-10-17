package yc3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreenContract$InputData;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashbackWithdrawMetalScreenContract$InputData f312478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f312479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f312480c;
    public final e4m.e d;

    public e(a aVar, h hVar, CashbackWithdrawMetalScreenContract$InputData cashbackWithdrawMetalScreenContract$InputData) {
        this.f312479b = aVar;
        this.f312478a = cashbackWithdrawMetalScreenContract$InputData;
        this.f312480c = e4m.b.b(new q(aVar, this, 1, 18));
        this.d = e4m.b.b(new q(aVar, this, 0, 18));
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
