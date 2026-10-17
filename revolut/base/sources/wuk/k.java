package wuk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f300197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f300198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f300199c;
    public final Clause d;
    public final yy0.j e;
    public final List f;

    public k(TextClause description, TextLocalisedClause textLocalisedClause, TextClause toolbarTitle, TimeClause timeClause, yy0.j endImage, List menuItems) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f300197a = description;
        this.f300198b = textLocalisedClause;
        this.f300199c = toolbarTitle;
        this.d = timeClause;
        this.e = endImage;
        this.f = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f300197a.equals(kVar.f300197a) && Intrinsics.f(this.f300198b, kVar.f300198b) && this.f300199c.equals(kVar.f300199c) && Intrinsics.f(this.d, kVar.d) && this.e.equals(kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f300197a.hashCode() * 31;
        Clause clause = this.f300198b;
        int iB = v7.b((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f300199c);
        Clause clause2 = this.d;
        return this.f.hashCode() + a10.b.c(this.e.f317755a, (iB + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31);
    }
}
