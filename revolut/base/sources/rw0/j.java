package rw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeClause f257808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f257809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f257810c;
    public final d d;

    public j(TimeClause headingText, TextClause textClause, TextClause subheadingText, d dVar) {
        Intrinsics.checkNotNullParameter(headingText, "headingText");
        Intrinsics.checkNotNullParameter(subheadingText, "subheadingText");
        this.f257808a = headingText;
        this.f257809b = textClause;
        this.f257810c = subheadingText;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f257808a, jVar.f257808a) && Intrinsics.f(this.f257809b, jVar.f257809b) && Intrinsics.f(this.f257810c, jVar.f257810c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f257808a.hashCode() * 31;
        Clause clause = this.f257809b;
        int iB = v7.b((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f257810c);
        d dVar = this.d;
        return iB + (dVar != null ? dVar.hashCode() : 0);
    }
}
