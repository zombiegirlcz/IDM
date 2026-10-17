package gu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u4 extends w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146843a;

    public u4(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f146843a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u4) && Intrinsics.f(this.f146843a, ((u4) obj2).f146843a);
    }

    public final int hashCode() {
        return this.f146843a.hashCode();
    }
}
