package bvb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f18990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f18991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18992c;

    public j(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18990a = title;
        this.f18991b = textLocalisedClause;
        this.f18992c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f18990a, jVar.f18990a) && Intrinsics.f(this.f18991b, jVar.f18991b) && this.f18992c == jVar.f18992c;
    }

    public final int hashCode() {
        int iHashCode = this.f18990a.hashCode() * 31;
        Clause clause = this.f18991b;
        return Boolean.hashCode(this.f18992c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    public /* synthetic */ j(int i, TextLocalisedClause textLocalisedClause) {
        this(textLocalisedClause, null, (i & 4) == 0);
    }
}
