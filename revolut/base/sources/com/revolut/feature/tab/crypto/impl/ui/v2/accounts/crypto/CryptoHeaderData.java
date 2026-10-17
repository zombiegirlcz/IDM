package com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.zero_fees.api.models.CryptoZeroFeesPromotion;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import com.revolut.feature.derivatives.models.BalanceWithPnl;
import com.revolut.feature.tab.crypto.impl.ui.actions.HeaderActionsProvider$HeaderActionsData;
import dj0.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yh5.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/v2/accounts/crypto/CryptoHeaderData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoHeaderData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketBalancesWithSum f89818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f89819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BalanceWithPnl f89820c;
    public final CryptoCommodityPositions d;
    public final ArrayList e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HeaderActionsProvider$HeaderActionsData f89821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f89822h;
    public final CryptoZeroFeesPromotion i;

    @NotNull
    public static final Parcelable.Creator<CryptoHeaderData> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PocketBalancesWithSum pocketBalancesWithSum = (PocketBalancesWithSum) j6.a.f(parcel, "parcel", CryptoHeaderData.class);
            d dVar = (d) parcel.readSerializable();
            BalanceWithPnl balanceWithPnl = (BalanceWithPnl) parcel.readParcelable(CryptoHeaderData.class.getClassLoader());
            CryptoCommodityPositions cryptoCommodityPositions = (CryptoCommodityPositions) parcel.readParcelable(CryptoHeaderData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CryptoHeaderData(pocketBalancesWithSum, dVar, balanceWithPnl, cryptoCommodityPositions, arrayList, a.valueOf(parcel.readString()), HeaderActionsProvider$HeaderActionsData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (CryptoZeroFeesPromotion) parcel.readParcelable(CryptoHeaderData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoHeaderData[i];
        }
    }

    public CryptoHeaderData(PocketBalancesWithSum pocketBalancesWithSum, d dVar, BalanceWithPnl balanceWithPnl, CryptoCommodityPositions cryptoPositions, ArrayList cryptoRates, a cryptoFeatureState, HeaderActionsProvider$HeaderActionsData headerActionsData, boolean z, CryptoZeroFeesPromotion zeroFeesPromotion) {
        Intrinsics.checkNotNullParameter(pocketBalancesWithSum, "pocketBalancesWithSum");
        Intrinsics.checkNotNullParameter(cryptoPositions, "cryptoPositions");
        Intrinsics.checkNotNullParameter(cryptoRates, "cryptoRates");
        Intrinsics.checkNotNullParameter(cryptoFeatureState, "cryptoFeatureState");
        Intrinsics.checkNotNullParameter(headerActionsData, "headerActionsData");
        Intrinsics.checkNotNullParameter(zeroFeesPromotion, "zeroFeesPromotion");
        this.f89818a = pocketBalancesWithSum;
        this.f89819b = dVar;
        this.f89820c = balanceWithPnl;
        this.d = cryptoPositions;
        this.e = cryptoRates;
        this.f = cryptoFeatureState;
        this.f89821g = headerActionsData;
        this.f89822h = z;
        this.i = zeroFeesPromotion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoHeaderData)) {
            return false;
        }
        CryptoHeaderData cryptoHeaderData = (CryptoHeaderData) obj2;
        return Intrinsics.f(this.f89818a, cryptoHeaderData.f89818a) && Intrinsics.f(this.f89819b, cryptoHeaderData.f89819b) && Intrinsics.f(this.f89820c, cryptoHeaderData.f89820c) && Intrinsics.f(this.d, cryptoHeaderData.d) && this.e.equals(cryptoHeaderData.e) && this.f == cryptoHeaderData.f && Intrinsics.f(this.f89821g, cryptoHeaderData.f89821g) && this.f89822h == cryptoHeaderData.f89822h && Intrinsics.f(this.i, cryptoHeaderData.i);
    }

    public final int hashCode() {
        int iHashCode = this.f89818a.hashCode() * 31;
        d dVar = this.f89819b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        BalanceWithPnl balanceWithPnl = this.f89820c;
        return this.i.hashCode() + j6.a.c((this.f89821g.hashCode() + ((this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + ((iHashCode2 + (balanceWithPnl != null ? balanceWithPnl.hashCode() : 0)) * 31)) * 31, 31)) * 31)) * 31, 31, this.f89822h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89818a, i);
        dest.writeSerializable(this.f89819b);
        dest.writeParcelable(this.f89820c, i);
        dest.writeParcelable(this.d, i);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        dest.writeString(this.f.name());
        this.f89821g.writeToParcel(dest, i);
        dest.writeInt(this.f89822h ? 1 : 0);
        dest.writeParcelable(this.i, i);
    }
}
