package com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.common.InfoDialogFactory$DialogConfig;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ RowDelegate.Model u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RowDelegate.Model model, b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = this.u.u;
        if (obj3 instanceof InfoDialogFactory$DialogConfig) {
            h.v2(this.v.f95431q, new CreditQualityScreenContract$ModalStep.InfoDialog((InfoDialogFactory$DialogConfig) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
