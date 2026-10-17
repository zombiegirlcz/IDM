package kw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f190192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw0.b f190193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f190194c;

    public h(Clause clause, dw0.b bVar, i style, int i) {
        bVar = (i & 2) != 0 ? null : bVar;
        style = (i & 8) != 0 ? i.HEADING1 : style;
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f190192a = clause;
        this.f190193b = bVar;
        this.f190194c = style;
    }

    @Override // kw0.j
    public final i a() {
        return this.f190194c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f190192a, hVar.f190192a) && this.f190193b == hVar.f190193b && this.f190194c == hVar.f190194c;
    }

    public final int hashCode() {
        int iHashCode = this.f190192a.hashCode() * 31;
        dw0.b bVar = this.f190193b;
        return this.f190194c.hashCode() + j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, false);
    }
}
