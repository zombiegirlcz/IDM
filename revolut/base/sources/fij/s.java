package fij;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f135457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f135458b;

    public s(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f135457a = title;
        this.f135458b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f135457a, sVar.f135457a) && Intrinsics.f(this.f135458b, sVar.f135458b);
    }

    public final int hashCode() {
        int iHashCode = this.f135457a.hashCode() * 31;
        Clause clause = this.f135458b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    public s(int i) {
        this(new TextLocalisedClause(i, null, null, 14), null);
    }
}
