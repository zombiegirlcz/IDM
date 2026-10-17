package com.revolut.feature.transfer.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import dj0.d;
import ej0.b;
import hq1.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/DeFiBalanceSource;", "Lcom/revolut/feature/transfer/core/models/FundingSource;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiBalanceSource extends FundingSource {

    @NotNull
    public static final Parcelable.Creator<DeFiBalanceSource> CREATOR = new a();
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f92237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f92238h;
    public final CountryProfile i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f92239j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiBalanceSource(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : CountryProfile.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiBalanceSource[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiBalanceSource(String scopedAccountId, String assetName, String assetTicker, String str, b fullPrecisionBalance, CountryProfile countryProfile) {
        super(AccountId.Personal.f51414a, scopedAccountId, fullPrecisionBalance.f126704b);
        Intrinsics.checkNotNullParameter(scopedAccountId, "scopedAccountId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(assetTicker, "assetTicker");
        Intrinsics.checkNotNullParameter(fullPrecisionBalance, "fullPrecisionBalance");
        this.d = scopedAccountId;
        this.e = assetName;
        this.f = assetTicker;
        this.f92237g = str;
        this.f92238h = fullPrecisionBalance;
        this.i = countryProfile;
        this.f92239j = j.b(new f(this, 3));
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CountryProfile getF92264h() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiBalanceSource)) {
            return false;
        }
        DeFiBalanceSource deFiBalanceSource = (DeFiBalanceSource) obj2;
        return Intrinsics.f(this.d, deFiBalanceSource.d) && Intrinsics.f(this.e, deFiBalanceSource.e) && Intrinsics.f(this.f, deFiBalanceSource.f) && Intrinsics.f(this.f92237g, deFiBalanceSource.f92237g) && Intrinsics.f(this.f92238h, deFiBalanceSource.f92238h) && Intrinsics.f(this.i, deFiBalanceSource.i);
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: getBalance */
    public final d getF92243g() {
        return (d) this.f92239j.getValue();
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        String str = this.f92237g;
        int iD = org.bouncycastle.jcajce.provider.digest.a.d(this.f92238h, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        CountryProfile countryProfile = this.i;
        return iD + (countryProfile != null ? countryProfile.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f92237g);
        dest.writeSerializable(this.f92238h);
        CountryProfile countryProfile = this.i;
        if (countryProfile == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            countryProfile.writeToParcel(dest, i);
        }
    }
}
