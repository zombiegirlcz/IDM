package jxi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179226a;

    public s(String airportId) {
        Intrinsics.checkNotNullParameter(airportId, "airportId");
        this.f179226a = airportId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f179226a, ((s) obj2).f179226a);
    }

    public final int hashCode() {
        return this.f179226a.hashCode();
    }
}
