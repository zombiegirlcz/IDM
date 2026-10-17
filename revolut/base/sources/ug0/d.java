package ug0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279918b;

    public d(String email, String serverAuthCode) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(serverAuthCode, "serverAuthCode");
        this.f279917a = email;
        this.f279918b = serverAuthCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f279917a, dVar.f279917a) && Intrinsics.f(this.f279918b, dVar.f279918b);
    }

    public final int hashCode() {
        return this.f279918b.hashCode() + (this.f279917a.hashCode() * 31);
    }
}
