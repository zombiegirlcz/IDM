package qpf;

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
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements zof.e {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f248386a;

    public f(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f248386a = navigator;
    }

    public static FeatureCommand c(jf0.c cVar) {
        String strE = cVar.e(2);
        TransferTroubleshooterType.Card card = new TransferTroubleshooterType.Card(com.revolut.feature.transfer.core.api.ui.throubleshooter.b.RECALL);
        HashMap map = cVar.d;
        String str = (String) map.get("source");
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        return new FeatureCommand(new TransferTroubleshooterFeatureConfig(new TransferTroubleshooterInputData(strE, card, str, (String) map.get("eta"))));
    }

    public static FeatureCommand d(jf0.c cVar) {
        String strE = cVar.e(2);
        TransferTroubleshooterType.Card card = new TransferTroubleshooterType.Card(com.revolut.feature.transfer.core.api.ui.throubleshooter.b.TROUBLESHOOTER);
        HashMap map = cVar.d;
        String str = (String) map.get("source");
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        return new FeatureCommand(new TransferTroubleshooterFeatureConfig(new TransferTroubleshooterInputData(strE, card, str, (String) map.get("eta"))));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "card-transfer");
    }

    public final z b(FeatureCommand featureCommand) {
        ufm.i iVar = new ufm.i(new ufm.c(new pu9.a(this, featureCommand, 9), 2), new qmd.c(21, new qpb.i(6)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        if (Intrinsics.f(cVar.e(3), "troubleshooting") && Intrinsics.f(cVar.e(4), "not-arrived")) {
            return new q06.h(new BridgeDestination(d(cVar)), null);
        }
        if (Intrinsics.f(cVar.e(3), "recall")) {
            return new q06.h(new BridgeDestination(c(cVar)), null);
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        if (y.D(cVar, "deeplink", 3, "troubleshooting") && Intrinsics.f(cVar.e(4), "not-arrived")) {
            return b(d(cVar));
        }
        if (Intrinsics.f(cVar.e(3), "recall")) {
            return b(c(cVar));
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
