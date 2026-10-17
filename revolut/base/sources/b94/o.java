package b94;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f13653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f13654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f13655c;
    public final boolean d;
    public final List e;
    public final ArrayList f;

    public o(TextLocalisedClause title, TextLocalisedClause buttonTitle, TextLocalisedClause textLocalisedClause, ArrayList items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f13653a = title;
        this.f13654b = buttonTitle;
        this.f13655c = textLocalisedClause;
        this.d = z;
        this.e = menuItems;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f13653a.equals(oVar.f13653a) && this.f13654b.equals(oVar.f13654b) && Intrinsics.f(this.f13655c, oVar.f13655c) && this.d == oVar.d && Intrinsics.f(this.e, oVar.e) && this.f.equals(oVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f13653a.hashCode() * 31, 31, this.f13654b);
        Clause clause = this.f13655c;
        return this.f.hashCode() + p.a.d(j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
