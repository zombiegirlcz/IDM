package bic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15468a;

    public c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f15468a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f15468a, ((c) obj2).f15468a);
    }

    public final int hashCode() {
        return this.f15468a.hashCode();
    }
}
