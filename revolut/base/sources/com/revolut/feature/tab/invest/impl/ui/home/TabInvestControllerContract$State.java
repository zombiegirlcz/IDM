package com.revolut.feature.tab.invest.impl.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import ble.p;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$HeaderState;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import fsl.n;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$State", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "Lfsl/n;", "", "", "toString", "()Ljava/lang/String;", "Companion", "b", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TabInvestControllerContract$State implements States$PersistentDomain, n {
    public final Data A;
    public final Data B;
    public final String C;
    public final p D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabInvestControllerContract$HeaderState f89853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f89854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final itb.b f89855c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccountSelectionNavBarContentView.b f89857h;
    public final NavBarMessage i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ld6.b f89858j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f89859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f89860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f89861n;
    public final d1h.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f89862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f89863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f89864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f89865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f89866t;
    public final Data u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AnalyticsContext f89867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Data f89868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f89869y;
    public final Data z;

    @NotNull
    public static final Parcelable.Creator<TabInvestControllerContract$State> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            List listV0;
            ld6.b bVar;
            TabInvestControllerContract$HeaderState tabInvestControllerContract$HeaderState = (TabInvestControllerContract$HeaderState) j6.a.f(parcel, "source", TabInvestControllerContract$HeaderState.class);
            try {
                Parcelable[] parcelableArray = parcel.readParcelableArray(WealthAction.class.getClassLoader());
                listV0 = parcelableArray != null ? kotlin.collections.d.v0(parcelableArray) : null;
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
            if (!(listV0 instanceof List)) {
                listV0 = null;
            }
            String string = parcel.readString();
            if (string != null) {
                ld6.b[] bVarArrValues = ld6.b.values();
                int length = bVarArrValues.length;
                for (int i = 0; i < length; i++) {
                    bVar = bVarArrValues[i];
                    if (a0.z(bVar.name(), string, true)) {
                        break;
                    }
                }
                bVar = null;
            } else {
                bVar = null;
            }
            if (tabInvestControllerContract$HeaderState instanceof TabInvestControllerContract$HeaderState.PreOnboarding) {
                tabInvestControllerContract$HeaderState = null;
            }
            if (tabInvestControllerContract$HeaderState == null) {
                tabInvestControllerContract$HeaderState = TabInvestControllerContract$HeaderState.Loading.f89835a;
            }
            return new TabInvestControllerContract$State(tabInvestControllerContract$HeaderState, listV0, bVar, 2147483132);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabInvestControllerContract$State[i];
        }
    }

    public TabInvestControllerContract$State(TabInvestControllerContract$HeaderState headerState, List list, itb.b userProfileAvatarParams, boolean z, boolean z3, boolean z4, boolean z6, AccountSelectionNavBarContentView.b chartScrollState, NavBarMessage navBarMessage, ld6.b bVar, Data data, Data accountWidgets, Data data2, Data investAccounts, d1h.g gVar, List npsItems, Data data3, Data data4, List tradingAddOnBanner, List tradingAddOnsTerminalBanner, Data data5, boolean z11, AnalyticsContext analyticsContext, Data slotManagerItems, List list2, Data data6, Data data7, Data data8, String str, p contentMode) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(userProfileAvatarParams, "userProfileAvatarParams");
        Intrinsics.checkNotNullParameter(chartScrollState, "chartScrollState");
        Intrinsics.checkNotNullParameter(accountWidgets, "accountWidgets");
        Intrinsics.checkNotNullParameter(investAccounts, "investAccounts");
        Intrinsics.checkNotNullParameter(npsItems, "npsItems");
        Intrinsics.checkNotNullParameter(tradingAddOnBanner, "tradingAddOnBanner");
        Intrinsics.checkNotNullParameter(tradingAddOnsTerminalBanner, "tradingAddOnsTerminalBanner");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(contentMode, "contentMode");
        this.f89853a = headerState;
        this.f89854b = list;
        this.f89855c = userProfileAvatarParams;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f89856g = z6;
        this.f89857h = chartScrollState;
        this.i = navBarMessage;
        this.f89858j = bVar;
        this.k = data;
        this.f89859l = accountWidgets;
        this.f89860m = data2;
        this.f89861n = investAccounts;
        this.o = gVar;
        this.f89862p = npsItems;
        this.f89863q = data3;
        this.f89864r = data4;
        this.f89865s = tradingAddOnBanner;
        this.f89866t = tradingAddOnsTerminalBanner;
        this.u = data5;
        this.v = z11;
        this.f89867w = analyticsContext;
        this.f89868x = slotManagerItems;
        this.f89869y = list2;
        this.z = data6;
        this.A = data7;
        this.B = data8;
        this.C = str;
        this.D = contentMode;
    }

    public static TabInvestControllerContract$State c(TabInvestControllerContract$State tabInvestControllerContract$State, TabInvestControllerContract$HeaderState tabInvestControllerContract$HeaderState, List list, itb.b bVar, boolean z, boolean z3, boolean z4, boolean z6, AccountSelectionNavBarContentView.b bVar2, NavBarMessage navBarMessage, ld6.b bVar3, Data data, Data data2, Data data3, Data data4, d1h.g gVar, List list2, Data data5, Data data6, Data data7, boolean z11, AnalyticsContext analyticsContext, Data data8, List list3, Data data9, Data data10, Data data11, String str, p pVar, int i) {
        TabInvestControllerContract$HeaderState headerState = (i & 1) != 0 ? tabInvestControllerContract$State.f89853a : tabInvestControllerContract$HeaderState;
        List list4 = (i & 2) != 0 ? tabInvestControllerContract$State.f89854b : list;
        itb.b userProfileAvatarParams = (i & 4) != 0 ? tabInvestControllerContract$State.f89855c : bVar;
        boolean z12 = (i & 8) != 0 ? tabInvestControllerContract$State.d : z;
        boolean z29 = (i & 16) != 0 ? tabInvestControllerContract$State.e : z3;
        boolean z31 = (i & 32) != 0 ? tabInvestControllerContract$State.f : z4;
        boolean z41 = (i & 64) != 0 ? tabInvestControllerContract$State.f89856g : z6;
        AccountSelectionNavBarContentView.b chartScrollState = (i & 128) != 0 ? tabInvestControllerContract$State.f89857h : bVar2;
        NavBarMessage navBarMessage2 = (i & 256) != 0 ? tabInvestControllerContract$State.i : navBarMessage;
        ld6.b bVar4 = (i & 512) != 0 ? tabInvestControllerContract$State.f89858j : bVar3;
        Data data12 = (i & 1024) != 0 ? tabInvestControllerContract$State.k : data;
        Data accountWidgets = (i & 2048) != 0 ? tabInvestControllerContract$State.f89859l : data2;
        Data data13 = (i & 4096) != 0 ? tabInvestControllerContract$State.f89860m : data3;
        Data investAccounts = (i & 8192) != 0 ? tabInvestControllerContract$State.f89861n : data4;
        d1h.g gVar2 = (i & 16384) != 0 ? tabInvestControllerContract$State.o : gVar;
        List npsItems = (32768 & i) != 0 ? tabInvestControllerContract$State.f89862p : list2;
        Data data14 = (i & 65536) != 0 ? tabInvestControllerContract$State.f89863q : data5;
        Data data15 = (i & 131072) != 0 ? tabInvestControllerContract$State.f89864r : data6;
        List tradingAddOnBanner = tabInvestControllerContract$State.f89865s;
        List list5 = list4;
        List tradingAddOnsTerminalBanner = tabInvestControllerContract$State.f89866t;
        tabInvestControllerContract$State.getClass();
        boolean z49 = z12;
        Data data16 = (i & PKIFailureInfo.badSenderNonce) != 0 ? tabInvestControllerContract$State.u : data7;
        boolean z54 = (i & 4194304) != 0 ? tabInvestControllerContract$State.v : z11;
        AnalyticsContext analyticsContext2 = (i & 8388608) != 0 ? tabInvestControllerContract$State.f89867w : analyticsContext;
        Data slotManagerItems = (i & 16777216) != 0 ? tabInvestControllerContract$State.f89868x : data8;
        boolean z74 = z29;
        List list6 = (i & 33554432) != 0 ? tabInvestControllerContract$State.f89869y : list3;
        Data data17 = (i & 67108864) != 0 ? tabInvestControllerContract$State.z : data9;
        Data data18 = (i & 134217728) != 0 ? tabInvestControllerContract$State.A : data10;
        Data data19 = (i & 268435456) != 0 ? tabInvestControllerContract$State.B : data11;
        String str2 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? tabInvestControllerContract$State.C : str;
        p contentMode = (i & 1073741824) != 0 ? tabInvestControllerContract$State.D : pVar;
        tabInvestControllerContract$State.getClass();
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(userProfileAvatarParams, "userProfileAvatarParams");
        Intrinsics.checkNotNullParameter(chartScrollState, "chartScrollState");
        Intrinsics.checkNotNullParameter(accountWidgets, "accountWidgets");
        Intrinsics.checkNotNullParameter(investAccounts, "investAccounts");
        Intrinsics.checkNotNullParameter(npsItems, "npsItems");
        Intrinsics.checkNotNullParameter(tradingAddOnBanner, "tradingAddOnBanner");
        Intrinsics.checkNotNullParameter(tradingAddOnsTerminalBanner, "tradingAddOnsTerminalBanner");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(contentMode, "contentMode");
        return new TabInvestControllerContract$State(headerState, list5, userProfileAvatarParams, z49, z74, z31, z41, chartScrollState, navBarMessage2, bVar4, data12, accountWidgets, data13, investAccounts, gVar2, npsItems, data14, data15, tradingAddOnBanner, tradingAddOnsTerminalBanner, data16, z54, analyticsContext2, slotManagerItems, list6, data17, data18, data19, str2, contentMode);
    }

    @Override // fsl.n
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final Data getF89864r() {
        return this.f89864r;
    }

    @Override // fsl.n
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getF89863q() {
        return this.f89863q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TabInvestControllerContract$State)) {
            return false;
        }
        TabInvestControllerContract$State tabInvestControllerContract$State = (TabInvestControllerContract$State) obj2;
        return Intrinsics.f(this.f89853a, tabInvestControllerContract$State.f89853a) && Intrinsics.f(this.f89854b, tabInvestControllerContract$State.f89854b) && Intrinsics.f(this.f89855c, tabInvestControllerContract$State.f89855c) && this.d == tabInvestControllerContract$State.d && this.e == tabInvestControllerContract$State.e && this.f == tabInvestControllerContract$State.f && this.f89856g == tabInvestControllerContract$State.f89856g && Intrinsics.f(this.f89857h, tabInvestControllerContract$State.f89857h) && Intrinsics.f(this.i, tabInvestControllerContract$State.i) && this.f89858j == tabInvestControllerContract$State.f89858j && Intrinsics.f(this.k, tabInvestControllerContract$State.k) && Intrinsics.f(this.f89859l, tabInvestControllerContract$State.f89859l) && Intrinsics.f(this.f89860m, tabInvestControllerContract$State.f89860m) && Intrinsics.f(this.f89861n, tabInvestControllerContract$State.f89861n) && Intrinsics.f(this.o, tabInvestControllerContract$State.o) && Intrinsics.f(this.f89862p, tabInvestControllerContract$State.f89862p) && Intrinsics.f(this.f89863q, tabInvestControllerContract$State.f89863q) && Intrinsics.f(this.f89864r, tabInvestControllerContract$State.f89864r) && Intrinsics.f(this.f89865s, tabInvestControllerContract$State.f89865s) && Intrinsics.f(this.f89866t, tabInvestControllerContract$State.f89866t) && Intrinsics.f(this.u, tabInvestControllerContract$State.u) && this.v == tabInvestControllerContract$State.v && Intrinsics.f(this.f89867w, tabInvestControllerContract$State.f89867w) && Intrinsics.f(this.f89868x, tabInvestControllerContract$State.f89868x) && Intrinsics.f(this.f89869y, tabInvestControllerContract$State.f89869y) && Intrinsics.f(this.z, tabInvestControllerContract$State.z) && Intrinsics.f(this.A, tabInvestControllerContract$State.A) && Intrinsics.f(this.B, tabInvestControllerContract$State.B) && Intrinsics.f(this.C, tabInvestControllerContract$State.C) && this.D == tabInvestControllerContract$State.D;
    }

    public final int hashCode() {
        int iHashCode = this.f89853a.hashCode() * 31;
        List list = this.f89854b;
        int iB = j6.a.b(this.f89857h.f59197a, j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f89855c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f89856g), 31);
        NavBarMessage navBarMessage = this.i;
        int iHashCode2 = (iB + (navBarMessage == null ? 0 : navBarMessage.hashCode())) * 31;
        ld6.b bVar = this.f89858j;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Data data = this.k;
        int iC = kii.e.c(this.f89859l, (iHashCode3 + (data == null ? 0 : data.hashCode())) * 31, 31);
        Data data2 = this.f89860m;
        int iC2 = kii.e.c(this.f89861n, (iC + (data2 == null ? 0 : data2.hashCode())) * 31, 31);
        d1h.g gVar = this.o;
        int iD = p.a.d((iC2 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f89862p);
        Data data3 = this.f89863q;
        int iHashCode4 = (iD + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f89864r;
        int iD2 = p.a.d(p.a.d((iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31, 31, this.f89865s), 961, this.f89866t);
        Data data5 = this.u;
        int iC3 = j6.a.c((iD2 + (data5 == null ? 0 : data5.hashCode())) * 31, 31, this.v);
        AnalyticsContext analyticsContext = this.f89867w;
        int iC4 = kii.e.c(this.f89868x, (iC3 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31);
        List list2 = this.f89869y;
        int iHashCode5 = (iC4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Data data6 = this.z;
        int iHashCode6 = (iHashCode5 + (data6 == null ? 0 : data6.hashCode())) * 31;
        Data data7 = this.A;
        int iHashCode7 = (iHashCode6 + (data7 == null ? 0 : data7.hashCode())) * 31;
        Data data8 = this.B;
        int iHashCode8 = (iHashCode7 + (data8 == null ? 0 : data8.hashCode())) * 31;
        String str = this.C;
        return this.D.hashCode() + ((iHashCode8 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89853a, 0);
        List list = this.f89854b;
        dest.writeParcelableArray(list != null ? (WealthAction[]) list.toArray(new WealthAction[0]) : null, 0);
        ld6.b bVar = this.f89858j;
        dest.writeString(bVar != null ? bVar.name() : null);
    }

    public TabInvestControllerContract$State(TabInvestControllerContract$HeaderState tabInvestControllerContract$HeaderState, List list, ld6.b bVar, int i) {
        TabInvestControllerContract$HeaderState tabInvestControllerContract$HeaderState2 = (i & 1) != 0 ? TabInvestControllerContract$HeaderState.Loading.f89835a : tabInvestControllerContract$HeaderState;
        List list2 = (i & 2) != 0 ? null : list;
        itb.b.Companion.getClass();
        itb.b bVar2 = itb.b.d;
        AccountSelectionNavBarContentView.b bVar3 = new AccountSelectionNavBarContentView.b(-1);
        ld6.b bVar4 = (i & 512) != 0 ? null : bVar;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        this(tabInvestControllerContract$HeaderState2, list2, bVar2, false, false, false, false, bVar3, null, bVar4, null, data, null, data2, null, f0Var, null, null, f0Var, f0Var, null, false, null, new Data(f0Var, null, false, 6, null), null, null, null, null, null, p.STANDARD);
    }
}
