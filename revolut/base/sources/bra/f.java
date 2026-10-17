package bra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17972b;

    public f(String cardNumber, boolean z) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        this.f17971a = cardNumber;
        this.f17972b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f17971a, fVar.f17971a) && this.f17972b == fVar.f17972b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17972b) + (this.f17971a.hashCode() * 31);
    }
}
