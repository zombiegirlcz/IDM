package pqg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238748a;

    public l(String formattedAmountInput) {
        Intrinsics.checkNotNullParameter(formattedAmountInput, "formattedAmountInput");
        this.f238748a = formattedAmountInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f238748a, ((l) obj2).f238748a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f238748a.hashCode() * 31);
    }
}
