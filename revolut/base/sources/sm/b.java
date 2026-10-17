package sm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264298a;

    public b(String str) {
        this.f264298a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f264298a, ((b) obj2).f264298a);
    }

    public final int hashCode() {
        String str = this.f264298a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
