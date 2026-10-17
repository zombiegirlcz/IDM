package cxe;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f109959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f109960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109961c;
    public final List d;

    public p(Clause title, Clause clause, int i, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f109959a = title;
        this.f109960b = clause;
        this.f109961c = i;
        this.d = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f109959a, pVar.f109959a) && Intrinsics.f(this.f109960b, pVar.f109960b) && this.f109961c == pVar.f109961c && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f109959a.hashCode() * 31;
        Clause clause = this.f109960b;
        return this.d.hashCode() + j6.a.b(this.f109961c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
