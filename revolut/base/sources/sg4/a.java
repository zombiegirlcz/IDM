package sg4;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import foh.i;
import grl.m2;
import grl.r2;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    public static final C1458a Companion = new C1458a();

    /* JADX INFO: renamed from: sg4.a$a, reason: collision with other inner class name */
    public static final class C1458a {
        private C1458a() {
        }
    }

    public static xfa.a a(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        String strName;
        String str;
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        CreditApplicationCommonContext creditApplicationCommonContextN = t1.N(pluginConfiguration);
        Pair pair = new Pair("pluginName", creditApplicationCommonContextN.getPluginName());
        Pair pair2 = new Pair("pluginState", creditApplicationCommonContextN.getPluginState());
        Pair pair3 = new Pair("applicationId", creditApplicationCommonContextN.getApplicationId());
        m2 productType = creditApplicationCommonContextN.getProductType();
        if (productType != null) {
            strName = productType.name();
            str = null;
        } else {
            strName = null;
            str = null;
        }
        Pair pair4 = new Pair("productType", strName);
        r2 entryPointType = creditApplicationCommonContextN.getEntryPointType();
        return new xfa.a(new LinkedHashMap(i.q(pair, pair2, pair3, pair4, new Pair("entryPointType", entryPointType != null ? entryPointType.name() : str), new Pair("cancellable", String.valueOf(creditApplicationCommonContextN.getCancellable())), new Pair("country", creditApplicationCommonContextN.getCountry()))));
    }
}
