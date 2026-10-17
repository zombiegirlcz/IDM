package aui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9831a;

    public f(String airportIataCode) {
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        this.f9831a = airportIataCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f9831a, ((f) obj2).f9831a);
    }

    public final int hashCode() {
        return this.f9831a.hashCode();
    }
}
