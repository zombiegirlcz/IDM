package com.revolut.feature.travel.flights.impl.ui.screen.search_results;

import a7g.r;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import y6g.l;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f93421w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f93421w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f93421w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        l lVar = this.f93421w;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            i4g.b bVar2 = bVar.f93425s;
            FlightSearchRequestFilters flightSearchRequestFilters = lVar.f311276a;
            this.u = 1;
            j2 j2Var = bVar2.f158423b;
            j2Var.getClass();
            j2Var.g(null, flightSearchRequestFilters);
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.I2(lVar.f311276a, ((r) ((j2) bVar.f93427w.f22677a).getValue()).f1895g);
        return Unit.f186387a;
    }
}
