package t73;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a;
import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardsCarouselScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(CardsCarouselScreen cardsCarouselScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardsCarouselScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h93.f0 f0Var;
        h93.f0 f0Var2;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g1 g1VarS3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) g1VarS3;
        cli.y yVar = gVar.f65434h0;
        Intrinsics.checkNotNullParameter(model, "model");
        di9.d dVar = gVar.f65438r;
        String str = model.f52613a;
        Object obj3 = model.i;
        Continuation continuation = null;
        if (!((ij9.i) dVar).b3(new yx4.b(str, obj3, null))) {
            int i = 0;
            j60.a.v(gVar.f65440t, false, null, 3);
            int i2 = 1;
            int i3 = 26;
            switch (str.hashCode()) {
                case -2045862275:
                    if (str.equals("CANCEL_CARD_ORDER_POSITIVE_BUTTON_ID")) {
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.checkout.models.CheckoutOrder");
                        gVar.l2(new sx2.r(gVar, (CheckoutOrder) obj3, continuation, 16), new yi5.b(i3));
                    }
                    break;
                case -1851780815:
                    if (str.equals("CARD_RESET_PIN_TRIES_POSITIVE_BUTTON_ID") && (f0Var = (h93.f0) ((q0) ((vkm.j2) yVar.f22677a).getValue()).d.f224257a) != null) {
                        gVar.l2(new r1(gVar, f0Var, continuation, 12), new yi5.b(i3));
                    }
                    break;
                case -1579500193:
                    if (str.equals("CONFIRM_UNFREEZE_BUTTON_LIST_ID")) {
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                        gVar.l2(new r1(gVar, (h93.f0) obj3, continuation, 15), new yi5.b(i3));
                    }
                    break;
                case -1357870739:
                    if (str.equals("ID_ENABLE_TRANSACTIONS")) {
                        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
                        gVar.n2(new v1(gVar, (String) obj3, continuation, 2), new whi.b(6));
                    }
                    break;
                case -1245633554:
                    if (str.equals("CREATE_NEW_DESIGN_CLICK_ACTION_ID") && (f0Var2 = (h93.f0) ((q0) ((vkm.j2) yVar.f22677a).getValue()).d.f224257a) != null) {
                        gVar.l2(new r1(gVar, f0Var2, continuation, i2), new yi5.b(i3));
                    }
                    break;
                case -106943317:
                    if (str.equals("CARD_DETAIL_CALL_SHARE_SAFE_ID")) {
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                        gVar.S2((h93.f0) obj3);
                    }
                    break;
                case -35756255:
                    if (str.equals("ACTIVATE_CARD_BY_CLICK_CONFIRM_RECEIVED_ACTION_ID")) {
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                        h93.f0 f0Var3 = (h93.f0) obj3;
                        boolean zB0 = f0Var3.b0();
                        String str2 = f0Var3.f150110a;
                        if (!zB0) {
                            gVar.l2(new v1(gVar, str2, continuation, i), new yi5.b(i3));
                        } else {
                            gVar.l2(new v1(gVar, str2, continuation, i2), new yi5.b(i3));
                        }
                    }
                    break;
                case 1496189808:
                    if (str.equals("CARD_NOT_FOUND_BUTTON_ID")) {
                        gVar.C2(a.f.f65421a);
                    }
                    break;
                case 1572533839:
                    if (str.equals("TERMINATE_MCY_CARD_ACTION_ID")) {
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                        gVar.Z2((h93.f0) obj3, null);
                    }
                    break;
            }
        }
        return Unit.f186387a;
    }
}
