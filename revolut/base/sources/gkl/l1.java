package gkl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144464b;

    public l1(String email, String serverAuthCode) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(serverAuthCode, "serverAuthCode");
        this.f144463a = email;
        this.f144464b = serverAuthCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f144463a, l1Var.f144463a) && Intrinsics.f(this.f144464b, l1Var.f144464b);
    }

    public final int hashCode() {
        return this.f144464b.hashCode() + (this.f144463a.hashCode() * 31);
    }
}
