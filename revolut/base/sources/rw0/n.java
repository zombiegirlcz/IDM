package rw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f257813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f257814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f257815c;
    public final m d;
    public final m e;
    public final f f;

    public n(c cVar, Clause clause, Clause clause2, m mVar, m mVar2, f fVar) {
        this.f257813a = cVar;
        this.f257814b = clause;
        this.f257815c = clause2;
        this.d = mVar;
        this.e = mVar2;
        this.f = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f257813a.equals(nVar.f257813a) && this.f257814b.equals(nVar.f257814b) && Intrinsics.f(this.f257815c, nVar.f257815c) && this.d.equals(nVar.d) && this.e.equals(nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f257813a.hashCode() * 31, 31, this.f257814b);
        Clause clause = this.f257815c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31;
        f fVar = this.f;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }
}
