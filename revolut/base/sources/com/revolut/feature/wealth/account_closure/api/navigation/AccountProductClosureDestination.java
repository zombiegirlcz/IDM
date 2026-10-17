package com.revolut.feature.wealth.account_closure.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/navigation/AccountProductClosureDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountProductClosureDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AccountProductClosureDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingProductCode f94891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f94892c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            TradingProductCode tradingProductCode = (TradingProductCode) parcel.readParcelable(AccountProductClosureDestination.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(AccountProductClosureDestination.class, parcel, linkedHashSet, iE, 1);
            }
            return new AccountProductClosureDestination(string, tradingProductCode, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountProductClosureDestination[i];
        }
    }

    public AccountProductClosureDestination(String accountId, TradingProductCode product, Set applicablePreconditions) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(applicablePreconditions, "applicablePreconditions");
        this.f94890a = accountId;
        this.f94891b = product;
        this.f94892c = applicablePreconditions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF94890a() {
        return this.f94890a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Set getF94892c() {
        return this.f94892c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TradingProductCode getF94891b() {
        return this.f94891b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountProductClosureDestination)) {
            return false;
        }
        AccountProductClosureDestination accountProductClosureDestination = (AccountProductClosureDestination) obj2;
        return Intrinsics.f(this.f94890a, accountProductClosureDestination.f94890a) && Intrinsics.f(this.f94891b, accountProductClosureDestination.f94891b) && Intrinsics.f(this.f94892c, accountProductClosureDestination.f94892c);
    }

    public final int hashCode() {
        return this.f94892c.hashCode() + ((this.f94891b.hashCode() + (this.f94890a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94890a);
        dest.writeParcelable(this.f94891b, i);
        Iterator itV = n.v(this.f94892c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
