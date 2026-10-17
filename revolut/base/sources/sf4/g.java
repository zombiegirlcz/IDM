package sf4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular.RegularOfferContentScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RegularOfferContentScreen f262348w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(RegularOfferContentScreen regularOfferContentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f262348w = regularOfferContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f262348w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f262348w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RegularOfferContentScreen regularOfferContentScreen = this.f262348w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pf4.o oVarD3 = regularOfferContentScreen.d();
                Intrinsics.h(aVar);
                c8g.c.o(oVarD3, aVar);
                break;
            default:
                String actionId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pf4.o oVarD32 = regularOfferContentScreen.d();
                Intrinsics.h(actionId);
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) oVarD32;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                bVar.C2(new pf4.i(actionId));
                break;
        }
        return Unit.f186387a;
    }
}
