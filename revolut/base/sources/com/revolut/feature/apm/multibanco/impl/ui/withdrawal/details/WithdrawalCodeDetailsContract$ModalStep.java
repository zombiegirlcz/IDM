package com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/ui/withdrawal/details/WithdrawalCodeDetailsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ShareConfirmation", "CancelConfirmation", "Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/details/WithdrawalCodeDetailsContract$ModalStep$CancelConfirmation;", "Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/details/WithdrawalCodeDetailsContract$ModalStep$ShareConfirmation;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WithdrawalCodeDetailsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/details/WithdrawalCodeDetailsContract$ModalStep$CancelConfirmation;", "Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/details/WithdrawalCodeDetailsContract$ModalStep;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelConfirmation implements WithdrawalCodeDetailsContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelConfirmation f62634a = new CancelConfirmation();

        @NotNull
        public static final Parcelable.Creator<CancelConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelConfirmation.f62634a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelConfirmation[i];
            }
        }

        private CancelConfirmation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/details/WithdrawalCodeDetailsContract$ModalStep$ShareConfirmation;", "Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/details/WithdrawalCodeDetailsContract$ModalStep;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShareConfirmation implements WithdrawalCodeDetailsContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShareConfirmation f62635a = new ShareConfirmation();

        @NotNull
        public static final Parcelable.Creator<ShareConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShareConfirmation.f62635a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShareConfirmation[i];
            }
        }

        private ShareConfirmation() {
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
