package f9d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132930a;

    public j(String str) {
        this.f132930a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f132930a, ((j) obj2).f132930a);
    }

    public final int hashCode() {
        String str = this.f132930a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
