package aw0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i4 extends j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10355c;
    public final Color d;
    public final List e;

    public i4(String id10, Clause clause, long j2, Color color, List subSegments) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(subSegments, "subSegments");
        this.f10353a = id10;
        this.f10354b = clause;
        this.f10355c = j2;
        this.d = color;
        this.e = subSegments;
    }

    public static i4 e(i4 i4Var, String str, Color.Opaque opaque, int i) {
        if ((i & 1) != 0) {
            str = i4Var.f10353a;
        }
        String id10 = str;
        Clause clause = i4Var.f10354b;
        long j2 = i4Var.f10355c;
        Color color = opaque;
        if ((i & 8) != 0) {
            color = i4Var.d;
        }
        Color color2 = color;
        List subSegments = i4Var.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(color2, "color");
        Intrinsics.checkNotNullParameter(subSegments, "subSegments");
        return new i4(id10, clause, j2, color2, subSegments);
    }

    @Override // aw0.j4
    public final String a() {
        return this.f10353a;
    }

    @Override // aw0.j4
    public final Clause b() {
        return this.f10354b;
    }

    @Override // aw0.j4
    public final List c() {
        return this.e;
    }

    @Override // aw0.j4
    public final long d() {
        return this.f10355c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj2;
        return Intrinsics.f(this.f10353a, i4Var.f10353a) && Intrinsics.f(this.f10354b, i4Var.f10354b) && this.f10355c == i4Var.f10355c && Intrinsics.f(this.d, i4Var.d) && Intrinsics.f(this.e, i4Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f10353a.hashCode() * 31;
        Clause clause = this.f10354b;
        return this.e.hashCode() + ehe.n.d(this.d, a0.d.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f10355c), 31);
    }

    public i4(String str, Clause clause, long j2, Color.Solid solid) {
        this(str, clause, j2, solid, zhm.f0.f322471a);
    }
}
