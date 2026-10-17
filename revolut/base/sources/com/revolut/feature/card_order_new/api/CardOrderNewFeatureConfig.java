package com.revolut.feature.card_order_new.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import h93.j0;
import h93.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderNewFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOrderNewFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CardOrderNewFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedTab f64956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOrderAccountWrapper f64957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64958c;
    public final NaviCommand d;
    public final NaviCommand e;
    public final NaviCommand f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zn3.a f64960h;
    public final CardOrderContext i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j0 f64961j;
    public final l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f64962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f64963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f64964n;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            NaviCommand naviCommand;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SelectedTab selectedTabCreateFromParcel = SelectedTab.CREATOR.createFromParcel(parcel);
            CardOrderAccountWrapper cardOrderAccountWrapper = (CardOrderAccountWrapper) parcel.readParcelable(CardOrderNewFeatureConfig.class.getClassLoader());
            boolean z4 = parcel.readInt() != 0;
            NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(CardOrderNewFeatureConfig.class.getClassLoader());
            NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(CardOrderNewFeatureConfig.class.getClassLoader());
            NaviCommand naviCommand4 = (NaviCommand) parcel.readParcelable(CardOrderNewFeatureConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
                naviCommand = naviCommand3;
                z3 = true;
            } else {
                z = true;
                naviCommand = naviCommand3;
                z3 = false;
            }
            return new CardOrderNewFeatureConfig(selectedTabCreateFromParcel, cardOrderAccountWrapper, z4, naviCommand2, naviCommand, naviCommand4, z3, parcel.readInt() == 0 ? null : zn3.a.valueOf(parcel.readString()), (CardOrderContext) parcel.readParcelable(CardOrderNewFeatureConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() != 0 ? l0.valueOf(parcel.readString()) : null, parcel.readInt() != 0 ? z : false, parcel.readString(), (h) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOrderNewFeatureConfig[i];
        }
    }

    public CardOrderNewFeatureConfig(SelectedTab selectedTab, CardOrderAccountWrapper accountWrapper, boolean z, NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, boolean z3, zn3.a aVar, CardOrderContext cardOrderContext, j0 j0Var, l0 l0Var, boolean z4, String str, h hVar) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(cardOrderContext, "cardOrderContext");
        this.f64956a = selectedTab;
        this.f64957b = accountWrapper;
        this.f64958c = z;
        this.d = naviCommand;
        this.e = naviCommand2;
        this.f = naviCommand3;
        this.f64959g = z3;
        this.f64960h = aVar;
        this.i = cardOrderContext;
        this.f64961j = j0Var;
        this.k = l0Var;
        this.f64962l = z4;
        this.f64963m = str;
        this.f64964n = hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardOrderNewFeatureConfig)) {
            return false;
        }
        CardOrderNewFeatureConfig cardOrderNewFeatureConfig = (CardOrderNewFeatureConfig) obj2;
        return this.f64956a == cardOrderNewFeatureConfig.f64956a && Intrinsics.f(this.f64957b, cardOrderNewFeatureConfig.f64957b) && this.f64958c == cardOrderNewFeatureConfig.f64958c && Intrinsics.f(this.d, cardOrderNewFeatureConfig.d) && Intrinsics.f(this.e, cardOrderNewFeatureConfig.e) && Intrinsics.f(this.f, cardOrderNewFeatureConfig.f) && this.f64959g == cardOrderNewFeatureConfig.f64959g && this.f64960h == cardOrderNewFeatureConfig.f64960h && Intrinsics.f(this.i, cardOrderNewFeatureConfig.i) && this.f64961j == cardOrderNewFeatureConfig.f64961j && this.k == cardOrderNewFeatureConfig.k && this.f64962l == cardOrderNewFeatureConfig.f64962l && Intrinsics.f(this.f64963m, cardOrderNewFeatureConfig.f64963m) && Intrinsics.f(this.f64964n, cardOrderNewFeatureConfig.f64964n);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f64957b.hashCode() + (this.f64956a.hashCode() * 31)) * 31, 31, this.f64958c);
        NaviCommand naviCommand = this.d;
        int iHashCode = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        NaviCommand naviCommand2 = this.e;
        int iHashCode2 = (iHashCode + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31;
        NaviCommand naviCommand3 = this.f;
        int iC2 = j6.a.c((iHashCode2 + (naviCommand3 == null ? 0 : naviCommand3.hashCode())) * 31, 31, this.f64959g);
        zn3.a aVar = this.f64960h;
        int iHashCode3 = (this.i.hashCode() + ((iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        j0 j0Var = this.f64961j;
        int iHashCode4 = (iHashCode3 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.k;
        int iC3 = j6.a.c((iHashCode4 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31, this.f64962l);
        String str = this.f64963m;
        int iHashCode5 = (iC3 + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.f64964n;
        return iHashCode5 + (hVar != null ? hVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f64956a.writeToParcel(dest, i);
        dest.writeParcelable(this.f64957b, i);
        dest.writeInt(this.f64958c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f64959g ? 1 : 0);
        zn3.a aVar = this.f64960h;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.i, i);
        j0 j0Var = this.f64961j;
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
        dest.writeInt(this.f64962l ? 1 : 0);
        dest.writeString(this.f64963m);
        dest.writeSerializable(this.f64964n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardOrderNewFeatureConfig(SelectedTab selectedTab, AccountId accountId, NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, boolean z, zn3.a aVar, CardOrderContext.CreditCardApplication creditCardApplication, j0 j0Var, l0 l0Var, String str, h hVar, int i) {
        SelectedTab selectedTab2 = (i & 1) != 0 ? SelectedTab.DEBIT : selectedTab;
        AccountId accountId2 = (i & 2) != 0 ? AccountId.Personal.f51414a : accountId;
        boolean z3 = (i & 4) == 0;
        NaviCommand naviCommand4 = (i & 8) != 0 ? null : naviCommand;
        NaviCommand naviCommand5 = (i & 16) != 0 ? null : naviCommand2;
        NaviCommand naviCommand6 = (i & 32) != 0 ? null : naviCommand3;
        boolean z4 = (i & 64) == 0 ? z : true;
        zn3.a aVar2 = (i & 128) != 0 ? null : aVar;
        CardOrderContext cardOrderContext = (i & 256) != 0 ? new CardOrderContext.Default(0) : creditCardApplication;
        j0 j0Var2 = (i & 512) != 0 ? null : j0Var;
        l0 l0Var2 = (i & 1024) != 0 ? null : l0Var;
        String str2 = (i & 4096) != 0 ? null : str;
        h hVar2 = (i & 8192) != 0 ? null : hVar;
        Intrinsics.checkNotNullParameter(selectedTab2, "selectedTab");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(cardOrderContext, "cardOrderContext");
        this(selectedTab2, new CardOrderAccountWrapper.Regular(accountId2), z3, naviCommand4, naviCommand5, naviCommand6, z4, aVar2, cardOrderContext, j0Var2, l0Var2, false, str2, hVar2);
    }
}
