package pwg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f240454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f240455c;
    public final s d;

    public c(String ref2, Float f, Float f4, s underlyingAsset) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(underlyingAsset, "underlyingAsset");
        this.f240453a = ref2;
        this.f240454b = f;
        this.f240455c = f4;
        this.d = underlyingAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f240453a, cVar.f240453a) && Intrinsics.f(this.f240454b, cVar.f240454b) && Intrinsics.f(this.f240455c, cVar.f240455c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f240453a.hashCode() * 31;
        Float f = this.f240454b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.f240455c;
        return this.d.hashCode() + ((iHashCode2 + (f4 != null ? f4.hashCode() : 0)) * 31);
    }
}
