package j68;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f171691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f171692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f171693c;
    public final boolean d;
    public final TextLocalisedClause e;

    public h(TextLocalisedClause title, Clause clause, LocalDate localDate, boolean z, TextLocalisedClause buttonLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f171691a = title;
        this.f171692b = clause;
        this.f171693c = localDate;
        this.d = z;
        this.e = buttonLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f171691a.equals(hVar.f171691a) && Intrinsics.f(this.f171692b, hVar.f171692b) && Intrinsics.f(this.f171693c, hVar.f171693c) && this.d == hVar.d && this.e.equals(hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f171691a.hashCode() * 31;
        Clause clause = this.f171692b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        LocalDate localDate = this.f171693c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.d);
    }
}
