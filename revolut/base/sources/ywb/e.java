package ywb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317405a;

    public e(String userVoucherId) {
        Intrinsics.checkNotNullParameter(userVoucherId, "userVoucherId");
        this.f317405a = userVoucherId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f317405a, ((e) obj2).f317405a);
    }

    public final int hashCode() {
        return this.f317405a.hashCode();
    }
}
