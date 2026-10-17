package d8i;

import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zq.a f112279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyFlowContract$MoveMoneyProcessState f112280x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(zq.a aVar, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112279w = aVar;
        this.f112280x = moveMoneyFlowContract$MoveMoneyProcessState;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f112279w, this.f112280x, continuation, 0);
            default:
                return new b(this.f112279w, this.f112280x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.u
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.v
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L2a
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            r6.v = r2
            zq.a r7 = r6.f112279w
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r1 = r6.f112280x
            java.lang.Object r7 = zq.a.c(r7, r1, r6)
            if (r7 != r0) goto L2a
            r7 = r0
        L2a:
            return r7
        L2b:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.v
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 != r2) goto L38
            yhm.o.b(r7)
            goto L95
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L40:
            yhm.o.b(r7)
            r6.v = r2
            zq.a r7 = r6.f112279w
            java.lang.Object r7 = r7.f324335b
            zrc.d r7 = (zrc.d) r7
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r1 = r6.f112280x
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r3 = r1.f97347a
            com.revolut.feature_move_money.api.model.AccountWrapper r3 = r3.d
            xi0.b r3 = r3.getCurrency()
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r1 = r1.f97347a
            com.revolut.feature_move_money.api.model.AccountWrapper r1 = r1.e
            xi0.b r1 = r1.getCurrency()
            vrc.i r4 = vrc.i.TOP_TO_BOTTOM
            int[] r5 = zrc.a.f324671a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r2) goto L7f
            r2 = 2
            if (r4 != r2) goto L79
            boolean r2 = cp5.d.z(r3)
            if (r2 == 0) goto L90
            boolean r1 = cp5.d.A(r1)
            if (r1 == 0) goto L90
            goto L8b
        L79:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L7f:
            boolean r2 = cp5.d.A(r3)
            if (r2 == 0) goto L90
            boolean r1 = cp5.d.z(r1)
            if (r1 == 0) goto L90
        L8b:
            java.lang.Object r7 = r7.c(r6)
            goto L92
        L90:
            vrc.e r7 = vrc.e.f291574a
        L92:
            if (r7 != r0) goto L95
            r7 = r0
        L95:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d8i.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
