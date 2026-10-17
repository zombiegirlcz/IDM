package com.revolut.feature.joint.impl.ui.close_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.joint.api.data.JointAccountCloseReason;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/joint/impl/ui/close_flow/JointCloseFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JointCloseFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JointCloseFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId.Joint f76512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JointAccountCloseReason f76513b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointCloseFlowContract$InputData((AccountId.Joint) parcel.readParcelable(JointCloseFlowContract$InputData.class.getClassLoader()), (JointAccountCloseReason) parcel.readParcelable(JointCloseFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointCloseFlowContract$InputData[i];
        }
    }

    public JointCloseFlowContract$InputData(AccountId.Joint accountId, JointAccountCloseReason closeReason) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        this.f76512a = accountId;
        this.f76513b = closeReason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JointCloseFlowContract$InputData)) {
            return false;
        }
        JointCloseFlowContract$InputData jointCloseFlowContract$InputData = (JointCloseFlowContract$InputData) obj2;
        return Intrinsics.f(this.f76512a, jointCloseFlowContract$InputData.f76512a) && Intrinsics.f(this.f76513b, jointCloseFlowContract$InputData.f76513b);
    }

    public final int hashCode() {
        return this.f76513b.hashCode() + (this.f76512a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76512a, i);
        dest.writeParcelable(this.f76513b, i);
    }
}
