package nfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p1 extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215017a;

    public p1(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f215017a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p1) && Intrinsics.f(this.f215017a, ((p1) obj2).f215017a);
    }

    public final int hashCode() {
        return this.f215017a.hashCode();
    }
}
