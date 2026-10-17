package rjf;

import android.content.Context;
import bnf.r;
import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.feature.transactions.api.navigation.TransactionMerchantFeedbackFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import thf.m;
import tof.a3;
import tof.j5;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f254673a;

    public g(m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f254673a = transactionTextResourcesMapper;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TransactionMerchantFeedbackFeatureConfig;
    }

    @Override // uri.a
    public final void c(sri.m navigator, Context context, FeatureConfig featureConfig) {
        TransactionMerchantFeedbackFeatureConfig config = (TransactionMerchantFeedbackFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        BackendFlowInput.Companion companion = BackendFlowInput.INSTANCE;
        a3 a3Var = config.f92002a;
        Pair pair = new Pair("transactionId", a3Var.f272581b);
        j5 j5Var = a3Var.A.f272779a;
        String str = j5Var.f272849b;
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("merchantId", str);
        r rVar = (r) this.f254673a;
        Pair pair3 = new Pair("shownName", rVar.g(a3Var));
        String str2 = j5Var.f272854l;
        if (str2 == null) {
            str2 = "";
        }
        navigator.c(new FeatureCommand(new KompotOverlayFeatureConfig(new BackendFlowDestination(BackendFlowInput.Companion.a(companion, "cards-merchant-in-app-feedback", r0.k(pair, pair2, pair3, new Pair("shownLogo", str2), new Pair("shownAddress", rVar.f(a3Var)), new Pair("createdDate", String.valueOf(a3Var.f272591g.getMillis()))), null, 4)), yhi.b.SOLID, (Integer) null, 12)));
    }
}
