package iyi;

import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesDisclaimer f169757a;

    public a(AirportLoungesDisclaimer disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f169757a = disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f169757a, ((a) obj2).f169757a);
    }

    public final int hashCode() {
        return this.f169757a.hashCode();
    }
}
