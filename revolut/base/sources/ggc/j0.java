package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143638a;

    public j0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f143638a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f143638a, ((j0) obj2).f143638a);
    }

    public final int hashCode() {
        return this.f143638a.hashCode();
    }
}
