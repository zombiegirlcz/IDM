package bo8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f17315a;

    public g(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f17315a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f17315a, ((g) obj2).f17315a);
    }

    public final int hashCode() {
        return this.f17315a.hashCode();
    }
}
