package sui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265781b;

    public i(String airportIataCode, String terminalId) {
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        this.f265780a = airportIataCode;
        this.f265781b = terminalId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f265780a, iVar.f265780a) && Intrinsics.f(this.f265781b, iVar.f265781b);
    }

    public final int hashCode() {
        return this.f265781b.hashCode() + (this.f265780a.hashCode() * 31);
    }
}
