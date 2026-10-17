package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Amount", "Confirmation", "CryptoScaPrompt", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step$Amount;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step$Confirmation;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step$CryptoScaPrompt;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoCommodityBuyCollectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step$Amount;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount extends CryptoCommodityBuyCollectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f71530c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(long j2, String collectionKey, String defaultCurrency, String defaultPocketId) {
            Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
            Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
            Intrinsics.checkNotNullParameter(defaultPocketId, "defaultPocketId");
            this.f71528a = collectionKey;
            this.f71529b = defaultCurrency;
            this.f71530c = j2;
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
            if (!(obj2 instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj2;
            return Intrinsics.f(this.f71528a, amount.f71528a) && Intrinsics.f(this.f71529b, amount.f71529b) && this.f71530c == amount.f71530c && Intrinsics.f(this.d, amount.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + d.c(p.a.c(this.f71528a.hashCode() * 31, 31, this.f71529b), 31, this.f71530c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71528a);
            dest.writeString(this.f71529b);
            dest.writeLong(this.f71530c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step$Confirmation;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends CryptoCommodityBuyCollectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData f71531a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData navigationData) {
            Intrinsics.checkNotNullParameter(navigationData, "navigationData");
            this.f71531a = navigationData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f71531a, ((Confirmation) obj2).f71531a);
        }

        public final int hashCode() {
            return this.f71531a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71531a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step$CryptoScaPrompt;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoScaPrompt extends CryptoCommodityBuyCollectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CryptoScaPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData f71533b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoScaPrompt(parcel.readString(), CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoScaPrompt[i];
            }
        }

        public CryptoScaPrompt(String legalEntityId, CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData navigationData) {
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            Intrinsics.checkNotNullParameter(navigationData, "navigationData");
            this.f71532a = legalEntityId;
            this.f71533b = navigationData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoScaPrompt)) {
                return false;
            }
            CryptoScaPrompt cryptoScaPrompt = (CryptoScaPrompt) obj2;
            return Intrinsics.f(this.f71532a, cryptoScaPrompt.f71532a) && Intrinsics.f(this.f71533b, cryptoScaPrompt.f71533b);
        }

        public final int hashCode() {
            return this.f71533b.hashCode() + (this.f71532a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71532a);
            this.f71533b.writeToParcel(dest, i);
        }
    }

    private CryptoCommodityBuyCollectionFlowContract$Step() {
    }
}
