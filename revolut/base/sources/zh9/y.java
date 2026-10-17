package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f322365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f322366b;

    public y(p instalment, r0 plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(instalment, "instalment");
        this.f322365a = plan;
        this.f322366b = instalment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f322365a, yVar.f322365a) && Intrinsics.f(this.f322366b, yVar.f322366b);
    }

    public final int hashCode() {
        return this.f322366b.hashCode() + (this.f322365a.hashCode() * 31);
    }
}
