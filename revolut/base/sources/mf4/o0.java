package mf4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2RootFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OfferV2RootFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(OfferV2RootFlow offerV2RootFlow, Continuation continuation) {
        super(2, continuation);
        this.v = offerV2RootFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o0 o0Var = new o0(this.v, continuation);
        o0Var.u = obj2;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVar = (d) this.v.N.getValue();
        Intrinsics.h(item);
        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) dVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        j60.a.v(gVar.f68153s, false, null, 3);
        Object obj3 = item.u;
        if (obj3 instanceof fu3.b) {
            gVar.l2(new m0(gVar, obj3, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
