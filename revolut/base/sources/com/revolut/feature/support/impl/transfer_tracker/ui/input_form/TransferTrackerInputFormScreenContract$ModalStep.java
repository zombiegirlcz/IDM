package com.revolut.feature.support.impl.transfer_tracker.ui.input_form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CurrencyPicker", "CountryPicker", "DatePicker", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep$CountryPicker;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep$DatePicker;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferTrackerInputFormScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep$CountryPicker;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryPicker extends TransferTrackerInputFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryPicker f89413a = new CountryPicker();

        @NotNull
        public static final Parcelable.Creator<CountryPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryPicker.f89413a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPicker[i];
            }
        }

        private CountryPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrencyPicker extends TransferTrackerInputFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CurrencyPicker f89414a = new CurrencyPicker();

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CurrencyPicker.f89414a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        private CurrencyPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep$DatePicker;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreenContract$ModalStep;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DatePicker extends TransferTrackerInputFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DatePicker f89415a = new DatePicker();

        @NotNull
        public static final Parcelable.Creator<DatePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DatePicker.f89415a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatePicker[i];
            }
        }

        private DatePicker() {
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

    private TransferTrackerInputFormScreenContract$ModalStep() {
    }
}
