package xsf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f308476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f308477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f308478c;
    public final Clause d;

    public q(ArrayList items, aw0.e actionFooterModel, Clause title, TextClause textClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f308476a = items;
        this.f308477b = actionFooterModel;
        this.f308478c = title;
        this.d = textClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f308476a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f308476a.equals(qVar.f308476a) && this.f308477b.equals(qVar.f308477b) && this.f308478c.equals(qVar.f308478c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iA = p.a.a(ehe.n.c(this.f308477b, this.f308476a.hashCode() * 31, 31), 31, this.f308478c);
        Clause clause = this.d;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
