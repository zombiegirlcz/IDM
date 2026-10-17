package com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h.v2(this.u.f101864s, WealthAllNewsContract$ModalStep.AddToWatchlist.f101860a, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
