package rle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255031a;

    public c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f255031a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f255031a, ((c) obj2).f255031a);
    }

    public final int hashCode() {
        return this.f255031a.hashCode();
    }
}
