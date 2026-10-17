package jxe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f179163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f179164b;

    public a(Clause primary, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f179163a = primary;
        this.f179164b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f179163a, aVar.f179163a) && Intrinsics.f(this.f179164b, aVar.f179164b);
    }

    public final int hashCode() {
        int iHashCode = this.f179163a.hashCode() * 31;
        Clause clause = this.f179164b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
