package com.revolut.feature.transfer_request_approval.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class TransferRequestApprovalApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalApi$Toggles$PaymentsChargesMigrationMoneyRequest;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_transfer_request_approval_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentsChargesMigrationMoneyRequest extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PaymentsChargesMigrationMoneyRequest f92447c = new PaymentsChargesMigrationMoneyRequest();

        @NotNull
        public static final Parcelable.Creator<PaymentsChargesMigrationMoneyRequest> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentsChargesMigrationMoneyRequest.f92447c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentsChargesMigrationMoneyRequest[i];
            }
        }

        private PaymentsChargesMigrationMoneyRequest() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("paymentsChargesMigrationMoneyRequestAndroid");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalApi$Toggles$SettleUpBalance;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_transfer_request_approval_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SettleUpBalance extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SettleUpBalance f92448c = new SettleUpBalance();

        @NotNull
        public static final Parcelable.Creator<SettleUpBalance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SettleUpBalance.f92448c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettleUpBalance[i];
            }
        }

        private SettleUpBalance() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("settleUpBalance");
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

    private TransferRequestApprovalApi$Toggles() {
    }

    public static List a() {
        return v.k(SettleUpBalance.f92448c, PaymentsChargesMigrationMoneyRequest.f92447c);
    }
}
