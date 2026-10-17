package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements xki.c, ko6.a, io6.a, go6.a, wn6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrossBorderEasyBankTransferFlowContract$InputData f304993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f304995c = this;
    public final e4m.e d;

    public q(t tVar, CrossBorderEasyBankTransferFlowContract$InputData crossBorderEasyBankTransferFlowContract$InputData) {
        this.f304994b = tVar;
        this.f304993a = crossBorderEasyBankTransferFlowContract$InputData;
        this.d = e4m.b.b(new whc.d(tVar, this, 21));
    }

    @Override // wn6.a
    public final w0 b() {
        return new w0(this.f304994b, this.f304995c, 1);
    }

    @Override // ko6.a
    public final j1 c() {
        return new j1(this.f304994b, this.f304995c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // go6.a
    public final f1 j() {
        return new f1(this.f304994b, this.f304995c, 1);
    }

    @Override // io6.a
    public final h1 q() {
        return new h1(this.f304994b, this.f304995c, 1);
    }
}
