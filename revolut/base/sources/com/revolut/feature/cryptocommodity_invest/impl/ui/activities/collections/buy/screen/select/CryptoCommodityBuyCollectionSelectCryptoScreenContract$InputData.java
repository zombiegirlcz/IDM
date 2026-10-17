package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/screen/select/CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f71550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f71551b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            int iC2 = 0;
            while (iC2 != i) {
                iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
            }
            return new CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData[i];
        }
    }

    public CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData(List allCryptoCurrencies, List selectedCryptoCurrencies) {
        Intrinsics.checkNotNullParameter(allCryptoCurrencies, "allCryptoCurrencies");
        Intrinsics.checkNotNullParameter(selectedCryptoCurrencies, "selectedCryptoCurrencies");
        this.f71550a = allCryptoCurrencies;
        this.f71551b = selectedCryptoCurrencies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData)) {
            return false;
        }
        CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData cryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData = (CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData) obj2;
        return Intrinsics.f(this.f71550a, cryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData.f71550a) && Intrinsics.f(this.f71551b, cryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData.f71551b);
    }

    public final int hashCode() {
        return this.f71551b.hashCode() + (this.f71550a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f71550a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = p.a.v(this.f71551b, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
    }
}
