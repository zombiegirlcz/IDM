package a0j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f425c;
    public final x d;
    public final List e;
    public final y f;

    public z(int i, int i2, x summary, List elements, y yVar) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f423a = i;
        this.f424b = 100;
        this.f425c = i2;
        this.d = summary;
        this.e = elements;
        this.f = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f423a == zVar.f423a && this.f424b == zVar.f424b && this.f425c == zVar.f425c && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d((this.d.hashCode() + j6.a.b(this.f425c, j6.a.b(this.f424b, Integer.hashCode(this.f423a) * 31, 31), 31)) * 31, 31, this.e);
        y yVar = this.f;
        return iD + (yVar == null ? 0 : yVar.hashCode());
    }
}
