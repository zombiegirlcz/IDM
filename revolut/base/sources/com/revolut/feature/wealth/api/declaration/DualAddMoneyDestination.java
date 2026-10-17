package com.revolut.feature.wealth.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/DualAddMoneyDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DualAddMoneyDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<DualAddMoneyDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferSubjectId f95198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthAccountType f95199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95200c;
    public final d d;
    public final RecurringDepositSchedule e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f95201g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DualAddMoneyDestination((TransferSubjectId) parcel.readParcelable(DualAddMoneyDestination.class.getClassLoader()), (WealthAccountType) parcel.readParcelable(DualAddMoneyDestination.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : RecurringDepositSchedule.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DualAddMoneyDestination[i];
        }
    }

    public DualAddMoneyDestination(TransferSubjectId transferSubjectId, WealthAccountType product, d dVar, d dVar2, RecurringDepositSchedule recurringDepositSchedule, String str, boolean z) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f95198a = transferSubjectId;
        this.f95199b = product;
        this.f95200c = dVar;
        this.d = dVar2;
        this.e = recurringDepositSchedule;
        this.f = str;
        this.f95201g = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RecurringDepositSchedule getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF95200c() {
        return this.f95200c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF95201g() {
        return this.f95201g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DualAddMoneyDestination)) {
            return false;
        }
        DualAddMoneyDestination dualAddMoneyDestination = (DualAddMoneyDestination) obj2;
        return Intrinsics.f(this.f95198a, dualAddMoneyDestination.f95198a) && this.f95199b == dualAddMoneyDestination.f95199b && Intrinsics.f(this.f95200c, dualAddMoneyDestination.f95200c) && Intrinsics.f(this.d, dualAddMoneyDestination.d) && Intrinsics.f(this.e, dualAddMoneyDestination.e) && Intrinsics.f(this.f, dualAddMoneyDestination.f) && this.f95201g == dualAddMoneyDestination.f95201g;
    }

    public final int hashCode() {
        int iE = b.e(this.f95199b, this.f95198a.hashCode() * 31, 31);
        d dVar = this.f95200c;
        int iHashCode = (iE + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.d;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        RecurringDepositSchedule recurringDepositSchedule = this.e;
        int iHashCode3 = (iHashCode2 + (recurringDepositSchedule == null ? 0 : recurringDepositSchedule.hashCode())) * 31;
        String str = this.f;
        return Boolean.hashCode(this.f95201g) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i2, reason: from getter */
    public final TransferSubjectId getF95198a() {
        return this.f95198a;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final WealthAccountType getF95199b() {
        return this.f95199b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95198a, i);
        dest.writeParcelable(this.f95199b, i);
        dest.writeSerializable(this.f95200c);
        dest.writeSerializable(this.d);
        RecurringDepositSchedule recurringDepositSchedule = this.e;
        if (recurringDepositSchedule == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            recurringDepositSchedule.writeToParcel(dest, i);
        }
        dest.writeString(this.f);
        dest.writeInt(this.f95201g ? 1 : 0);
    }
}
