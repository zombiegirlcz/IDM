package mz3;

import com.revolut.feature.credit.application.plugins.api.models.config.CreditOperationStatusCheckConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class n1 {
    public static final SpinnerConfiguration.FullScreen a(CreditOperationStatusCheckConfig checkConfig, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(checkConfig, "checkConfig");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        List<CreditOperationStatusCheckConfig.SpinnerContent> list = checkConfig.f66353a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (CreditOperationStatusCheckConfig.SpinnerContent spinnerContent : list) {
            arrayList.add(new SpinnerConfiguration.Content.SpinnerContent(spinnerContent.f66356a, spinnerContent.f66357b));
        }
        SpinnerConfiguration.Content.Dynamic dynamic = new SpinnerConfiguration.Content.Dynamic(checkConfig.f66354b, arrayList);
        int i = checkConfig.f66355c;
        long j2 = checkConfig.d;
        long j3 = ((long) i) * j2;
        ks3.b bVar = pluginConfiguration.f66894g;
        List list2 = checkConfig.f;
        if (list2 == null) {
            list2 = zhm.f0.f322471a;
        }
        return new SpinnerConfiguration.FullScreen(dynamic, new SpinnerConfiguration.Mode.Limited(i, j2, j3, new SpinnerConfiguration.Mode.Limited.TerminationCondition.StatusStateChanged(bVar, list2), checkConfig.e, ju3.g.STATUS_DIALOG));
    }
}
