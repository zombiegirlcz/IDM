package com.revolut.feature.external_accounts.impl.ui.india.upi.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/india/upi/flow/UpiTransferFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpiTransferFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UpiTransferFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f72937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72938b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpiTransferFlowContract$State(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UpiTransferFlowContract$State[i];
        }
    }

    public UpiTransferFlowContract$State() {
        this(0);
    }

    public static UpiTransferFlowContract$State a(UpiTransferFlowContract$State upiTransferFlowContract$State, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = upiTransferFlowContract$State.f72937a;
        }
        if ((i & 2) != 0) {
            str = upiTransferFlowContract$State.f72938b;
        }
        upiTransferFlowContract$State.getClass();
        return new UpiTransferFlowContract$State(z, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UpiTransferFlowContract$State)) {
            return false;
        }
        UpiTransferFlowContract$State upiTransferFlowContract$State = (UpiTransferFlowContract$State) obj2;
        return this.f72937a == upiTransferFlowContract$State.f72937a && Intrinsics.f(this.f72938b, upiTransferFlowContract$State.f72938b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f72937a) * 31;
        String str = this.f72938b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f72937a ? 1 : 0);
        dest.writeString(this.f72938b);
    }

    public UpiTransferFlowContract$State(boolean z, String str) {
        this.f72937a = z;
        this.f72938b = str;
    }

    public /* synthetic */ UpiTransferFlowContract$State(int i) {
        this(false, null);
    }
}
