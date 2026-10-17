package bx1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19481c;

    public a(Object obj2, Object obj3, boolean z) {
        this.f19479a = obj2;
        this.f19480b = obj3;
        this.f19481c = z;
    }

    public final Clause a(Function1 clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Clause clause2 = (Clause) clause.invoke(this.f19479a);
        return clause2 == null ? new TextLocalisedClause(R$string.mandate_details_authorisation_none, null, null, 14) : clause2;
    }

    public final TextLocalisedClause b(Function1 clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (!this.f19481c) {
            return null;
        }
        Object textLocalisedClause = (Clause) clause.invoke(this.f19480b);
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.mandate_details_authorisation_none, null, null, 14);
        }
        return new TextLocalisedClause(R$string.mandate_details_authorisation_was_placeholder, u.c(textLocalisedClause), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f19479a, aVar.f19479a) && Intrinsics.f(this.f19480b, aVar.f19480b) && this.f19481c == aVar.f19481c;
    }

    public final int hashCode() {
        Object obj2 = this.f19479a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f19480b;
        return Boolean.hashCode(this.f19481c) + ((iHashCode + (obj3 != null ? obj3.hashCode() : 0)) * 31);
    }
}
