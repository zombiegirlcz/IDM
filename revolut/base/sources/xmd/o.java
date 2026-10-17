package xmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f307186b;

    public o(dj0.d amount, n phase) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(phase, "phase");
        this.f307185a = amount;
        this.f307186b = phase;
    }

    public static o a(o oVar, dj0.d amount, m mVar, int i) {
        if ((i & 1) != 0) {
            amount = oVar.f307185a;
        }
        n phase = mVar;
        if ((i & 2) != 0) {
            phase = oVar.f307186b;
        }
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(phase, "phase");
        return new o(amount, phase);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f307185a, oVar.f307185a) && Intrinsics.f(this.f307186b, oVar.f307186b);
    }

    public final int hashCode() {
        return this.f307186b.hashCode() + (this.f307185a.hashCode() * 31);
    }
}
