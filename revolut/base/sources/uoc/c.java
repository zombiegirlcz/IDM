package uoc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281605b;

    public c(dj0.d contribution, boolean z) {
        Intrinsics.checkNotNullParameter(contribution, "contribution");
        this.f281604a = contribution;
        this.f281605b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f281604a, cVar.f281604a) && this.f281605b == cVar.f281605b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281605b) + (this.f281604a.hashCode() * 31);
    }
}
