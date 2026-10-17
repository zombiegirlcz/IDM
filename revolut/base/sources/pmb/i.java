package pmb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f237538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f237539c;
    public final int d;
    public final Clause e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f237540g;

    public i(List items, List tabItems, b ctaButtonUIState, int i, CompositeClause compositeClause, TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        Intrinsics.checkNotNullParameter(ctaButtonUIState, "ctaButtonUIState");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f237537a = items;
        this.f237538b = tabItems;
        this.f237539c = ctaButtonUIState;
        this.d = i;
        this.e = compositeClause;
        this.f = title;
        this.f237540g = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return new h(!Intrinsics.f(r7.f237538b, this.f237538b), !Intrinsics.f(r7.f237539c, this.f237539c), ((i) oldState).d != this.d, !Intrinsics.f(r7.f, this.f));
    }

    @Override // cli.p
    public final List c() {
        return this.f237537a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f237537a, iVar.f237537a) && Intrinsics.f(this.f237538b, iVar.f237538b) && Intrinsics.f(this.f237539c, iVar.f237539c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f237540g == iVar.f237540g;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, (this.f237539c.hashCode() + p.a.d(this.f237537a.hashCode() * 31, 31, this.f237538b)) * 31, 31);
        Clause clause = this.e;
        return Boolean.hashCode(this.f237540g) + t61.a.a((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f);
    }

    public /* synthetic */ i(List list, f0 f0Var, b bVar, TextLocalisedClause textLocalisedClause) {
        this(list, f0Var, bVar, 0, null, textLocalisedClause, false);
    }
}
