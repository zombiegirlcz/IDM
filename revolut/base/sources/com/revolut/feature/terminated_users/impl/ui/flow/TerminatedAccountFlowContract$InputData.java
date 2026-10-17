package com.revolut.feature.terminated_users.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import do3.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/terminated_users/impl/ui/flow/TerminatedAccountFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_terminated_users_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TerminatedAccountFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TerminatedAccountFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f90342a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TerminatedAccountFlowContract$InputData(parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TerminatedAccountFlowContract$InputData[i];
        }
    }

    public TerminatedAccountFlowContract$InputData(v vVar) {
        this.f90342a = vVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TerminatedAccountFlowContract$InputData) && this.f90342a == ((TerminatedAccountFlowContract$InputData) obj2).f90342a;
    }

    public final int hashCode() {
        v vVar = this.f90342a;
        if (vVar == null) {
            return 0;
        }
        return vVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        v vVar = this.f90342a;
        if (vVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(vVar.name());
        }
    }
}
