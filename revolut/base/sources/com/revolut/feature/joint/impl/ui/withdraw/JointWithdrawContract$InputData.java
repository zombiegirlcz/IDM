package com.revolut.feature.joint.impl.ui.withdraw;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/joint/impl/ui/withdraw/JointWithdrawContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JointWithdrawContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JointWithdrawContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f76604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f76605b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointWithdrawContract$InputData((xi0.b) parcel.readSerializable(), (AccountId) parcel.readParcelable(JointWithdrawContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointWithdrawContract$InputData[i];
        }
    }

    public JointWithdrawContract$InputData(xi0.b currency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f76604a = currency;
        this.f76605b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JointWithdrawContract$InputData)) {
            return false;
        }
        JointWithdrawContract$InputData jointWithdrawContract$InputData = (JointWithdrawContract$InputData) obj2;
        return Intrinsics.f(this.f76604a, jointWithdrawContract$InputData.f76604a) && Intrinsics.f(this.f76605b, jointWithdrawContract$InputData.f76605b);
    }

    public final int hashCode() {
        return this.f76605b.hashCode() + (this.f76604a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f76604a);
        dest.writeParcelable(this.f76605b, i);
    }
}
