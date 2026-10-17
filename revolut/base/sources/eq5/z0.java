package eq5;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends gim.i implements Function1 {
    public Object A;
    public Serializable B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f128358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f128359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f128360y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, Pair pair, Continuation continuation, wk5.a aVar, xi0.b bVar) {
        super(1, continuation);
        this.f128360y = jVar;
        this.B = bVar;
        this.C = aVar;
        this.A = pair;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f128360y;
                xi0.b bVar = (xi0.b) this.B;
                return new z0(jVar, (Pair) this.A, continuation, (wk5.a) this.C, bVar);
            case 1:
                return new z0((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c) this.f128358w, (f5j.a) this.f128359x, (TransferTrustData) this.f128360y, (r4k.m) this.z, (BankTransferData) this.A, (gim.i) this.B, (AccountId) this.C, continuation);
            default:
                return new z0((com.revolut.trading.orders.ui.invest.placement.target_price.b) this.C, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x030a A[EXC_TOP_SPLITTER, PHI: r0 r2 r3
      0x030a: PHI (r0v4 kotlin.Pair) = (r0v2 kotlin.Pair), (r0v9 kotlin.Pair) binds: [B:94:0x0307, B:80:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r2v2 com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) = 
      (r2v1 com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j)
      (r2v8 com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j)
     binds: [B:94:0x0307, B:80:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r3v3 hlm.a) = (r3v2 hlm.a), (r3v5 hlm.a) binds: [B:94:0x0307, B:80:0x0273] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Type inference failed for: r10v6, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c cVar, f5j.a aVar, TransferTrustData transferTrustData, r4k.m mVar, BankTransferData bankTransferData, Function1 function1, AccountId accountId, Continuation continuation) {
        super(1, continuation);
        this.f128358w = cVar;
        this.f128359x = aVar;
        this.f128360y = transferTrustData;
        this.z = mVar;
        this.A = bankTransferData;
        this.B = (gim.i) function1;
        this.C = accountId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.revolut.trading.orders.ui.invest.placement.target_price.b bVar, Continuation continuation) {
        super(1, continuation);
        this.C = bVar;
    }
}
