package hdh;

import kotlin.jvm.internal.Intrinsics;
import nel.v0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f151438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f151439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f151440c;

    public h(bfl.g tradeSide, v0 onboardingDetails, boolean z) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        this.f151438a = tradeSide;
        this.f151439b = onboardingDetails;
        this.f151440c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f151438a == hVar.f151438a && Intrinsics.f(this.f151439b, hVar.f151439b) && this.f151440c == hVar.f151440c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151440c) + ((this.f151439b.hashCode() + (this.f151438a.hashCode() * 31)) * 31);
    }
}
