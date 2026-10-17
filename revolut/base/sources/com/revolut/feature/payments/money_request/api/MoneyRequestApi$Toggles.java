package com.revolut.feature.payments.money_request.api;

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

/* JADX INFO: loaded from: classes5.dex */
public final class MoneyRequestApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/MoneyRequestApi$Toggles$IsraelMoneyRequestBeneficiary;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IsraelMoneyRequestBeneficiary extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final IsraelMoneyRequestBeneficiary f79587c = new IsraelMoneyRequestBeneficiary();

        @NotNull
        public static final Parcelable.Creator<IsraelMoneyRequestBeneficiary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IsraelMoneyRequestBeneficiary.f79587c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IsraelMoneyRequestBeneficiary[i];
            }
        }

        private IsraelMoneyRequestBeneficiary() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("ilBankTransferRequestToPay");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/MoneyRequestApi$Toggles$MoneyRequestActionsDialog;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoneyRequestActionsDialog extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoneyRequestActionsDialog f79588c = new MoneyRequestActionsDialog();

        @NotNull
        public static final Parcelable.Creator<MoneyRequestActionsDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoneyRequestActionsDialog.f79588c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyRequestActionsDialog[i];
            }
        }

        private MoneyRequestActionsDialog() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moneyRequestActionsDialog");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/MoneyRequestApi$Toggles$MoneyRequestDetailsRevamp;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoneyRequestDetailsRevamp extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoneyRequestDetailsRevamp f79589c = new MoneyRequestDetailsRevamp();

        @NotNull
        public static final Parcelable.Creator<MoneyRequestDetailsRevamp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoneyRequestDetailsRevamp.f79589c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyRequestDetailsRevamp[i];
            }
        }

        private MoneyRequestDetailsRevamp() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moneyRequestDetailsRevamp");
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

    private MoneyRequestApi$Toggles() {
    }

    public static List a() {
        return v.k(IsraelMoneyRequestBeneficiary.f79587c, MoneyRequestDetailsRevamp.f79589c, MoneyRequestActionsDialog.f79588c);
    }
}
