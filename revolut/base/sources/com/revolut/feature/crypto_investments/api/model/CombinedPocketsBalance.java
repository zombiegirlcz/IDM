package com.revolut.feature.crypto_investments.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/CombinedPocketsBalance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CombinedPocketsBalance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CombinedPocketsBalance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CombinedPocketsBalanceGroup f71375c;
    public final CombinedPocketsBalanceGroup d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            Parcelable.Creator<CombinedPocketsBalanceGroup> creator = CombinedPocketsBalanceGroup.CREATOR;
            return new CombinedPocketsBalance(dVar, dVar2, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CombinedPocketsBalance[i];
        }
    }

    public CombinedPocketsBalance(d combinedBalance, d dVar, CombinedPocketsBalanceGroup available, CombinedPocketsBalanceGroup combinedPocketsBalanceGroup, b baseCurrency) {
        Intrinsics.checkNotNullParameter(combinedBalance, "combinedBalance");
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f71373a = combinedBalance;
        this.f71374b = dVar;
        this.f71375c = available;
        this.d = combinedPocketsBalanceGroup;
        this.e = baseCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CombinedPocketsBalance)) {
            return false;
        }
        CombinedPocketsBalance combinedPocketsBalance = (CombinedPocketsBalance) obj2;
        return Intrinsics.f(this.f71373a, combinedPocketsBalance.f71373a) && Intrinsics.f(this.f71374b, combinedPocketsBalance.f71374b) && Intrinsics.f(this.f71375c, combinedPocketsBalance.f71375c) && Intrinsics.f(this.d, combinedPocketsBalance.d) && Intrinsics.f(this.e, combinedPocketsBalance.e);
    }

    public final int hashCode() {
        int iHashCode = this.f71373a.hashCode() * 31;
        d dVar = this.f71374b;
        int iHashCode2 = (this.f71375c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        CombinedPocketsBalanceGroup combinedPocketsBalanceGroup = this.d;
        return this.e.hashCode() + ((iHashCode2 + (combinedPocketsBalanceGroup != null ? combinedPocketsBalanceGroup.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71373a);
        dest.writeSerializable(this.f71374b);
        this.f71375c.writeToParcel(dest, i);
        CombinedPocketsBalanceGroup combinedPocketsBalanceGroup = this.d;
        if (combinedPocketsBalanceGroup == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            combinedPocketsBalanceGroup.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.e);
    }
}
