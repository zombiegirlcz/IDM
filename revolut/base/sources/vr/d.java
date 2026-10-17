package vr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291440b;

    public d(String localizedTitle, String str) {
        Intrinsics.checkNotNullParameter(localizedTitle, "localizedTitle");
        this.f291439a = localizedTitle;
        this.f291440b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f291439a, dVar.f291439a) && Intrinsics.f(this.f291440b, dVar.f291440b);
    }

    public final int hashCode() {
        int iHashCode = this.f291439a.hashCode() * 31;
        String str = this.f291440b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
