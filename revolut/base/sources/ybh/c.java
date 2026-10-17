package ybh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usb.j f312296a;

    public c(usb.j exceedsBalanceValidation) {
        Intrinsics.checkNotNullParameter(exceedsBalanceValidation, "exceedsBalanceValidation");
        this.f312296a = exceedsBalanceValidation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f312296a, ((c) obj2).f312296a);
    }

    public final int hashCode() {
        return this.f312296a.hashCode();
    }
}
