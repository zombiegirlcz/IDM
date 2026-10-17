package ph0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236199b;

    public i(String email, String serverAuthCode) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(serverAuthCode, "serverAuthCode");
        this.f236198a = email;
        this.f236199b = serverAuthCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f236198a, iVar.f236198a) && Intrinsics.f(this.f236199b, iVar.f236199b);
    }

    public final int hashCode() {
        return this.f236199b.hashCode() + (this.f236198a.hashCode() * 31);
    }
}
