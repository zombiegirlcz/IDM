package com.revolut.feature.joint.impl.ui.close_flow.close_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.joint.api.data.JointAccountCloseReason;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/joint/impl/ui/close_flow/close_prompt/JointClosePromptScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JointClosePromptScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JointClosePromptScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointAccountCloseReason f76522a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointClosePromptScreenContract$InputData((JointAccountCloseReason) parcel.readParcelable(JointClosePromptScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointClosePromptScreenContract$InputData[i];
        }
    }

    public JointClosePromptScreenContract$InputData(JointAccountCloseReason jointAccountCloseReason) {
        Intrinsics.checkNotNullParameter(jointAccountCloseReason, "jointAccountCloseReason");
        this.f76522a = jointAccountCloseReason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof JointClosePromptScreenContract$InputData) && Intrinsics.f(this.f76522a, ((JointClosePromptScreenContract$InputData) obj2).f76522a);
    }

    public final int hashCode() {
        return this.f76522a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76522a, i);
    }
}
