package gu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t4 extends w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146836a;

    public t4(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f146836a = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t4) && Intrinsics.f(this.f146836a, ((t4) obj2).f146836a);
    }

    public final int hashCode() {
        return this.f146836a.hashCode();
    }
}
