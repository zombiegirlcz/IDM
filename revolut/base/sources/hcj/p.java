package hcj;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.address_list.ReturnCryptoDepositAddressListScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r10.w;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends oki.h implements l {
    public final w o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReturnCryptoDepositAddressListScreenContract$InputData f150918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f150919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f150920r;

    public p(r mapper, w interactor, ReturnCryptoDepositAddressListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f150918p = inputData;
        this.f150919q = new vii.b();
        this.f150920r = mra.d.b(this, new f(new Data(null, null, true, 3, null), inputData.f100124a), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f150919q, new o(continuation, this, 0)), null, new hba.k(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f150920r;
    }
}
