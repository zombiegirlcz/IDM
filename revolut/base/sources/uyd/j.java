package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284210a;

    public j(String str) {
        this.f284210a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f284210a, ((j) obj2).f284210a);
    }

    public final int hashCode() {
        String str = this.f284210a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
