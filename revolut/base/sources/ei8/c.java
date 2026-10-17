package ei8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf8.d f126450a;

    public c(kf8.d registrationConfirmation) {
        Intrinsics.checkNotNullParameter(registrationConfirmation, "registrationConfirmation");
        this.f126450a = registrationConfirmation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f126450a, ((c) obj2).f126450a);
    }

    public final int hashCode() {
        return this.f126450a.hashCode();
    }
}
