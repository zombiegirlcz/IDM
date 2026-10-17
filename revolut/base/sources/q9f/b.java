package q9f;

import com.revolut.feature.trading.transfer.investments.api.navigation.TransferOutFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import u8f.h;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements v8f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f243889a;

    public b(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f243889a = navigator;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TransferOutFeatureConfig.TransferOut b(jf0.c cVar) {
        h hVar;
        String strE = cVar.e(3);
        switch (strE.hashCode()) {
            case -663297863:
                if (strE.equals("ACAT_FULL")) {
                    hVar = h.ACAT_FULL;
                    return new TransferOutFeatureConfig.TransferOut(hVar, null);
                }
                break;
            case 67973:
                if (strE.equals("DRS")) {
                    hVar = h.DRS;
                    return new TransferOutFeatureConfig.TransferOut(hVar, null);
                }
                break;
            case 68019:
                if (strE.equals("DTC")) {
                    hVar = h.DTC;
                    return new TransferOutFeatureConfig.TransferOut(hVar, null);
                }
                break;
            case 69799:
                if (strE.equals("FOP")) {
                    hVar = h.FOP;
                    return new TransferOutFeatureConfig.TransferOut(hVar, null);
                }
                break;
            case 556263159:
                if (strE.equals("ACAT_PARTIAL")) {
                    hVar = h.ACAT_PARTIAL;
                    return new TransferOutFeatureConfig.TransferOut(hVar, null);
                }
                break;
        }
        throw new IllegalStateException("Unknown transfer type");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "transfer-out");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(new FeatureCommand(b(cVar))), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 16), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
