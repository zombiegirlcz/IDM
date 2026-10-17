package ojk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225807a;

    public b0() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f225807a, ((b0) obj2).f225807a);
    }

    public final int hashCode() {
        String str = this.f225807a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public b0(String str) {
        this.f225807a = str;
    }
}
