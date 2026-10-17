package l35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o35.e f191851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f191852b;

    public c(o35.e details, g toggles) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(toggles, "toggles");
        this.f191851a = details;
        this.f191852b = toggles;
    }

    @Override // qx4.h
    public final int a() {
        g gVar = this.f191852b;
        if (gVar.f191854a || gVar.f191855b) {
            return 1;
        }
        return gVar.f191856c ? 1 : 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f191851a, cVar.f191851a) && Intrinsics.f(this.f191852b, cVar.f191852b);
    }

    public final int hashCode() {
        return this.f191852b.hashCode() + (this.f191851a.hashCode() * 31);
    }
}
