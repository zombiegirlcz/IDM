package w19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f293811b;

    public h(f onboardingInfo) {
        Intrinsics.checkNotNullParameter(onboardingInfo, "onboardingInfo");
        this.f293811b = onboardingInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f293811b, ((h) obj2).f293811b);
    }

    public final int hashCode() {
        return this.f293811b.hashCode();
    }
}
