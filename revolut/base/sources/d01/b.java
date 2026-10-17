package d01;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f110278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f110279c;
    public final boolean d;
    public final f e;
    public final Clause f;

    public b(String id10, Clause text, Object obj2, boolean z, f style, Clause clause, int i) {
        obj2 = (i & 4) != 0 ? null : obj2;
        z = (i & 8) != 0 ? true : z;
        style = (i & 16) != 0 ? f.DEFAULT : style;
        clause = (i & 32) != 0 ? null : clause;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f110277a = id10;
        this.f110278b = text;
        this.f110279c = obj2;
        this.d = z;
        this.e = style;
        this.f = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f110277a, bVar.f110277a) && Intrinsics.f(this.f110278b, bVar.f110278b) && Intrinsics.f(this.f110279c, bVar.f110279c) && this.d == bVar.d && this.e == bVar.e && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f110277a.hashCode() * 31, 31, this.f110278b);
        Object obj2 = this.f110279c;
        int iHashCode = (this.e.hashCode() + j6.a.c((iA + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.d)) * 31;
        Clause clause = this.f;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }
}
