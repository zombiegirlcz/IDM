package com.revolut.kompot.common.flow.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/kompot/common/flow/permissions/PermissionsFlowContract$ExplanationStep", "Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$PermissionFlowStep;", "Lcom/revolut/kompot/common/flow/permissions/PermissionsFlowContract$InfoStep;", "<init>", "()V", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PermissionsFlowContract$ExplanationStep implements PermissionsFlowContract$PermissionFlowStep, PermissionsFlowContract$InfoStep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PermissionsFlowContract$ExplanationStep f98343a = new PermissionsFlowContract$ExplanationStep();

    @NotNull
    public static final Parcelable.Creator<PermissionsFlowContract$ExplanationStep> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PermissionsFlowContract$ExplanationStep.f98343a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PermissionsFlowContract$ExplanationStep[i];
        }
    }

    private PermissionsFlowContract$ExplanationStep() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
