package zmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323452a;

    public k(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f323452a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f323452a, ((k) obj2).f323452a);
    }

    public final int hashCode() {
        return this.f323452a.hashCode();
    }
}
