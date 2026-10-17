package a8c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2166b;

    public i(String str, String str2) {
        this.f2165a = str;
        this.f2166b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f2165a, iVar.f2165a) && Intrinsics.f(this.f2166b, iVar.f2166b);
    }

    public final int hashCode() {
        String str = this.f2165a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2166b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
