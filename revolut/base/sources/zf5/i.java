package zf5;

import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f321872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f321873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f321874c;
    public final boolean d;
    public final String e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f321875g;

    public i(TextLocalisedClause title, TextLocalisedClause description, List tabs, boolean z, String str, TextLocalisedClause textLocalisedClause, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f321872a = title;
        this.f321873b = description;
        this.f321874c = tabs;
        this.d = z;
        this.e = str;
        this.f = textLocalisedClause;
        this.f321875g = clause;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof i ? (i) oldState : null) == null) {
            return null;
        }
        return new h(!r9.f321872a.equals(this.f321872a), !r9.f321873b.equals(this.f321873b), !Intrinsics.f(r9.f321874c, this.f321874c), !Intrinsics.f(r9.e, this.e), !Intrinsics.f(r9.f, this.f));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f321872a.equals(iVar.f321872a) && this.f321873b.equals(iVar.f321873b) && Intrinsics.f(this.f321874c, iVar.f321874c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f321875g, iVar.f321875g);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(t61.a.a(this.f321872a.hashCode() * 31, 31, this.f321873b), 31, this.f321874c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Clause clause = this.f;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f321875g;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
