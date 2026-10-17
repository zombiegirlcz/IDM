package e10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f121819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f121820b;

    public l(s quality, o headRotationResult) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(headRotationResult, "headRotationResult");
        this.f121819a = quality;
        this.f121820b = headRotationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f121819a, lVar.f121819a) && Intrinsics.f(this.f121820b, lVar.f121820b);
    }

    public final int hashCode() {
        return this.f121820b.hashCode() + (this.f121819a.hashCode() * 31);
    }
}
