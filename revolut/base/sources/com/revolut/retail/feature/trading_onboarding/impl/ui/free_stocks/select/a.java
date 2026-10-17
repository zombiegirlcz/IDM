package com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select;

import ael.t0;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.SelectFreeStocksContract$ModalStep;
import com.revolut.shared.feature.wealth.models.config.Links;
import dj0.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f104166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Long f104167x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d dVar, Long l2, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f104166w = dVar;
        this.f104167x = l2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f104166w, this.f104167x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.i iVarF = ((t0) bVar.f104170r).f();
            this.u = 1;
            obj2 = nim.a.b(iVarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Links links = (Links) obj2;
        h.v2(bVar.f104173w, new SelectFreeStocksContract$ModalStep.TermsAndConditions(this.f104166w, this.f104167x, links.f105103w, links.f105104x), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
