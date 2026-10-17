package gu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x4 extends w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146867a;

    public x4(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f146867a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x4) && Intrinsics.f(this.f146867a, ((x4) obj2).f146867a);
    }

    public final int hashCode() {
        return this.f146867a.hashCode();
    }
}
