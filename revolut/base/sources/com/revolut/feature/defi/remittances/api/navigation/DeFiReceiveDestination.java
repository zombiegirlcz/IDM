package com.revolut.feature.defi.remittances.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.StackDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/api/navigation/DeFiReceiveDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiReceiveDestination implements StackDestination {

    @NotNull
    public static final Parcelable.Creator<DeFiReceiveDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71793b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiReceiveDestination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiReceiveDestination[i];
        }
    }

    public DeFiReceiveDestination(String accountId, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f71792a = accountId;
        this.f71793b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiReceiveDestination)) {
            return false;
        }
        DeFiReceiveDestination deFiReceiveDestination = (DeFiReceiveDestination) obj2;
        return Intrinsics.f(this.f71792a, deFiReceiveDestination.f71792a) && Intrinsics.f(this.f71793b, deFiReceiveDestination.f71793b);
    }

    public final int hashCode() {
        int iHashCode = this.f71792a.hashCode() * 31;
        String str = this.f71793b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71792a);
        dest.writeString(this.f71793b);
    }
}
