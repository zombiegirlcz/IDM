package com.revolut.feature.defi.remittances.impl.ui.receive.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/remittances/impl/ui/receive/flow/DeFiReceiveFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiReceiveFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeFiReceiveFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71809b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiReceiveFlowContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiReceiveFlowContract$InputData[i];
        }
    }

    public DeFiReceiveFlowContract$InputData(String accountId, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f71808a = accountId;
        this.f71809b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiReceiveFlowContract$InputData)) {
            return false;
        }
        DeFiReceiveFlowContract$InputData deFiReceiveFlowContract$InputData = (DeFiReceiveFlowContract$InputData) obj2;
        return Intrinsics.f(this.f71808a, deFiReceiveFlowContract$InputData.f71808a) && Intrinsics.f(this.f71809b, deFiReceiveFlowContract$InputData.f71809b);
    }

    public final int hashCode() {
        int iHashCode = this.f71808a.hashCode() * 31;
        String str = this.f71809b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71808a);
        dest.writeString(this.f71809b);
    }
}
