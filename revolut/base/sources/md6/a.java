package md6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ld6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f204482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f204483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f204484c;
    public final f d;
    public final boolean e;
    public final boolean f;

    public a(e type, o currency, d state, f balanceType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        this.f204482a = type;
        this.f204483b = currency;
        this.f204484c = state;
        this.d = balanceType;
        this.e = z;
        this.f = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f204482a == aVar.f204482a && Intrinsics.f(this.f204483b, aVar.f204483b) && this.f204484c == aVar.f204484c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c((this.d.hashCode() + ((this.f204484c.hashCode() + ((this.f204483b.hashCode() + (this.f204482a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public /* synthetic */ a(e eVar, o oVar, d dVar, f fVar, int i) {
        this(eVar, oVar, (i & 4) != 0 ? d.OPENED : dVar, (i & 8) != 0 ? f.SIMPLE : fVar, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(e type, xi0.b bVar, d dVar, f fVar, int i) {
        bVar = (i & 2) != 0 ? null : bVar;
        d state = (i & 4) != 0 ? d.OPENED : dVar;
        f balanceType = (i & 8) != 0 ? f.SIMPLE : fVar;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        this(type, bVar != null ? new n(bVar) : m.f204493a, state, balanceType, false, false);
    }
}
