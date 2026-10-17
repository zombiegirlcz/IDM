package l5a;

import aw0.k9;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5a.a f192208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f192209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f192210c;
    public final k9 d;
    public final aw0.b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarMessage f192211g;

    public m(i5a.a aVar, List menuItems, TextLocalisedClause searchButtonText, k9 searchFieldExtraButtons, aw0.b contentModel, boolean z, NavBarMessage navBarMessage) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(searchButtonText, "searchButtonText");
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        Intrinsics.checkNotNullParameter(contentModel, "contentModel");
        this.f192208a = aVar;
        this.f192209b = menuItems;
        this.f192210c = searchButtonText;
        this.d = searchFieldExtraButtons;
        this.e = contentModel;
        this.f = z;
        this.f192211g = navBarMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f192208a, mVar.f192208a) && Intrinsics.f(this.f192209b, mVar.f192209b) && this.f192210c.equals(mVar.f192210c) && Intrinsics.f(this.d, mVar.d) && this.e.equals(mVar.e) && this.f == mVar.f && Intrinsics.f(this.f192211g, mVar.f192211g);
    }

    public final int hashCode() {
        i5a.a aVar = this.f192208a;
        int iC = j6.a.c((this.e.hashCode() + ((this.d.hashCode() + t61.a.a(p.a.d((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f192209b), 31, this.f192210c)) * 31)) * 31, 31, this.f);
        NavBarMessage navBarMessage = this.f192211g;
        return iC + (navBarMessage != null ? navBarMessage.hashCode() : 0);
    }
}
