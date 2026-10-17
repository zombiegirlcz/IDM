package com.revolut.feature.payments.splitbill.impl.ui_new.manage_split;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RemoveParticipant", "CancelSplit", "UpdateSplit", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep$CancelSplit;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep$RemoveParticipant;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep$UpdateSplit;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecurringPaymentsManageSplitContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep$CancelSplit;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelSplit extends RecurringPaymentsManageSplitContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelSplit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecurringSplit f79880a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelSplit((RecurringSplit) parcel.readParcelable(CancelSplit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelSplit[i];
            }
        }

        public CancelSplit(RecurringSplit split) {
            Intrinsics.checkNotNullParameter(split, "split");
            this.f79880a = split;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelSplit) && Intrinsics.f(this.f79880a, ((CancelSplit) obj2).f79880a);
        }

        public final int hashCode() {
            return this.f79880a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79880a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep$RemoveParticipant;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveParticipant extends RecurringPaymentsManageSplitContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RemoveParticipant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79883c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveParticipant(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveParticipant[i];
            }
        }

        public RemoveParticipant(String splitId, String participantId, String contactName) {
            Intrinsics.checkNotNullParameter(splitId, "splitId");
            Intrinsics.checkNotNullParameter(participantId, "participantId");
            Intrinsics.checkNotNullParameter(contactName, "contactName");
            this.f79881a = splitId;
            this.f79882b = participantId;
            this.f79883c = contactName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RemoveParticipant)) {
                return false;
            }
            RemoveParticipant removeParticipant = (RemoveParticipant) obj2;
            return Intrinsics.f(this.f79881a, removeParticipant.f79881a) && Intrinsics.f(this.f79882b, removeParticipant.f79882b) && Intrinsics.f(this.f79883c, removeParticipant.f79883c);
        }

        public final int hashCode() {
            return this.f79883c.hashCode() + p.a.c(this.f79881a.hashCode() * 31, 31, this.f79882b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79881a);
            dest.writeString(this.f79882b);
            dest.writeString(this.f79883c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep$UpdateSplit;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateSplit extends RecurringPaymentsManageSplitContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateSplit f79884a = new UpdateSplit();

        @NotNull
        public static final Parcelable.Creator<UpdateSplit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateSplit.f79884a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateSplit[i];
            }
        }

        private UpdateSplit() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof UpdateSplit);
        }

        public final int hashCode() {
            return -1625114188;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private RecurringPaymentsManageSplitContract$ModalStep() {
    }
}
