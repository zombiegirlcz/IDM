package com.revolut.feature.apm.bills.tapi.impl.flow.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Amount", "FeeBreakdown", "TransferBreakdown", "Review", "Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step$Amount;", "Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step$FeeBreakdown;", "Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step$Review;", "Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step$TransferBreakdown;", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TapiTransferFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step$Amount;", "Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step;", "<init>", "()V", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Amount implements TapiTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Amount f61538a = new Amount();

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Amount.f61538a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        private Amount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step$FeeBreakdown;", "Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeBreakdown implements TapiTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeeBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmQuoteCharges f61539a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeBreakdown((ApmQuoteCharges) parcel.readParcelable(FeeBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeBreakdown[i];
            }
        }

        public FeeBreakdown(ApmQuoteCharges apmQuoteCharges) {
            this.f61539a = apmQuoteCharges;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeeBreakdown) && Intrinsics.f(this.f61539a, ((FeeBreakdown) obj2).f61539a);
        }

        public final int hashCode() {
            ApmQuoteCharges apmQuoteCharges = this.f61539a;
            if (apmQuoteCharges == null) {
                return 0;
            }
            return apmQuoteCharges.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61539a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step$Review;", "Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements TapiTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f61540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f61541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61542c;
        public final ApmQuote d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review((d) parcel.readSerializable(), (AccountId) parcel.readParcelable(Review.class.getClassLoader()), parcel.readString(), (ApmQuote) parcel.readParcelable(Review.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(d amount, AccountId accountId, String str, ApmQuote apmQuote) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f61540a = amount;
            this.f61541b = accountId;
            this.f61542c = str;
            this.d = apmQuote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f61540a, review.f61540a) && Intrinsics.f(this.f61541b, review.f61541b) && Intrinsics.f(this.f61542c, review.f61542c) && Intrinsics.f(this.d, review.d);
        }

        public final int hashCode() {
            int iHashCode = this.f61540a.hashCode() * 31;
            AccountId accountId = this.f61541b;
            int iHashCode2 = (iHashCode + (accountId == null ? 0 : accountId.hashCode())) * 31;
            String str = this.f61542c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ApmQuote apmQuote = this.d;
            return iHashCode3 + (apmQuote != null ? apmQuote.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f61540a);
            dest.writeParcelable(this.f61541b, i);
            dest.writeString(this.f61542c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step$TransferBreakdown;", "Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferBreakdown implements TapiTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransferBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n9l.a f61543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmQuote f61544b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferBreakdown((ApmQuote) parcel.readParcelable(TransferBreakdown.class.getClassLoader()), (n9l.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferBreakdown[i];
            }
        }

        public TransferBreakdown(ApmQuote apmQuote, n9l.a exchangeRate) {
            Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
            this.f61543a = exchangeRate;
            this.f61544b = apmQuote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransferBreakdown)) {
                return false;
            }
            TransferBreakdown transferBreakdown = (TransferBreakdown) obj2;
            return Intrinsics.f(this.f61543a, transferBreakdown.f61543a) && Intrinsics.f(this.f61544b, transferBreakdown.f61544b);
        }

        public final int hashCode() {
            int iHashCode = this.f61543a.hashCode() * 31;
            ApmQuote apmQuote = this.f61544b;
            return iHashCode + (apmQuote == null ? 0 : apmQuote.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f61543a);
            dest.writeParcelable(this.f61544b, i);
        }
    }
}
