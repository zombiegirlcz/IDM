package tt7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f274245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f274246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f274247c;

    public j(TextClause title, TextClause textClause, aim.e actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f274245a = title;
        this.f274246b = textClause;
        this.f274247c = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f274245a.equals(jVar.f274245a) && Intrinsics.f(this.f274246b, jVar.f274246b) && Intrinsics.f(this.f274247c, jVar.f274247c);
    }

    public final int hashCode() {
        int iHashCode = this.f274245a.hashCode() * 31;
        Clause clause = this.f274246b;
        return this.f274247c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
