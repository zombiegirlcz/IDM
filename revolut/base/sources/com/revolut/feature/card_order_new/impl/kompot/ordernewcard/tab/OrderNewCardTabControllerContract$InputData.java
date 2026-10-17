package com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import h93.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/ordernewcard/tab/OrderNewCardTabControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderNewCardTabControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OrderNewCardTabControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedTab f65111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardOrderAccountWrapper f65113c;
    public final NaviCommand d;
    public final zn3.a e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f65114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f65115h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f65116j;
    public final AnalyticsProduct k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            CardOrderAccountWrapper cardOrderAccountWrapper;
            zn3.a aVar;
            l0 l0Var;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SelectedTab selectedTab = (SelectedTab) parcel.readParcelable(OrderNewCardTabControllerContract$InputData.class.getClassLoader());
            boolean z4 = parcel.readInt() != 0;
            CardOrderAccountWrapper cardOrderAccountWrapper2 = (CardOrderAccountWrapper) parcel.readParcelable(OrderNewCardTabControllerContract$InputData.class.getClassLoader());
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(OrderNewCardTabControllerContract$InputData.class.getClassLoader());
            zn3.a aVarValueOf = parcel.readInt() == 0 ? null : zn3.a.valueOf(parcel.readString());
            boolean z6 = true;
            String string = parcel.readString();
            l0 l0VarValueOf = parcel.readInt() != 0 ? l0.valueOf(parcel.readString()) : null;
            if (parcel.readInt() != 0) {
                z = false;
                cardOrderAccountWrapper = cardOrderAccountWrapper2;
                aVar = aVarValueOf;
                l0Var = l0VarValueOf;
                z3 = true;
            } else {
                z = false;
                cardOrderAccountWrapper = cardOrderAccountWrapper2;
                aVar = aVarValueOf;
                l0Var = l0VarValueOf;
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z6 = z;
            }
            return new OrderNewCardTabControllerContract$InputData(selectedTab, z4, cardOrderAccountWrapper, naviCommand, aVar, string, l0Var, z3, z6, (h) parcel.readSerializable(), (AnalyticsProduct) parcel.readParcelable(OrderNewCardTabControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderNewCardTabControllerContract$InputData[i];
        }
    }

    public OrderNewCardTabControllerContract$InputData(SelectedTab tab2, boolean z, CardOrderAccountWrapper accountWrapper, NaviCommand naviCommand, zn3.a aVar, String str, l0 l0Var, boolean z3, boolean z4, h hVar, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f65111a = tab2;
        this.f65112b = z;
        this.f65113c = accountWrapper;
        this.d = naviCommand;
        this.e = aVar;
        this.f = str;
        this.f65114g = l0Var;
        this.f65115h = z3;
        this.i = z4;
        this.f65116j = hVar;
        this.k = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderNewCardTabControllerContract$InputData)) {
            return false;
        }
        OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData = (OrderNewCardTabControllerContract$InputData) obj2;
        return this.f65111a == orderNewCardTabControllerContract$InputData.f65111a && this.f65112b == orderNewCardTabControllerContract$InputData.f65112b && Intrinsics.f(this.f65113c, orderNewCardTabControllerContract$InputData.f65113c) && Intrinsics.f(this.d, orderNewCardTabControllerContract$InputData.d) && this.e == orderNewCardTabControllerContract$InputData.e && Intrinsics.f(this.f, orderNewCardTabControllerContract$InputData.f) && this.f65114g == orderNewCardTabControllerContract$InputData.f65114g && this.f65115h == orderNewCardTabControllerContract$InputData.f65115h && this.i == orderNewCardTabControllerContract$InputData.i && Intrinsics.f(this.f65116j, orderNewCardTabControllerContract$InputData.f65116j) && Intrinsics.f(this.k, orderNewCardTabControllerContract$InputData.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f65113c.hashCode() + j6.a.c(this.f65111a.hashCode() * 31, 31, this.f65112b)) * 31;
        NaviCommand naviCommand = this.d;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        zn3.a aVar = this.e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        l0 l0Var = this.f65114g;
        int iC = j6.a.c(j6.a.c((iHashCode4 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31, this.f65115h), 31, this.i);
        h hVar = this.f65116j;
        return this.k.hashCode() + ((iC + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65111a, i);
        dest.writeInt(this.f65112b ? 1 : 0);
        dest.writeParcelable(this.f65113c, i);
        dest.writeParcelable(this.d, i);
        zn3.a aVar = this.e;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.f);
        l0 l0Var = this.f65114g;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        dest.writeInt(this.f65115h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeSerializable(this.f65116j);
        dest.writeParcelable(this.k, i);
    }
}
