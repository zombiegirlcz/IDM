package com.revolut.feature.card_design.impl.card_design;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import h93.j0;
import h93.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDesignFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CardDesignFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f64632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f64633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f64634c;
    public final AccountId d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NaviCommand f64635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SkipConfig f64636h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e93.b f64637j;
    public final j0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0 f64638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e93.b f64639m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDesignFlowContract$State((h) parcel.readSerializable(), j0.valueOf(parcel.readString()), l0.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CardDesignFlowContract$State.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (NaviCommand) parcel.readParcelable(CardDesignFlowContract$State.class.getClassLoader()), (SkipConfig) parcel.readParcelable(CardDesignFlowContract$State.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(CardDesignFlowContract$State.class.getClassLoader()), parcel.readInt() == 0 ? null : e93.b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : l0.valueOf(parcel.readString()), parcel.readInt() != 0 ? e93.b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDesignFlowContract$State[i];
        }
    }

    public CardDesignFlowContract$State(h hVar, j0 productType, l0 subProductType, AccountId accountId, String str, boolean z, NaviCommand naviCommand, SkipConfig skipConfig, AnalyticsProduct automaticEventProduct, e93.b bVar, j0 j0Var, l0 l0Var, e93.b bVar2) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f64632a = hVar;
        this.f64633b = productType;
        this.f64634c = subProductType;
        this.d = accountId;
        this.e = str;
        this.f = z;
        this.f64635g = naviCommand;
        this.f64636h = skipConfig;
        this.i = automaticEventProduct;
        this.f64637j = bVar;
        this.k = j0Var;
        this.f64638l = l0Var;
        this.f64639m = bVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDesignFlowContract$State)) {
            return false;
        }
        CardDesignFlowContract$State cardDesignFlowContract$State = (CardDesignFlowContract$State) obj2;
        return Intrinsics.f(this.f64632a, cardDesignFlowContract$State.f64632a) && this.f64633b == cardDesignFlowContract$State.f64633b && this.f64634c == cardDesignFlowContract$State.f64634c && Intrinsics.f(this.d, cardDesignFlowContract$State.d) && Intrinsics.f(this.e, cardDesignFlowContract$State.e) && this.f == cardDesignFlowContract$State.f && Intrinsics.f(this.f64635g, cardDesignFlowContract$State.f64635g) && Intrinsics.f(this.f64636h, cardDesignFlowContract$State.f64636h) && Intrinsics.f(this.i, cardDesignFlowContract$State.i) && this.f64637j == cardDesignFlowContract$State.f64637j && this.k == cardDesignFlowContract$State.k && this.f64638l == cardDesignFlowContract$State.f64638l && this.f64639m == cardDesignFlowContract$State.f64639m;
    }

    public final int hashCode() {
        h hVar = this.f64632a;
        int iB = l.b(this.d, (this.f64634c.hashCode() + ((this.f64633b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31, 31);
        String str = this.e;
        int iC = j6.a.c((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        NaviCommand naviCommand = this.f64635g;
        int iHashCode = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        SkipConfig skipConfig = this.f64636h;
        int iA = l.a((iHashCode + (skipConfig == null ? 0 : skipConfig.hashCode())) * 31, 31, this.i);
        e93.b bVar = this.f64637j;
        int iHashCode2 = (iA + (bVar == null ? 0 : bVar.hashCode())) * 31;
        j0 j0Var = this.k;
        int iHashCode3 = (iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.f64638l;
        int iHashCode4 = (iHashCode3 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        e93.b bVar2 = this.f64639m;
        return iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64632a);
        dest.writeString(this.f64633b.name());
        dest.writeString(this.f64634c.name());
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeParcelable(this.f64635g, i);
        dest.writeParcelable(this.f64636h, i);
        dest.writeParcelable(this.i, i);
        e93.b bVar = this.f64637j;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        j0 j0Var = this.k;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        l0 l0Var = this.f64638l;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        e93.b bVar2 = this.f64639m;
        if (bVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar2.name());
        }
    }
}
