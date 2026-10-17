package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3 f216063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r3 f216064b;

    public w3(r3 grossAmount, r3 tax) {
        Intrinsics.checkNotNullParameter(grossAmount, "grossAmount");
        Intrinsics.checkNotNullParameter(tax, "tax");
        this.f216063a = grossAmount;
        this.f216064b = tax;
    }

    public final r3 a() {
        return this.f216063a;
    }

    public final r3 b() {
        return this.f216064b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj2;
        return Intrinsics.f(this.f216063a, w3Var.f216063a) && Intrinsics.f(this.f216064b, w3Var.f216064b);
    }

    public final int hashCode() {
        return this.f216064b.hashCode() + (this.f216063a.hashCode() * 31);
    }
}
