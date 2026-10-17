package uf4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreen;
import dx4.l;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TopItemOfferContentScreen f279541w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TopItemOfferContentScreen topItemOfferContentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279541w = topItemOfferContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f279541w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f279541w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f279541w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TopItemOfferContentScreen topItemOfferContentScreen = this.f279541w;
        switch (i) {
            case 0:
                l lVar = (l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c8g.c.i(topItemOfferContentScreen.d(), lVar);
                break;
            case 1:
                l lVar2 = (l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c8g.c.i(topItemOfferContentScreen.d(), lVar2);
                break;
            default:
                String actionId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pf4.o oVarD = topItemOfferContentScreen.d();
                Intrinsics.h(actionId);
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) oVarD;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                bVar.C2(new pf4.i(actionId));
                break;
        }
        return Unit.f186387a;
    }
}
