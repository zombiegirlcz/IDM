package wbg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f296205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f296206b;

    public t0(List items, q0 paymentButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(paymentButtonState, "paymentButtonState");
        this.f296205a = items;
        this.f296206b = paymentButtonState;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof t0) {
            return new n0(!Intrinsics.f(((t0) oldState).f296206b, this.f296206b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f296205a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f296205a, t0Var.f296205a) && Intrinsics.f(this.f296206b, t0Var.f296206b);
    }

    public final int hashCode() {
        return this.f296206b.hashCode() + (this.f296205a.hashCode() * 31);
    }
}
