package dyg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f121114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f121115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f121116c;
    public final boolean d;

    public i(Clause title, TextLocalisedClause topDescription, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(topDescription, "topDescription");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f121114a = topDescription;
        this.f121115b = title;
        this.f121116c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f121114a.equals(iVar.f121114a) && this.f121115b.equals(iVar.f121115b) && this.f121116c == iVar.f121116c && this.d == iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.b(this.f121114a.hashCode() * 31, 31, this.f121115b), 31, this.f121116c);
    }
}
