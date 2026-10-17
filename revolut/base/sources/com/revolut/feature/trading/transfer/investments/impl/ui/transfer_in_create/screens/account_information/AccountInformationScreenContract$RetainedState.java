package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/account_information/AccountInformationScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountInformationScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<AccountInformationScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f91595c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new AccountInformationScreenContract$RetainedState(string, string2, bVar, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountInformationScreenContract$RetainedState[i];
        }
    }

    public AccountInformationScreenContract$RetainedState(String str, String str2, b bVar, boolean z, boolean z3) {
        this.f91593a = str;
        this.f91594b = str2;
        this.f91595c = bVar;
        this.d = z;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountInformationScreenContract$RetainedState)) {
            return false;
        }
        AccountInformationScreenContract$RetainedState accountInformationScreenContract$RetainedState = (AccountInformationScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f91593a, accountInformationScreenContract$RetainedState.f91593a) && Intrinsics.f(this.f91594b, accountInformationScreenContract$RetainedState.f91594b) && Intrinsics.f(this.f91595c, accountInformationScreenContract$RetainedState.f91595c) && this.d == accountInformationScreenContract$RetainedState.d && this.e == accountInformationScreenContract$RetainedState.e;
    }

    public final int hashCode() {
        String str = this.f91593a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f91594b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.f91595c;
        return Boolean.hashCode(this.e) + j6.a.c((iHashCode2 + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91593a);
        dest.writeString(this.f91594b);
        dest.writeSerializable(this.f91595c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
