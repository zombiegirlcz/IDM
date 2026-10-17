package zq5;

import aw0.k9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f324399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9 f324401c;
    public final TextLocalisedClause d;
    public final boolean e;

    public w(Clause title, aim.e menuItems, k9 searchFieldActionButtons, TextLocalisedClause searchHint, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(searchFieldActionButtons, "searchFieldActionButtons");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        this.f324399a = title;
        this.f324400b = menuItems;
        this.f324401c = searchFieldActionButtons;
        this.d = searchHint;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f324399a.equals(wVar.f324399a) && Intrinsics.f(this.f324400b, wVar.f324400b) && this.f324401c.equals(wVar.f324401c) && this.d.equals(wVar.d) && this.e == wVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a((this.f324401c.hashCode() + p.a.d(this.f324399a.hashCode() * 31, 31, this.f324400b)) * 31, 31, this.d);
    }
}
