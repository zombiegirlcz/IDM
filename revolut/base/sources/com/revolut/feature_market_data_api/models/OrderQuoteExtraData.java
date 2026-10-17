package com.revolut.feature_market_data_api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.h;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData;", "Landroid/os/Parcelable;", "<init>", "()V", "TradingOrderQuoteExtraData", "CryptoOrderQuoteExtraData", "CreditCardQuoteExtraData", "TopupExtraData", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$CreditCardQuoteExtraData;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$CryptoOrderQuoteExtraData;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$TopupExtraData;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$TradingOrderQuoteExtraData;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OrderQuoteExtraData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$CreditCardQuoteExtraData;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData;", "", "toString", "()Ljava/lang/String;", "Interest", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardQuoteExtraData extends OrderQuoteExtraData {

        @NotNull
        public static final Parcelable.Creator<CreditCardQuoteExtraData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Interest f97009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f97010c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$CreditCardQuoteExtraData$Interest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Interest implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Interest> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TransferQuoteSplitOption f97011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditCardInterest f97012b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Interest((TransferQuoteSplitOption) parcel.readParcelable(Interest.class.getClassLoader()), (CreditCardInterest) parcel.readParcelable(Interest.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Interest[i];
                }
            }

            public Interest(TransferQuoteSplitOption transferQuoteSplitOption, CreditCardInterest creditCardInterest) {
                this.f97011a = transferQuoteSplitOption;
                this.f97012b = creditCardInterest;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Interest)) {
                    return false;
                }
                Interest interest = (Interest) obj2;
                return Intrinsics.f(this.f97011a, interest.f97011a) && Intrinsics.f(this.f97012b, interest.f97012b);
            }

            public final int hashCode() {
                TransferQuoteSplitOption transferQuoteSplitOption = this.f97011a;
                int iHashCode = (transferQuoteSplitOption == null ? 0 : transferQuoteSplitOption.hashCode()) * 31;
                CreditCardInterest creditCardInterest = this.f97012b;
                return iHashCode + (creditCardInterest != null ? creditCardInterest.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f97011a, i);
                dest.writeParcelable(this.f97012b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCardQuoteExtraData(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Interest.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardQuoteExtraData[i];
            }
        }

        public CreditCardQuoteExtraData(boolean z, Interest interest, b bVar) {
            this.f97008a = z;
            this.f97009b = interest;
            this.f97010c = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCardQuoteExtraData)) {
                return false;
            }
            CreditCardQuoteExtraData creditCardQuoteExtraData = (CreditCardQuoteExtraData) obj2;
            return this.f97008a == creditCardQuoteExtraData.f97008a && Intrinsics.f(this.f97009b, creditCardQuoteExtraData.f97009b) && Intrinsics.f(this.f97010c, creditCardQuoteExtraData.f97010c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f97008a) * 31;
            Interest interest = this.f97009b;
            int iHashCode2 = (iHashCode + (interest == null ? 0 : interest.hashCode())) * 31;
            b bVar = this.f97010c;
            return iHashCode2 + (bVar != null ? bVar.f297794a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f97008a ? 1 : 0);
            Interest interest = this.f97009b;
            if (interest == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                interest.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f97010c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$CryptoOrderQuoteExtraData;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoOrderQuoteExtraData extends OrderQuoteExtraData {

        @NotNull
        public static final Parcelable.Creator<CryptoOrderQuoteExtraData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f97013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f97014b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoOrderQuoteExtraData(h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoOrderQuoteExtraData[i];
            }
        }

        public CryptoOrderQuoteExtraData(h exchangeOrderType, Double d) {
            Intrinsics.checkNotNullParameter(exchangeOrderType, "exchangeOrderType");
            this.f97013a = exchangeOrderType;
            this.f97014b = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoOrderQuoteExtraData)) {
                return false;
            }
            CryptoOrderQuoteExtraData cryptoOrderQuoteExtraData = (CryptoOrderQuoteExtraData) obj2;
            return this.f97013a == cryptoOrderQuoteExtraData.f97013a && Intrinsics.f(this.f97014b, cryptoOrderQuoteExtraData.f97014b);
        }

        public final int hashCode() {
            int iHashCode = this.f97013a.hashCode() * 31;
            Double d = this.f97014b;
            return iHashCode + (d == null ? 0 : d.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97013a.name());
            Double d = this.f97014b;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$TopupExtraData;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData;", "<init>", "()V", "CreditCard", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$TopupExtraData$CreditCard;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class TopupExtraData extends OrderQuoteExtraData {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$TopupExtraData$CreditCard;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$TopupExtraData;", "<init>", "()V", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CreditCard extends TopupExtraData {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CreditCard f97015a = new CreditCard();

            @NotNull
            public static final Parcelable.Creator<CreditCard> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CreditCard.f97015a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreditCard[i];
                }
            }

            private CreditCard() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        private TopupExtraData() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData$TradingOrderQuoteExtraData;", "Lcom/revolut/feature_market_data_api/models/OrderQuoteExtraData;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature_market_data_api/models/a", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingOrderQuoteExtraData extends OrderQuoteExtraData {

        @NotNull
        public static final Parcelable.Creator<TradingOrderQuoteExtraData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature_market_data_api.models.a f97016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransactionUnitsType f97017b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingOrderQuoteExtraData(com.revolut.feature_market_data_api.models.a.valueOf(parcel.readString()), (TransactionUnitsType) parcel.readParcelable(TradingOrderQuoteExtraData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingOrderQuoteExtraData[i];
            }
        }

        public TradingOrderQuoteExtraData(com.revolut.feature_market_data_api.models.a securityType, TransactionUnitsType unitsType) {
            Intrinsics.checkNotNullParameter(securityType, "securityType");
            Intrinsics.checkNotNullParameter(unitsType, "unitsType");
            this.f97016a = securityType;
            this.f97017b = unitsType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingOrderQuoteExtraData)) {
                return false;
            }
            TradingOrderQuoteExtraData tradingOrderQuoteExtraData = (TradingOrderQuoteExtraData) obj2;
            return this.f97016a == tradingOrderQuoteExtraData.f97016a && Intrinsics.f(this.f97017b, tradingOrderQuoteExtraData.f97017b);
        }

        public final int hashCode() {
            return this.f97017b.hashCode() + (this.f97016a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97016a.name());
            dest.writeParcelable(this.f97017b, i);
        }
    }

    private OrderQuoteExtraData() {
    }
}
