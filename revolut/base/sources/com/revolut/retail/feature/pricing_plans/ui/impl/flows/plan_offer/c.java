package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.e;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mfm.f;
import oki.h;
import qz0.j;
import qz0.n;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        d dVar = this.v;
        PlanOfferFlowContract$InputData planOfferFlowContract$InputData = dVar.o;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            PlanOfferPromptLayout.Background background = ((PlanOfferFlowContract$InputData.ByPrompt) planOfferFlowContract$InputData).f103193a.f102847a.f102692c;
            this.u = 1;
            PlanOfferPromptLayout.Asset asset = (background != null ? background.f102695a : null) == e.ASSET ? background.f102697c : null;
            if ((asset != null ? asset.f102693a : null) == com.revolut.retail.feature.pricing_plans.ui.api.models.d.IMAGE) {
                n nVar = dVar.f103207s;
                UrlImage urlImage = new UrlImage(asset.f102694b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                qz0.i iVar = j.Companion;
                pfm.a aVar = new pfm.a(nVar.f(urlImage, false, -1, -1), f.f205044g, 1);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
                objA = nim.a.a(aVar, this);
                if (objA != obj3) {
                    objA = Unit.f186387a;
                }
            } else {
                r6.b.D("Bottom sheet offers only support IMAGE background");
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.z2(dVar.u, new PlanOfferFlowContract$Step.BottomSheetPromptOffer(((PlanOfferFlowContract$InputData.ByPrompt) planOfferFlowContract$InputData).f103193a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
