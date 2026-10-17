package com.revolut.feature.payment.counterparty.impl.screen.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DeleteRecipient", "ChangeBackgroundDialog", "Lcom/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreenContract$ModalStep$ChangeBackgroundDialog;", "Lcom/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreenContract$ModalStep$DeleteRecipient;", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CounterPartyDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreenContract$ModalStep$ChangeBackgroundDialog;", "Lcom/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeBackgroundDialog extends CounterPartyDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeBackgroundDialog f79050a = new ChangeBackgroundDialog();

        @NotNull
        public static final Parcelable.Creator<ChangeBackgroundDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeBackgroundDialog.f79050a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeBackgroundDialog[i];
            }
        }

        private ChangeBackgroundDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreenContract$ModalStep$DeleteRecipient;", "Lcom/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeleteRecipient extends CounterPartyDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteRecipient f79051a = new DeleteRecipient();

        @NotNull
        public static final Parcelable.Creator<DeleteRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeleteRecipient.f79051a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteRecipient[i];
            }
        }

        private DeleteRecipient() {
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

    private CounterPartyDetailsScreenContract$ModalStep() {
    }
}
