package com.revolut.feature.card_order_new.impl.kompot.ordernewcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.api.navigation.OrderNewCardDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import h30.l;
import h93.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderNewCardFlowContract$InputData implements IOData$Input {
    public static final k9 o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedTab f65090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOrderAccountWrapper f65091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65092c;
    public final boolean d;
    public final CardOrderContext e;
    public final zn3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f65093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f65094h;
    public final l0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f65095j;
    public final NaviCommand k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NaviCommand f65096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NaviCommand f65097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnalyticsProduct f65098n;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<OrderNewCardFlowContract$InputData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$InputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static OrderNewCardFlowContract$InputData a(OrderNewCardDestination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            SelectedTab selectedTab = destination.f65001a;
            CardOrderAccountWrapper cardOrderAccountWrapper = destination.f65002b;
            boolean z = destination.f65003c;
            boolean z3 = destination.f65004g;
            CardOrderContext cardOrderContext = destination.i;
            zn3.a aVar = destination.f65005h;
            h hVar = destination.f65009n;
            String str = destination.f65008m;
            l0 l0Var = destination.k;
            boolean z4 = destination.f65007l;
            NaviCommand naviCommand = destination.d;
            NaviCommand naviCommand2 = destination.e;
            NaviCommand naviCommand3 = destination.f;
            AnalyticsProduct analyticsProduct = destination.o;
            return new OrderNewCardFlowContract$InputData(selectedTab, cardOrderAccountWrapper, z, z3, cardOrderContext, aVar, hVar, str, l0Var, z4, naviCommand, naviCommand2, naviCommand3, analyticsProduct == null ? new AnalyticsProduct.Retail(OrderNewCardFlowContract$InputData.o) : analyticsProduct);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SelectedTab selectedTab = (SelectedTab) parcel.readParcelable(OrderNewCardFlowContract$InputData.class.getClassLoader());
            CardOrderAccountWrapper cardOrderAccountWrapper = (CardOrderAccountWrapper) parcel.readParcelable(OrderNewCardFlowContract$InputData.class.getClassLoader());
            boolean z3 = false;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new OrderNewCardFlowContract$InputData(selectedTab, cardOrderAccountWrapper, z4, z3, (CardOrderContext) parcel.readParcelable(OrderNewCardFlowContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : zn3.a.valueOf(parcel.readString()), (h) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0 ? l0.valueOf(parcel.readString()) : null, parcel.readInt() == 0 ? z : true, (NaviCommand) parcel.readParcelable(OrderNewCardFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(OrderNewCardFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(OrderNewCardFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(OrderNewCardFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderNewCardFlowContract$InputData[i];
        }
    }

    static {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137496c;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        o = k9Var;
    }

    public OrderNewCardFlowContract$InputData(SelectedTab selectedTab, CardOrderAccountWrapper accountWrapper, boolean z, boolean z3, CardOrderContext cardOrderContext, zn3.a aVar, h hVar, String str, l0 l0Var, boolean z4, NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(cardOrderContext, "cardOrderContext");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f65090a = selectedTab;
        this.f65091b = accountWrapper;
        this.f65092c = z;
        this.d = z3;
        this.e = cardOrderContext;
        this.f = aVar;
        this.f65093g = hVar;
        this.f65094h = str;
        this.i = l0Var;
        this.f65095j = z4;
        this.k = naviCommand;
        this.f65096l = naviCommand2;
        this.f65097m = naviCommand3;
        this.f65098n = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderNewCardFlowContract$InputData)) {
            return false;
        }
        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = (OrderNewCardFlowContract$InputData) obj2;
        return this.f65090a == orderNewCardFlowContract$InputData.f65090a && Intrinsics.f(this.f65091b, orderNewCardFlowContract$InputData.f65091b) && this.f65092c == orderNewCardFlowContract$InputData.f65092c && this.d == orderNewCardFlowContract$InputData.d && Intrinsics.f(this.e, orderNewCardFlowContract$InputData.e) && this.f == orderNewCardFlowContract$InputData.f && Intrinsics.f(this.f65093g, orderNewCardFlowContract$InputData.f65093g) && Intrinsics.f(this.f65094h, orderNewCardFlowContract$InputData.f65094h) && this.i == orderNewCardFlowContract$InputData.i && this.f65095j == orderNewCardFlowContract$InputData.f65095j && Intrinsics.f(this.k, orderNewCardFlowContract$InputData.k) && Intrinsics.f(this.f65096l, orderNewCardFlowContract$InputData.f65096l) && Intrinsics.f(this.f65097m, orderNewCardFlowContract$InputData.f65097m) && Intrinsics.f(this.f65098n, orderNewCardFlowContract$InputData.f65098n);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + j6.a.c(j6.a.c((this.f65091b.hashCode() + (this.f65090a.hashCode() * 31)) * 31, 31, this.f65092c), 31, this.d)) * 31;
        zn3.a aVar = this.f;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        h hVar = this.f65093g;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str = this.f65094h;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        l0 l0Var = this.i;
        int iC = j6.a.c((iHashCode4 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31, this.f65095j);
        NaviCommand naviCommand = this.k;
        int iHashCode5 = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        NaviCommand naviCommand2 = this.f65096l;
        int iHashCode6 = (iHashCode5 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31;
        NaviCommand naviCommand3 = this.f65097m;
        return this.f65098n.hashCode() + ((iHashCode6 + (naviCommand3 != null ? naviCommand3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65090a, i);
        dest.writeParcelable(this.f65091b, i);
        dest.writeInt(this.f65092c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        zn3.a aVar = this.f;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.f65093g);
        dest.writeString(this.f65094h);
        l0 l0Var = this.i;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        dest.writeInt(this.f65095j ? 1 : 0);
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f65096l, i);
        dest.writeParcelable(this.f65097m, i);
        dest.writeParcelable(this.f65098n, i);
    }
}
