package gui;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftPass f146949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146950c;
    public final boolean d;

    public d(String passId, AsftPass asftPass, int i, boolean z) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f146948a = passId;
        this.f146949b = asftPass;
        this.f146950c = i;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f146948a, dVar.f146948a) && Intrinsics.f(this.f146949b, dVar.f146949b) && this.f146950c == dVar.f146950c && this.d == dVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f146948a.hashCode() * 31;
        AsftPass asftPass = this.f146949b;
        return Boolean.hashCode(this.d) + j6.a.b(this.f146950c, (iHashCode + (asftPass == null ? 0 : asftPass.hashCode())) * 31, 31);
    }
}
