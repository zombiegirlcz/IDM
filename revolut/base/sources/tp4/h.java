package tp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273271a;

    public h(String str) {
        this.f273271a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f273271a, ((h) obj2).f273271a);
    }

    public final int hashCode() {
        String str = this.f273271a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
