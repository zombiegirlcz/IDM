package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityBuyCollectionFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityBuyCollectionFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71526c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCommodityBuyCollectionFlowContract$InputData(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityBuyCollectionFlowContract$InputData[i];
        }
    }

    public CryptoCommodityBuyCollectionFlowContract$InputData(long j2, String collectionKey, String defaultCurrency, String defaultPocketId) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(defaultPocketId, "defaultPocketId");
        this.f71524a = collectionKey;
        this.f71525b = defaultCurrency;
        this.f71526c = j2;
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
        if (!(obj2 instanceof CryptoCommodityBuyCollectionFlowContract$InputData)) {
            return false;
        }
        CryptoCommodityBuyCollectionFlowContract$InputData cryptoCommodityBuyCollectionFlowContract$InputData = (CryptoCommodityBuyCollectionFlowContract$InputData) obj2;
        return Intrinsics.f(this.f71524a, cryptoCommodityBuyCollectionFlowContract$InputData.f71524a) && Intrinsics.f(this.f71525b, cryptoCommodityBuyCollectionFlowContract$InputData.f71525b) && this.f71526c == cryptoCommodityBuyCollectionFlowContract$InputData.f71526c && Intrinsics.f(this.d, cryptoCommodityBuyCollectionFlowContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.c(p.a.c(this.f71524a.hashCode() * 31, 31, this.f71525b), 31, this.f71526c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71524a);
        dest.writeString(this.f71525b);
        dest.writeLong(this.f71526c);
        dest.writeString(this.d);
    }
}
