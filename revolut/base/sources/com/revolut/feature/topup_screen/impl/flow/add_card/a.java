package com.revolut.feature.topup_screen.impl.flow.add_card;

import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flow.add_card.AddCardFlowContract$Step;
import dj0.d;
import efm.r;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import t61.g;
import u21.k;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardDetails f90596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CardDetailsScreenDescriptor$OutputData$CardData f90597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, CardDetails cardDetails, CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f90596w = cardDetails;
        this.f90597x = cardDetailsScreenDescriptor$OutputData$CardData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f90596w, this.f90597x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarG = m70.a.g(((k) bVar.f90598p).b(), null, null, 3);
            this.u = 1;
            objC = nim.a.c(rVarG, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objC = obj2;
        }
        List list = (List) objC;
        Intrinsics.h(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((g) it8.next()).f268137a);
        }
        Set setI1 = d0.i1(arrayList);
        yki.a aVar2 = bVar.f90600r;
        CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData = this.f90597x;
        h.t2(bVar, aVar2, new AddCardFlowContract$Step.PerformAddCard(new TopupWithNewCardFlowDescriptor$InputData(this.f90596w, cardDetailsScreenDescriptor$OutputData$CardData.f90485b, cardDetailsScreenDescriptor$OutputData$CardData.f90486c, (d) null, TopUpTarget.Main.f90573a, cardDetailsScreenDescriptor$OutputData$CardData.d, (String) null, (Boolean) null, 416), setI1), true, null, false, 12);
        return Unit.f186387a;
    }
}
