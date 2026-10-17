package yui;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftPass f317038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f317039c;
    public final boolean d;

    public m(String passId, AsftPass asftPass, int i, boolean z) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f317037a = passId;
        this.f317038b = asftPass;
        this.f317039c = i;
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
        return Intrinsics.f(this.f317037a, mVar.f317037a) && Intrinsics.f(this.f317038b, mVar.f317038b) && this.f317039c == mVar.f317039c && this.d == mVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f317037a.hashCode() * 31;
        AsftPass asftPass = this.f317038b;
        return Boolean.hashCode(this.d) + j6.a.b(this.f317039c, (iHashCode + (asftPass == null ? 0 : asftPass.hashCode())) * 31, 31);
    }
}
