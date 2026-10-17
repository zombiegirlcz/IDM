package n7f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213084a;

    public e() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f213084a, ((e) obj2).f213084a);
    }

    public final int hashCode() {
        String str = this.f213084a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public e(String str) {
        this.f213084a = str;
    }
}
