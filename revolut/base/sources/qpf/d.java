package qpf;

import com.revolut.feature.transfer.core.api.cancellation.TransferCancellationDestination;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterFeatureConfig;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterInputData;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import sri.m;
import tof.r9;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements zof.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f248383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2k.e f248384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f248385c;
    public final d3j.b d;

    public d(m navigator, x2k.e naviCommandProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(naviCommandProvider, "naviCommandProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.f248383a = navigator;
        this.f248384b = naviCommandProvider;
        this.f248385c = transactionsInteractor;
        this.d = beneficiaryInteractor;
    }

    public static boolean b(jf0.c cVar) {
        return Intrinsics.f(cVar.e(3), "troubleshooting") && Intrinsics.f(cVar.e(4), "not-arrived") && cVar.d.containsKey("mode");
    }

    public static FeatureCommand d(jf0.c cVar) {
        String strE = cVar.e(2);
        TransferTroubleshooterType.Bank bank = new TransferTroubleshooterType.Bank(com.revolut.feature.transfer.core.api.ui.throubleshooter.a.RECALL);
        HashMap map = cVar.d;
        String str = (String) map.get("source");
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        return new FeatureCommand(new TransferTroubleshooterFeatureConfig(new TransferTroubleshooterInputData(strE, bank, str, (String) map.get("eta"))));
    }

    public static FeatureCommand h(jf0.c cVar) {
        com.revolut.feature.transfer.core.api.ui.throubleshooter.a aVar;
        String strE = cVar.e(2);
        HashMap map = cVar.d;
        String str = (String) map.get("source");
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        String str2 = (String) map.get("eta");
        String str3 = (String) map.get("mode");
        if (str3 == null) {
            return null;
        }
        int iHashCode = str3.hashCode();
        if (iHashCode != -682587753) {
            if (iHashCode != -405687040) {
                if (iHashCode != -12092413 || !str3.equals("after_buffer")) {
                    return null;
                }
                aVar = com.revolut.feature.transfer.core.api.ui.throubleshooter.a.AFTER_BUFFER;
            } else {
                if (!str3.equals("before_buffer")) {
                    return null;
                }
                aVar = com.revolut.feature.transfer.core.api.ui.throubleshooter.a.BEFORE_BUFFER;
            }
        } else {
            if (!str3.equals("pending")) {
                return null;
            }
            aVar = com.revolut.feature.transfer.core.api.ui.throubleshooter.a.PENDING;
        }
        return new FeatureCommand(new TransferTroubleshooterFeatureConfig(new TransferTroubleshooterInputData(strE, new TransferTroubleshooterType.Bank(aVar), str, str2)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "bank-transfer");
    }

    public final z c(FeatureCommand featureCommand) {
        ufm.i iVar = new ufm.i(new ufm.c(new pu9.a(this, featureCommand, 8), 2), new qmd.c(18, new qpb.i(4)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        if (b(cVar)) {
            FeatureCommand featureCommandH = h(cVar);
            if (featureCommandH != null) {
                return new q06.h(new BridgeDestination(featureCommandH), null);
            }
        } else {
            if (Intrinsics.f(cVar.e(3), "recall")) {
                return new q06.h(new BridgeDestination(d(cVar)), null);
            }
            if (Intrinsics.f(cVar.e(3), "cancel")) {
                return new q06.h(new BridgeDestination(vhi.c.c(new TransferCancellationDestination(cVar.e(2)), yhi.b.POPUP, 3334445, false, 8)), null);
            }
            if (Intrinsics.f(cVar.e(3), "resend")) {
                return g(cVar, (gim.c) continuation);
            }
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (b(deeplink)) {
            FeatureCommand featureCommandH = h(deeplink);
            if (featureCommandH != null) {
                return c(featureCommandH);
            }
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (Intrinsics.f(deeplink.e(3), "recall")) {
            return c(d(deeplink));
        }
        if (Intrinsics.f(deeplink.e(3), "cancel")) {
            return c(vhi.c.c(new TransferCancellationDestination(deeplink.e(2)), yhi.b.POPUP, 3334445, false, 8));
        }
        if (!Intrinsics.f(deeplink.e(3), "resend")) {
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        ufm.i iVar = new ufm.i(com.revolut.domain.interactors.transactions.a.b(this.f248385c, new r9(deeplink.e(2)), null, null, null, null, 30), new qmd.c(19, new qpb.i(5)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(iVar, new qmd.c(17, new a(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(jf0.c r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qpf.d.g(jf0.c, gim.c):java.lang.Object");
    }
}
