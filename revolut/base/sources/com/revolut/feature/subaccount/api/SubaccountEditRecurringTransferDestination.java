package com.revolut.feature.subaccount.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/SubaccountEditRecurringTransferDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubaccountEditRecurringTransferDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SubaccountEditRecurringTransferDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferScheduleData f88952c;
    public final Long d;
    public final boolean e;
    public final NaviCommand f;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubaccountEditRecurringTransferDestination(parcel.readString(), parcel.readString(), (TransferScheduleData) parcel.readParcelable(SubaccountEditRecurringTransferDestination.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, (NaviCommand) parcel.readParcelable(SubaccountEditRecurringTransferDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubaccountEditRecurringTransferDestination[i];
        }
    }

    public SubaccountEditRecurringTransferDestination(String subaccountId, String currencyCode, TransferScheduleData transferScheduleData, Long l2, boolean z, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f88950a = subaccountId;
        this.f88951b = currencyCode;
        this.f88952c = transferScheduleData;
        this.d = l2;
        this.e = z;
        this.f = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubaccountEditRecurringTransferDestination)) {
            return false;
        }
        SubaccountEditRecurringTransferDestination subaccountEditRecurringTransferDestination = (SubaccountEditRecurringTransferDestination) obj2;
        return Intrinsics.f(this.f88950a, subaccountEditRecurringTransferDestination.f88950a) && Intrinsics.f(this.f88951b, subaccountEditRecurringTransferDestination.f88951b) && Intrinsics.f(this.f88952c, subaccountEditRecurringTransferDestination.f88952c) && Intrinsics.f(this.d, subaccountEditRecurringTransferDestination.d) && this.e == subaccountEditRecurringTransferDestination.e && Intrinsics.f(this.f, subaccountEditRecurringTransferDestination.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f88950a.hashCode() * 31, 31, this.f88951b);
        TransferScheduleData transferScheduleData = this.f88952c;
        int iHashCode = (iC + (transferScheduleData == null ? 0 : transferScheduleData.hashCode())) * 31;
        Long l2 = this.d;
        int iC2 = j6.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e);
        NaviCommand naviCommand = this.f;
        return iC2 + (naviCommand != null ? naviCommand.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88950a);
        dest.writeString(this.f88951b);
        dest.writeParcelable(this.f88952c, i);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }
}
