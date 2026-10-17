package djc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.k f115304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f115305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f115306c;
    public final List d;

    public j(aw0.k kVar, CompositeClause title, TextLocalisedClause textLocalisedClause, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f115304a = kVar;
        this.f115305b = title;
        this.f115306c = textLocalisedClause;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f115304a.equals(jVar.f115304a) && this.f115305b.equals(jVar.f115305b) && Intrinsics.f(this.f115306c, jVar.f115306c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = h30.l.c(this.f115305b, this.f115304a.hashCode() * 31, 31);
        Clause clause = this.f115306c;
        return this.d.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
