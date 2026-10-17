package com.revolut.retail.feature.pending_payments.api.navigation;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "Accepted", "Rejected", "Error", "NotAvailable", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData$Accepted;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData$Error;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData$NotAvailable;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData$Rejected;", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PendingPaymentContract$OutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData$Accepted;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData;", "<init>", "()V", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Accepted implements PendingPaymentContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Accepted f102403a = new Accepted();

        @NotNull
        public static final Parcelable.Creator<Accepted> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Accepted.f102403a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Accepted[i];
            }
        }

        private Accepted() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData$Error;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData;", "<init>", "()V", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Error implements PendingPaymentContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f102404a = new Error();

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f102404a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        private Error() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData$NotAvailable;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData;", "<init>", "()V", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotAvailable implements PendingPaymentContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f102405a = new NotAvailable();

        @NotNull
        public static final Parcelable.Creator<NotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotAvailable.f102405a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotAvailable[i];
            }
        }

        private NotAvailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData$Rejected;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData;", "<init>", "()V", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Rejected implements PendingPaymentContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Rejected f102406a = new Rejected();

        @NotNull
        public static final Parcelable.Creator<Rejected> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Rejected.f102406a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rejected[i];
            }
        }

        private Rejected() {
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
}
