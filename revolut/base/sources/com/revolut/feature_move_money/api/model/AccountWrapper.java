package com.revolut.feature_move_money.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature_move_money.api.model.AccountSource;
import dj0.d;
import j8l.h;
import kii.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountWrapper;", "Lj8l/h;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountWrapper implements h, Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountWrapper> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8l.a f97224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f97225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f97226c;
    public final AccountSource d;
    public final CountryProfile e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountWrapper(j8l.a.valueOf(parcel.readString()), (Clause) parcel.readParcelable(AccountWrapper.class.getClassLoader()), (Image) parcel.readParcelable(AccountWrapper.class.getClassLoader()), (AccountSource) parcel.readParcelable(AccountWrapper.class.getClassLoader()), (CountryProfile) parcel.readParcelable(AccountWrapper.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountWrapper[i];
        }
    }

    public AccountWrapper(j8l.a type, Clause title, Image icon, AccountSource source, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f97224a = type;
        this.f97225b = title;
        this.f97226c = icon;
        this.d = source;
        this.e = countryProfile;
    }

    public final String a() {
        AccountSource accountSource = this.d;
        if (accountSource instanceof AccountSource.PocketSource) {
            return ((AccountSource.PocketSource) accountSource).f97213a.f163145a;
        }
        if (accountSource instanceof AccountSource.VaultSource) {
            return ((AccountSource.VaultSource) accountSource).f97223a.f234881a;
        }
        if (accountSource instanceof AccountSource.JointVaultSource) {
            return ((AccountSource.JointVaultSource) accountSource).f97202a.f234881a;
        }
        if (accountSource instanceof AccountSource.SavingsSource) {
            return ((AccountSource.SavingsSource) accountSource).f97216a.f86460a.f234881a;
        }
        if (accountSource instanceof AccountSource.JointSavingsSource) {
            return ((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a.f234881a;
        }
        if (accountSource instanceof AccountSource.CreditCardSource) {
            return ((AccountSource.CreditCardSource) accountSource).f97192a.f69793b;
        }
        if (accountSource instanceof AccountSource.RevPointsPocketSource) {
            return ((AccountSource.RevPointsPocketSource) accountSource).f97214a.f97784a;
        }
        if (accountSource instanceof AccountSource.JuniorPocketSource) {
            return ((AccountSource.JuniorPocketSource) accountSource).f97204b.f163145a;
        }
        if (accountSource instanceof AccountSource.JuniorVaultSource) {
            return ((AccountSource.JuniorVaultSource) accountSource).f97209b.f234881a;
        }
        if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            return ((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a.f234881a;
        }
        if (accountSource instanceof AccountSource.TeenPocketSource) {
            return ((AccountSource.TeenPocketSource) accountSource).f97220b.f163145a;
        }
        if (accountSource instanceof AccountSource.TeenVaultSource) {
            return ((AccountSource.TeenVaultSource) accountSource).f97222b.f234881a;
        }
        if (accountSource instanceof AccountSource.InvestCashHolding) {
            return ((AccountSource.InvestCashHolding) accountSource).f97199b.f183150c;
        }
        if (accountSource instanceof AccountSource.NonExistingCurrencyAccount) {
            return ((AccountSource.NonExistingCurrencyAccount) accountSource).f97210a.f306286a;
        }
        if (accountSource instanceof AccountSource.SpotMarginCollateralSource) {
            return b.c(((AccountSource.SpotMarginCollateralSource) accountSource).f97218b.f115083b);
        }
        if (accountSource instanceof AccountSource.FuturesCollateralSource) {
            return ((AccountSource.FuturesCollateralSource) accountSource).f97195a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountWrapper)) {
            return false;
        }
        AccountWrapper accountWrapper = (AccountWrapper) obj2;
        return this.f97224a == accountWrapper.f97224a && Intrinsics.f(this.f97225b, accountWrapper.f97225b) && Intrinsics.f(this.f97226c, accountWrapper.f97226c) && Intrinsics.f(this.d, accountWrapper.d) && Intrinsics.f(this.e, accountWrapper.e);
    }

    public final d getBalance() {
        AccountSource accountSource = this.d;
        if (accountSource instanceof AccountSource.PocketSource) {
            return io3.h.e(((AccountSource.PocketSource) accountSource).f97213a);
        }
        if (accountSource instanceof AccountSource.VaultSource) {
            s sVar = ((AccountSource.VaultSource) accountSource).f97223a;
            return new d(sVar.f234885h.f234861c, e.u(sVar, xi0.b.Companion));
        }
        if (accountSource instanceof AccountSource.JointVaultSource) {
            s sVar2 = ((AccountSource.JointVaultSource) accountSource).f97202a;
            return new d(sVar2.f234885h.f234861c, e.u(sVar2, xi0.b.Companion));
        }
        if (accountSource instanceof AccountSource.SavingsSource) {
            s sVar3 = ((AccountSource.SavingsSource) accountSource).f97216a.f86460a;
            return new d(sVar3.f234885h.f234861c, e.u(sVar3, xi0.b.Companion));
        }
        if (accountSource instanceof AccountSource.JointSavingsSource) {
            s sVar4 = ((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a;
            return new d(sVar4.f234885h.f234861c, e.u(sVar4, xi0.b.Companion));
        }
        if (accountSource instanceof AccountSource.CreditCardSource) {
            return ((AccountSource.CreditCardSource) accountSource).f97192a.d;
        }
        if (accountSource instanceof AccountSource.RevPointsPocketSource) {
            return ((AccountSource.RevPointsPocketSource) accountSource).f97214a.e;
        }
        if (accountSource instanceof AccountSource.JuniorPocketSource) {
            return io3.h.e(((AccountSource.JuniorPocketSource) accountSource).f97204b);
        }
        if (accountSource instanceof AccountSource.JuniorVaultSource) {
            s sVar5 = ((AccountSource.JuniorVaultSource) accountSource).f97209b;
            return new d(sVar5.f234885h.f234861c, e.u(sVar5, xi0.b.Companion));
        }
        if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            s sVar6 = ((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a;
            return new d(sVar6.f234885h.f234861c, e.u(sVar6, xi0.b.Companion));
        }
        if (accountSource instanceof AccountSource.TeenPocketSource) {
            return io3.h.e(((AccountSource.TeenPocketSource) accountSource).f97220b);
        }
        if (accountSource instanceof AccountSource.TeenVaultSource) {
            s sVar7 = ((AccountSource.TeenVaultSource) accountSource).f97222b;
            return new d(sVar7.f234885h.f234861c, e.u(sVar7, xi0.b.Companion));
        }
        if (accountSource instanceof AccountSource.InvestCashHolding) {
            return ((AccountSource.InvestCashHolding) accountSource).f97200c;
        }
        if (accountSource instanceof AccountSource.NonExistingCurrencyAccount) {
            return new d(0L, ((AccountSource.NonExistingCurrencyAccount) accountSource).f97210a);
        }
        if (accountSource instanceof AccountSource.SpotMarginCollateralSource) {
            return ((AccountSource.SpotMarginCollateralSource) accountSource).f97217a;
        }
        if (accountSource instanceof AccountSource.FuturesCollateralSource) {
            return ((AccountSource.FuturesCollateralSource) accountSource).f97196b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final xi0.b getCurrency() {
        AccountSource accountSource = this.d;
        if (accountSource instanceof AccountSource.PocketSource) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((AccountSource.PocketSource) accountSource).f97213a.f163147c;
            aVar.getClass();
            return xi0.a.a(str);
        }
        if (accountSource instanceof AccountSource.VaultSource) {
            return e.u(((AccountSource.VaultSource) accountSource).f97223a, xi0.b.Companion);
        }
        if (accountSource instanceof AccountSource.JointVaultSource) {
            return e.u(((AccountSource.JointVaultSource) accountSource).f97202a, xi0.b.Companion);
        }
        if (accountSource instanceof AccountSource.SavingsSource) {
            return e.u(((AccountSource.SavingsSource) accountSource).f97216a.f86460a, xi0.b.Companion);
        }
        if (accountSource instanceof AccountSource.JointSavingsSource) {
            return e.u(((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a, xi0.b.Companion);
        }
        if (accountSource instanceof AccountSource.CreditCardSource) {
            return ((AccountSource.CreditCardSource) accountSource).f97192a.f69798l;
        }
        if (accountSource instanceof AccountSource.RevPointsPocketSource) {
            return ((AccountSource.RevPointsPocketSource) accountSource).f97214a.e.f115083b;
        }
        if (accountSource instanceof AccountSource.JuniorPocketSource) {
            xi0.a aVar2 = xi0.b.Companion;
            String str2 = ((AccountSource.JuniorPocketSource) accountSource).f97204b.f163147c;
            aVar2.getClass();
            return xi0.a.a(str2);
        }
        if (accountSource instanceof AccountSource.JuniorVaultSource) {
            return e.u(((AccountSource.JuniorVaultSource) accountSource).f97209b, xi0.b.Companion);
        }
        if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            return e.u(((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a, xi0.b.Companion);
        }
        if (accountSource instanceof AccountSource.TeenPocketSource) {
            xi0.a aVar3 = xi0.b.Companion;
            String str3 = ((AccountSource.TeenPocketSource) accountSource).f97220b.f163147c;
            aVar3.getClass();
            return xi0.a.a(str3);
        }
        if (accountSource instanceof AccountSource.TeenVaultSource) {
            return e.u(((AccountSource.TeenVaultSource) accountSource).f97222b, xi0.b.Companion);
        }
        if (accountSource instanceof AccountSource.InvestCashHolding) {
            xi0.a aVar4 = xi0.b.Companion;
            String str4 = ((AccountSource.InvestCashHolding) accountSource).f97199b.f183148a.e;
            aVar4.getClass();
            return xi0.a.a(str4);
        }
        if (accountSource instanceof AccountSource.NonExistingCurrencyAccount) {
            return ((AccountSource.NonExistingCurrencyAccount) accountSource).f97210a;
        }
        if (accountSource instanceof AccountSource.SpotMarginCollateralSource) {
            return ((AccountSource.SpotMarginCollateralSource) accountSource).f97217a.f115083b;
        }
        if (accountSource instanceof AccountSource.FuturesCollateralSource) {
            return ((AccountSource.FuturesCollateralSource) accountSource).f97196b.f115083b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getId() {
        AccountSource accountSource = this.d;
        if (accountSource instanceof AccountSource.PocketSource) {
            return ((AccountSource.PocketSource) accountSource).f97213a.f163145a;
        }
        if (accountSource instanceof AccountSource.VaultSource) {
            return ((AccountSource.VaultSource) accountSource).f97223a.f();
        }
        if (accountSource instanceof AccountSource.JointVaultSource) {
            return ((AccountSource.JointVaultSource) accountSource).f97202a.f();
        }
        if (accountSource instanceof AccountSource.SavingsSource) {
            return ((AccountSource.SavingsSource) accountSource).f97216a.f86460a.f();
        }
        if (accountSource instanceof AccountSource.JointSavingsSource) {
            return ((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a.f();
        }
        if (accountSource instanceof AccountSource.CreditCardSource) {
            return ((AccountSource.CreditCardSource) accountSource).f97192a.f69792a;
        }
        if (accountSource instanceof AccountSource.RevPointsPocketSource) {
            return ((AccountSource.RevPointsPocketSource) accountSource).f97214a.f97784a;
        }
        if (accountSource instanceof AccountSource.JuniorPocketSource) {
            return ((AccountSource.JuniorPocketSource) accountSource).f97204b.f163145a;
        }
        if (accountSource instanceof AccountSource.JuniorVaultSource) {
            return ((AccountSource.JuniorVaultSource) accountSource).f97209b.f234881a;
        }
        if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            return ((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a.f();
        }
        if (accountSource instanceof AccountSource.TeenPocketSource) {
            return ((AccountSource.TeenPocketSource) accountSource).f97220b.f163145a;
        }
        if (accountSource instanceof AccountSource.TeenVaultSource) {
            return ((AccountSource.TeenVaultSource) accountSource).f97222b.f();
        }
        if (accountSource instanceof AccountSource.InvestCashHolding) {
            return ((AccountSource.InvestCashHolding) accountSource).f97199b.f183148a.f183145a;
        }
        if (accountSource instanceof AccountSource.NonExistingCurrencyAccount) {
            return ((AccountSource.NonExistingCurrencyAccount) accountSource).f97210a.f306286a;
        }
        if (accountSource instanceof AccountSource.SpotMarginCollateralSource) {
            return b.c(((AccountSource.SpotMarginCollateralSource) accountSource).f97218b.f115083b);
        }
        if (accountSource instanceof AccountSource.FuturesCollateralSource) {
            return ((AccountSource.FuturesCollateralSource) accountSource).f97195a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getPocketId() {
        AccountSource accountSource = this.d;
        if (accountSource instanceof AccountSource.PocketSource) {
            return ((AccountSource.PocketSource) accountSource).f97213a.f163145a;
        }
        if (accountSource instanceof AccountSource.VaultSource) {
            return ((AccountSource.VaultSource) accountSource).f97223a.f();
        }
        if (accountSource instanceof AccountSource.JointVaultSource) {
            return ((AccountSource.JointVaultSource) accountSource).f97202a.f();
        }
        if (accountSource instanceof AccountSource.SavingsSource) {
            return ((AccountSource.SavingsSource) accountSource).f97216a.f86460a.f();
        }
        if (accountSource instanceof AccountSource.JointSavingsSource) {
            return ((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a.f();
        }
        if (accountSource instanceof AccountSource.CreditCardSource) {
            return ((AccountSource.CreditCardSource) accountSource).f97192a.f69793b;
        }
        if (accountSource instanceof AccountSource.RevPointsPocketSource) {
            return ((AccountSource.RevPointsPocketSource) accountSource).f97214a.f97784a;
        }
        if (accountSource instanceof AccountSource.JuniorPocketSource) {
            return ((AccountSource.JuniorPocketSource) accountSource).f97204b.f163145a;
        }
        if (accountSource instanceof AccountSource.JuniorVaultSource) {
            return ((AccountSource.JuniorVaultSource) accountSource).f97209b.f();
        }
        if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            return ((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a.f();
        }
        if (accountSource instanceof AccountSource.TeenPocketSource) {
            return ((AccountSource.TeenPocketSource) accountSource).f97220b.f163145a;
        }
        if (accountSource instanceof AccountSource.TeenVaultSource) {
            return ((AccountSource.TeenVaultSource) accountSource).f97222b.f();
        }
        if (accountSource instanceof AccountSource.InvestCashHolding) {
            return ((AccountSource.InvestCashHolding) accountSource).f97199b.f183150c;
        }
        if (accountSource instanceof AccountSource.NonExistingCurrencyAccount) {
            return ((AccountSource.NonExistingCurrencyAccount) accountSource).f97210a.f306286a;
        }
        if (accountSource instanceof AccountSource.SpotMarginCollateralSource) {
            return b.c(((AccountSource.SpotMarginCollateralSource) accountSource).f97218b.f115083b);
        }
        if (accountSource instanceof AccountSource.FuturesCollateralSource) {
            return ((AccountSource.FuturesCollateralSource) accountSource).f97195a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a10.b.c(this.f97226c, p.a.a(this.f97224a.hashCode() * 31, 31, this.f97225b), 31)) * 31;
        CountryProfile countryProfile = this.e;
        return iHashCode + (countryProfile == null ? 0 : countryProfile.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97224a.name());
        dest.writeParcelable(this.f97225b, i);
        dest.writeParcelable(this.f97226c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
