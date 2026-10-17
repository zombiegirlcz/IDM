package t2h;

import kotlin.jvm.internal.Intrinsics;
import nel.v0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f267570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f267571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f267572c;

    public f(bfl.g tradeSide, v0 onboardingDetails, boolean z) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        this.f267570a = tradeSide;
        this.f267571b = onboardingDetails;
        this.f267572c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f267570a == fVar.f267570a && Intrinsics.f(this.f267571b, fVar.f267571b) && this.f267572c == fVar.f267572c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267572c) + ((this.f267571b.hashCode() + (this.f267570a.hashCode() * 31)) * 31);
    }
}
