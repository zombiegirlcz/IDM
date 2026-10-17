package com.revolut.feature.transfer.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import io3.d;
import io3.i;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import z92.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/PocketSource;", "Lcom/revolut/feature/transfer/core/models/FundingSource;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketSource extends FundingSource {

    @NotNull
    public static final Parcelable.Creator<PocketSource> CREATOR = new a();
    public final d d;
    public final AccountId e;
    public final CountryProfile f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PocketSource((d) parcel.readSerializable(), (AccountId) parcel.readParcelable(PocketSource.class.getClassLoader()), parcel.readInt() == 0 ? null : CountryProfile.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketSource[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PocketSource(d pocket, AccountId accountId, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String str = pocket.f163145a;
        xi0.a aVar = b.Companion;
        String str2 = pocket.f163147c;
        aVar.getClass();
        super(accountId, str, xi0.a.a(str2));
        this.d = pocket;
        this.e = accountId;
        this.f = countryProfile;
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CountryProfile getF92264h() {
        return this.f;
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    public final boolean c() {
        return this.d.e == l.CREDIT;
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    public final boolean d() {
        return this.d.f163149h == i.EXTERNAL;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketSource)) {
            return false;
        }
        PocketSource pocketSource = (PocketSource) obj2;
        return Intrinsics.f(this.d, pocketSource.d) && Intrinsics.f(this.e, pocketSource.e) && Intrinsics.f(this.f, pocketSource.f);
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public final AccountId getK() {
        return this.e;
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: getBalance */
    public final dj0.d getF92243g() {
        return f.j(this.d);
    }

    public final int hashCode() {
        int iB = h30.l.b(this.e, this.d.hashCode() * 31, 31);
        CountryProfile countryProfile = this.f;
        return iB + (countryProfile == null ? 0 : countryProfile.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        CountryProfile countryProfile = this.f;
        if (countryProfile == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            countryProfile.writeToParcel(dest, i);
        }
    }
}
