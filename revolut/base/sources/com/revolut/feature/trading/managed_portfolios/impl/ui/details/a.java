package com.revolut.feature.trading.managed_portfolios.impl.ui.details;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import i6f.t;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ List v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        od0.i iVar = (od0.i) ((t) ((j2) cVar.I.f22677a).getValue()).f158969a.getContent();
        if (iVar == null || (str = (String) iVar.f224257a) == null) {
            throw new IllegalStateException("Trying to interact with a non-existing portfolio");
        }
        h.v2(cVar.J, new ManagedPortfolioDetailsControllerContract$ModalStep.MoreActions(str, this.v), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
