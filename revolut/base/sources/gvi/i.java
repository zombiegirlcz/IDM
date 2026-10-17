package gvi;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftPass f147184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147185c;
    public final boolean d;

    public i(String passId, AsftPass asftPass, int i, boolean z) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f147183a = passId;
        this.f147184b = asftPass;
        this.f147185c = i;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f147183a, iVar.f147183a) && Intrinsics.f(this.f147184b, iVar.f147184b) && this.f147185c == iVar.f147185c && this.d == iVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f147183a.hashCode() * 31;
        AsftPass asftPass = this.f147184b;
        return Boolean.hashCode(this.d) + j6.a.b(this.f147185c, (iHashCode + (asftPass == null ? 0 : asftPass.hashCode())) * 31, 31);
    }
}
