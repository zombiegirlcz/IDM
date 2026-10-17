package lmj;

import aw0.n6;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import lmj.c;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanPortingCancellationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(EsimMobilePlanPortingCancellationScreen esimMobilePlanPortingCancellationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanPortingCancellationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanPortingCancellationScreen esimMobilePlanPortingCancellationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) ((d) esimMobilePlanPortingCancellationScreen.T.getValue())).C2(c.a.f197091a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) ((d) esimMobilePlanPortingCancellationScreen.T.getValue())).B2();
                break;
        }
        return Unit.f186387a;
    }
}
