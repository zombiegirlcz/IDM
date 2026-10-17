package com.revolut.feature.card_order_new.impl.newcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import h30.l;
import h93.j0;
import h93.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/newcard/OrderNewCardContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderNewCardContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderNewCardContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedTab f65208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardOrderAccountWrapper f65210c;
    public final NaviCommand d;
    public final NaviCommand e;
    public final NaviCommand f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zn3.a f65211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f65212h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CardOrderContext f65213j;
    public final j0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0 f65214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f65215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f65216n;
    public final AnalyticsProduct o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SelectedTab selectedTab = (SelectedTab) parcel.readParcelable(OrderNewCardContract$Configuration.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            CardOrderAccountWrapper cardOrderAccountWrapper = (CardOrderAccountWrapper) parcel.readParcelable(OrderNewCardContract$Configuration.class.getClassLoader());
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(OrderNewCardContract$Configuration.class.getClassLoader());
            NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(OrderNewCardContract$Configuration.class.getClassLoader());
            NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(OrderNewCardContract$Configuration.class.getClassLoader());
            zn3.a aVarValueOf = parcel.readInt() == 0 ? null : zn3.a.valueOf(parcel.readString());
            return new OrderNewCardContract$Configuration((AnalyticsProduct) parcel.readParcelable(OrderNewCardContract$Configuration.class.getClassLoader()), cardOrderAccountWrapper, (CardOrderContext) parcel.readParcelable(OrderNewCardContract$Configuration.class.getClassLoader()), selectedTab, naviCommand, naviCommand2, naviCommand3, parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() != 0 ? l0.valueOf(parcel.readString()) : null, parcel.readString(), (h) parcel.readSerializable(), aVarValueOf, z, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderNewCardContract$Configuration[i];
        }
    }

    public OrderNewCardContract$Configuration(AnalyticsProduct automaticEventProduct, CardOrderAccountWrapper accountWrapper, CardOrderContext cardOrderContext, SelectedTab selectedTab, NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, j0 j0Var, l0 l0Var, String str, h hVar, zn3.a aVar, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(cardOrderContext, "cardOrderContext");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f65208a = selectedTab;
        this.f65209b = z;
        this.f65210c = accountWrapper;
        this.d = naviCommand;
        this.e = naviCommand2;
        this.f = naviCommand3;
        this.f65211g = aVar;
        this.f65212h = hVar;
        this.i = z3;
        this.f65213j = cardOrderContext;
        this.k = j0Var;
        this.f65214l = l0Var;
        this.f65215m = z4;
        this.f65216n = str;
        this.o = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderNewCardContract$Configuration)) {
            return false;
        }
        OrderNewCardContract$Configuration orderNewCardContract$Configuration = (OrderNewCardContract$Configuration) obj2;
        return this.f65208a == orderNewCardContract$Configuration.f65208a && this.f65209b == orderNewCardContract$Configuration.f65209b && Intrinsics.f(this.f65210c, orderNewCardContract$Configuration.f65210c) && Intrinsics.f(this.d, orderNewCardContract$Configuration.d) && Intrinsics.f(this.e, orderNewCardContract$Configuration.e) && Intrinsics.f(this.f, orderNewCardContract$Configuration.f) && this.f65211g == orderNewCardContract$Configuration.f65211g && Intrinsics.f(this.f65212h, orderNewCardContract$Configuration.f65212h) && this.i == orderNewCardContract$Configuration.i && Intrinsics.f(this.f65213j, orderNewCardContract$Configuration.f65213j) && this.k == orderNewCardContract$Configuration.k && this.f65214l == orderNewCardContract$Configuration.f65214l && this.f65215m == orderNewCardContract$Configuration.f65215m && Intrinsics.f(this.f65216n, orderNewCardContract$Configuration.f65216n) && Intrinsics.f(this.o, orderNewCardContract$Configuration.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f65210c.hashCode() + j6.a.c(this.f65208a.hashCode() * 31, 31, this.f65209b)) * 31;
        NaviCommand naviCommand = this.d;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        NaviCommand naviCommand2 = this.e;
        int iHashCode3 = (iHashCode2 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31;
        NaviCommand naviCommand3 = this.f;
        int iHashCode4 = (iHashCode3 + (naviCommand3 == null ? 0 : naviCommand3.hashCode())) * 31;
        zn3.a aVar = this.f65211g;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        h hVar = this.f65212h;
        int iHashCode6 = (this.f65213j.hashCode() + j6.a.c((iHashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.i)) * 31;
        j0 j0Var = this.k;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.f65214l;
        int iC = j6.a.c((iHashCode7 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31, this.f65215m);
        String str = this.f65216n;
        return this.o.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65208a, i);
        dest.writeInt(this.f65209b ? 1 : 0);
        dest.writeParcelable(this.f65210c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        zn3.a aVar = this.f65211g;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.f65212h);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f65213j, i);
        j0 j0Var = this.k;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        l0 l0Var = this.f65214l;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        dest.writeInt(this.f65215m ? 1 : 0);
        dest.writeString(this.f65216n);
        dest.writeParcelable(this.o, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderNewCardContract$Configuration(SelectedTab selectedTab, boolean z, CardOrderAccountWrapper cardOrderAccountWrapper, NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, zn3.a aVar, h hVar, boolean z3, CardOrderContext cardOrderContext, j0 j0Var, l0 l0Var, String str, AnalyticsProduct analyticsProduct, int i) {
        AnalyticsProduct analyticsProductG;
        NaviCommand naviCommand4 = (i & 8) != 0 ? null : naviCommand;
        NaviCommand naviCommand5 = (i & 16) != 0 ? null : naviCommand2;
        NaviCommand naviCommand6 = (i & 32) != 0 ? null : naviCommand3;
        CardOrderContext cardOrderContext2 = (i & 512) != 0 ? new CardOrderContext.Default(0) : cardOrderContext;
        j0 j0Var2 = (i & 1024) != 0 ? null : j0Var;
        l0 l0Var2 = (i & 2048) != 0 ? null : l0Var;
        String str2 = (i & 8192) != 0 ? null : str;
        if ((i & 16384) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137496c;
            analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        } else {
            analyticsProductG = analyticsProduct;
        }
        this(analyticsProductG, cardOrderAccountWrapper, cardOrderContext2, selectedTab, naviCommand4, naviCommand5, naviCommand6, j0Var2, l0Var2, str2, hVar, aVar, z, z3, false);
    }
}
