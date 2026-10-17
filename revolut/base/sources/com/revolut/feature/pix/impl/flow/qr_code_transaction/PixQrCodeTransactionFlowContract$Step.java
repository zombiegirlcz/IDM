package com.revolut.feature.pix.impl.flow.qr_code_transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Amount", "Review", "AdditionalInformationRequested", "InterestAndFeeRequested", "PixChangeAmountRequested", "AddressRequested", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$AdditionalInformationRequested;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$AddressRequested;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$Amount;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$InterestAndFeeRequested;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$PixChangeAmountRequested;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$Review;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixQrCodeTransactionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$AdditionalInformationRequested;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AdditionalInformationRequested implements PixQrCodeTransactionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AdditionalInformationRequested f80687a = new AdditionalInformationRequested();

        @NotNull
        public static final Parcelable.Creator<AdditionalInformationRequested> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AdditionalInformationRequested.f80687a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInformationRequested[i];
            }
        }

        private AdditionalInformationRequested() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$AddressRequested;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressRequested implements PixQrCodeTransactionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressRequested f80688a = new AddressRequested();

        @NotNull
        public static final Parcelable.Creator<AddressRequested> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressRequested.f80688a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressRequested[i];
            }
        }

        private AddressRequested() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$Amount;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount implements PixQrCodeTransactionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80690b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(String beneficiaryName, String beneficiarySubtitle) {
            Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
            Intrinsics.checkNotNullParameter(beneficiarySubtitle, "beneficiarySubtitle");
            this.f80689a = beneficiaryName;
            this.f80690b = beneficiarySubtitle;
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
            return Intrinsics.f(this.f80689a, amount.f80689a) && Intrinsics.f(this.f80690b, amount.f80690b);
        }

        public final int hashCode() {
            return this.f80690b.hashCode() + (this.f80689a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80689a);
            dest.writeString(this.f80690b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$InterestAndFeeRequested;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InterestAndFeeRequested implements PixQrCodeTransactionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterestAndFeeRequested f80691a = new InterestAndFeeRequested();

        @NotNull
        public static final Parcelable.Creator<InterestAndFeeRequested> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InterestAndFeeRequested.f80691a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestAndFeeRequested[i];
            }
        }

        private InterestAndFeeRequested() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$PixChangeAmountRequested;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PixChangeAmountRequested implements PixQrCodeTransactionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PixChangeAmountRequested f80692a = new PixChangeAmountRequested();

        @NotNull
        public static final Parcelable.Creator<PixChangeAmountRequested> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PixChangeAmountRequested.f80692a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixChangeAmountRequested[i];
            }
        }

        private PixChangeAmountRequested() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step$Review;", "Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/PixQrCodeTransactionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements PixQrCodeTransactionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f80694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f80695c;
        public final String d;
        public final String e;
        public final TransferScheduleData f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), (TransferScheduleData) parcel.readParcelable(Review.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(String decodedOperationId, d amount, String reference, String beneficiaryName, String institutionName, TransferScheduleData scheduleData) {
            Intrinsics.checkNotNullParameter(decodedOperationId, "decodedOperationId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(reference, "reference");
            Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            this.f80693a = decodedOperationId;
            this.f80694b = amount;
            this.f80695c = reference;
            this.d = beneficiaryName;
            this.e = institutionName;
            this.f = scheduleData;
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
            return Intrinsics.f(this.f80693a, review.f80693a) && Intrinsics.f(this.f80694b, review.f80694b) && Intrinsics.f(this.f80695c, review.f80695c) && Intrinsics.f(this.d, review.d) && Intrinsics.f(this.e, review.e) && Intrinsics.f(this.f, review.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + p.a.c(p.a.c(p.a.c(v7.c(this.f80693a.hashCode() * 31, 31, this.f80694b), 31, this.f80695c), 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80693a);
            dest.writeSerializable(this.f80694b);
            dest.writeString(this.f80695c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
        }
    }
}
