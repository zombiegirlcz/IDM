package pf4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f235463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f235464c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f235465g;

    public u(List items, t headerContent, boolean z, Clause clause, TextLocalisedClause textLocalisedClause, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerContent, "headerContent");
        this.f235462a = items;
        this.f235463b = headerContent;
        this.f235464c = z;
        this.d = clause;
        this.e = textLocalisedClause;
        this.f = z3;
        this.f235465g = z4;
    }

    @Override // cli.p
    public final List c() {
        return this.f235462a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f235462a, uVar.f235462a) && Intrinsics.f(this.f235463b, uVar.f235463b) && this.f235464c == uVar.f235464c && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && this.f == uVar.f && this.f235465g == uVar.f235465g;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f235463b.hashCode() + (this.f235462a.hashCode() * 31)) * 31, 31, this.f235464c);
        Clause clause = this.d;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return Boolean.hashCode(this.f235465g) + j6.a.c((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.f);
    }

    public /* synthetic */ u(List list, t tVar, boolean z, TextLocalisedClause textLocalisedClause, boolean z3, int i) {
        this(list, tVar, z, (i & 8) != 0 ? null : textLocalisedClause, null, (i & 32) != 0 ? false : z3, false);
    }
}
