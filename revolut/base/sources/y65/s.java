package y65;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f311180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f311181c;
    public final boolean d;
    public final LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer e;

    public s(String id10, TextLocalisedClause title, Clause subtitle, boolean z, LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer loanPaymentScheduleMapper$ScheduleStep$InfoExplainer) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f311179a = id10;
        this.f311180b = title;
        this.f311181c = subtitle;
        this.d = z;
        this.e = loanPaymentScheduleMapper$ScheduleStep$InfoExplainer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f311179a.equals(sVar.f311179a) && this.f311180b.equals(sVar.f311180b) && this.f311181c.equals(sVar.f311181c) && this.d == sVar.d && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.b(t61.a.a(this.f311179a.hashCode() * 31, 31, this.f311180b), 31, this.f311181c), 31, this.d);
        LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer loanPaymentScheduleMapper$ScheduleStep$InfoExplainer = this.e;
        return iC + (loanPaymentScheduleMapper$ScheduleStep$InfoExplainer == null ? 0 : loanPaymentScheduleMapper$ScheduleStep$InfoExplainer.hashCode());
    }
}
