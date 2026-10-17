package ph6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f236225b;

    public d(String str, c institution) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        this.f236224a = str;
        this.f236225b = institution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f236224a, dVar.f236224a) && Intrinsics.f(this.f236225b, dVar.f236225b);
    }

    public final int hashCode() {
        String str = this.f236224a;
        return this.f236225b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
