package hib;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import hu1.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f152586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f152587x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Continuation continuation, yji.l lVar) {
        super(1, continuation);
        this.u = i;
        this.f152586w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(0, continuation, (q) this.f152586w);
            case 1:
                return new n((yji.l) this.f152586w, this.f152587x, continuation, 1);
            case 2:
                return new n((f88.f) this.f152587x, (WealthAccount) this.f152586w, continuation, 2);
            case 3:
                return new n((yji.l) this.f152586w, this.f152587x, continuation, 3);
            case 4:
                return new n((yji.l) this.f152586w, this.f152587x, continuation, 4);
            case 5:
                return new n((hlf.c) this.f152587x, (fof.f) this.f152586w, continuation, 5);
            case 6:
                return new n((yji.l) this.f152586w, this.f152587x, continuation, 6);
            case 7:
                return new n(this.f152587x, this.f152586w, continuation, 7);
            case 8:
                return new n(this.f152587x, this.f152586w, continuation, 8);
            case 9:
                return new n(this.f152587x, this.f152586w, continuation, 9);
            case 10:
                return new n(10, continuation, (ht1.k) this.f152586w);
            case 11:
                return new n(this.f152587x, this.f152586w, continuation, 11);
            case 12:
                return new n(12, continuation, (e0) this.f152586w);
            case 13:
                return new n((yji.l) this.f152586w, this.f152587x, continuation, 13);
            case 14:
                return new n(14, continuation, (com.revolut.feature.staking.impl.confirmation.a) this.f152586w);
            case 15:
                return new n(this.f152587x, this.f152586w, continuation, 15);
            case 16:
                return new n(this.f152587x, this.f152586w, continuation, 16);
            case 17:
                return new n(17, continuation, (com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f152586w);
            case 18:
                return new n((yji.l) this.f152586w, this.f152587x, continuation, 18);
            case 19:
                return new n(this.f152587x, this.f152586w, continuation, 19);
            case 20:
                return new n((i0a.b) this.f152587x, (zm3.a) this.f152586w, continuation, 20);
            case 21:
                return new n((yji.l) this.f152586w, this.f152587x, continuation, 21);
            case 22:
                return new n((i26.c) this.f152587x, (i26.a) this.f152586w, continuation, 22);
            case 23:
                return new n(23, continuation, (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) this.f152586w);
            case 24:
                return new n(this.f152587x, this.f152586w, continuation, 24);
            case 25:
                return new n(this.f152587x, this.f152586w, continuation, 25);
            case 26:
                return new n(this.f152587x, this.f152586w, continuation, 26);
            case 27:
                return new n((yji.l) this.f152586w, this.f152587x, continuation, 27);
            case 28:
                return new n(this.f152587x, this.f152586w, continuation, 28);
            default:
                return new n(this.f152587x, this.f152586w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0286, code lost:
    
        if (r0 == r12) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:520:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hib.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f152587x = obj2;
        this.f152586w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(yji.l lVar, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f152586w = lVar;
        this.f152587x = obj2;
    }
}
