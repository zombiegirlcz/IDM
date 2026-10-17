package fmb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f136312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f136313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f136314c;
    public final ResourceImage d;
    public final CurrencyImage e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f136315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f136316h;
    public final Clause i;

    public y(TextLocalisedClause title, CompositeClause compositeClause, Clause clause, ResourceImage titleEndIcon, CurrencyImage navBarEndIcon, TextLocalisedClause toolbarTitle, Clause clause2, x xVar, TextClause textClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleEndIcon, "titleEndIcon");
        Intrinsics.checkNotNullParameter(navBarEndIcon, "navBarEndIcon");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f136312a = title;
        this.f136313b = compositeClause;
        this.f136314c = clause;
        this.d = titleEndIcon;
        this.e = navBarEndIcon;
        this.f = toolbarTitle;
        this.f136315g = clause2;
        this.f136316h = xVar;
        this.i = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f136312a.equals(yVar.f136312a) && Intrinsics.f(this.f136313b, yVar.f136313b) && Intrinsics.f(this.f136314c, yVar.f136314c) && this.d.equals(yVar.d) && this.e.equals(yVar.e) && this.f.equals(yVar.f) && Intrinsics.f(this.f136315g, yVar.f136315g) && Intrinsics.f(this.f136316h, yVar.f136316h) && Intrinsics.f(this.i, yVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f136312a.hashCode() * 31;
        Clause clause = this.f136313b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f136314c;
        int iA = t61.a.a((this.e.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.d, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31)) * 31, 31, this.f);
        Clause clause3 = this.f136315g;
        int iHashCode3 = (iA + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        x xVar = this.f136316h;
        int iHashCode4 = (iHashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        Clause clause4 = this.i;
        return iHashCode4 + (clause4 != null ? clause4.hashCode() : 0);
    }
}
