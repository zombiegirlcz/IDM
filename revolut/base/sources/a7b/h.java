package a7b;

import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueBottomSheet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.mappers.CobrandedCardsCardFeesItemMapper;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsAdditionalValueScreen f1819w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1819w = cobrandedCardsAdditionalValueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f1819w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f1819w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((CobrandedCardsPlanAdditionalValueBottomSheet) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen = this.f1819w;
        switch (i) {
            case 0:
                CobrandedCardsPlanAdditionalValueBottomSheet info = (CobrandedCardsPlanAdditionalValueBottomSheet) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) cobrandedCardsAdditionalValueScreen.d();
                cVar.getClass();
                Intrinsics.checkNotNullParameter(info, "info");
                oki.h.v2(cVar.f82564w, new CobrandedCardsAdditionalValueScreenContract$ModalStep.SectionInfo(info), bottom_dialog);
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE3 = cobrandedCardsAdditionalValueScreen.d();
                Object obj3 = aVar2.d;
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) pVarE3;
                cVar2.getClass();
                if (obj3 instanceof HyperTextClickData) {
                    HyperTextTarget hyperTextTarget = ((HyperTextClickData) obj3).f74762a;
                    if (hyperTextTarget instanceof HyperTextTarget.Link) {
                        cVar2.l2(new a1a.a(cVar2, hyperTextTarget, null, 18), new yi5.b(26));
                    }
                } else if (obj3 instanceof CobrandedCardsCardFeesItemMapper.CardFeesClickData) {
                    oki.h.v2(cVar2.f82564w, new CobrandedCardsAdditionalValueScreenContract$ModalStep.CardFees(((CobrandedCardsCardFeesItemMapper.CardFeesClickData) obj3).f82549a), bottom_dialog);
                }
                break;
        }
        return Unit.f186387a;
    }
}
