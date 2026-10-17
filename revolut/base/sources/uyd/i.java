package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f284205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284206b;

    public i(int i, String str) {
        this.f284205a = i;
        this.f284206b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f284205a == iVar.f284205a && Intrinsics.f(this.f284206b, iVar.f284206b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f284205a) * 31;
        String str = this.f284206b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
