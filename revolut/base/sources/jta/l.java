package jta;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f178449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f178450c;
    public final k d;

    public l(List headerPages, List menuItems, TextClause toolbarTitle, k kVar) {
        Intrinsics.checkNotNullParameter(headerPages, "headerPages");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f178448a = headerPages;
        this.f178449b = menuItems;
        this.f178450c = toolbarTitle;
        this.d = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f178448a, lVar.f178448a) && Intrinsics.f(this.f178449b, lVar.f178449b) && this.f178450c.equals(lVar.f178450c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iB = v7.b(p.a.d(this.f178448a.hashCode() * 31, 31, this.f178449b), 31, this.f178450c);
        k kVar = this.d;
        return iB + (kVar == null ? 0 : kVar.hashCode());
    }
}
