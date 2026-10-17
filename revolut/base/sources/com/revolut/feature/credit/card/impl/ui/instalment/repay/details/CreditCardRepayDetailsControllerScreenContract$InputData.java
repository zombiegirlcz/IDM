package com.revolut.feature.credit.card.impl.ui.instalment.repay.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardCustomAmountQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.v;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "RepayDetails", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardRepayDetailsControllerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardRepayDetailsControllerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RepayDetails f69480c;
    public final v d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails;", "Landroid/os/Parcelable;", "CustomAmount", "FutureInstalments", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails$CustomAmount;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails$FutureInstalments;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RepayDetails extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails$CustomAmount;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CustomAmount implements RepayDetails {

            @NotNull
            public static final Parcelable.Creator<CustomAmount> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final dj0.d f69481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditCardCustomAmountQuote f69482b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CustomAmount((dj0.d) parcel.readSerializable(), (CreditCardCustomAmountQuote) parcel.readParcelable(CustomAmount.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CustomAmount[i];
                }
            }

            public CustomAmount(dj0.d repaymentAmount, CreditCardCustomAmountQuote quote) {
                Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
                Intrinsics.checkNotNullParameter(quote, "quote");
                this.f69481a = repaymentAmount;
                this.f69482b = quote;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CustomAmount)) {
                    return false;
                }
                CustomAmount customAmount = (CustomAmount) obj2;
                return Intrinsics.f(this.f69481a, customAmount.f69481a) && Intrinsics.f(this.f69482b, customAmount.f69482b);
            }

            public final int hashCode() {
                return this.f69482b.hashCode() + (this.f69481a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f69481a);
                dest.writeParcelable(this.f69482b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails$FutureInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreenContract$InputData$RepayDetails;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FutureInstalments implements RepayDetails {

            @NotNull
            public static final Parcelable.Creator<FutureInstalments> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditCardFutureInstalmentQuote f69483a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LocalDate f69484b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LocalDate f69485c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FutureInstalments((CreditCardFutureInstalmentQuote) parcel.readParcelable(FutureInstalments.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FutureInstalments[i];
                }
            }

            public FutureInstalments(CreditCardFutureInstalmentQuote quote, LocalDate nextMaturingDate, LocalDate previousLastMaturingDate) {
                Intrinsics.checkNotNullParameter(quote, "quote");
                Intrinsics.checkNotNullParameter(nextMaturingDate, "nextMaturingDate");
                Intrinsics.checkNotNullParameter(previousLastMaturingDate, "previousLastMaturingDate");
                this.f69483a = quote;
                this.f69484b = nextMaturingDate;
                this.f69485c = previousLastMaturingDate;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof FutureInstalments)) {
                    return false;
                }
                FutureInstalments futureInstalments = (FutureInstalments) obj2;
                return Intrinsics.f(this.f69483a, futureInstalments.f69483a) && Intrinsics.f(this.f69484b, futureInstalments.f69484b) && Intrinsics.f(this.f69485c, futureInstalments.f69485c);
            }

            public final int hashCode() {
                return this.f69485c.hashCode() + y.a(this.f69483a.hashCode() * 31, 31, this.f69484b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f69483a, i);
                dest.writeSerializable(this.f69484b);
                dest.writeSerializable(this.f69485c);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardRepayDetailsControllerScreenContract$InputData(parcel.readString(), parcel.readString(), (RepayDetails) parcel.readParcelable(CreditCardRepayDetailsControllerScreenContract$InputData.class.getClassLoader()), v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardRepayDetailsControllerScreenContract$InputData[i];
        }
    }

    public CreditCardRepayDetailsControllerScreenContract$InputData(String facilityId, String planId, RepayDetails repayDetails, v instalmentType) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(repayDetails, "repayDetails");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        this.f69478a = facilityId;
        this.f69479b = planId;
        this.f69480c = repayDetails;
        this.d = instalmentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardRepayDetailsControllerScreenContract$InputData)) {
            return false;
        }
        CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = (CreditCardRepayDetailsControllerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69478a, creditCardRepayDetailsControllerScreenContract$InputData.f69478a) && Intrinsics.f(this.f69479b, creditCardRepayDetailsControllerScreenContract$InputData.f69479b) && Intrinsics.f(this.f69480c, creditCardRepayDetailsControllerScreenContract$InputData.f69480c) && this.d == creditCardRepayDetailsControllerScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f69480c.hashCode() + p.a.c(this.f69478a.hashCode() * 31, 31, this.f69479b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69478a);
        dest.writeString(this.f69479b);
        dest.writeParcelable(this.f69480c, i);
        dest.writeString(this.d.name());
    }
}
