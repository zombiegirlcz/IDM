package tsk;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f274160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f274161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f274162c;
    public final List d;

    public l(Pair period, ej0.b bVar, ej0.b bVar2) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f274160a = period;
        this.f274161b = bVar;
        this.f274162c = bVar2;
        ej0.b[] elements = {bVar, bVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.L(elements);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f274160a, lVar.f274160a) && Intrinsics.f(this.f274161b, lVar.f274161b) && Intrinsics.f(this.f274162c, lVar.f274162c);
    }

    public final int hashCode() {
        int iHashCode = this.f274160a.hashCode() * 31;
        ej0.b bVar = this.f274161b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ej0.b bVar2 = this.f274162c;
        return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
