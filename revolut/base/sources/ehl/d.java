package ehl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.b f126240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126241b;

    public d(String side, jo3.b amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f126240a = amount;
        this.f126241b = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f126240a, dVar.f126240a) && Intrinsics.f(this.f126241b, dVar.f126241b);
    }

    public final int hashCode() {
        return this.f126241b.hashCode() + (this.f126240a.hashCode() * 31);
    }
}
