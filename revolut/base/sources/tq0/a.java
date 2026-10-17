package tq0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements koi.j, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f273445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f273446c;
    public final boolean d;
    public final boolean e;
    public d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f273447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vf0.h f273448h;
    public final Object i;

    public a(String listId, Clause clause, b style, boolean z, boolean z3, boolean z4, vf0.h hVar, Object obj2, int i) {
        style = (i & 4) != 0 ? b.REGULAR : style;
        z4 = (i & 64) != 0 ? false : z4;
        hVar = (i & 128) != 0 ? null : hVar;
        obj2 = (i & 256) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f273444a = listId;
        this.f273445b = clause;
        this.f273446c = style;
        this.d = z;
        this.e = z3;
        this.f = null;
        this.f273447g = z4;
        this.f273448h = hVar;
        this.i = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53016n() {
        return this.i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59236a() {
        return this.f273444a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f273444a, aVar.f273444a) && Intrinsics.f(this.f273445b, aVar.f273445b) && this.f273446c == aVar.f273446c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.f273447g == aVar.f273447g && Intrinsics.f(this.f273448h, aVar.f273448h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f273446c.hashCode() + p.a.b(this.f273444a.hashCode() * 31, 31, this.f273445b)) * 31, 31, this.d), 31, this.e);
        d dVar = this.f;
        int iC2 = j6.a.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f273447g);
        vf0.h hVar = this.f273448h;
        int iHashCode = (iC2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Object obj2 = this.i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof a ? (a) oldItem : null) == null) {
            return null;
        }
        a aVar = (a) oldItem;
        boolean z3 = !Intrinsics.f(this.f273445b, aVar.f273445b);
        boolean z4 = false;
        boolean z6 = this.f273446c != aVar.f273446c;
        if (this.d != aVar.d) {
            z = false;
            z4 = true;
        } else {
            z = false;
        }
        return new e(z3, z6, z4, this.e != aVar.e ? true : z, this.f != aVar.f ? true : z, this.f273447g != aVar.f273447g ? true : z, !Intrinsics.f(this.f273448h, aVar.f273448h));
    }
}
