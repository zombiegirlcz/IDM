package com.revolut.feature.wealth.impl.ui.flows.create_add_money_request;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/flows/create_add_money_request/CollectDepositInfoFlowContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectDepositInfoFlowContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CollectDepositInfoFlowContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferSubjectId f95551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthAccountType f95552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f95553c;
    public final RecurringDepositSchedule d;
    public final j0h.a e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f95554g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectDepositInfoFlowContract$Input((TransferSubjectId) parcel.readParcelable(CollectDepositInfoFlowContract$Input.class.getClassLoader()), (WealthAccountType) parcel.readParcelable(CollectDepositInfoFlowContract$Input.class.getClassLoader()), parcel.readLong(), (RecurringDepositSchedule) parcel.readParcelable(CollectDepositInfoFlowContract$Input.class.getClassLoader()), j0h.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectDepositInfoFlowContract$Input[i];
        }
    }

    public CollectDepositInfoFlowContract$Input(TransferSubjectId transferSubjectId, WealthAccountType investAccountType, long j2, RecurringDepositSchedule recurringDepositSchedule, j0h.a mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(investAccountType, "investAccountType");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f95551a = transferSubjectId;
        this.f95552b = investAccountType;
        this.f95553c = j2;
        this.d = recurringDepositSchedule;
        this.e = mode;
        this.f = str;
        this.f95554g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollectDepositInfoFlowContract$Input)) {
            return false;
        }
        CollectDepositInfoFlowContract$Input collectDepositInfoFlowContract$Input = (CollectDepositInfoFlowContract$Input) obj2;
        return Intrinsics.f(this.f95551a, collectDepositInfoFlowContract$Input.f95551a) && this.f95552b == collectDepositInfoFlowContract$Input.f95552b && this.f95553c == collectDepositInfoFlowContract$Input.f95553c && Intrinsics.f(this.d, collectDepositInfoFlowContract$Input.d) && this.e == collectDepositInfoFlowContract$Input.e && Intrinsics.f(this.f, collectDepositInfoFlowContract$Input.f) && Intrinsics.f(this.f95554g, collectDepositInfoFlowContract$Input.f95554g);
    }

    public final int hashCode() {
        int iC = d.c(b.e(this.f95552b, this.f95551a.hashCode() * 31, 31), 31, this.f95553c);
        RecurringDepositSchedule recurringDepositSchedule = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (recurringDepositSchedule == null ? 0 : recurringDepositSchedule.hashCode())) * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95554g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95551a, i);
        dest.writeParcelable(this.f95552b, i);
        dest.writeLong(this.f95553c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        dest.writeString(this.f95554g);
    }

    public /* synthetic */ CollectDepositInfoFlowContract$Input(TransferSubjectId transferSubjectId, WealthAccountType wealthAccountType, long j2, RecurringDepositSchedule recurringDepositSchedule, j0h.a aVar, String str, String str2, int i) {
        this(transferSubjectId, wealthAccountType, j2, (i & 8) != 0 ? null : recurringDepositSchedule, (i & 16) != 0 ? j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT : aVar, str, (i & 64) != 0 ? null : str2);
    }
}
