package hlb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153428a;

    public e(String str) {
        this.f153428a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f153428a, ((e) obj2).f153428a);
    }

    public final int hashCode() {
        String str = this.f153428a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
