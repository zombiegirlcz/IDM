package com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/vaults/impl/ui/money_flow/recurring_transfer/RecurringTransferFlowContract$FlowInput", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringTransferFlowContract$FlowInput implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RecurringTransferFlowContract$FlowInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94782c;
    public final TransferScheduleData d;
    public final Long e;
    public final Integer f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            return new RecurringTransferFlowContract$FlowInput((TransferScheduleData) parcel.readParcelable(RecurringTransferFlowContract$FlowInput.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), string, string2, string3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringTransferFlowContract$FlowInput[i];
        }
    }

    public RecurringTransferFlowContract$FlowInput(TransferScheduleData transferScheduleData, Integer num, Long l2, String vaultId, String str, String currencyCode) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f94780a = vaultId;
        this.f94781b = str;
        this.f94782c = currencyCode;
        this.d = transferScheduleData;
        this.e = l2;
        this.f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringTransferFlowContract$FlowInput)) {
            return false;
        }
        RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = (RecurringTransferFlowContract$FlowInput) obj2;
        return Intrinsics.f(this.f94780a, recurringTransferFlowContract$FlowInput.f94780a) && Intrinsics.f(this.f94781b, recurringTransferFlowContract$FlowInput.f94781b) && Intrinsics.f(this.f94782c, recurringTransferFlowContract$FlowInput.f94782c) && Intrinsics.f(this.d, recurringTransferFlowContract$FlowInput.d) && Intrinsics.f(this.e, recurringTransferFlowContract$FlowInput.e) && Intrinsics.f(this.f, recurringTransferFlowContract$FlowInput.f);
    }

    public final int hashCode() {
        int iHashCode = this.f94780a.hashCode() * 31;
        String str = this.f94781b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f94782c);
        TransferScheduleData transferScheduleData = this.d;
        int iHashCode2 = (iC + (transferScheduleData == null ? 0 : transferScheduleData.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94780a);
        dest.writeString(this.f94781b);
        dest.writeString(this.f94782c);
        dest.writeParcelable(this.d, i);
        Long l2 = this.e;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Integer num = this.f;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
