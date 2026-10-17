package v7e;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainerBackground f286602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f286603c;
    public final TextLocalisedClause d;

    public m(List items, NavBarWithContainerBackground navBarWithContainerBackground, boolean z, TextLocalisedClause toolbarTitleClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitleClause, "toolbarTitleClause");
        this.f286601a = items;
        this.f286602b = navBarWithContainerBackground;
        this.f286603c = z;
        this.d = toolbarTitleClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f286601a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f286601a, mVar.f286601a) && Intrinsics.f(this.f286602b, mVar.f286602b) && this.f286603c == mVar.f286603c && this.d.equals(mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f286601a.hashCode() * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.f286602b;
        return this.d.hashCode() + j6.a.c((iHashCode + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode())) * 31, 31, this.f286603c);
    }
}
