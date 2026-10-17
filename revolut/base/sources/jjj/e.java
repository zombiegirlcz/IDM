package jjj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f174998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f174999b;

    public e(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f174998a = title;
        this.f174999b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f174998a.equals(eVar.f174998a) && Intrinsics.f(this.f174999b, eVar.f174999b);
    }

    public final int hashCode() {
        int iHashCode = this.f174998a.hashCode() * 31;
        Clause clause = this.f174999b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
