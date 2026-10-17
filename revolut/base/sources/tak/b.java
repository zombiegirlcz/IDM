package tak;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pending_payments.api.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f269356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f269357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f269358c;

    public b() {
        this(7, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f269356a, bVar.f269356a) && Intrinsics.f(this.f269357b, bVar.f269357b) && Intrinsics.f(this.f269358c, bVar.f269358c);
    }

    public final int hashCode() {
        Clause clause = this.f269356a;
        return this.f269358c.hashCode() + t61.a.a((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f269357b);
    }

    public b(Clause clause, TextLocalisedClause acceptClause, TextLocalisedClause declineClause) {
        Intrinsics.checkNotNullParameter(acceptClause, "acceptClause");
        Intrinsics.checkNotNullParameter(declineClause, "declineClause");
        this.f269356a = clause;
        this.f269357b = acceptClause;
        this.f269358c = declineClause;
    }

    public /* synthetic */ b(int i, TextLocalisedClause textLocalisedClause) {
        this((i & 1) != 0 ? null : textLocalisedClause, new TextLocalisedClause(R$string.pending_payments_footer_action_accept, null, null, 14), new TextLocalisedClause(R$string.pending_payments_footer_action_decline, null, null, 14));
    }
}
