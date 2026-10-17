package com.revolut.feature.check_topup.impl.ui_kompot.screen.scan.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CheckTopUpScanDialogHelperImpl implements jg3.a {

    @NotNull
    private static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/scan/dialog/CheckTopUpScanDialogHelperImpl$DialogConfiguration;", "Landroid/os/Parcelable;", "<init>", "()V", "PendingDialog", "ErrorDialog", "Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/scan/dialog/CheckTopUpScanDialogHelperImpl$DialogConfiguration$ErrorDialog;", "Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/scan/dialog/CheckTopUpScanDialogHelperImpl$DialogConfiguration$PendingDialog;", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class DialogConfiguration implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/scan/dialog/CheckTopUpScanDialogHelperImpl$DialogConfiguration$ErrorDialog;", "Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/scan/dialog/CheckTopUpScanDialogHelperImpl$DialogConfiguration;", "<init>", "()V", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ErrorDialog extends DialogConfiguration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ErrorDialog f65773a = new ErrorDialog();

            @NotNull
            public static final Parcelable.Creator<ErrorDialog> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ErrorDialog.f65773a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ErrorDialog[i];
                }
            }

            private ErrorDialog() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/scan/dialog/CheckTopUpScanDialogHelperImpl$DialogConfiguration$PendingDialog;", "Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/scan/dialog/CheckTopUpScanDialogHelperImpl$DialogConfiguration;", "<init>", "()V", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PendingDialog extends DialogConfiguration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PendingDialog f65774a = new PendingDialog();

            @NotNull
            public static final Parcelable.Creator<PendingDialog> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PendingDialog.f65774a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PendingDialog[i];
                }
            }

            private PendingDialog() {
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

        private DialogConfiguration() {
        }
    }

    public static final class a {
        private a() {
        }
    }
}
