package com.revolut.feature.bank_account_switching.impl.ui.target_account_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wn2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/target_account_selection/BankAccountSwitchingTargetSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankAccountSwitchingTargetSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankAccountSwitchingTargetSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointAccountData f64072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2.a f64073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f64074c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccountSwitchingTargetSelectionScreenContract$InputData(JointAccountData.CREATOR.createFromParcel(parcel), mn2.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankAccountSwitchingTargetSelectionScreenContract$InputData[i];
        }
    }

    public BankAccountSwitchingTargetSelectionScreenContract$InputData(JointAccountData jointAccountData, mn2.a serviceType, d dVar) {
        Intrinsics.checkNotNullParameter(jointAccountData, "jointAccountData");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f64072a = jointAccountData;
        this.f64073b = serviceType;
        this.f64074c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankAccountSwitchingTargetSelectionScreenContract$InputData)) {
            return false;
        }
        BankAccountSwitchingTargetSelectionScreenContract$InputData bankAccountSwitchingTargetSelectionScreenContract$InputData = (BankAccountSwitchingTargetSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64072a, bankAccountSwitchingTargetSelectionScreenContract$InputData.f64072a) && this.f64073b == bankAccountSwitchingTargetSelectionScreenContract$InputData.f64073b && this.f64074c == bankAccountSwitchingTargetSelectionScreenContract$InputData.f64074c;
    }

    public final int hashCode() {
        int iHashCode = (this.f64073b.hashCode() + (this.f64072a.hashCode() * 31)) * 31;
        d dVar = this.f64074c;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f64072a.writeToParcel(dest, i);
        dest.writeString(this.f64073b.name());
        d dVar = this.f64074c;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
    }
}
