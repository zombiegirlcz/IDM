package com.revolut.feature.transfer.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/WealthPortfolio;", "Lcom/revolut/feature/transfer/core/models/FundingSource;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthPortfolio extends FundingSource {

    @NotNull
    public static final Parcelable.Creator<WealthPortfolio> CREATOR = new a();
    public final String d;
    public final b e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f92263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CountryProfile f92264h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthPortfolio(parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? CountryProfile.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthPortfolio[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WealthPortfolio(d availableToWithdraw, String portfolioId, String str) {
        this(portfolioId, availableToWithdraw.f115083b, Long.valueOf(availableToWithdraw.f115082a), str, null);
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CountryProfile getF92264h() {
        return this.f92264h;
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: b */
    public final String getF92240a() {
        String str = this.f92263g;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("SelectedPocketId must be set");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthPortfolio)) {
            return false;
        }
        WealthPortfolio wealthPortfolio = (WealthPortfolio) obj2;
        return Intrinsics.f(this.d, wealthPortfolio.d) && Intrinsics.f(this.e, wealthPortfolio.e) && Intrinsics.f(this.f, wealthPortfolio.f) && Intrinsics.f(this.f92263g, wealthPortfolio.f92263g) && Intrinsics.f(this.f92264h, wealthPortfolio.f92264h);
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: getBalance */
    public final d getF92243g() {
        Long l2 = this.f;
        return new d(l2 != null ? l2.longValue() : 0L, this.f92241b);
    }

    public final int hashCode() {
        int iJ = l.j(this.e, this.d.hashCode() * 31, 31);
        Long l2 = this.f;
        int iHashCode = (iJ + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f92263g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CountryProfile countryProfile = this.f92264h;
        return iHashCode2 + (countryProfile != null ? countryProfile.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        Long l2 = this.f;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeString(this.f92263g);
        CountryProfile countryProfile = this.f92264h;
        if (countryProfile == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            countryProfile.writeToParcel(dest, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthPortfolio(String portfolioId, b portfolioCurrency, Long l2, String str, CountryProfile countryProfile) {
        super(AccountId.Personal.f51414a, portfolioId, portfolioCurrency);
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioCurrency, "portfolioCurrency");
        this.d = portfolioId;
        this.e = portfolioCurrency;
        this.f = l2;
        this.f92263g = str;
        this.f92264h = countryProfile;
    }
}
