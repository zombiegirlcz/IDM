package com.revolut.feature.revolutpay.impl.ui.native_move_money;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/impl/ui/native_move_money/RevolutPayMoveMoneyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutPayMoveMoneyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutPayMoveMoneyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f84502c;
    public final String d;
    public final long e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutPayMoveMoneyFlowContract$InputData(parcel.readString(), parcel.readString(), l.valueOf(parcel.readString()), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutPayMoveMoneyFlowContract$InputData[i];
        }
    }

    public RevolutPayMoveMoneyFlowContract$InputData(String str, String str2, l moveMoneyTarget, String str3, long j2) {
        Intrinsics.checkNotNullParameter(moveMoneyTarget, "moveMoneyTarget");
        this.f84500a = str;
        this.f84501b = str2;
        this.f84502c = moveMoneyTarget;
        this.d = str3;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutPayMoveMoneyFlowContract$InputData)) {
            return false;
        }
        RevolutPayMoveMoneyFlowContract$InputData revolutPayMoveMoneyFlowContract$InputData = (RevolutPayMoveMoneyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f84500a, revolutPayMoveMoneyFlowContract$InputData.f84500a) && Intrinsics.f(this.f84501b, revolutPayMoveMoneyFlowContract$InputData.f84501b) && this.f84502c == revolutPayMoveMoneyFlowContract$InputData.f84502c && Intrinsics.f(this.d, revolutPayMoveMoneyFlowContract$InputData.d) && this.e == revolutPayMoveMoneyFlowContract$InputData.e;
    }

    public final int hashCode() {
        String str = this.f84500a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84501b;
        int iHashCode2 = (this.f84502c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        return Long.hashCode(this.e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84500a);
        dest.writeString(this.f84501b);
        dest.writeString(this.f84502c.name());
        dest.writeString(this.d);
        dest.writeLong(this.e);
    }
}
