package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284174a;

    public d(String str) {
        this.f284174a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f284174a, ((d) obj2).f284174a);
    }

    public final int hashCode() {
        String str = this.f284174a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
