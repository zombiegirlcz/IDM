package com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "IssueDatePicker", "DueDatePicker", "SupplyDatePicker", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step$DueDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step$IssueDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step$SupplyDatePicker;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceScheduleSettingsScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step$DueDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DueDatePicker implements InvoiceScheduleSettingsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DueDatePicker f73938a = new DueDatePicker();

        @NotNull
        public static final Parcelable.Creator<DueDatePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DueDatePicker.f73938a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DueDatePicker[i];
            }
        }

        private DueDatePicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step$IssueDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IssueDatePicker implements InvoiceScheduleSettingsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IssueDatePicker f73939a = new IssueDatePicker();

        @NotNull
        public static final Parcelable.Creator<IssueDatePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IssueDatePicker.f73939a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IssueDatePicker[i];
            }
        }

        private IssueDatePicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step$SupplyDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/schedule/InvoiceScheduleSettingsScreenContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SupplyDatePicker implements InvoiceScheduleSettingsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SupplyDatePicker f73940a = new SupplyDatePicker();

        @NotNull
        public static final Parcelable.Creator<SupplyDatePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SupplyDatePicker.f73940a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SupplyDatePicker[i];
            }
        }

        private SupplyDatePicker() {
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
