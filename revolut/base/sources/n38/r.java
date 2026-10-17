package n38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f211957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f211958b;

    public r(s jointEligibilityStatus, boolean z) {
        Intrinsics.checkNotNullParameter(jointEligibilityStatus, "jointEligibilityStatus");
        this.f211957a = jointEligibilityStatus;
        this.f211958b = z;
    }

    public final boolean a() {
        return this.f211958b;
    }

    public final s b() {
        return this.f211957a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f211957a == rVar.f211957a && this.f211958b == rVar.f211958b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211958b) + (this.f211957a.hashCode() * 31);
    }
}
