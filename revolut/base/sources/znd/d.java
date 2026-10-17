package znd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f323740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f323741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f323742c;
    public final boolean d;
    public final ArrayList e;
    public final String f;

    public d(MoneyClause title, Clause topDescription, Clause clause, boolean z, ArrayList chartSwitcherItems, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topDescription, "topDescription");
        Intrinsics.checkNotNullParameter(chartSwitcherItems, "chartSwitcherItems");
        this.f323740a = title;
        this.f323741b = topDescription;
        this.f323742c = clause;
        this.d = z;
        this.e = chartSwitcherItems;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f323740a.equals(dVar.f323740a) && this.f323741b.equals(dVar.f323741b) && Intrinsics.f(this.f323742c, dVar.f323742c) && this.d == dVar.d && this.e.equals(dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f323740a.hashCode() * 31, 31, this.f323741b);
        Clause clause = this.f323742c;
        int iB2 = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, j6.a.c((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31);
        String str = this.f;
        return iB2 + (str != null ? str.hashCode() : 0);
    }
}
