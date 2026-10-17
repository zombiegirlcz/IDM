package n4k;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import r4k.m;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ m A;
    public final /* synthetic */ BankTransferData B;
    public final /* synthetic */ i C;
    public final /* synthetic */ AccountId D;
    public boolean u;
    public a5k.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f212464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c f212465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f5j.a f212466y;
    public final /* synthetic */ TransferTrustData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c cVar, f5j.a aVar, TransferTrustData transferTrustData, m mVar, BankTransferData bankTransferData, Function1 function1, AccountId accountId, Continuation continuation) {
        super(1, continuation);
        this.f212465x = cVar;
        this.f212466y = aVar;
        this.z = transferTrustData;
        this.A = mVar;
        this.B = bankTransferData;
        this.C = (i) function1;
        this.D = accountId;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f212465x, this.f212466y, this.z, this.A, this.B, this.C, this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        if (r0 == r8) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v15, types: [a5k.i] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [a5k.i] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.revolut.core.model.account.AccountId, qua.p] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4k.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
