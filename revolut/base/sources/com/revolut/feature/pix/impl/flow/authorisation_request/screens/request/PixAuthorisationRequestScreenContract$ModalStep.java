package com.revolut.feature.pix.impl.flow.authorisation_request.screens.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "NotifyBeforePaymentInfo", "AuthorisationRequestedForDownPayment", "RejectionReason", "TransactionLimitChange", "Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep$AuthorisationRequestedForDownPayment;", "Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep$NotifyBeforePaymentInfo;", "Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep$RejectionReason;", "Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep$TransactionLimitChange;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PixAuthorisationRequestScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep$AuthorisationRequestedForDownPayment;", "Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AuthorisationRequestedForDownPayment extends PixAuthorisationRequestScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AuthorisationRequestedForDownPayment f80590a = new AuthorisationRequestedForDownPayment();

        @NotNull
        public static final Parcelable.Creator<AuthorisationRequestedForDownPayment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AuthorisationRequestedForDownPayment.f80590a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthorisationRequestedForDownPayment[i];
            }
        }

        private AuthorisationRequestedForDownPayment() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep$NotifyBeforePaymentInfo;", "Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotifyBeforePaymentInfo extends PixAuthorisationRequestScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotifyBeforePaymentInfo f80591a = new NotifyBeforePaymentInfo();

        @NotNull
        public static final Parcelable.Creator<NotifyBeforePaymentInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotifyBeforePaymentInfo.f80591a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotifyBeforePaymentInfo[i];
            }
        }

        private NotifyBeforePaymentInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep$RejectionReason;", "Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RejectionReason extends PixAuthorisationRequestScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RejectionReason f80592a = new RejectionReason();

        @NotNull
        public static final Parcelable.Creator<RejectionReason> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RejectionReason.f80592a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RejectionReason[i];
            }
        }

        private RejectionReason() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep$TransactionLimitChange;", "Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionLimitChange extends PixAuthorisationRequestScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TransactionLimitChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f80593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f80594b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionLimitChange((d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionLimitChange[i];
            }
        }

        public TransactionLimitChange(d dVar, d dVar2) {
            this.f80593a = dVar;
            this.f80594b = dVar2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionLimitChange)) {
                return false;
            }
            TransactionLimitChange transactionLimitChange = (TransactionLimitChange) obj2;
            return Intrinsics.f(this.f80593a, transactionLimitChange.f80593a) && Intrinsics.f(this.f80594b, transactionLimitChange.f80594b);
        }

        public final int hashCode() {
            d dVar = this.f80593a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            d dVar2 = this.f80594b;
            return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80593a);
            dest.writeSerializable(this.f80594b);
        }
    }

    private PixAuthorisationRequestScreenContract$ModalStep() {
    }
}
