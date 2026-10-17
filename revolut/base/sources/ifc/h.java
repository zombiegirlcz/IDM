package ifc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f160998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160999b;

    public h(boolean z, String str) {
        this.f160998a = z;
        this.f160999b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f160998a == hVar.f160998a && Intrinsics.f(this.f160999b, hVar.f160999b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f160998a) * 31;
        String str = this.f160999b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
