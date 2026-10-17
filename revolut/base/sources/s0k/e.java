package s0k;

import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewTab;
import java.util.List;
import jki.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f258965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthNewsOverviewTab f258967c;

    public e(List tabs, boolean z, WealthNewsOverviewTab wealthNewsOverviewTab) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f258965a = tabs;
        this.f258966b = z;
        this.f258967c = wealthNewsOverviewTab;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f258965a, eVar.f258965a) && this.f258966b == eVar.f258966b && Intrinsics.f(this.f258967c, eVar.f258967c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f258965a.hashCode() * 31, 31, this.f258966b);
        WealthNewsOverviewTab wealthNewsOverviewTab = this.f258967c;
        return iC + (wealthNewsOverviewTab == null ? 0 : wealthNewsOverviewTab.hashCode());
    }
}
