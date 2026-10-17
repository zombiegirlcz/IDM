package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements xki.c, un6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JapanEasyBankTransferFlowContract$InputData f305165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f305167c = this;
    public final e4m.e d;

    public y(t tVar, JapanEasyBankTransferFlowContract$InputData japanEasyBankTransferFlowContract$InputData) {
        this.f305166b = tVar;
        this.f305165a = japanEasyBankTransferFlowContract$InputData;
        this.d = e4m.b.b(new whc.d(tVar, this, 25));
    }

    @Override // un6.a
    public final u0 b() {
        return new u0(this.f305166b, this.f305167c, 1);
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
