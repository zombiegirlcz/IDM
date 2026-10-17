package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/screen/amount/CryptoCommodityBuyCollectionAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityBuyCollectionAmountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityBuyCollectionAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71540c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCommodityBuyCollectionAmountScreenContract$InputData(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityBuyCollectionAmountScreenContract$InputData[i];
        }
    }

    public CryptoCommodityBuyCollectionAmountScreenContract$InputData(long j2, String defaultCurrency, String collectionKey, String defaultPocketId) {
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        Intrinsics.checkNotNullParameter(defaultPocketId, "defaultPocketId");
        this.f71538a = defaultCurrency;
        this.f71539b = collectionKey;
        this.f71540c = j2;
        this.d = defaultPocketId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityBuyCollectionAmountScreenContract$InputData)) {
            return false;
        }
        CryptoCommodityBuyCollectionAmountScreenContract$InputData cryptoCommodityBuyCollectionAmountScreenContract$InputData = (CryptoCommodityBuyCollectionAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f71538a, cryptoCommodityBuyCollectionAmountScreenContract$InputData.f71538a) && Intrinsics.f(this.f71539b, cryptoCommodityBuyCollectionAmountScreenContract$InputData.f71539b) && this.f71540c == cryptoCommodityBuyCollectionAmountScreenContract$InputData.f71540c && Intrinsics.f(this.d, cryptoCommodityBuyCollectionAmountScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.c(p.a.c(this.f71538a.hashCode() * 31, 31, this.f71539b), 31, this.f71540c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71538a);
        dest.writeString(this.f71539b);
        dest.writeLong(this.f71540c);
        dest.writeString(this.d);
    }
}
