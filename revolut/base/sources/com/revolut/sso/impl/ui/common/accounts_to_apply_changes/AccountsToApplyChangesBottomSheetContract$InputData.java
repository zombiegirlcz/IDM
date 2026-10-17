package com.revolut.sso.impl.ui.common.accounts_to_apply_changes;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ull.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/impl/ui/common/accounts_to_apply_changes/AccountsToApplyChangesBottomSheetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "ull/c", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountsToApplyChangesBottomSheetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountsToApplyChangesBottomSheetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f106444c;
    public final c d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str = ((RegisteredIdentityId) j6.a.f(parcel, "parcel", AccountsToApplyChangesBottomSheetContract$InputData.class)).f74764a;
            String str2 = ((RegisteredIdentityId) parcel.readParcelable(AccountsToApplyChangesBottomSheetContract$InputData.class.getClassLoader())).f74764a;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(UserInfoAccount.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AccountsToApplyChangesBottomSheetContract$InputData(str, str2, arrayList, c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountsToApplyChangesBottomSheetContract$InputData[i];
        }
    }

    public AccountsToApplyChangesBottomSheetContract$InputData(String accountIdCurrent, String accountIdChangeInitiated, List accounts, c applyFor) {
        Intrinsics.checkNotNullParameter(accountIdCurrent, "accountIdCurrent");
        Intrinsics.checkNotNullParameter(accountIdChangeInitiated, "accountIdChangeInitiated");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(applyFor, "applyFor");
        this.f106442a = accountIdCurrent;
        this.f106443b = accountIdChangeInitiated;
        this.f106444c = accounts;
        this.d = applyFor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountsToApplyChangesBottomSheetContract$InputData)) {
            return false;
        }
        AccountsToApplyChangesBottomSheetContract$InputData accountsToApplyChangesBottomSheetContract$InputData = (AccountsToApplyChangesBottomSheetContract$InputData) obj2;
        return Intrinsics.f(this.f106442a, accountsToApplyChangesBottomSheetContract$InputData.f106442a) && Intrinsics.f(this.f106443b, accountsToApplyChangesBottomSheetContract$InputData.f106443b) && Intrinsics.f(this.f106444c, accountsToApplyChangesBottomSheetContract$InputData.f106444c) && this.d == accountsToApplyChangesBottomSheetContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f106442a.hashCode() * 31, 31, this.f106443b), 31, this.f106444c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e.x(this.f106442a, dest, i);
        e.x(this.f106443b, dest, i);
        Iterator itV = p.a.v(this.f106444c, dest);
        while (itV.hasNext()) {
            ((UserInfoAccount) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d.name());
    }
}
