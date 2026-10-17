package p2k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferFlowInputData f232371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f232372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f232373c;

    public j(n nVar, BankTransferFlowInputData bankTransferFlowInputData, od0.i iVar) {
        this.f232371a = bankTransferFlowInputData;
        this.f232372b = iVar;
        this.f232373c = e4m.b.b(new c(nVar, this, 1));
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
