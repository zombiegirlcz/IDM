package com.revolut.feature.push_to_card.impl.ui.flow;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.push_to_card.impl.ui.flow.PushToCardTransferFlowContract$Step;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b u;
    public final /* synthetic */ PushToCardTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f81613w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, PushToCardTransferData pushToCardTransferData, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
        this.v = pushToCardTransferData;
        this.f81613w = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, this.f81613w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.u;
        h.t2(bVar, bVar.f81614p, new PushToCardTransferFlowContract$Step.Review(new PushToCardTransferReviewScreenContract$InputData(bVar.o.getF81536a(), this.v, this.f81613w, false)), true, null, false, 12);
        return Unit.f186387a;
    }
}
