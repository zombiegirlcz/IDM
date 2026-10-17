package uni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281439a;

    public e(String otpCode) {
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        this.f281439a = otpCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f281439a, ((e) obj2).f281439a);
    }

    public final int hashCode() {
        return this.f281439a.hashCode();
    }
}
