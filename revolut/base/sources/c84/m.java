package c84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22099b;

    public m() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f22098a == mVar.f22098a && Intrinsics.f(this.f22099b, mVar.f22099b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f22098a) * 31;
        String str = this.f22099b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ m(int i) {
        this(true, null);
    }

    public m(boolean z, String str) {
        this.f22098a = z;
        this.f22099b = str;
    }
}
