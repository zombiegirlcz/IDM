package com.revolut.feature.card_order_new.impl.brazil;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/brazil/CardSubtypePickerControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardSubtypePickerControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardSubtypePickerControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e13.a f65023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn3.a f65024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f65025c;
    public final NaviCommand d;
    public final String e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f65026g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardSubtypePickerControllerContract$InputData(e13.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : zn3.a.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CardSubtypePickerControllerContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(CardSubtypePickerControllerContract$InputData.class.getClassLoader()), parcel.readString(), (h) parcel.readSerializable(), (AnalyticsProduct) parcel.readParcelable(CardSubtypePickerControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardSubtypePickerControllerContract$InputData[i];
        }
    }

    public CardSubtypePickerControllerContract$InputData(e13.a flowType, zn3.a aVar, AccountId accountId, NaviCommand naviCommand, String str, h hVar, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f65023a = flowType;
        this.f65024b = aVar;
        this.f65025c = accountId;
        this.d = naviCommand;
        this.e = str;
        this.f = hVar;
        this.f65026g = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardSubtypePickerControllerContract$InputData)) {
            return false;
        }
        CardSubtypePickerControllerContract$InputData cardSubtypePickerControllerContract$InputData = (CardSubtypePickerControllerContract$InputData) obj2;
        return this.f65023a == cardSubtypePickerControllerContract$InputData.f65023a && this.f65024b == cardSubtypePickerControllerContract$InputData.f65024b && Intrinsics.f(this.f65025c, cardSubtypePickerControllerContract$InputData.f65025c) && Intrinsics.f(this.d, cardSubtypePickerControllerContract$InputData.d) && Intrinsics.f(this.e, cardSubtypePickerControllerContract$InputData.e) && Intrinsics.f(this.f, cardSubtypePickerControllerContract$InputData.f) && Intrinsics.f(this.f65026g, cardSubtypePickerControllerContract$InputData.f65026g);
    }

    public final int hashCode() {
        int iHashCode = this.f65023a.hashCode() * 31;
        zn3.a aVar = this.f65024b;
        int iB = l.b(this.f65025c, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        NaviCommand naviCommand = this.d;
        int iHashCode2 = (iB + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.f;
        return this.f65026g.hashCode() + ((iHashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65023a.name());
        zn3.a aVar = this.f65024b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.f65025c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeParcelable(this.f65026g, i);
    }
}
