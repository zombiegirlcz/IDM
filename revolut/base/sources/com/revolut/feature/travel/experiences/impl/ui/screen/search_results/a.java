package com.revolut.feature.travel.experiences.impl.ui.screen.search_results;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestinationBrief;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import lul.d;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesSearchResultsScreenContract$InputData.Destination f93150w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, TravelExperiencesSearchResultsScreenContract$InputData.Destination destination, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f93150w = destination;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, this.f93150w, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        TravelSearchDestinationBrief travelSearchDestinationBrief = (TravelSearchDestinationBrief) data.getContent();
        if (travelSearchDestinationBrief != null && (str = travelSearchDestinationBrief.f92892b) != null) {
            this.v.x2(new d(this.f93150w, str, 22));
        }
        return Unit.f186387a;
    }
}
