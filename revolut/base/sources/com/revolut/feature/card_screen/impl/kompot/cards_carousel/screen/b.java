package com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen;

import com.revolut.feature.card_screen.impl.kompot.cards_carousel.WalletTokenizationState;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function1 {
    public g u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f65422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f65423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f65424y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, f0 f0Var, Continuation continuation) {
        super(1, continuation);
        this.f65423x = gVar;
        this.f65424y = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f65423x, this.f65424y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar;
        com.revolut.kompot.navigable.vc.modal.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f65422w;
        if (i == 0) {
            o.b(obj2);
            gVar = this.f65423x;
            com.revolut.kompot.navigable.vc.modal.a aVar3 = gVar.f65435k0;
            String str = this.f65424y.f150110a;
            this.u = gVar;
            this.v = aVar3;
            this.f65422w = 1;
            Enum enumJ2 = g.J2(gVar, str, this);
            if (enumJ2 == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = enumJ2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.v;
            gVar = this.u;
            o.b(obj2);
        }
        CardsCarouselScreenContract$ModalStep.ShowAutoRenewalDialog showAutoRenewalDialog = new CardsCarouselScreenContract$ModalStep.ShowAutoRenewalDialog((WalletTokenizationState) obj2);
        gVar.getClass();
        h.v2(aVar, showAutoRenewalDialog, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
