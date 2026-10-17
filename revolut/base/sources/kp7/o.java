package kp7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f188186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f188187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f188188c;
    public final String d;
    public final Object e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f188189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f188190h;
    public final Object i;

    public o(List items, CompositeClause compositeClause, List tabs, String str, Clause primaryButtonText, TextLocalisedClause textLocalisedClause, boolean z, boolean z3, Clause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f188186a = items;
        this.f188187b = compositeClause;
        this.f188188c = tabs;
        this.d = str;
        this.e = primaryButtonText;
        this.f = textLocalisedClause;
        this.f188189g = z;
        this.f188190h = z3;
        this.i = title;
    }

    @Override // jki.n
    public final List c() {
        return this.f188186a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f188186a, oVar.f188186a) && this.f188187b.equals(oVar.f188187b) && Intrinsics.f(this.f188188c, oVar.f188188c) && Intrinsics.f(this.d, oVar.d) && this.e.equals(oVar.e) && Intrinsics.f(this.f, oVar.f) && this.f188189g == oVar.f188189g && this.f188190h == oVar.f188190h && this.i.equals(oVar.i);
    }

    public final int hashCode() {
        int iD = p.a.d(h30.l.c(this.f188187b, this.f188186a.hashCode() * 31, 31), 31, this.f188188c);
        String str = this.d;
        int iB = p.a.b((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Clause clause = this.f;
        return this.i.hashCode() + j6.a.c(j6.a.c((iB + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.f188189g), 31, this.f188190h);
    }
}
