package wfh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b f297134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2h.b f297135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f297136c;

    public o(com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b navBar, x2h.b actionsPanelState, aim.e items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f297134a = navBar;
        this.f297135b = actionsPanelState;
        this.f297136c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f297136c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f297134a, oVar.f297134a) && Intrinsics.f(this.f297135b, oVar.f297135b) && Intrinsics.f(this.f297136c, oVar.f297136c);
    }

    public final int hashCode() {
        return this.f297136c.hashCode() + ((this.f297135b.hashCode() + (this.f297134a.hashCode() * 31)) * 31);
    }
}
