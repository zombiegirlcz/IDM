package k52;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData;
import ji1.m;
import k3k.k;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends h implements b {
    public final ApmTransferWrapperNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lx1.d f181381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f181382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f181383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f181384s;

    public e(ApmTransferWrapperNavigation$InputData inputData, lx1.d apmContactsInteractor, gte.a featureToggleInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f181381p = apmContactsInteractor;
        this.f181382q = featureToggleInteractor;
        this.f181383r = idempotencyKeyHolder;
        this.f181384s = d8l.d.a(this, new k(this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(k52.e r29, com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData.AcceptMoneyRequest r30, gim.c r31) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k52.e.I2(k52.e, com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData$AcceptMoneyRequest, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        this.f181383r.a("payments_apm_money_request");
        l2(new m(this, null, 28), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f181384s;
    }
}
