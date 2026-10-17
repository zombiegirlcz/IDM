package bwb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19283a;

    public b(String str) {
        this.f19283a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f19283a, ((b) obj2).f19283a);
    }

    public final int hashCode() {
        String str = this.f19283a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
