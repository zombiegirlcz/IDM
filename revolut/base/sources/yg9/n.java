package yg9;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f313587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f313588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f313589c;
    public final List d;

    public n(ArrayList items, Clause clause, aw0.e footerModel, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f313587a = items;
        this.f313588b = clause;
        this.f313589c = footerModel;
        this.d = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f313587a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f313587a.equals(nVar.f313587a) && Intrinsics.f(this.f313588b, nVar.f313588b) && this.f313589c.equals(nVar.f313589c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f313587a.hashCode() * 31;
        Clause clause = this.f313588b;
        return this.d.hashCode() + ehe.n.c(this.f313589c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
