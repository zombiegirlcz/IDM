package ljd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f195650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f195651b;

    public a(Clause period, TextLocalisedClause status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f195650a = status;
        this.f195651b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f195650a.equals(aVar.f195650a) && this.f195651b.equals(aVar.f195651b);
    }

    public final int hashCode() {
        return this.f195651b.hashCode() + (this.f195650a.hashCode() * 31);
    }
}
