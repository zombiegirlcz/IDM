package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import ko5.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/FiatCryptoWithdrawLimits;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FiatCryptoWithdrawLimits implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatCryptoWithdrawLimits> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatCryptoMoney f71185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiatCryptoMoney f71186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FiatCryptoMoney f71187c;
    public final FiatCryptoMoney d;
    public final o e;
    public final Long f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatCryptoWithdrawLimits((FiatCryptoMoney) parcel.readParcelable(FiatCryptoWithdrawLimits.class.getClassLoader()), (FiatCryptoMoney) parcel.readParcelable(FiatCryptoWithdrawLimits.class.getClassLoader()), (FiatCryptoMoney) parcel.readParcelable(FiatCryptoWithdrawLimits.class.getClassLoader()), (FiatCryptoMoney) parcel.readParcelable(FiatCryptoWithdrawLimits.class.getClassLoader()), parcel.readInt() == 0 ? null : o.valueOf(parcel.readString()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FiatCryptoWithdrawLimits[i];
        }
    }

    public FiatCryptoWithdrawLimits(FiatCryptoMoney dailyWithdrawalLimit, FiatCryptoMoney dailyWithdrawalUsage, FiatCryptoMoney monthlyWithdrawalLimit, FiatCryptoMoney monthlyWithdrawalUsage, o oVar, Long l2) {
        Intrinsics.checkNotNullParameter(dailyWithdrawalLimit, "dailyWithdrawalLimit");
        Intrinsics.checkNotNullParameter(dailyWithdrawalUsage, "dailyWithdrawalUsage");
        Intrinsics.checkNotNullParameter(monthlyWithdrawalLimit, "monthlyWithdrawalLimit");
        Intrinsics.checkNotNullParameter(monthlyWithdrawalUsage, "monthlyWithdrawalUsage");
        this.f71185a = dailyWithdrawalLimit;
        this.f71186b = dailyWithdrawalUsage;
        this.f71187c = monthlyWithdrawalLimit;
        this.d = monthlyWithdrawalUsage;
        this.e = oVar;
        this.f = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FiatCryptoWithdrawLimits)) {
            return false;
        }
        FiatCryptoWithdrawLimits fiatCryptoWithdrawLimits = (FiatCryptoWithdrawLimits) obj2;
        return Intrinsics.f(this.f71185a, fiatCryptoWithdrawLimits.f71185a) && Intrinsics.f(this.f71186b, fiatCryptoWithdrawLimits.f71186b) && Intrinsics.f(this.f71187c, fiatCryptoWithdrawLimits.f71187c) && Intrinsics.f(this.d, fiatCryptoWithdrawLimits.d) && this.e == fiatCryptoWithdrawLimits.e && Intrinsics.f(this.f, fiatCryptoWithdrawLimits.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f71187c.hashCode() + ((this.f71186b.hashCode() + (this.f71185a.hashCode() * 31)) * 31)) * 31)) * 31;
        o oVar = this.e;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f71185a, i);
        dest.writeParcelable(this.f71186b, i);
        dest.writeParcelable(this.f71187c, i);
        dest.writeParcelable(this.d, i);
        o oVar = this.e;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
        Long l2 = this.f;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
    }
}
