package rrb;

import aii.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f256747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256748b;

    public a(Clause descriptionClause, TextLocalisedClause titleClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(descriptionClause, "descriptionClause");
        this.f256747a = titleClause;
        this.f256748b = descriptionClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f256747a.equals(aVar.f256747a) && this.f256748b.equals(aVar.f256748b);
    }

    public final int hashCode() {
        return this.f256748b.hashCode() + (this.f256747a.hashCode() * 31);
    }
}
