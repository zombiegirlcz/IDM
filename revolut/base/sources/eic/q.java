package eic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126480a;

    public q(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f126480a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f126480a, ((q) obj2).f126480a);
    }

    public final int hashCode() {
        return this.f126480a.hashCode();
    }
}
