package zve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325670a;

    public c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f325670a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f325670a, ((c) obj2).f325670a);
    }

    public final int hashCode() {
        return this.f325670a.hashCode();
    }
}
