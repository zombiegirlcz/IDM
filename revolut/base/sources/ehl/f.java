package ehl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.b f126245a;

    public f(jo3.b fees) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f126245a = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f126245a, ((f) obj2).f126245a);
    }

    public final int hashCode() {
        return this.f126245a.hashCode();
    }
}
