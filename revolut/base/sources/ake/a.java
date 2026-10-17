package ake;

import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f5802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChosenBackground f5804c;
    public final List d;
    public final sh5.c e;
    public final SimpleTotalValueChart f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccountSelectionNavBarContentView.b f5805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f5806h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f5807j;

    public a() {
        this(null, null, null, 1023);
    }

    public static a a(a aVar, Data data, List list, ChosenBackground chosenBackground, List list2, sh5.c cVar, SimpleTotalValueChart simpleTotalValueChart, AccountSelectionNavBarContentView.b bVar, xi0.b bVar2, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = aVar.f5802a;
        }
        Data headerData = data;
        if ((i & 2) != 0) {
            list = aVar.f5803b;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            chosenBackground = aVar.f5804c;
        }
        ChosenBackground chosenBackground2 = chosenBackground;
        if ((i & 8) != 0) {
            list2 = aVar.d;
        }
        List menuItems = list2;
        sh5.c headerDisclaimer = (i & 16) != 0 ? aVar.e : cVar;
        SimpleTotalValueChart simpleTotalValueChart2 = (i & 32) != 0 ? aVar.f : simpleTotalValueChart;
        AccountSelectionNavBarContentView.b chartScrollingState = (i & 64) != 0 ? aVar.f5805g : bVar;
        xi0.b bVar3 = (i & 128) != 0 ? aVar.f5806h : bVar2;
        Data data4 = (i & 256) != 0 ? aVar.i : data2;
        Data hasDeFiAccounts = (i & 512) != 0 ? aVar.f5807j : data3;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(headerDisclaimer, "headerDisclaimer");
        Intrinsics.checkNotNullParameter(chartScrollingState, "chartScrollingState");
        Intrinsics.checkNotNullParameter(hasDeFiAccounts, "hasDeFiAccounts");
        return new a(headerData, list3, chosenBackground2, menuItems, headerDisclaimer, simpleTotalValueChart2, chartScrollingState, bVar3, data4, hasDeFiAccounts);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f5802a, aVar.f5802a) && Intrinsics.f(this.f5803b, aVar.f5803b) && Intrinsics.f(this.f5804c, aVar.f5804c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f5805g, aVar.f5805g) && Intrinsics.f(this.f5806h, aVar.f5806h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f5807j, aVar.f5807j);
    }

    public final int hashCode() {
        int iHashCode = this.f5802a.hashCode() * 31;
        List list = this.f5803b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ChosenBackground chosenBackground = this.f5804c;
        int iHashCode3 = (this.e.hashCode() + p.a.d((iHashCode2 + (chosenBackground == null ? 0 : chosenBackground.hashCode())) * 31, 31, this.d)) * 31;
        SimpleTotalValueChart simpleTotalValueChart = this.f;
        int iB = j6.a.b(this.f5805g.f59197a, (iHashCode3 + (simpleTotalValueChart == null ? 0 : simpleTotalValueChart.hashCode())) * 31, 31);
        xi0.b bVar = this.f5806h;
        int iHashCode4 = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Data data = this.i;
        return this.f5807j.hashCode() + ((iHashCode4 + (data != null ? data.hashCode() : 0)) * 31);
    }

    public a(Data headerData, List list, ChosenBackground chosenBackground, List menuItems, sh5.c headerDisclaimer, SimpleTotalValueChart simpleTotalValueChart, AccountSelectionNavBarContentView.b chartScrollingState, xi0.b bVar, Data data, Data hasDeFiAccounts) {
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(headerDisclaimer, "headerDisclaimer");
        Intrinsics.checkNotNullParameter(chartScrollingState, "chartScrollingState");
        Intrinsics.checkNotNullParameter(hasDeFiAccounts, "hasDeFiAccounts");
        this.f5802a = headerData;
        this.f5803b = list;
        this.f5804c = chosenBackground;
        this.d = menuItems;
        this.e = headerDisclaimer;
        this.f = simpleTotalValueChart;
        this.f5805g = chartScrollingState;
        this.f5806h = bVar;
        this.i = data;
        this.f5807j = hasDeFiAccounts;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Data data, ChosenBackground chosenBackground, sh5.c cVar, int i) {
        sh5.c cVarA;
        Data data2 = (i & 1) != 0 ? new Data(null, null, true, 3, null) : data;
        ChosenBackground chosenBackground2 = (i & 4) != 0 ? null : chosenBackground;
        f0 f0Var = f0.f322471a;
        if ((i & 16) != 0) {
            sh5.c.Companion.getClass();
            cVarA = sh5.b.a();
        } else {
            cVarA = cVar;
        }
        this(data2, null, chosenBackground2, f0Var, cVarA, null, new AccountSelectionNavBarContentView.b(-1), null, null, new Data(null, null, true, 3, null));
    }
}
