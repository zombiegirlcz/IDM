package bej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14857a;

    public l(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f14857a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f14857a, ((l) obj2).f14857a);
    }

    public final int hashCode() {
        return this.f14857a.hashCode();
    }
}
