package com.revolut.feature.revolutpay.shared.ui.add_payment_method;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/shared/ui/add_payment_method/AddPaymentMethodScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EncryptedByRevolut", "Lcom/revolut/feature/revolutpay/shared/ui/add_payment_method/AddPaymentMethodScreenContract$ModalStep$EncryptedByRevolut;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddPaymentMethodScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/add_payment_method/AddPaymentMethodScreenContract$ModalStep$EncryptedByRevolut;", "Lcom/revolut/feature/revolutpay/shared/ui/add_payment_method/AddPaymentMethodScreenContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EncryptedByRevolut implements AddPaymentMethodScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EncryptedByRevolut f84707a = new EncryptedByRevolut();

        @NotNull
        public static final Parcelable.Creator<EncryptedByRevolut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EncryptedByRevolut.f84707a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EncryptedByRevolut[i];
            }
        }

        private EncryptedByRevolut() {
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
