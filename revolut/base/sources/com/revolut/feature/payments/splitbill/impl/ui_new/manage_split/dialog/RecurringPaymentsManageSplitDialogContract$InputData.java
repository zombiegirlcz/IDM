package com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/manage_split/dialog/RecurringPaymentsManageSplitDialogContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "RemoveParticipant", "CancelSplit", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/dialog/RecurringPaymentsManageSplitDialogContract$InputData$CancelSplit;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/dialog/RecurringPaymentsManageSplitDialogContract$InputData$RemoveParticipant;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecurringPaymentsManageSplitDialogContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/dialog/RecurringPaymentsManageSplitDialogContract$InputData$CancelSplit;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/dialog/RecurringPaymentsManageSplitDialogContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelSplit implements RecurringPaymentsManageSplitDialogContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CancelSplit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecurringSplit f79891a;

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
            this.f79891a = split;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelSplit) && Intrinsics.f(this.f79891a, ((CancelSplit) obj2).f79891a);
        }

        public final int hashCode() {
            return this.f79891a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79891a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/dialog/RecurringPaymentsManageSplitDialogContract$InputData$RemoveParticipant;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/dialog/RecurringPaymentsManageSplitDialogContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveParticipant implements RecurringPaymentsManageSplitDialogContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RemoveParticipant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79894c;

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
            this.f79892a = splitId;
            this.f79893b = participantId;
            this.f79894c = contactName;
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
            return Intrinsics.f(this.f79892a, removeParticipant.f79892a) && Intrinsics.f(this.f79893b, removeParticipant.f79893b) && Intrinsics.f(this.f79894c, removeParticipant.f79894c);
        }

        public final int hashCode() {
            return this.f79894c.hashCode() + p.a.c(this.f79892a.hashCode() * 31, 31, this.f79893b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79892a);
            dest.writeString(this.f79893b);
            dest.writeString(this.f79894c);
        }
    }
}
