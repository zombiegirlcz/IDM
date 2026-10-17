package com.revolut.feature_retail_user_declarations.risk_assessment.screen;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskAssessmentScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RiskAssessmentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RiskAssessmentScreen riskAssessmentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = riskAssessmentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarE3 = this.v.R2();
        Object obj3 = model.i;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem.Option");
        RiskItem.Option item = (RiskItem.Option) obj3;
        c cVar = (c) bVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        h.v2(cVar.f97739p, new RiskAssessmentScreenContract$ModalStep.InfoDialog(item), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
