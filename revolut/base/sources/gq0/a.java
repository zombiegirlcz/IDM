package gq0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f145488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f145489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f145490c;
    public final Function0 d;

    public a(int i, Clause clause, n nVar, Function0 perform) {
        Intrinsics.checkNotNullParameter(perform, "perform");
        this.f145488a = i;
        this.f145489b = clause;
        this.f145490c = nVar;
        this.d = perform;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f145488a == aVar.f145488a && Intrinsics.f(this.f145489b, aVar.f145489b) && Intrinsics.f(this.f145490c, aVar.f145490c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f145488a) * 31;
        Clause clause = this.f145489b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        n nVar = this.f145490c;
        return this.d.hashCode() + ((iHashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31);
    }
}
