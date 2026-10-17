package com.revolut.feature.revolutpay.impl.external.ui.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/impl/external/ui/flow/root/RevolutPayRootFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutPayRootFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<RevolutPayRootFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84469b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutPayRootFlowContract$State(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutPayRootFlowContract$State[i];
        }
    }

    public RevolutPayRootFlowContract$State(boolean z, String str) {
        this.f84468a = z;
        this.f84469b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutPayRootFlowContract$State)) {
            return false;
        }
        RevolutPayRootFlowContract$State revolutPayRootFlowContract$State = (RevolutPayRootFlowContract$State) obj2;
        return this.f84468a == revolutPayRootFlowContract$State.f84468a && Intrinsics.f(this.f84469b, revolutPayRootFlowContract$State.f84469b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f84468a) * 31;
        String str = this.f84469b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84468a ? 1 : 0);
        dest.writeString(this.f84469b);
    }
}
