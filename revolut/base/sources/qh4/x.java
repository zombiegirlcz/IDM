package qh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246482a;

    public x(String str) {
        this.f246482a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f246482a, ((x) obj2).f246482a);
    }

    public final int hashCode() {
        String str = this.f246482a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
