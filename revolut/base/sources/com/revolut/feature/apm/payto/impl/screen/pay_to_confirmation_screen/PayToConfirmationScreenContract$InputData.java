package com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.kompot.common.IOData$Input;
import j02.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "WithId", "WithPendingActionData", "Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$InputData$WithId;", "Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$InputData$WithPendingActionData;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayToConfirmationScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$InputData$WithId;", "Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithId implements PayToConfirmationScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f62747b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithId(parcel.readString(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithId[i];
            }
        }

        public WithId(String id10, n type) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f62746a = id10;
            this.f62747b = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithId)) {
                return false;
            }
            WithId withId = (WithId) obj2;
            return Intrinsics.f(this.f62746a, withId.f62746a) && this.f62747b == withId.f62747b;
        }

        public final int hashCode() {
            return this.f62747b.hashCode() + (this.f62746a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62746a);
            dest.writeString(this.f62747b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$InputData$WithPendingActionData;", "Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithPendingActionData implements PayToConfirmationScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithPendingActionData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationPendingAction f62748a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithPendingActionData((ApmPaymentAuthorisationPendingAction) parcel.readParcelable(WithPendingActionData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithPendingActionData[i];
            }
        }

        public WithPendingActionData(ApmPaymentAuthorisationPendingAction paymentAuthorisationPendingAction) {
            Intrinsics.checkNotNullParameter(paymentAuthorisationPendingAction, "paymentAuthorisationPendingAction");
            this.f62748a = paymentAuthorisationPendingAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithPendingActionData) && Intrinsics.f(this.f62748a, ((WithPendingActionData) obj2).f62748a);
        }

        public final int hashCode() {
            return this.f62748a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62748a, i);
        }
    }
}
