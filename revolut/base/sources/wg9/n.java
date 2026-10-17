package wg9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f297255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f297256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f297257c;
    public final aw0.e d;
    public final boolean e;

    public n(ArrayList items, TextLocalisedClause title, Clause clause, aw0.e footerModel, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        this.f297255a = items;
        this.f297256b = title;
        this.f297257c = clause;
        this.d = footerModel;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f297255a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f297255a.equals(nVar.f297255a) && this.f297256b.equals(nVar.f297256b) && Intrinsics.f(this.f297257c, nVar.f297257c) && this.d.equals(nVar.d) && this.e == nVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f297255a.hashCode() * 31, 31, this.f297256b);
        Clause clause = this.f297257c;
        return Boolean.hashCode(this.e) + ehe.n.c(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
