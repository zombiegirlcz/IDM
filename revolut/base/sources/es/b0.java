package es;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128747a;

    public b0(String str) {
        this.f128747a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f128747a, ((b0) obj2).f128747a);
    }

    public final int hashCode() {
        String str = this.f128747a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
