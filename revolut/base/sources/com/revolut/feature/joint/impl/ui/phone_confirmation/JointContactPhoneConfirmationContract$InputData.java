package com.revolut.feature.joint.impl.ui.phone_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import d58.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/joint/impl/ui/phone_confirmation/JointContactPhoneConfirmationContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JointContactPhoneConfirmationContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JointContactPhoneConfirmationContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f76592a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointContactPhoneConfirmationContract$InputData((f) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointContactPhoneConfirmationContract$InputData[i];
        }
    }

    public JointContactPhoneConfirmationContract$InputData(f invitationType) {
        Intrinsics.checkNotNullParameter(invitationType, "invitationType");
        this.f76592a = invitationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof JointContactPhoneConfirmationContract$InputData) && Intrinsics.f(this.f76592a, ((JointContactPhoneConfirmationContract$InputData) obj2).f76592a);
    }

    public final int hashCode() {
        return this.f76592a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f76592a);
    }
}
