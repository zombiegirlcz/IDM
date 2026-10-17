package wli;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f298514a;

    public i(m reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f298514a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f298514a, ((i) obj2).f298514a);
    }

    public final int hashCode() {
        return this.f298514a.hashCode();
    }
}
