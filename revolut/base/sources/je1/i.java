package je1;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f173177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f173178c;
    public final TextLocalisedClause d;
    public final boolean e;

    public i(TextLocalisedClause toolbarTitle, TextLocalisedClause ctaTitle, List items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        this.f173176a = items;
        this.f173177b = toolbarTitle;
        this.f173178c = menuItems;
        this.d = ctaTitle;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f173176a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f173176a, iVar.f173176a) && this.f173177b.equals(iVar.f173177b) && Intrinsics.f(this.f173178c, iVar.f173178c) && this.d.equals(iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(p.a.d(t61.a.a(this.f173176a.hashCode() * 31, 31, this.f173177b), 31, this.f173178c), 31, this.d);
    }
}
