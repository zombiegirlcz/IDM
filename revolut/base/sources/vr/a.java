package vr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f291435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f291436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f291437c;

    public a(e errorHint, g manualReviewPolicy, f fVar) {
        Intrinsics.checkNotNullParameter(errorHint, "errorHint");
        Intrinsics.checkNotNullParameter(manualReviewPolicy, "manualReviewPolicy");
        this.f291435a = errorHint;
        this.f291436b = manualReviewPolicy;
        this.f291437c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f291435a, aVar.f291435a) && this.f291436b == aVar.f291436b && Intrinsics.f(this.f291437c, aVar.f291437c);
    }

    public final int hashCode() {
        int iHashCode = (this.f291436b.hashCode() + (this.f291435a.hashCode() * 31)) * 31;
        f fVar = this.f291437c;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
