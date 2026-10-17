package com.revolut.feature.profile.impl.ui.close_account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/profile/impl/ui/close_account/SelfTerminationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelfTerminationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelfTerminationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81354c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelfTerminationFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelfTerminationFlowContract$InputData[i];
        }
    }

    public SelfTerminationFlowContract$InputData(String closeAccountDeeplink, String str, boolean z) {
        Intrinsics.checkNotNullParameter(closeAccountDeeplink, "closeAccountDeeplink");
        this.f81352a = closeAccountDeeplink;
        this.f81353b = str;
        this.f81354c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelfTerminationFlowContract$InputData)) {
            return false;
        }
        SelfTerminationFlowContract$InputData selfTerminationFlowContract$InputData = (SelfTerminationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f81352a, selfTerminationFlowContract$InputData.f81352a) && Intrinsics.f(this.f81353b, selfTerminationFlowContract$InputData.f81353b) && this.f81354c == selfTerminationFlowContract$InputData.f81354c;
    }

    public final int hashCode() {
        int iHashCode = this.f81352a.hashCode() * 31;
        String str = this.f81353b;
        return Boolean.hashCode(this.f81354c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81352a);
        dest.writeString(this.f81353b);
        dest.writeInt(this.f81354c ? 1 : 0);
    }
}
