package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166123b;

    public r50() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r50)) {
            return false;
        }
        r50 r50Var = (r50) obj2;
        return Intrinsics.f(this.f166122a, r50Var.f166122a) && this.f166123b == r50Var.f166123b;
    }

    public final int hashCode() {
        String str = this.f166122a;
        return Boolean.hashCode(this.f166123b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public r50(String str, int i) {
        this.f166122a = (i & 1) != 0 ? null : str;
        this.f166123b = true;
    }
}
