package snd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccountsSelection f264515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f264516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f264517c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f264518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xnd.c0 f264519h;
    public final Data i;

    public a(AnalyticsAccountsSelection accountsSelection, Data accountSelectorData, Data mainWidgetsData, Data budgetingWidgetData, Data overviewWidgetsData, Data toolsData, Data customAssetsState, xnd.c0 contextMenuData, Data userData) {
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
        Intrinsics.checkNotNullParameter(mainWidgetsData, "mainWidgetsData");
        Intrinsics.checkNotNullParameter(budgetingWidgetData, "budgetingWidgetData");
        Intrinsics.checkNotNullParameter(overviewWidgetsData, "overviewWidgetsData");
        Intrinsics.checkNotNullParameter(toolsData, "toolsData");
        Intrinsics.checkNotNullParameter(customAssetsState, "customAssetsState");
        Intrinsics.checkNotNullParameter(contextMenuData, "contextMenuData");
        Intrinsics.checkNotNullParameter(userData, "userData");
        this.f264515a = accountsSelection;
        this.f264516b = accountSelectorData;
        this.f264517c = mainWidgetsData;
        this.d = budgetingWidgetData;
        this.e = overviewWidgetsData;
        this.f = toolsData;
        this.f264518g = customAssetsState;
        this.f264519h = contextMenuData;
        this.i = userData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f264515a, aVar.f264515a) && Intrinsics.f(this.f264516b, aVar.f264516b) && Intrinsics.f(this.f264517c, aVar.f264517c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f264518g, aVar.f264518g) && Intrinsics.f(this.f264519h, aVar.f264519h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.f264519h.hashCode() + kii.e.c(this.f264518g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f264517c, kii.e.c(this.f264516b, this.f264515a.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }
}
