package z0h;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f318546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318547b;

    public p1(List disclaimers, hel.b bVar) {
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f318546a = disclaimers;
        this.f318547b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f318546a, p1Var.f318546a) && this.f318547b == p1Var.f318547b;
    }

    public final int hashCode() {
        int iHashCode = this.f318546a.hashCode() * 31;
        hel.b bVar = this.f318547b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
