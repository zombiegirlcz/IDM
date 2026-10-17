package d3i;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a97.c f111161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a97.c f111162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f111163c;
    public final qta.c d;

    public b(a97.c fromSide, a97.c toSide, Data plot, qta.c cVar) {
        Intrinsics.checkNotNullParameter(fromSide, "fromSide");
        Intrinsics.checkNotNullParameter(toSide, "toSide");
        Intrinsics.checkNotNullParameter(plot, "plot");
        this.f111161a = fromSide;
        this.f111162b = toSide;
        this.f111163c = plot;
        this.d = cVar;
    }

    public static b d(b bVar, Data plot, qta.c cVar, int i) {
        a97.c fromSide = bVar.f111161a;
        a97.c toSide = bVar.f111162b;
        if ((i & 4) != 0) {
            plot = bVar.f111163c;
        }
        if ((i & 8) != 0) {
            cVar = bVar.d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(fromSide, "fromSide");
        Intrinsics.checkNotNullParameter(toSide, "toSide");
        Intrinsics.checkNotNullParameter(plot, "plot");
        return new b(fromSide, toSide, plot, cVar);
    }

    @Override // d3i.c
    public final qta.c A() {
        return this.d;
    }

    @Override // d3i.c
    public final xi0.b a() {
        return this.f111161a.f2366a;
    }

    @Override // d3i.c
    public final xi0.b b() {
        return this.f111162b.f2366a;
    }

    @Override // d3i.c
    public final Data c() {
        return this.f111163c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f111161a, bVar.f111161a) && Intrinsics.f(this.f111162b, bVar.f111162b) && Intrinsics.f(this.f111163c, bVar.f111163c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f111163c, (this.f111162b.hashCode() + (this.f111161a.hashCode() * 31)) * 31, 31);
        qta.c cVar = this.d;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
