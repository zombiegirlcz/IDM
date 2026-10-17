package tni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272457a;

    public e(String otp) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f272457a = otp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f272457a, ((e) obj2).f272457a);
    }

    public final int hashCode() {
        return this.f272457a.hashCode();
    }
}
