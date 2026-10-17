package com.revolut.shared.feature.wealth.models.trading_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccounts;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradingAccounts implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradingAccounts> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f105278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f105279b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TradingAccounts.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingAccountAvailableToOnboard.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new TradingAccounts(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingAccounts[i];
        }
    }

    public TradingAccounts(List createdAccounts, List availableToOnboard) {
        Intrinsics.checkNotNullParameter(createdAccounts, "createdAccounts");
        Intrinsics.checkNotNullParameter(availableToOnboard, "availableToOnboard");
        this.f105278a = createdAccounts;
        this.f105279b = availableToOnboard;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradingAccounts)) {
            return false;
        }
        TradingAccounts tradingAccounts = (TradingAccounts) obj2;
        return Intrinsics.f(this.f105278a, tradingAccounts.f105278a) && Intrinsics.f(this.f105279b, tradingAccounts.f105279b);
    }

    public final int hashCode() {
        return this.f105279b.hashCode() + (this.f105278a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f105278a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f105279b, dest);
        while (itV2.hasNext()) {
            ((TradingAccountAvailableToOnboard) itV2.next()).writeToParcel(dest, i);
        }
    }
}
