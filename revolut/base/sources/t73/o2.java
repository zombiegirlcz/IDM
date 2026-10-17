package t73;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenModel$CardNotFoundException;
import com.revolut.feature.cards_core.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class o2 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o2 o2Var = new o2(this.v, continuation);
        o2Var.u = obj2;
        return o2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o2) create((q0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.v;
        q0 q0Var = (q0) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = 14;
        try {
            com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.N2(gVar, (h93.f0) q0Var.d.c(), q0Var.f268508c);
        } catch (CardsCarouselScreenModel$CardNotFoundException e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CardsCarouselScreenModel", null, e, h0Var);
            j60.a aVar2 = gVar.f65440t;
            gVar.v.getClass();
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_screen_card_terminated_title, null, null, 14), new TextLocalisedClause(R$string.card_screen_card_terminated_message, null, null, 14), null, 28);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            int i2 = R$attr.uikit_dp8;
            int i3 = R$attr.uikit_dp16;
            aVar2.x(new rp0.y(zhm.u.c(new LargeActionButtonDelegate.Model("CARD_NOT_FOUND_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, R$attr.uikit_dp24, i3, i3, 496)), tVar, null, null, null, null, 1020));
        }
        gVar.H2(gVar.f65434h0, new d(i));
        return Unit.f186387a;
    }
}
