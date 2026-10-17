package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/FiatCryptoFeesBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FiatCryptoFeesBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatCryptoFeesBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatCryptoMoney f71106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiatCryptoMoney f71107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FiatCryptoMoney f71108c;
    public final FiatCryptoMoney d;
    public final FiatCryptoMoney e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            FiatCryptoMoney fiatCryptoMoneyCreateFromParcel = parcel.readInt() == 0 ? null : FiatCryptoMoney.CREATOR.createFromParcel(parcel);
            FiatCryptoMoney fiatCryptoMoneyCreateFromParcel2 = parcel.readInt() == 0 ? null : FiatCryptoMoney.CREATOR.createFromParcel(parcel);
            FiatCryptoMoney fiatCryptoMoneyCreateFromParcel3 = parcel.readInt() == 0 ? null : FiatCryptoMoney.CREATOR.createFromParcel(parcel);
            FiatCryptoMoney fiatCryptoMoneyCreateFromParcel4 = parcel.readInt() == 0 ? null : FiatCryptoMoney.CREATOR.createFromParcel(parcel);
            FiatCryptoMoney fiatCryptoMoneyCreateFromParcel5 = FiatCryptoMoney.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(FiatCryptoFeesBreakdownDetail.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new FiatCryptoFeesBreakdown(fiatCryptoMoneyCreateFromParcel, fiatCryptoMoneyCreateFromParcel2, fiatCryptoMoneyCreateFromParcel3, fiatCryptoMoneyCreateFromParcel4, fiatCryptoMoneyCreateFromParcel5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FiatCryptoFeesBreakdown[i];
        }
    }

    public FiatCryptoFeesBreakdown(FiatCryptoMoney fiatCryptoMoney, FiatCryptoMoney fiatCryptoMoney2, FiatCryptoMoney fiatCryptoMoney3, FiatCryptoMoney fiatCryptoMoney4, FiatCryptoMoney total, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.f71106a = fiatCryptoMoney;
        this.f71107b = fiatCryptoMoney2;
        this.f71108c = fiatCryptoMoney3;
        this.d = fiatCryptoMoney4;
        this.e = total;
        this.f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FiatCryptoFeesBreakdown)) {
            return false;
        }
        FiatCryptoFeesBreakdown fiatCryptoFeesBreakdown = (FiatCryptoFeesBreakdown) obj2;
        return Intrinsics.f(this.f71106a, fiatCryptoFeesBreakdown.f71106a) && Intrinsics.f(this.f71107b, fiatCryptoFeesBreakdown.f71107b) && Intrinsics.f(this.f71108c, fiatCryptoFeesBreakdown.f71108c) && Intrinsics.f(this.d, fiatCryptoFeesBreakdown.d) && Intrinsics.f(this.e, fiatCryptoFeesBreakdown.e) && Intrinsics.f(this.f, fiatCryptoFeesBreakdown.f);
    }

    public final int hashCode() {
        FiatCryptoMoney fiatCryptoMoney = this.f71106a;
        int iHashCode = (fiatCryptoMoney == null ? 0 : fiatCryptoMoney.hashCode()) * 31;
        FiatCryptoMoney fiatCryptoMoney2 = this.f71107b;
        int iHashCode2 = (iHashCode + (fiatCryptoMoney2 == null ? 0 : fiatCryptoMoney2.hashCode())) * 31;
        FiatCryptoMoney fiatCryptoMoney3 = this.f71108c;
        int iHashCode3 = (iHashCode2 + (fiatCryptoMoney3 == null ? 0 : fiatCryptoMoney3.hashCode())) * 31;
        FiatCryptoMoney fiatCryptoMoney4 = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (fiatCryptoMoney4 == null ? 0 : fiatCryptoMoney4.hashCode())) * 31)) * 31;
        List list = this.f;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        FiatCryptoMoney fiatCryptoMoney = this.f71106a;
        if (fiatCryptoMoney == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatCryptoMoney.writeToParcel(dest, i);
        }
        FiatCryptoMoney fiatCryptoMoney2 = this.f71107b;
        if (fiatCryptoMoney2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatCryptoMoney2.writeToParcel(dest, i);
        }
        FiatCryptoMoney fiatCryptoMoney3 = this.f71108c;
        if (fiatCryptoMoney3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatCryptoMoney3.writeToParcel(dest, i);
        }
        FiatCryptoMoney fiatCryptoMoney4 = this.d;
        if (fiatCryptoMoney4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatCryptoMoney4.writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((FiatCryptoFeesBreakdownDetail) itQ.next()).writeToParcel(dest, i);
        }
    }
}
