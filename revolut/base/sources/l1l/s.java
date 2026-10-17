package l1l;

import com.revolut.feature.payments.api.PaymentsToggles$NewTransferWalletLimits;
import com.revolut.feature.wallets.api.module.WalletLimit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements yqi.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f191596a;

    public s(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f191596a = featureToggleInteractor;
    }

    public static boolean b(WalletLimit.CounterLimit counterLimit, long j2) {
        return counterLimit == null || j2 + counterLimit.f94846c.f115082a <= counterLimit.e.f115082a;
    }

    @Override // yqi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yqi.d validate(r validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        hrf.i iVar = validationData.f191593a;
        if (iVar == null) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        long j2 = iVar.e;
        boolean zB = b(iVar.f154820a, j2);
        boolean zB2 = b(iVar.f154821b, j2);
        boolean zB3 = b(iVar.f154822c, j2);
        if (!zB || !zB2 || !zB3) {
            return (((jte.d) this.f191596a).c(PaymentsToggles$NewTransferWalletLimits.f79154c) && com.bumptech.glide.d.k(validationData.d)) ? new yqi.d(validationData, new i1l.k(iVar)) : new yqi.d(validationData, new i1l.l(iVar));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
