package jd7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172988a;

    public f(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f172988a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f172988a, ((f) obj2).f172988a);
    }

    public final int hashCode() {
        return this.f172988a.hashCode();
    }
}
