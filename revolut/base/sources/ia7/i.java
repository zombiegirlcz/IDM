package ia7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f159960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159961c;

    public i(String str, long j2, boolean z) {
        this.f159959a = str;
        this.f159960b = j2;
        this.f159961c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f159959a, iVar.f159959a) && this.f159960b == iVar.f159960b && this.f159961c == iVar.f159961c;
    }

    public final int hashCode() {
        String str = this.f159959a;
        return Boolean.hashCode(this.f159961c) + a0.d.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f159960b);
    }
}
