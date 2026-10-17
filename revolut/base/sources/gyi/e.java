package gyi;

import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesDisclaimer f147883a;

    public e(AirportLoungesDisclaimer disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f147883a = disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f147883a, ((e) obj2).f147883a);
    }

    public final int hashCode() {
        return this.f147883a.hashCode();
    }
}
