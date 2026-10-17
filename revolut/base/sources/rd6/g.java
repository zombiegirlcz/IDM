package rd6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253356a;

    public g(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f253356a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f253356a, ((g) obj2).f253356a);
    }

    public final int hashCode() {
        return this.f253356a.hashCode();
    }
}
