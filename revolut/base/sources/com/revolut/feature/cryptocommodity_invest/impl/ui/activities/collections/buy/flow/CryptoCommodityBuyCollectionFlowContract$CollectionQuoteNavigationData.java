package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CollectionQuote f71520c;
    public final List d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            CollectionQuote collectionQuote = (CollectionQuote) parcel.readParcelable(CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData(string, dVar, collectionQuote, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData[i];
        }
    }

    public CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData(String collectionKey, d insertedAmount, CollectionQuote collectionQuote, List list, String str) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        Intrinsics.checkNotNullParameter(insertedAmount, "insertedAmount");
        Intrinsics.checkNotNullParameter(collectionQuote, "collectionQuote");
        this.f71518a = collectionKey;
        this.f71519b = insertedAmount;
        this.f71520c = collectionQuote;
        this.d = list;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData)) {
            return false;
        }
        CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData = (CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData) obj2;
        return Intrinsics.f(this.f71518a, cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.f71518a) && Intrinsics.f(this.f71519b, cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.f71519b) && Intrinsics.f(this.f71520c, cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.f71520c) && Intrinsics.f(this.d, cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.d) && Intrinsics.f(this.e, cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f71520c.hashCode() + v7.c(this.f71518a.hashCode() * 31, 31, this.f71519b)) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71518a);
        dest.writeSerializable(this.f71519b);
        dest.writeParcelable(this.f71520c, i);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        dest.writeString(this.e);
    }
}
