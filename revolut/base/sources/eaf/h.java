package eaf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f124235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f124236b;

    public h(Clause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124235a = title;
        this.f124236b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f124235a.equals(hVar.f124235a) && Intrinsics.f(this.f124236b, hVar.f124236b);
    }

    public final int hashCode() {
        int iHashCode = this.f124235a.hashCode() * 31;
        Clause clause = this.f124236b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
