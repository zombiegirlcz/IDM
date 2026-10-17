package com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ly3.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "Intro", "Schedule", "Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step$Schedule;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConveyancingAppointmentSchedulingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial implements ConveyancingAppointmentSchedulingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f67314a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f67314a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements ConveyancingAppointmentSchedulingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f67315a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(e configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67315a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f67315a, ((Intro) obj2).f67315a);
        }

        public final int hashCode() {
            return this.f67315a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67315a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step$Schedule;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Schedule implements ConveyancingAppointmentSchedulingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Schedule> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f67316a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Schedule((e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Schedule[i];
            }
        }

        public Schedule(e configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67316a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Schedule) && Intrinsics.f(this.f67316a, ((Schedule) obj2).f67316a);
        }

        public final int hashCode() {
            return this.f67316a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67316a);
        }
    }
}
