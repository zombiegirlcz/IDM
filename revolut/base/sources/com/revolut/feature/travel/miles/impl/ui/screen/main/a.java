package com.revolut.feature.travel.miles.impl.ui.screen.main;

import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.impl.ui.screen.main.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAirline f94367a;

    public a(TravelMilesAirline airline) {
        Intrinsics.checkNotNullParameter(airline, "airline");
        this.f94367a = airline;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f94367a, ((a) obj2).f94367a);
    }

    public final int hashCode() {
        return this.f94367a.hashCode();
    }
}
