package ldk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194171a;

    public m(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f194171a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f194171a, ((m) obj2).f194171a);
    }

    public final int hashCode() {
        return this.f194171a.hashCode();
    }
}
