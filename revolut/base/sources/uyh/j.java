package uyh;

import com.revolut.feature.recurring_buys.schedule.api.models.RecurringBuySettings;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoOrderDraft f284369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kyh.h f284370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f284371c;
    public final boolean d;
    public final RecurringBuySettings e;

    public j(CryptoOrderDraft cryptoOrderDraft, kyh.h cryptoOrderConfig, StakingPocket stakingPocket, boolean z, RecurringBuySettings recurringBuySettings) {
        Intrinsics.checkNotNullParameter(cryptoOrderConfig, "cryptoOrderConfig");
        Intrinsics.checkNotNullParameter(recurringBuySettings, "recurringBuySettings");
        this.f284369a = cryptoOrderDraft;
        this.f284370b = cryptoOrderConfig;
        this.f284371c = stakingPocket;
        this.d = z;
        this.e = recurringBuySettings;
    }

    public static j a(j jVar, CryptoOrderDraft cryptoOrderDraft, StakingPocket stakingPocket, boolean z, RecurringBuySettings recurringBuySettings, int i) {
        if ((i & 1) != 0) {
            cryptoOrderDraft = jVar.f284369a;
        }
        CryptoOrderDraft cryptoOrderDraft2 = cryptoOrderDraft;
        kyh.h cryptoOrderConfig = jVar.f284370b;
        if ((i & 4) != 0) {
            stakingPocket = jVar.f284371c;
        }
        StakingPocket stakingPocket2 = stakingPocket;
        if ((i & 8) != 0) {
            z = jVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            recurringBuySettings = jVar.e;
        }
        RecurringBuySettings recurringBuySettings2 = recurringBuySettings;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(cryptoOrderConfig, "cryptoOrderConfig");
        Intrinsics.checkNotNullParameter(recurringBuySettings2, "recurringBuySettings");
        return new j(cryptoOrderDraft2, cryptoOrderConfig, stakingPocket2, z3, recurringBuySettings2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f284369a, jVar.f284369a) && Intrinsics.f(this.f284370b, jVar.f284370b) && Intrinsics.f(this.f284371c, jVar.f284371c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        CryptoOrderDraft cryptoOrderDraft = this.f284369a;
        int iHashCode = (this.f284370b.hashCode() + ((cryptoOrderDraft == null ? 0 : cryptoOrderDraft.hashCode()) * 31)) * 31;
        StakingPocket stakingPocket = this.f284371c;
        return this.e.hashCode() + j6.a.c((iHashCode + (stakingPocket != null ? stakingPocket.hashCode() : 0)) * 31, 31, this.d);
    }
}
