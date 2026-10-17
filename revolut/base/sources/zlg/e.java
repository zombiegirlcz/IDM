package zlg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323254a;

    public e(String str) {
        this.f323254a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f323254a, ((e) obj2).f323254a);
    }

    public final int hashCode() {
        String str = this.f323254a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
