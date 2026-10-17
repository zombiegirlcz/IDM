package uf4;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import com.revolut.feature.credit.application.plugins.api.models.action_button.Button;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreen;
import cv3.s;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TopItemOfferContentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TopItemOfferContentScreen topItemOfferContentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = topItemOfferContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Button button;
        int i = this.u;
        TopItemOfferContentScreen topItemOfferContentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) topItemOfferContentScreen.d()).J2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) topItemOfferContentScreen.d();
                s sVar = (s) ((pf4.e) ((j2) bVar.f68143s.f22677a).getValue()).f235436b.getContent();
                Action action = (sVar == null || (button = sVar.f) == null) ? null : button.f66299b;
                if (action != null) {
                    bVar.C2(new pf4.f(action));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pf4.o.g0(topItemOfferContentScreen.d());
                break;
        }
        return Unit.f186387a;
    }
}
