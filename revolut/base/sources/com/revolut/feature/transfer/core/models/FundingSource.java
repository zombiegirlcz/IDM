package com.revolut.feature.transfer.core.models;

import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import dj0.d;
import kotlin.Metadata;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/core/models/FundingSource;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/transfer/core/models/DeFiBalanceSource;", "Lcom/revolut/feature/transfer/core/models/PocketSource;", "Lcom/revolut/feature/transfer/core/models/SavingsAccount;", "Lcom/revolut/feature/transfer/core/models/WealthPortfolio;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FundingSource implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f92241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f92242c;

    public FundingSource(AccountId accountId, String str, b bVar) {
        this.f92240a = str;
        this.f92241b = bVar;
        this.f92242c = accountId;
    }

    public abstract CountryProfile a();

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getF92240a() {
        return this.f92240a;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public AccountId getF92242c() {
        return this.f92242c;
    }

    public abstract d getBalance();
}
