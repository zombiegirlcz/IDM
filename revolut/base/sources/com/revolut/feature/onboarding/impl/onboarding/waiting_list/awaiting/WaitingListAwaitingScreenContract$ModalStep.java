package com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChangeCountryConfirmationDialog", "LogOutConfirmationDialog", "Lcom/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreenContract$ModalStep$ChangeCountryConfirmationDialog;", "Lcom/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreenContract$ModalStep$LogOutConfirmationDialog;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WaitingListAwaitingScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreenContract$ModalStep$ChangeCountryConfirmationDialog;", "Lcom/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreenContract$ModalStep;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeCountryConfirmationDialog implements WaitingListAwaitingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeCountryConfirmationDialog f78501a = new ChangeCountryConfirmationDialog();

        @NotNull
        public static final Parcelable.Creator<ChangeCountryConfirmationDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeCountryConfirmationDialog.f78501a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeCountryConfirmationDialog[i];
            }
        }

        private ChangeCountryConfirmationDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreenContract$ModalStep$LogOutConfirmationDialog;", "Lcom/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreenContract$ModalStep;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LogOutConfirmationDialog implements WaitingListAwaitingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogOutConfirmationDialog f78502a = new LogOutConfirmationDialog();

        @NotNull
        public static final Parcelable.Creator<LogOutConfirmationDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LogOutConfirmationDialog.f78502a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LogOutConfirmationDialog[i];
            }
        }

        private LogOutConfirmationDialog() {
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
