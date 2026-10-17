package yx6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317577b;

    public d(String str) {
        this.f317577b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f317577b, ((d) obj2).f317577b);
    }

    public final int hashCode() {
        String str = this.f317577b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
