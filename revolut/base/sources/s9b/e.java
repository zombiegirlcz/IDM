package s9b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zlg.c f261152a;

    public e(zlg.c registeredIdentityInfo) {
        Intrinsics.checkNotNullParameter(registeredIdentityInfo, "registeredIdentityInfo");
        this.f261152a = registeredIdentityInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f261152a, ((e) obj2).f261152a);
    }

    public final int hashCode() {
        return this.f261152a.hashCode();
    }
}
