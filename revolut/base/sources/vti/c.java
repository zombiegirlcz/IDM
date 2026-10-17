package vti;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftPass f292121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f292122c;
    public final boolean d;

    public c(String passId, AsftPass asftPass, int i, boolean z) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f292120a = passId;
        this.f292121b = asftPass;
        this.f292122c = i;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f292120a, cVar.f292120a) && Intrinsics.f(this.f292121b, cVar.f292121b) && this.f292122c == cVar.f292122c && this.d == cVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f292120a.hashCode() * 31;
        AsftPass asftPass = this.f292121b;
        return Boolean.hashCode(this.d) + j6.a.b(this.f292122c, (iHashCode + (asftPass == null ? 0 : asftPass.hashCode())) * 31, 31);
    }
}
