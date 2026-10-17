package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements xki.c, yn6.a, sn6.a, wn6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EasyBankTransferFlowContract$InputData f305040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f305042c = this;
    public final e4m.e d;

    public s(t tVar, EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData) {
        this.f305041b = tVar;
        this.f305040a = easyBankTransferFlowContract$InputData;
        this.d = e4m.b.b(new whc.d(tVar, this, 23));
    }

    @Override // wn6.a
    public final w0 b() {
        return new w0(this.f305041b, this.f305042c, 2);
    }

    @Override // yn6.a
    public final y0 c() {
        return new y0(this.f305041b, this.f305042c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // sn6.a
    public final s0 s() {
        return new s0(this.f305041b, this.f305042c, 0);
    }
}
