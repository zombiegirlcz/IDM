package hye;

import com.revolut.feature.wallets.api.module.WalletLimit;
import kotlin.jvm.internal.Intrinsics;
import qb3.u;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f156869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f156870b;

    public n(u cashTopUpHintMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cashTopUpHintMapper, "cashTopUpHintMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f156869a = cashTopUpHintMapper;
        this.f156870b = featureToggleInteractor;
    }

    public static boolean a(WalletLimit.CounterLimit counterLimit, long j2) {
        return counterLimit != null && j2 + counterLimit.f94846c.f115082a > counterLimit.e.f115082a;
    }
}
