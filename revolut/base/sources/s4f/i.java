package s4f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259856a;

    public i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f259856a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f259856a, ((i) obj2).f259856a);
    }

    public final int hashCode() {
        return this.f259856a.hashCode();
    }
}
