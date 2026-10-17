package com.revolut.feature.security_hub.impl.ui.transactions_limits_change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LimitExceeded", "LimitDecrease", "PixAutomatedLimitConfirmation", "FrequencyChange", "SepaLimitSetToZero", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$FrequencyChange;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$LimitDecrease;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$LimitExceeded;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$PixAutomatedLimitConfirmation;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$SepaLimitSetToZero;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionsLimitsChangeScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$FrequencyChange;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FrequencyChange implements TransactionsLimitsChangeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FrequencyChange f85760a = new FrequencyChange();

        @NotNull
        public static final Parcelable.Creator<FrequencyChange> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FrequencyChange.f85760a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FrequencyChange[i];
            }
        }

        private FrequencyChange() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$LimitDecrease;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LimitDecrease implements TransactionsLimitsChangeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LimitDecrease f85761a = new LimitDecrease();

        @NotNull
        public static final Parcelable.Creator<LimitDecrease> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LimitDecrease.f85761a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitDecrease[i];
            }
        }

        private LimitDecrease() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$LimitExceeded;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LimitExceeded implements TransactionsLimitsChangeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LimitExceeded f85762a = new LimitExceeded();

        @NotNull
        public static final Parcelable.Creator<LimitExceeded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LimitExceeded.f85762a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitExceeded[i];
            }
        }

        private LimitExceeded() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$PixAutomatedLimitConfirmation;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PixAutomatedLimitConfirmation implements TransactionsLimitsChangeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PixAutomatedLimitConfirmation f85763a = new PixAutomatedLimitConfirmation();

        @NotNull
        public static final Parcelable.Creator<PixAutomatedLimitConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PixAutomatedLimitConfirmation.f85763a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixAutomatedLimitConfirmation[i];
            }
        }

        private PixAutomatedLimitConfirmation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep$SepaLimitSetToZero;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SepaLimitSetToZero implements TransactionsLimitsChangeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SepaLimitSetToZero f85764a = new SepaLimitSetToZero();

        @NotNull
        public static final Parcelable.Creator<SepaLimitSetToZero> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SepaLimitSetToZero.f85764a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SepaLimitSetToZero[i];
            }
        }

        private SepaLimitSetToZero() {
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
