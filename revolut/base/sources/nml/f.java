package nml;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f217377b;

    public f(boolean z, String str) {
        this.f217376a = z;
        this.f217377b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f217376a == fVar.f217376a && Intrinsics.f(this.f217377b, fVar.f217377b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f217376a) * 31;
        String str = this.f217377b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
