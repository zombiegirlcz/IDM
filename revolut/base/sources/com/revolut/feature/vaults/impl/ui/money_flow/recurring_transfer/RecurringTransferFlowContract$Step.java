package com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/vaults/impl/ui/money_flow/recurring_transfer/RecurringTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Schedule", "RecurringTransfer", "Lcom/revolut/feature/vaults/impl/ui/money_flow/recurring_transfer/RecurringTransferFlowContract$Step$RecurringTransfer;", "Lcom/revolut/feature/vaults/impl/ui/money_flow/recurring_transfer/RecurringTransferFlowContract$Step$Schedule;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecurringTransferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/money_flow/recurring_transfer/RecurringTransferFlowContract$Step$RecurringTransfer;", "Lcom/revolut/feature/vaults/impl/ui/money_flow/recurring_transfer/RecurringTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringTransfer extends RecurringTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RecurringTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferScheduleData f94783a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringTransfer((TransferScheduleData) parcel.readParcelable(RecurringTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringTransfer[i];
            }
        }

        public RecurringTransfer(TransferScheduleData scheduleData) {
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            this.f94783a = scheduleData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecurringTransfer) && Intrinsics.f(this.f94783a, ((RecurringTransfer) obj2).f94783a);
        }

        public final int hashCode() {
            return this.f94783a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94783a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/money_flow/recurring_transfer/RecurringTransferFlowContract$Step$Schedule;", "Lcom/revolut/feature/vaults/impl/ui/money_flow/recurring_transfer/RecurringTransferFlowContract$Step;", "<init>", "()V", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Schedule extends RecurringTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Schedule f94784a = new Schedule();

        @NotNull
        public static final Parcelable.Creator<Schedule> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Schedule.f94784a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Schedule[i];
            }
        }

        private Schedule() {
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

    private RecurringTransferFlowContract$Step() {
    }
}
