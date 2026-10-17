package com.revolut.feature.credit.autopay.ui.screen.confirm_autopay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BackupInfoDialog", "RepaymentDayInfoDialog", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ModalStep$BackupInfoDialog;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ModalStep$RepaymentDayInfoDialog;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConfirmAutopayContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ModalStep$BackupInfoDialog;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ModalStep;", "<init>", "()V", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BackupInfoDialog implements ConfirmAutopayContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackupInfoDialog f68628a = new BackupInfoDialog();

        @NotNull
        public static final Parcelable.Creator<BackupInfoDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BackupInfoDialog.f68628a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackupInfoDialog[i];
            }
        }

        private BackupInfoDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ModalStep$RepaymentDayInfoDialog;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ModalStep;", "<init>", "()V", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RepaymentDayInfoDialog implements ConfirmAutopayContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RepaymentDayInfoDialog f68629a = new RepaymentDayInfoDialog();

        @NotNull
        public static final Parcelable.Creator<RepaymentDayInfoDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RepaymentDayInfoDialog.f68629a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentDayInfoDialog[i];
            }
        }

        private RepaymentDayInfoDialog() {
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
