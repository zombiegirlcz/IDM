package com.revolut.feature.recurring_buys.schedule.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import hua.c;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/recurring_buys/schedule/impl/ui/RecurringSettingsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CalendarPicker", "FrequencyPicker", "Lcom/revolut/feature/recurring_buys/schedule/impl/ui/RecurringSettingsContract$ModalStep$CalendarPicker;", "Lcom/revolut/feature/recurring_buys/schedule/impl/ui/RecurringSettingsContract$ModalStep$FrequencyPicker;", "feature_recurring_buys_schedule_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecurringSettingsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurring_buys/schedule/impl/ui/RecurringSettingsContract$ModalStep$CalendarPicker;", "Lcom/revolut/feature/recurring_buys/schedule/impl/ui/RecurringSettingsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_recurring_buys_schedule_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CalendarPicker implements RecurringSettingsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CalendarPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f81646a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CalendarPicker((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CalendarPicker[i];
            }
        }

        public CalendarPicker(LocalDate selectedDate) {
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            this.f81646a = selectedDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CalendarPicker) && Intrinsics.f(this.f81646a, ((CalendarPicker) obj2).f81646a);
        }

        public final int hashCode() {
            return this.f81646a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81646a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurring_buys/schedule/impl/ui/RecurringSettingsContract$ModalStep$FrequencyPicker;", "Lcom/revolut/feature/recurring_buys/schedule/impl/ui/RecurringSettingsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_recurring_buys_schedule_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FrequencyPicker implements RecurringSettingsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FrequencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f81647a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FrequencyPicker(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FrequencyPicker[i];
            }
        }

        public FrequencyPicker(c selectedFrequency) {
            Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
            this.f81647a = selectedFrequency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FrequencyPicker) && this.f81647a == ((FrequencyPicker) obj2).f81647a;
        }

        public final int hashCode() {
            return this.f81647a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81647a.name());
        }
    }
}
