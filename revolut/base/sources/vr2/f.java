package vr2;

import com.revolut.feature.blocked_merchants.api.model.BlockMerchantsTabConfig;
import com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantTransactionFlowDestination;
import com.revolut.feature.blocked_merchants.api.navigation.BlockedMerchantsListFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import sri.m;
import ufm.i;
import vq5.x;
import wp5.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements lr2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f291468a;

    public f(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f291468a = navigator;
    }

    public static InternalDestination b(jf0.c cVar) {
        String strE = cVar.e(1);
        if (Intrinsics.f(strE, "blocked-merchants")) {
            return new BlockedMerchantsListFlowDestination(new BlockMerchantsTabConfig.All((String) cVar.d.get("blockOwnerId")));
        }
        if (Intrinsics.f(strE, "block-merchant")) {
            return new BlockMerchantTransactionFlowDestination(cVar.e(2));
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "blocked-merchants") || Intrinsics.f(cVar.e(1), "block-merchant");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        InternalDestination internalDestinationB = b(cVar);
        if (internalDestinationB == null) {
            return null;
        }
        return new h(internalDestinationB, null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(1);
        FeatureCommand featureCommand = null;
        if (Intrinsics.f(strE, "blocked-merchants")) {
            InternalDestination internalDestinationB = b(deeplink);
            if (internalDestinationB != null) {
                featureCommand = u0.e(internalDestinationB);
            }
        } else if (Intrinsics.f(strE, "block-merchant")) {
            InternalDestination internalDestinationB2 = b(deeplink);
            if (internalDestinationB2 != null) {
                featureCommand = new FeatureCommand(new KompotOverlayFeatureConfig(internalDestinationB2, yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
            }
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.c cVar = rd0.c.ERROR;
            String strE2 = deeplink.e(1);
            String strE3 = deeplink.e(2);
            String str = deeplink.f173629c;
            HashMap map = deeplink.d;
            StringBuilder sbM = v0.a.m("deeplink not handled base=", strE2, ", second=", strE3, ", uri=");
            sbM.append(str);
            sbM.append(", parameters=");
            sbM.append(map);
            rd0.d.a(cVar, "BlockedMerchantsDeeplinkActionPerformerImpl", sbM.toString(), null, h0Var);
        }
        if (featureCommand == null) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        i iVar = new i(d0.m(featureCommand), new vpg.b(23, new x(this, 1)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
