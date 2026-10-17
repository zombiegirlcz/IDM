package xsh;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f308497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f308498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f308499c;
    public final Clause d;
    public final boolean e;

    public g(ArrayList items, int i, Clause clause, Clause clause2, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308497a = items;
        this.f308498b = i;
        this.f308499c = clause;
        this.d = clause2;
        this.e = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f308497a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f308497a.equals(gVar.f308497a) && this.f308498b == gVar.f308498b && Intrinsics.f(this.f308499c, gVar.f308499c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f308498b, this.f308497a.hashCode() * 31, 31);
        Clause clause = this.f308499c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
