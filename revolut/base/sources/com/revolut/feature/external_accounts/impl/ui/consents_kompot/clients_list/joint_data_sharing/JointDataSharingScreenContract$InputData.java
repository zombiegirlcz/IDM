package com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "EnableDataSharing", "DisableDataSharing", "LearnDataSharing", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData$DisableDataSharing;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData$EnableDataSharing;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData$LearnDataSharing;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JointDataSharingScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData$DisableDataSharing;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisableDataSharing implements JointDataSharingScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DisableDataSharing f72768a = new DisableDataSharing();

        @NotNull
        public static final Parcelable.Creator<DisableDataSharing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DisableDataSharing.f72768a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableDataSharing[i];
            }
        }

        private DisableDataSharing() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData$EnableDataSharing;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnableDataSharing implements JointDataSharingScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnableDataSharing f72769a = new EnableDataSharing();

        @NotNull
        public static final Parcelable.Creator<EnableDataSharing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnableDataSharing.f72769a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnableDataSharing[i];
            }
        }

        private EnableDataSharing() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData$LearnDataSharing;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreenContract$InputData;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LearnDataSharing implements JointDataSharingScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LearnDataSharing f72770a = new LearnDataSharing();

        @NotNull
        public static final Parcelable.Creator<LearnDataSharing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LearnDataSharing.f72770a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnDataSharing[i];
            }
        }

        private LearnDataSharing() {
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
