package vl5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290295a;

    public f(String str) {
        this.f290295a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f290295a, ((f) obj2).f290295a);
    }

    public final int hashCode() {
        String str = this.f290295a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
