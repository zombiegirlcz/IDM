package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen;

import cli.y;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductArticle;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2ScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c;
import gim.i;
import imk.a0;
import imk.b0;
import imk.c0;
import imk.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import skm.e0;
import skm.p0;
import wgb.v;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f103573w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f103573w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f103573w, continuation);
        fVar.v = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        g gVar = this.f103573w;
        com.revolut.kompot.navigable.vc.modal.a aVar = gVar.E;
        a aVar2 = gVar.f103577y;
        y yVar = gVar.C;
        c cVar = (c) this.v;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            if (cVar instanceof c0) {
                gVar.H2(yVar, new im3.e(6));
                int i2 = gVar.B;
                imk.f fVar = imk.f.PRODUCT_ARTICLE;
                aVar2.f103566g = Integer.valueOf(i2);
                aVar2.f103567h = fVar;
                PlanHubProductArticle planHubProductArticle = ((c0) cVar).f162503a.f162508a;
                h.v2(aVar, new PlanHubV2ScreenContract$ModalStep.ProductArticle(planHubProductArticle.f102651a, planHubProductArticle.f102652b), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
            } else if (!(cVar instanceof a0) && !Intrinsics.f(cVar, c.b.f103570a) && !Intrinsics.f(cVar, c.a.f103569a)) {
                int i3 = 7;
                if (cVar instanceof d0) {
                    gVar.H2(yVar, new im3.e(i3));
                    int i5 = gVar.B;
                    imk.f fVar2 = imk.f.PROMO_OFFER;
                    aVar2.f103566g = Integer.valueOf(i5);
                    aVar2.f103567h = fVar2;
                    h.v2(aVar, new PlanHubV2ScreenContract$ModalStep.PromptOffer(((d0) cVar).f162505a.f162515a), ModalDestination.Style.POPUP.f98311a);
                } else {
                    if (!(cVar instanceof b0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.H2(yVar, new im3.e(8));
                    int i6 = gVar.B;
                    imk.f fVar3 = imk.f.MODAL;
                    aVar2.f103566g = Integer.valueOf(i6);
                    aVar2.f103567h = fVar3;
                    wik.g gVar2 = gVar.f103576x;
                    String str = ((b0) cVar).f162498a;
                    this.v = cVar;
                    this.u = 1;
                    gVar2.getClass();
                    v vVar = new v(gVar2, str, null, i3);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, vVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        h.v2(aVar, new PlanHubV2ScreenContract$ModalStep.BeDrivenModal(((b0) cVar).f162499b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
