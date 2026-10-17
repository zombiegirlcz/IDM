package q43;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f242009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f242010c;
    public final Clause d;
    public final Clause e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f242011g;

    public c0(List items, boolean z, boolean z3, Clause clause, TextLocalisedClause textLocalisedClause, ArrayList tabs, String selectedTabId) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f242008a = items;
        this.f242009b = z;
        this.f242010c = z3;
        this.d = clause;
        this.e = textLocalisedClause;
        this.f = tabs;
        this.f242011g = selectedTabId;
    }

    @Override // q43.e0
    public final Clause a() {
        return this.d;
    }

    @Override // jki.n
    public final List c() {
        return this.f242008a;
    }

    @Override // q43.e0
    public final Clause d() {
        return this.e;
    }

    @Override // q43.e0
    public final boolean e() {
        return this.f242010c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f242008a, c0Var.f242008a) && this.f242009b == c0Var.f242009b && this.f242010c == c0Var.f242010c && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && this.f.equals(c0Var.f) && Intrinsics.f(this.f242011g, c0Var.f242011g);
    }

    @Override // q43.e0
    public final boolean f() {
        return this.f242009b;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f242008a.hashCode() * 31, 31, this.f242009b), 31, this.f242010c);
        Clause clause = this.d;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return this.f242011g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31);
    }
}
