package ia7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f159963b;

    public j(String str, long j2) {
        this.f159962a = str;
        this.f159963b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f159962a, jVar.f159962a) && this.f159963b == jVar.f159963b;
    }

    public final int hashCode() {
        String str = this.f159962a;
        return Long.hashCode(this.f159963b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
