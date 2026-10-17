package rgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f254100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254101b;

    public j(int i, String str) {
        this.f254100a = i;
        this.f254101b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f254100a == jVar.f254100a && Intrinsics.f(this.f254101b, jVar.f254101b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f254100a) * 31;
        String str = this.f254101b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
