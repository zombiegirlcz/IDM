package com.revolut.feature.card_order_new.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import h93.j0;
import h93.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/navigation/OrderNewCardDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderNewCardDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<OrderNewCardDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedTab f65001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOrderAccountWrapper f65002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65003c;
    public final NaviCommand d;
    public final NaviCommand e;
    public final NaviCommand f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f65004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zn3.a f65005h;
    public final CardOrderContext i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j0 f65006j;
    public final l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f65007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f65008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f65009n;
    public final AnalyticsProduct o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SelectedTab selectedTabCreateFromParcel = SelectedTab.CREATOR.createFromParcel(parcel);
            CardOrderAccountWrapper cardOrderAccountWrapper = (CardOrderAccountWrapper) parcel.readParcelable(OrderNewCardDestination.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(OrderNewCardDestination.class.getClassLoader());
            NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(OrderNewCardDestination.class.getClassLoader());
            NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(OrderNewCardDestination.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            return new OrderNewCardDestination((AnalyticsProduct) parcel.readParcelable(OrderNewCardDestination.class.getClassLoader()), cardOrderAccountWrapper, (CardOrderContext) parcel.readParcelable(OrderNewCardDestination.class.getClassLoader()), selectedTabCreateFromParcel, naviCommand, naviCommand2, naviCommand3, parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() != 0 ? l0.valueOf(parcel.readString()) : null, parcel.readString(), (h) parcel.readSerializable(), parcel.readInt() == 0 ? null : zn3.a.valueOf(parcel.readString()), z, z3, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderNewCardDestination[i];
        }
    }

    public OrderNewCardDestination(AnalyticsProduct analyticsProduct, CardOrderAccountWrapper accountWrapper, CardOrderContext cardOrderContext, SelectedTab selectedTab, NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, j0 j0Var, l0 l0Var, String str, h hVar, zn3.a aVar, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(cardOrderContext, "cardOrderContext");
        this.f65001a = selectedTab;
        this.f65002b = accountWrapper;
        this.f65003c = z;
        this.d = naviCommand;
        this.e = naviCommand2;
        this.f = naviCommand3;
        this.f65004g = z3;
        this.f65005h = aVar;
        this.i = cardOrderContext;
        this.f65006j = j0Var;
        this.k = l0Var;
        this.f65007l = z4;
        this.f65008m = str;
        this.f65009n = hVar;
        this.o = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderNewCardDestination)) {
            return false;
        }
        OrderNewCardDestination orderNewCardDestination = (OrderNewCardDestination) obj2;
        return this.f65001a == orderNewCardDestination.f65001a && Intrinsics.f(this.f65002b, orderNewCardDestination.f65002b) && this.f65003c == orderNewCardDestination.f65003c && Intrinsics.f(this.d, orderNewCardDestination.d) && Intrinsics.f(this.e, orderNewCardDestination.e) && Intrinsics.f(this.f, orderNewCardDestination.f) && this.f65004g == orderNewCardDestination.f65004g && this.f65005h == orderNewCardDestination.f65005h && Intrinsics.f(this.i, orderNewCardDestination.i) && this.f65006j == orderNewCardDestination.f65006j && this.k == orderNewCardDestination.k && this.f65007l == orderNewCardDestination.f65007l && Intrinsics.f(this.f65008m, orderNewCardDestination.f65008m) && Intrinsics.f(this.f65009n, orderNewCardDestination.f65009n) && Intrinsics.f(this.o, orderNewCardDestination.o);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f65002b.hashCode() + (this.f65001a.hashCode() * 31)) * 31, 31, this.f65003c);
        NaviCommand naviCommand = this.d;
        int iHashCode = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        NaviCommand naviCommand2 = this.e;
        int iHashCode2 = (iHashCode + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31;
        NaviCommand naviCommand3 = this.f;
        int iC2 = j6.a.c((iHashCode2 + (naviCommand3 == null ? 0 : naviCommand3.hashCode())) * 31, 31, this.f65004g);
        zn3.a aVar = this.f65005h;
        int iHashCode3 = (this.i.hashCode() + ((iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        j0 j0Var = this.f65006j;
        int iHashCode4 = (iHashCode3 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.k;
        int iC3 = j6.a.c((iHashCode4 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31, this.f65007l);
        String str = this.f65008m;
        int iHashCode5 = (iC3 + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.f65009n;
        int iHashCode6 = (iHashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        AnalyticsProduct analyticsProduct = this.o;
        return iHashCode6 + (analyticsProduct != null ? analyticsProduct.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f65001a.writeToParcel(dest, i);
        dest.writeParcelable(this.f65002b, i);
        dest.writeInt(this.f65003c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f65004g ? 1 : 0);
        zn3.a aVar = this.f65005h;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.i, i);
        j0 j0Var = this.f65006j;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        l0 l0Var = this.k;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        dest.writeInt(this.f65007l ? 1 : 0);
        dest.writeString(this.f65008m);
        dest.writeSerializable(this.f65009n);
        dest.writeParcelable(this.o, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderNewCardDestination(SelectedTab selectedTab, CardOrderAccountWrapper cardOrderAccountWrapper, boolean z, NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, boolean z3, zn3.a aVar, CardOrderContext cardOrderContext, j0 j0Var, l0 l0Var, boolean z4, String str, h hVar, AnalyticsProduct analyticsProduct, int i) {
        NaviCommand naviCommand4 = (i & 8) != 0 ? null : naviCommand;
        NaviCommand naviCommand5 = (i & 16) != 0 ? null : naviCommand2;
        NaviCommand naviCommand6 = (i & 32) != 0 ? null : naviCommand3;
        CardOrderContext cardOrderContext2 = (i & 256) != 0 ? new CardOrderContext.Default(0) : cardOrderContext;
        j0 j0Var2 = (i & 512) != 0 ? null : j0Var;
        l0 l0Var2 = (i & 1024) != 0 ? null : l0Var;
        boolean z6 = (i & 2048) != 0 ? false : z4;
        this((i & 16384) != 0 ? null : analyticsProduct, cardOrderAccountWrapper, cardOrderContext2, selectedTab, naviCommand4, naviCommand5, naviCommand6, j0Var2, l0Var2, (i & 4096) != 0 ? null : str, hVar, aVar, z, z3, z6);
    }
}
