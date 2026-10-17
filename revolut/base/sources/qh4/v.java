package qh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f246479b;

    public v(String str, boolean z) {
        this.f246478a = str;
        this.f246479b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f246478a, vVar.f246478a) && this.f246479b == vVar.f246479b;
    }

    public final int hashCode() {
        String str = this.f246478a;
        return Boolean.hashCode(this.f246479b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
