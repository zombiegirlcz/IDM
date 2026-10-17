package cui;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftPass f109013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109014c;
    public final boolean d;

    public m(String passId, AsftPass asftPass, int i, boolean z) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f109012a = passId;
        this.f109013b = asftPass;
        this.f109014c = i;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f109012a, mVar.f109012a) && Intrinsics.f(this.f109013b, mVar.f109013b) && this.f109014c == mVar.f109014c && this.d == mVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f109012a.hashCode() * 31;
        AsftPass asftPass = this.f109013b;
        return Boolean.hashCode(this.d) + j6.a.b(this.f109014c, (iHashCode + (asftPass == null ? 0 : asftPass.hashCode())) * 31, 31);
    }
}
