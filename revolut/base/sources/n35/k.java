package n35;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f211874c;
    public final LocalDate d;
    public final LocalDate e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f211875g;

    public k(String id10, String loanId, LocalDate issueDate, LocalDate periodFrom, LocalDate periodTo, j type, String statementLink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(periodFrom, "periodFrom");
        Intrinsics.checkNotNullParameter(periodTo, "periodTo");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(statementLink, "statementLink");
        this.f211872a = id10;
        this.f211873b = loanId;
        this.f211874c = issueDate;
        this.d = periodFrom;
        this.e = periodTo;
        this.f = type;
        this.f211875g = statementLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f211872a, kVar.f211872a) && Intrinsics.f(this.f211873b, kVar.f211873b) && Intrinsics.f(this.f211874c, kVar.f211874c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f && Intrinsics.f(this.f211875g, kVar.f211875g);
    }

    public final int hashCode() {
        return this.f211875g.hashCode() + ((this.f.hashCode() + y.a(y.a(y.a(p.a.c(this.f211872a.hashCode() * 31, 31, this.f211873b), 31, this.f211874c), 31, this.d), 31, this.e)) * 31);
    }
}
