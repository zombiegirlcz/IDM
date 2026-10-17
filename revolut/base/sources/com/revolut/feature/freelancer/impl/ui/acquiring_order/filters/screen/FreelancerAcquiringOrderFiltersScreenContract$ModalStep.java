package com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/acquiring_order/filters/screen/FreelancerAcquiringOrderFiltersScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "StartDateRangePicker", "EndDateRangePicker", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/filters/screen/FreelancerAcquiringOrderFiltersScreenContract$ModalStep$EndDateRangePicker;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/filters/screen/FreelancerAcquiringOrderFiltersScreenContract$ModalStep$StartDateRangePicker;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAcquiringOrderFiltersScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/filters/screen/FreelancerAcquiringOrderFiltersScreenContract$ModalStep$EndDateRangePicker;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/filters/screen/FreelancerAcquiringOrderFiltersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EndDateRangePicker implements FreelancerAcquiringOrderFiltersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EndDateRangePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f73682a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EndDateRangePicker((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EndDateRangePicker[i];
            }
        }

        public EndDateRangePicker(LocalDate startDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            this.f73682a = startDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EndDateRangePicker) && Intrinsics.f(this.f73682a, ((EndDateRangePicker) obj2).f73682a);
        }

        public final int hashCode() {
            return this.f73682a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73682a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/filters/screen/FreelancerAcquiringOrderFiltersScreenContract$ModalStep$StartDateRangePicker;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/filters/screen/FreelancerAcquiringOrderFiltersScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StartDateRangePicker implements FreelancerAcquiringOrderFiltersScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StartDateRangePicker f73683a = new StartDateRangePicker();

        @NotNull
        public static final Parcelable.Creator<StartDateRangePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StartDateRangePicker.f73683a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartDateRangePicker[i];
            }
        }

        private StartDateRangePicker() {
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
