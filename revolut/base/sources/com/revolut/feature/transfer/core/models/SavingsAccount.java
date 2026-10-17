package com.revolut.feature.transfer.core.models;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/SavingsAccount;", "Lcom/revolut/feature/transfer/core/models/FundingSource;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsAccount extends FundingSource {

    @NotNull
    public static final Parcelable.Creator<SavingsAccount> CREATOR = new a();
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f92243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f92244h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f92245j;
    public final AccountId k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CountryProfile f92246l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsAccount(parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (Image) parcel.readParcelable(SavingsAccount.class.getClassLoader()), parcel.readString(), (Clause) parcel.readParcelable(SavingsAccount.class.getClassLoader()), (AccountId) parcel.readParcelable(SavingsAccount.class.getClassLoader()), parcel.readInt() == 0 ? null : CountryProfile.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsAccount[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccount(String vaultUnderlyingId, String savingsAccountId, String str, d availableBalance, Image icon, String name, Clause clause, AccountId accountId, CountryProfile countryProfile) {
        super(accountId, vaultUnderlyingId, availableBalance.f115083b);
        Intrinsics.checkNotNullParameter(vaultUnderlyingId, "vaultUnderlyingId");
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.d = vaultUnderlyingId;
        this.e = savingsAccountId;
        this.f = str;
        this.f92243g = availableBalance;
        this.f92244h = icon;
        this.i = name;
        this.f92245j = clause;
        this.k = accountId;
        this.f92246l = countryProfile;
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CountryProfile getF92264h() {
        return this.f92246l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsAccount)) {
            return false;
        }
        SavingsAccount savingsAccount = (SavingsAccount) obj2;
        return Intrinsics.f(this.d, savingsAccount.d) && Intrinsics.f(this.e, savingsAccount.e) && Intrinsics.f(this.f, savingsAccount.f) && Intrinsics.f(this.f92243g, savingsAccount.f92243g) && Intrinsics.f(this.f92244h, savingsAccount.f92244h) && Intrinsics.f(this.i, savingsAccount.i) && Intrinsics.f(this.f92245j, savingsAccount.f92245j) && Intrinsics.f(this.k, savingsAccount.k) && Intrinsics.f(this.f92246l, savingsAccount.f92246l);
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public final AccountId getK() {
        return this.k;
    }

    @Override // com.revolut.feature.transfer.core.models.FundingSource
    /* JADX INFO: renamed from: getBalance, reason: from getter */
    public final d getF92243g() {
        return this.f92243g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int iC2 = p.a.c(b.c(this.f92244h, v7.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f92243g), 31), 31, this.i);
        Clause clause = this.f92245j;
        int iB = l.b(this.k, (iC2 + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        CountryProfile countryProfile = this.f92246l;
        return iB + (countryProfile != null ? countryProfile.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeSerializable(this.f92243g);
        dest.writeParcelable(this.f92244h, i);
        dest.writeString(this.i);
        dest.writeParcelable(this.f92245j, i);
        dest.writeParcelable(this.k, i);
        CountryProfile countryProfile = this.f92246l;
        if (countryProfile == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            countryProfile.writeToParcel(dest, i);
        }
    }
}
