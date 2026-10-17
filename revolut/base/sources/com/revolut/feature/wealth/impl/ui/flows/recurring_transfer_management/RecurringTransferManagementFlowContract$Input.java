package com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/flows/recurring_transfer_management/RecurringTransferManagementFlowContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringTransferManagementFlowContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RecurringTransferManagementFlowContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sah.a f95563b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringTransferManagementFlowContract$Input(parcel.readString(), sah.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringTransferManagementFlowContract$Input[i];
        }
    }

    public RecurringTransferManagementFlowContract$Input(String portfolioId, sah.a portfolioType) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
        this.f95562a = portfolioId;
        this.f95563b = portfolioType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringTransferManagementFlowContract$Input)) {
            return false;
        }
        RecurringTransferManagementFlowContract$Input recurringTransferManagementFlowContract$Input = (RecurringTransferManagementFlowContract$Input) obj2;
        return Intrinsics.f(this.f95562a, recurringTransferManagementFlowContract$Input.f95562a) && this.f95563b == recurringTransferManagementFlowContract$Input.f95563b;
    }

    public final int hashCode() {
        return this.f95563b.hashCode() + (this.f95562a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95562a);
        dest.writeString(this.f95563b.name());
    }
}
