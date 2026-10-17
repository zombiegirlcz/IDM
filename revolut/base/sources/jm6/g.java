package jm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176481a;

    public g(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f176481a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f176481a, ((g) obj2).f176481a);
    }

    public final int hashCode() {
        return this.f176481a.hashCode();
    }
}
