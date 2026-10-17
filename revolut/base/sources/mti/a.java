package mti;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pti.e f208843a;

    public a(pti.e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f208843a = repository;
    }

    public final akg.n a(String airportIataCode, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        pti.e eVar = this.f208843a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(eVar.d.b(Unit.f186387a, loadingStrategy), new mll.h(airportIataCode, 3));
    }
}
