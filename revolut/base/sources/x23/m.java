package x23;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f302486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f302487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f302488c;
    public final Object d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f302489g;

    public m(h cardPersonalisationSnapshot, l buttonsConfig, TextLocalisedClause toolbarTitle, Clause toolbarDescription, List menuItems, boolean z, List fontSuggestionsItems) {
        Intrinsics.checkNotNullParameter(cardPersonalisationSnapshot, "cardPersonalisationSnapshot");
        Intrinsics.checkNotNullParameter(buttonsConfig, "buttonsConfig");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(fontSuggestionsItems, "fontSuggestionsItems");
        this.f302486a = cardPersonalisationSnapshot;
        this.f302487b = buttonsConfig;
        this.f302488c = toolbarTitle;
        this.d = toolbarDescription;
        this.e = menuItems;
        this.f = z;
        this.f302489g = fontSuggestionsItems;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof m)) {
            return null;
        }
        return new n(!this.f302487b.equals(r9.f302487b), !this.f302488c.equals(r9.f302488c), !this.d.equals(r9.d), !Intrinsics.f(this.e, r9.e), this.f != ((m) oldState).f, !Intrinsics.f(this.f302489g, r9.f302489g));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f302486a.equals(mVar.f302486a) && this.f302487b.equals(mVar.f302487b) && this.f302488c.equals(mVar.f302488c) && this.d.equals(mVar.d) && Intrinsics.f(this.e, mVar.e) && this.f == mVar.f && Intrinsics.f(this.f302489g, mVar.f302489g);
    }

    public final int hashCode() {
        return this.f302489g.hashCode() + j6.a.c(p.a.d(p.a.b(t61.a.a((this.f302487b.hashCode() + (this.f302486a.hashCode() * 31)) * 31, 31, this.f302488c), 31, this.d), 31, this.e), 31, this.f);
    }
}
