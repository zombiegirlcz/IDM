package al4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl4.a f6142a;

    public g(cl4.a details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f6142a = details;
    }

    @Override // qx4.h
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f6142a, ((g) obj2).f6142a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f6142a.hashCode() * 31);
    }
}
