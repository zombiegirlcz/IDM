package qpf;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;
import tof.r9;
import wp5.y;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements zof.h {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f248393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f248394b;

    public l(com.revolut.domain.interactors.transactions.a transactionsInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f248393a = transactionsInteractor;
        this.f248394b = navigator;
    }

    public static FeatureCommand b(String str) {
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TransactionTroubleshooterDestination(new TransactionTroubleshooterDestination.TroubleshooterList(str, null, null, false, null, SyslogConstants.LOG_CLOCK)), false, (Integer) null, 0, 61));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterFeatureConfig.BridgeDestination d(tof.a3 r8, jf0.c r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qpf.l.d(tof.a3, jf0.c):com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterFeatureConfig$BridgeDestination");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 3, "troubleshooting") && Intrinsics.f(cVar.e(4), "status");
    }

    public final d0 c(String str) {
        d0 d0VarFirstOrError = zi0.c.q(zi0.c.J(com.revolut.domain.interactors.transactions.a.d(this.f248393a, new r9(str), null, null, null, null, 30)), f0.f322471a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qpf.k
            if (r0 == 0) goto L13
            r0 = r7
            qpf.k r0 = (qpf.k) r0
            int r1 = r0.f248392x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248392x = r1
            goto L1a
        L13:
            qpf.k r0 = new qpf.k
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248392x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            jf0.c r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            java.lang.String r7 = r6.e(r4)
            efm.d0 r7 = r5.c(r7)
            r0.u = r6
            r0.f248392x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = zhm.d0.d0(r7)
            tof.a3 r7 = (tof.a3) r7
            r0 = 0
            if (r7 != 0) goto L6d
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            java.lang.String r6 = r6.e(r4)
            com.revolut.retail.core.navigation.FeatureCommand r6 = b(r6)
            r1.<init>(r6)
            r7.<init>(r1, r0)
            return r7
        L6d:
            q06.h r1 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r2 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterFeatureConfig$BridgeDestination r6 = d(r7, r6)
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r6)
            r2.<init>(r6)
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qpf.l.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarC = c(deeplink.e(2));
        qmd.c cVar = new qmd.c(22, new i(this, deeplink, 0));
        d0VarC.getClass();
        ufm.i iVar = new ufm.i(d0VarC, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.I(iVar, h0.f322473a, new i(this, deeplink, 1));
    }
}
