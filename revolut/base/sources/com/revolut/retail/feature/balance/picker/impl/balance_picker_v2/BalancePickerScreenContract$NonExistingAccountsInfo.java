package com.revolut.retail.feature.balance.picker.impl.balance_picker_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import k1j.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n1j.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$NonExistingAccountsInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BalancePickerScreenContract$NonExistingAccountsInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BalancePickerScreenContract$NonExistingAccountsInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f99502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f99503c;
    public final q d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVarValueOf = d.valueOf(parcel.readString());
            AccountId accountId = (AccountId) parcel.readParcelable(BalancePickerScreenContract$NonExistingAccountsInfo.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new BalancePickerScreenContract$NonExistingAccountsInfo(dVarValueOf, accountId, arrayList, q.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BalancePickerScreenContract$NonExistingAccountsInfo[i];
        }
    }

    public BalancePickerScreenContract$NonExistingAccountsInfo(d walletScope, AccountId accountId, ArrayList currencies, q type) {
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f99501a = walletScope;
        this.f99502b = accountId;
        this.f99503c = currencies;
        this.d = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BalancePickerScreenContract$NonExistingAccountsInfo)) {
            return false;
        }
        BalancePickerScreenContract$NonExistingAccountsInfo balancePickerScreenContract$NonExistingAccountsInfo = (BalancePickerScreenContract$NonExistingAccountsInfo) obj2;
        return this.f99501a == balancePickerScreenContract$NonExistingAccountsInfo.f99501a && Intrinsics.f(this.f99502b, balancePickerScreenContract$NonExistingAccountsInfo.f99502b) && this.f99503c.equals(balancePickerScreenContract$NonExistingAccountsInfo.f99503c) && this.d == balancePickerScreenContract$NonExistingAccountsInfo.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f99503c, l.b(this.f99502b, this.f99501a.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99501a.name());
        dest.writeParcelable(this.f99502b, i);
        Iterator itY = j6.a.y(this.f99503c, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        dest.writeString(this.d.name());
    }
}
