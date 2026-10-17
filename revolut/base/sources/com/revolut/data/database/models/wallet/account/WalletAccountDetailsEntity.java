package com.revolut.data.database.models.wallet.account;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;", "", "id", "", "currency", "type", "Lcom/revolut/data/database/models/wallet/account/AccountTypeEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/wallet/account/AccountTypeEntity;)V", "getId", "()Ljava/lang/String;", "getCurrency", "getType", "()Lcom/revolut/data/database/models/wallet/account/AccountTypeEntity;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WalletAccountDetailsEntity {

    @b("walletAccountCurrency")
    @NotNull
    private final String currency;

    @b("walletAccountId")
    @NotNull
    private final String id;

    @b("walletAccountType")
    @NotNull
    private final AccountTypeEntity type;

    public WalletAccountDetailsEntity(@NotNull String id10, @NotNull String currency, @NotNull AccountTypeEntity type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id10;
        this.currency = currency;
        this.type = type;
    }

    public static /* synthetic */ WalletAccountDetailsEntity copy$default(WalletAccountDetailsEntity walletAccountDetailsEntity, String str, String str2, AccountTypeEntity accountTypeEntity, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = walletAccountDetailsEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = walletAccountDetailsEntity.currency;
        }
        if ((i & 4) != 0) {
            accountTypeEntity = walletAccountDetailsEntity.type;
        }
        return walletAccountDetailsEntity.copy(str, str2, accountTypeEntity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AccountTypeEntity getType() {
        return this.type;
    }

    @NotNull
    public final WalletAccountDetailsEntity copy(@NotNull String id10, @NotNull String currency, @NotNull AccountTypeEntity type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        return new WalletAccountDetailsEntity(id10, currency, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletAccountDetailsEntity)) {
            return false;
        }
        WalletAccountDetailsEntity walletAccountDetailsEntity = (WalletAccountDetailsEntity) other;
        return Intrinsics.f(this.id, walletAccountDetailsEntity.id) && Intrinsics.f(this.currency, walletAccountDetailsEntity.currency) && this.type == walletAccountDetailsEntity.type;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final AccountTypeEntity getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + a.c(this.id.hashCode() * 31, 31, this.currency);
    }
}
