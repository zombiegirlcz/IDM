package yuj;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import puj.f;
import skm.e0;
import skm.p0;
import tuj.d;
import tuj.g;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f317057a;

    public a(g repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f317057a = repository;
    }

    public final Object a(String str, f fVar, com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.a aVar) throws Throwable {
        g gVar = this.f317057a;
        gVar.getClass();
        d dVar = new d(gVar, str, fVar, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, dVar, aVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
