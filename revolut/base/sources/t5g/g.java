package t5g;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f268109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.d f268110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f268111c;
    public final Date d;
    public final Date e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f268112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextLocalisedClause f268113h;

    public g(vim.e calendarDatesRange, vim.e eVar, Date selectableDatesStart, Date selectableDatesEnd, Date currentDate, boolean z, CompositeClause compositeClause, TextLocalisedClause confirmButtonText) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(selectableDatesStart, "selectableDatesStart");
        Intrinsics.checkNotNullParameter(selectableDatesEnd, "selectableDatesEnd");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        this.f268109a = calendarDatesRange;
        this.f268110b = eVar;
        this.f268111c = selectableDatesStart;
        this.d = selectableDatesEnd;
        this.e = currentDate;
        this.f = z;
        this.f268112g = compositeClause;
        this.f268113h = confirmButtonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f268109a.equals(gVar.f268109a) && Intrinsics.f(this.f268110b, gVar.f268110b) && Intrinsics.f(this.f268111c, gVar.f268111c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && Intrinsics.f(this.f268112g, gVar.f268112g) && this.f268113h.equals(gVar.f268113h);
    }

    public final int hashCode() {
        int iHashCode = this.f268109a.hashCode() * 31;
        vim.d dVar = this.f268110b;
        int iC = j6.a.c(t61.a.e(this.e, t61.a.e(this.d, t61.a.e(this.f268111c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31), 31, this.f);
        Clause clause = this.f268112g;
        return this.f268113h.hashCode() + ((iC + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
