package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Day", "Night", "Daily", "Other", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem$Daily;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem$Day;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem$Night;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem$Other;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionsDayNightLimitsFlowContract$PagerItem extends FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem$Daily;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Daily implements TransactionsDayNightLimitsFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Daily f85713a = new Daily();

        @NotNull
        public static final Parcelable.Creator<Daily> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Daily.f85713a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Daily[i];
            }
        }

        private Daily() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem$Day;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Day implements TransactionsDayNightLimitsFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Day f85714a = new Day();

        @NotNull
        public static final Parcelable.Creator<Day> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Day.f85714a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Day[i];
            }
        }

        private Day() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem$Night;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Night implements TransactionsDayNightLimitsFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Night f85715a = new Night();

        @NotNull
        public static final Parcelable.Creator<Night> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Night.f85715a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Night[i];
            }
        }

        private Night() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem$Other;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Other implements TransactionsDayNightLimitsFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Other f85716a = new Other();

        @NotNull
        public static final Parcelable.Creator<Other> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Other.f85716a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Other[i];
            }
        }

        private Other() {
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
