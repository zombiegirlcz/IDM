package cul;

import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class a1 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SourcePocketWrapper f109071x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(SourcePocketWrapper sourcePocketWrapper, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f109071x = sourcePocketWrapper;
        this.f109070w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a1 a1Var = new a1(this.f109071x, this.f109070w, continuation);
                a1Var.v = obj2;
                return a1Var;
            default:
                a1 a1Var2 = new a1(continuation, this.f109070w, this.f109071x);
                a1Var2.v = obj2;
                return a1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a1) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d A[PHI: r32
      0x024d: PHI (r32v2 java.math.BigDecimal) = (r32v0 java.math.BigDecimal), (r32v4 java.math.BigDecimal) binds: [B:81:0x0251, B:77:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a5  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cul.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Continuation continuation, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, SourcePocketWrapper sourcePocketWrapper) {
        super(2, continuation);
        this.f109070w = eVar;
        this.f109071x = sourcePocketWrapper;
    }
}
