package l6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192396b;

    public h(String str, String str2) {
        this.f192395a = str;
        this.f192396b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f192395a, hVar.f192395a) && Intrinsics.f(this.f192396b, hVar.f192396b);
    }

    public final int hashCode() {
        String str = this.f192395a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f192396b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
