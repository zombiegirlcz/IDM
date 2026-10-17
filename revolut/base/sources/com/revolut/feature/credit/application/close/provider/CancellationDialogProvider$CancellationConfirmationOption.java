package com.revolut.feature.credit.application.close.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption", "Landroid/os/Parcelable;", "ConfirmCancellation", "RejectCancellation", "SaveForLater", "BackendAction", "Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption$BackendAction;", "Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption$ConfirmCancellation;", "Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption$RejectCancellation;", "Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption$SaveForLater;", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CancellationDialogProvider$CancellationConfirmationOption extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption$BackendAction;", "Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackendAction implements CancellationDialogProvider$CancellationConfirmationOption {

        @NotNull
        public static final Parcelable.Creator<BackendAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DropOutConfig.Action f66211a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackendAction((DropOutConfig.Action) parcel.readParcelable(BackendAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackendAction[i];
            }
        }

        public BackendAction(DropOutConfig.Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f66211a = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BackendAction) && Intrinsics.f(this.f66211a, ((BackendAction) obj2).f66211a);
        }

        public final int hashCode() {
            return this.f66211a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66211a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption$ConfirmCancellation;", "Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption;", "<init>", "()V", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmCancellation implements CancellationDialogProvider$CancellationConfirmationOption {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmCancellation f66212a = new ConfirmCancellation();

        @NotNull
        public static final Parcelable.Creator<ConfirmCancellation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmCancellation.f66212a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmCancellation[i];
            }
        }

        private ConfirmCancellation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption$RejectCancellation;", "Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption;", "<init>", "()V", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RejectCancellation implements CancellationDialogProvider$CancellationConfirmationOption {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RejectCancellation f66213a = new RejectCancellation();

        @NotNull
        public static final Parcelable.Creator<RejectCancellation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RejectCancellation.f66213a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RejectCancellation[i];
            }
        }

        private RejectCancellation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption$SaveForLater;", "Lcom/revolut/feature/credit/application/close/provider/CancellationDialogProvider$CancellationConfirmationOption;", "<init>", "()V", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SaveForLater implements CancellationDialogProvider$CancellationConfirmationOption {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SaveForLater f66214a = new SaveForLater();

        @NotNull
        public static final Parcelable.Creator<SaveForLater> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SaveForLater.f66214a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SaveForLater[i];
            }
        }

        private SaveForLater() {
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
