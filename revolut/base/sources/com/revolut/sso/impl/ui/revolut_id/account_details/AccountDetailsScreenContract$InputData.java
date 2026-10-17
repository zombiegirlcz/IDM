package com.revolut.sso.impl.ui.revolut_id.account_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/revolut_id/account_details/AccountDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f106707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserInfoAccount f106708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f106709c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountDetailsScreenContract$InputData(UserInfoAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountDetailsScreenContract$InputData[i];
        }
    }

    public AccountDetailsScreenContract$InputData(UserInfoAccount userInfoAccount, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(userInfoAccount, "userInfoAccount");
        this.f106707a = z;
        this.f106708b = userInfoAccount;
        this.f106709c = z3;
        this.d = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountDetailsScreenContract$InputData)) {
            return false;
        }
        AccountDetailsScreenContract$InputData accountDetailsScreenContract$InputData = (AccountDetailsScreenContract$InputData) obj2;
        return this.f106707a == accountDetailsScreenContract$InputData.f106707a && Intrinsics.f(this.f106708b, accountDetailsScreenContract$InputData.f106708b) && this.f106709c == accountDetailsScreenContract$InputData.f106709c && this.d == accountDetailsScreenContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f106708b.hashCode() + (Boolean.hashCode(this.f106707a) * 31)) * 31, 31, this.f106709c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f106707a ? 1 : 0);
        this.f106708b.writeToParcel(dest, i);
        dest.writeInt(this.f106709c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}
