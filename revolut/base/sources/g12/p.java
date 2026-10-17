package g12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f139527a;

    public p(m result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f139527a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f139527a, ((p) obj2).f139527a);
    }

    public final int hashCode() {
        return this.f139527a.hashCode();
    }
}
