package udk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279258a;

    public i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f279258a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f279258a, ((i) obj2).f279258a);
    }

    public final int hashCode() {
        return this.f279258a.hashCode();
    }
}
