package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113533a;

    public f2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f113533a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f2) && Intrinsics.f(this.f113533a, ((f2) obj2).f113533a);
    }

    public final int hashCode() {
        return this.f113533a.hashCode();
    }
}
