package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f16177a;

    public l(n0 signUpData) {
        Intrinsics.checkNotNullParameter(signUpData, "signUpData");
        this.f16177a = signUpData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f16177a, ((l) obj2).f16177a);
    }

    public final int hashCode() {
        return this.f16177a.hashCode();
    }
}
