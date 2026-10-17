package com.revolut.feature.wealth.account_closure.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "Landroid/os/Parcelable;", "OK", "HasOpenPositions", "HasNonTradeableStocks", "HasPendingStockTransfers", "HasTransferOutRequest", "HasWarrants", "HasRoboOrFlexibleAccountOnboarded", "HasOtherAccountOnboarded", "HasJointGiaOnboarded", "HasMarginLoan", "Unknown", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasJointGiaOnboarded;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasMarginLoan;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasNonTradeableStocks;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasOpenPositions;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasOtherAccountOnboarded;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasPendingStockTransfers;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasRoboOrFlexibleAccountOnboarded;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasTransferOutRequest;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasWarrants;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$OK;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$Unknown;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountClosurePreconditionsStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasJointGiaOnboarded;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HasJointGiaOnboarded implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HasJointGiaOnboarded f94874a = new HasJointGiaOnboarded();

        @NotNull
        public static final Parcelable.Creator<HasJointGiaOnboarded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HasJointGiaOnboarded.f94874a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasJointGiaOnboarded[i];
            }
        }

        private HasJointGiaOnboarded() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasMarginLoan;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HasMarginLoan implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HasMarginLoan f94875a = new HasMarginLoan();

        @NotNull
        public static final Parcelable.Creator<HasMarginLoan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HasMarginLoan.f94875a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasMarginLoan[i];
            }
        }

        private HasMarginLoan() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasNonTradeableStocks;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HasNonTradeableStocks implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HasNonTradeableStocks f94876a = new HasNonTradeableStocks();

        @NotNull
        public static final Parcelable.Creator<HasNonTradeableStocks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HasNonTradeableStocks.f94876a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasNonTradeableStocks[i];
            }
        }

        private HasNonTradeableStocks() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasOpenPositions;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HasOpenPositions implements AccountClosurePreconditionsStatus {

        @NotNull
        public static final Parcelable.Creator<HasOpenPositions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountClosureFeedbackOptions f94877a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HasOpenPositions(AccountClosureFeedbackOptions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasOpenPositions[i];
            }
        }

        public HasOpenPositions(AccountClosureFeedbackOptions feedbackOptions) {
            Intrinsics.checkNotNullParameter(feedbackOptions, "feedbackOptions");
            this.f94877a = feedbackOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HasOpenPositions) && Intrinsics.f(this.f94877a, ((HasOpenPositions) obj2).f94877a);
        }

        public final int hashCode() {
            return this.f94877a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f94877a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasOtherAccountOnboarded;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HasOtherAccountOnboarded implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HasOtherAccountOnboarded f94878a = new HasOtherAccountOnboarded();

        @NotNull
        public static final Parcelable.Creator<HasOtherAccountOnboarded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HasOtherAccountOnboarded.f94878a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasOtherAccountOnboarded[i];
            }
        }

        private HasOtherAccountOnboarded() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasPendingStockTransfers;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HasPendingStockTransfers implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HasPendingStockTransfers f94879a = new HasPendingStockTransfers();

        @NotNull
        public static final Parcelable.Creator<HasPendingStockTransfers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HasPendingStockTransfers.f94879a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasPendingStockTransfers[i];
            }
        }

        private HasPendingStockTransfers() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasRoboOrFlexibleAccountOnboarded;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HasRoboOrFlexibleAccountOnboarded implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HasRoboOrFlexibleAccountOnboarded f94880a = new HasRoboOrFlexibleAccountOnboarded();

        @NotNull
        public static final Parcelable.Creator<HasRoboOrFlexibleAccountOnboarded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HasRoboOrFlexibleAccountOnboarded.f94880a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasRoboOrFlexibleAccountOnboarded[i];
            }
        }

        private HasRoboOrFlexibleAccountOnboarded() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasTransferOutRequest;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HasTransferOutRequest implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HasTransferOutRequest f94881a = new HasTransferOutRequest();

        @NotNull
        public static final Parcelable.Creator<HasTransferOutRequest> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HasTransferOutRequest.f94881a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasTransferOutRequest[i];
            }
        }

        private HasTransferOutRequest() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$HasWarrants;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HasWarrants implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HasWarrants f94882a = new HasWarrants();

        @NotNull
        public static final Parcelable.Creator<HasWarrants> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HasWarrants.f94882a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasWarrants[i];
            }
        }

        private HasWarrants() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$OK;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OK implements AccountClosurePreconditionsStatus {

        @NotNull
        public static final Parcelable.Creator<OK> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountClosureFeedbackOptions f94883a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OK(AccountClosureFeedbackOptions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OK[i];
            }
        }

        public OK(AccountClosureFeedbackOptions feedbackOptions) {
            Intrinsics.checkNotNullParameter(feedbackOptions, "feedbackOptions");
            this.f94883a = feedbackOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OK) && Intrinsics.f(this.f94883a, ((OK) obj2).f94883a);
        }

        public final int hashCode() {
            return this.f94883a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f94883a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus$Unknown;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosurePreconditionsStatus;", "<init>", "()V", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown implements AccountClosurePreconditionsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f94884a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f94884a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
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
