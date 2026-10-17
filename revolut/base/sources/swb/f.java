package swb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266174a;

    public f(String userVoucherId) {
        Intrinsics.checkNotNullParameter(userVoucherId, "userVoucherId");
        this.f266174a = userVoucherId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f266174a, ((f) obj2).f266174a);
    }

    public final int hashCode() {
        return this.f266174a.hashCode();
    }
}
