package ybh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312289a;

    public a(String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f312289a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f312289a, ((a) obj2).f312289a);
    }

    public final int hashCode() {
        return this.f312289a.hashCode();
    }
}
