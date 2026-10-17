package mz3;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i1 {
    public static SpinnerConfiguration.Popup a(i1 i1Var, hs3.u1 metadata, boolean z, ks3.b closeIfPluginNameChangesFrom) {
        ks3.a closeIfPluginStateChangesFrom = ks3.a.IN_PROGRESS;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(closeIfPluginNameChangesFrom, "closeIfPluginNameChangesFrom");
        Intrinsics.checkNotNullParameter(closeIfPluginStateChangesFrom, "closeIfPluginStateChangesFrom");
        boolean z3 = metadata.f == hs3.v1.SPINNER_AND_POPUP || z;
        List list = metadata.f154955c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(com.revolut.feature.credit.application.plugins.api.models.config.c.a((hs3.s1) it8.next()));
        }
        SpinnerConfiguration.Content.Dynamic dynamic = new SpinnerConfiguration.Content.Dynamic(metadata.f154954b, arrayList);
        int i = z3 ? metadata.f154953a : 0;
        ju3.g gVar = z ? ju3.g.STATUS_DIALOG : ju3.g.BOTTOM_SHEET;
        long j2 = metadata.f154954b;
        long jMax = Math.max(21000L, ((long) i) * j2);
        SpinnerConfiguration.Mode.Limited.TerminationCondition.PluginStateChangedFrom pluginStateChangedFrom = new SpinnerConfiguration.Mode.Limited.TerminationCondition.PluginStateChangedFrom(closeIfPluginNameChangesFrom, closeIfPluginStateChangesFrom);
        WaitingPopupScreenConfig.INSTANCE.getClass();
        return new SpinnerConfiguration.Popup(dynamic, new SpinnerConfiguration.Mode.Limited(i, j2, jMax, pluginStateChangedFrom, WaitingPopupScreenConfig.Companion.a(metadata), gVar));
    }
}
