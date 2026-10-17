package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetailsAmendment;", "Landroid/os/Parcelable;", "PayToPaymentMethodDetailsAmendment", "UpiPaymentMethodDetailsAmendment", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetailsAmendment$PayToPaymentMethodDetailsAmendment;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetailsAmendment$UpiPaymentMethodDetailsAmendment;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentMethodDetailsAmendment extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetailsAmendment$PayToPaymentMethodDetailsAmendment;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetailsAmendment;", "", "toString", "()Ljava/lang/String;", "AmendmentAdditionalInfo", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayToPaymentMethodDetailsAmendment implements PaymentMethodDetailsAmendment {

        @NotNull
        public static final Parcelable.Creator<PayToPaymentMethodDetailsAmendment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FieldChange f62075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FieldChange f62076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FieldChange f62077c;
        public final FieldChange d;
        public final FieldChange e;
        public final FieldChange f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final FieldChange f62078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final FieldChange f62079h;
        public final FieldChange i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final FieldChange f62080j;
        public final AmendmentAdditionalInfo k;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetailsAmendment$PayToPaymentMethodDetailsAmendment$AmendmentAdditionalInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AmendmentAdditionalInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AmendmentAdditionalInfo> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FieldChange f62081a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final FieldChange f62082b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final FieldChange f62083c;
            public final FieldChange d;
            public final FieldChange e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AmendmentAdditionalInfo((FieldChange) parcel.readParcelable(AmendmentAdditionalInfo.class.getClassLoader()), (FieldChange) parcel.readParcelable(AmendmentAdditionalInfo.class.getClassLoader()), (FieldChange) parcel.readParcelable(AmendmentAdditionalInfo.class.getClassLoader()), (FieldChange) parcel.readParcelable(AmendmentAdditionalInfo.class.getClassLoader()), (FieldChange) parcel.readParcelable(AmendmentAdditionalInfo.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AmendmentAdditionalInfo[i];
                }
            }

            public AmendmentAdditionalInfo(FieldChange shortDescription, FieldChange purpose, FieldChange transferArrangement, FieldChange expirationExtendedAutomatically, FieldChange reference) {
                Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
                Intrinsics.checkNotNullParameter(purpose, "purpose");
                Intrinsics.checkNotNullParameter(transferArrangement, "transferArrangement");
                Intrinsics.checkNotNullParameter(expirationExtendedAutomatically, "expirationExtendedAutomatically");
                Intrinsics.checkNotNullParameter(reference, "reference");
                this.f62081a = shortDescription;
                this.f62082b = purpose;
                this.f62083c = transferArrangement;
                this.d = expirationExtendedAutomatically;
                this.e = reference;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AmendmentAdditionalInfo)) {
                    return false;
                }
                AmendmentAdditionalInfo amendmentAdditionalInfo = (AmendmentAdditionalInfo) obj2;
                return Intrinsics.f(this.f62081a, amendmentAdditionalInfo.f62081a) && Intrinsics.f(this.f62082b, amendmentAdditionalInfo.f62082b) && Intrinsics.f(this.f62083c, amendmentAdditionalInfo.f62083c) && Intrinsics.f(this.d, amendmentAdditionalInfo.d) && Intrinsics.f(this.e, amendmentAdditionalInfo.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + ((this.f62083c.hashCode() + ((this.f62082b.hashCode() + (this.f62081a.hashCode() * 31)) * 31)) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f62081a, i);
                dest.writeParcelable(this.f62082b, i);
                dest.writeParcelable(this.f62083c, i);
                dest.writeParcelable(this.d, i);
                dest.writeParcelable(this.e, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayToPaymentMethodDetailsAmendment((FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), (FieldChange) parcel.readParcelable(PayToPaymentMethodDetailsAmendment.class.getClassLoader()), parcel.readInt() == 0 ? null : AmendmentAdditionalInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayToPaymentMethodDetailsAmendment[i];
            }
        }

        public PayToPaymentMethodDetailsAmendment(FieldChange description, FieldChange creditor, FieldChange firstAmount, FieldChange lastAmount, FieldChange amountType, FieldChange firstTransactionDate, FieldChange lastTransactionDate, FieldChange countPerPeriod, FieldChange pointInTime, FieldChange paymentNotAllowedBefore, AmendmentAdditionalInfo amendmentAdditionalInfo) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            Intrinsics.checkNotNullParameter(firstAmount, "firstAmount");
            Intrinsics.checkNotNullParameter(lastAmount, "lastAmount");
            Intrinsics.checkNotNullParameter(amountType, "amountType");
            Intrinsics.checkNotNullParameter(firstTransactionDate, "firstTransactionDate");
            Intrinsics.checkNotNullParameter(lastTransactionDate, "lastTransactionDate");
            Intrinsics.checkNotNullParameter(countPerPeriod, "countPerPeriod");
            Intrinsics.checkNotNullParameter(pointInTime, "pointInTime");
            Intrinsics.checkNotNullParameter(paymentNotAllowedBefore, "paymentNotAllowedBefore");
            this.f62075a = description;
            this.f62076b = creditor;
            this.f62077c = firstAmount;
            this.d = lastAmount;
            this.e = amountType;
            this.f = firstTransactionDate;
            this.f62078g = lastTransactionDate;
            this.f62079h = countPerPeriod;
            this.i = pointInTime;
            this.f62080j = paymentNotAllowedBefore;
            this.k = amendmentAdditionalInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PayToPaymentMethodDetailsAmendment)) {
                return false;
            }
            PayToPaymentMethodDetailsAmendment payToPaymentMethodDetailsAmendment = (PayToPaymentMethodDetailsAmendment) obj2;
            return Intrinsics.f(this.f62075a, payToPaymentMethodDetailsAmendment.f62075a) && Intrinsics.f(this.f62076b, payToPaymentMethodDetailsAmendment.f62076b) && Intrinsics.f(this.f62077c, payToPaymentMethodDetailsAmendment.f62077c) && Intrinsics.f(this.d, payToPaymentMethodDetailsAmendment.d) && Intrinsics.f(this.e, payToPaymentMethodDetailsAmendment.e) && Intrinsics.f(this.f, payToPaymentMethodDetailsAmendment.f) && Intrinsics.f(this.f62078g, payToPaymentMethodDetailsAmendment.f62078g) && Intrinsics.f(this.f62079h, payToPaymentMethodDetailsAmendment.f62079h) && Intrinsics.f(this.i, payToPaymentMethodDetailsAmendment.i) && Intrinsics.f(this.f62080j, payToPaymentMethodDetailsAmendment.f62080j) && Intrinsics.f(this.k, payToPaymentMethodDetailsAmendment.k);
        }

        public final int hashCode() {
            int iHashCode = (this.f62080j.hashCode() + ((this.i.hashCode() + ((this.f62079h.hashCode() + ((this.f62078g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f62077c.hashCode() + ((this.f62076b.hashCode() + (this.f62075a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            AmendmentAdditionalInfo amendmentAdditionalInfo = this.k;
            return iHashCode + (amendmentAdditionalInfo == null ? 0 : amendmentAdditionalInfo.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62075a, i);
            dest.writeParcelable(this.f62076b, i);
            dest.writeParcelable(this.f62077c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f62078g, i);
            dest.writeParcelable(this.f62079h, i);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f62080j, i);
            AmendmentAdditionalInfo amendmentAdditionalInfo = this.k;
            if (amendmentAdditionalInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                amendmentAdditionalInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetailsAmendment$UpiPaymentMethodDetailsAmendment;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetailsAmendment;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpiPaymentMethodDetailsAmendment implements PaymentMethodDetailsAmendment {

        @NotNull
        public static final Parcelable.Creator<UpiPaymentMethodDetailsAmendment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FieldChange f62084a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpiPaymentMethodDetailsAmendment((FieldChange) parcel.readParcelable(UpiPaymentMethodDetailsAmendment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpiPaymentMethodDetailsAmendment[i];
            }
        }

        public UpiPaymentMethodDetailsAmendment(FieldChange description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f62084a = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpiPaymentMethodDetailsAmendment) && Intrinsics.f(this.f62084a, ((UpiPaymentMethodDetailsAmendment) obj2).f62084a);
        }

        public final int hashCode() {
            return this.f62084a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62084a, i);
        }
    }
}
