package iyi;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f169760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f169761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f169762c;
    public final aw0.h d;

    public d(ArrayList items, TextClause title, Clause clause, aw0.h actionFooter) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        this.f169760a = items;
        this.f169761b = title;
        this.f169762c = clause;
        this.d = actionFooter;
    }

    @Override // cli.p
    public final List c() {
        return this.f169760a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f169760a.equals(dVar.f169760a) && this.f169761b.equals(dVar.f169761b) && Intrinsics.f(this.f169762c, dVar.f169762c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        int iB = v7.b(this.f169760a.hashCode() * 31, 31, this.f169761b);
        Clause clause = this.f169762c;
        return this.d.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
