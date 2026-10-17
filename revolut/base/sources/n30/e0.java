package n30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211623b;

    public e0(String fcmToken, String accessToken) {
        Intrinsics.checkNotNullParameter(fcmToken, "fcmToken");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.f211622a = fcmToken;
        this.f211623b = accessToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f211622a, e0Var.f211622a) && Intrinsics.f(this.f211623b, e0Var.f211623b);
    }

    public final int hashCode() {
        return this.f211623b.hashCode() + (this.f211622a.hashCode() * 31);
    }
}
