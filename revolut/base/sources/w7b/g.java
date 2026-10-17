package w7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderCardInfoDetails;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderPlanSwitchBannerItem;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$ModalStep;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.a;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsValueReminderScreen f295497w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f295497w = cobrandedCardsValueReminderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f295497w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f295497w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((CobrandedCardsValueReminderCardInfoDetails) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen = this.f295497w;
        switch (i) {
            case 0:
                CobrandedCardsValueReminderCardInfoDetails cardInfoDetails = (CobrandedCardsValueReminderCardInfoDetails) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) cobrandedCardsValueReminderScreen.e3();
                cVar.getClass();
                Intrinsics.checkNotNullParameter(cardInfoDetails, "cardInfoDetails");
                oki.h.v2(cVar.u, new CobrandedCardsValueReminderScreenContract$ModalStep.CardTerminationInfo(cardInfoDetails), bottom_dialog);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = cobrandedCardsValueReminderScreen.e3();
                Intrinsics.h(clickData);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) kVarE3;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "ID_SWITCH_BANNER")) {
                    Object obj3 = clickData.d;
                    CobrandedCardsValueReminderPlanSwitchBannerItem cobrandedCardsValueReminderPlanSwitchBannerItem = obj3 instanceof CobrandedCardsValueReminderPlanSwitchBannerItem ? (CobrandedCardsValueReminderPlanSwitchBannerItem) obj3 : null;
                    if (cobrandedCardsValueReminderPlanSwitchBannerItem != null) {
                        CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = cobrandedCardsValueReminderPlanSwitchBannerItem.d.f82448b;
                        if (cobrandedCardsValueReminderActionConfirmation != null) {
                            oki.h.v2(cVar2.u, new CobrandedCardsValueReminderScreenContract$ModalStep.SwitchPlanConfirmation(cobrandedCardsValueReminderActionConfirmation), bottom_dialog);
                        } else {
                            cVar2.C2(a.f.f82626a);
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
