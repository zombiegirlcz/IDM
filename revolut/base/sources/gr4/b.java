package gr4;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import yw4.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f145933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f145934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f145935c;
    public final p d;

    public b(Integer num, c cVar, Clause clause, p pVar) {
        this.f145933a = num;
        this.f145934b = cVar;
        this.f145935c = clause;
        this.d = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f145933a, bVar.f145933a) && Intrinsics.f(this.f145934b, bVar.f145934b) && Intrinsics.f(this.f145935c, bVar.f145935c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        Integer num = this.f145933a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        c cVar = this.f145934b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Clause clause = this.f145935c;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        p pVar = this.d;
        return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
    }
}
