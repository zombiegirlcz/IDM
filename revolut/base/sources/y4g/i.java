package y4g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import l7g.q;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f310925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f310926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f310927c;
    public final boolean d;
    public final Clause e;

    public i(g initialContact, g contact, q qVar, boolean z, Clause clause) {
        Intrinsics.checkNotNullParameter(initialContact, "initialContact");
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f310925a = initialContact;
        this.f310926b = contact;
        this.f310927c = qVar;
        this.d = z;
        this.e = clause;
    }

    public static i a(i iVar, g gVar, boolean z, TextLocalisedClause textLocalisedClause, int i) {
        g initialContact = iVar.f310925a;
        if ((i & 2) != 0) {
            gVar = iVar.f310926b;
        }
        g contact = gVar;
        q qVar = iVar.f310927c;
        if ((i & 8) != 0) {
            z = iVar.d;
        }
        boolean z3 = z;
        Clause clause = textLocalisedClause;
        if ((i & 16) != 0) {
            clause = iVar.e;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(initialContact, "initialContact");
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new i(initialContact, contact, qVar, z3, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f310925a, iVar.f310925a) && Intrinsics.f(this.f310926b, iVar.f310926b) && this.f310927c == iVar.f310927c && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f310926b.hashCode() + (this.f310925a.hashCode() * 31)) * 31;
        q qVar = this.f310927c;
        int iC = j6.a.c((iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.d);
        Clause clause = this.e;
        return iC + (clause != null ? clause.hashCode() : 0);
    }
}
