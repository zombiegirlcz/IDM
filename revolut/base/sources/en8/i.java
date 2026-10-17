package en8;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f127770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f127771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f127772c;
    public final List d;

    public i(List items, Clause toolbarTitle, Clause clause, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f127770a = items;
        this.f127771b = toolbarTitle;
        this.f127772c = clause;
        this.d = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f127770a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f127770a, iVar.f127770a) && this.f127771b.equals(iVar.f127771b) && Intrinsics.f(this.f127772c, iVar.f127772c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f127770a.hashCode() * 31, 31, this.f127771b);
        Clause clause = this.f127772c;
        return this.d.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
