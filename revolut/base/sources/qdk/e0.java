package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244962a;

    public e0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f244962a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f244962a, ((e0) obj2).f244962a);
    }

    public final int hashCode() {
        return this.f244962a.hashCode();
    }
}
