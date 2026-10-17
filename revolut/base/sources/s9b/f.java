package s9b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zlg.c f261153a;

    public f(zlg.c registeredIdentityInfo) {
        Intrinsics.checkNotNullParameter(registeredIdentityInfo, "registeredIdentityInfo");
        this.f261153a = registeredIdentityInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f261153a, ((f) obj2).f261153a);
    }

    public final int hashCode() {
        return this.f261153a.hashCode();
    }
}
