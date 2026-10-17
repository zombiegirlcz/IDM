package ybh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f312353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f312354b;

    public u(Boolean bool, t confirmButton) {
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        this.f312353a = bool;
        this.f312354b = confirmButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f312353a, uVar.f312353a) && Intrinsics.f(this.f312354b, uVar.f312354b);
    }

    public final int hashCode() {
        Boolean bool = this.f312353a;
        return this.f312354b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
    }
}
