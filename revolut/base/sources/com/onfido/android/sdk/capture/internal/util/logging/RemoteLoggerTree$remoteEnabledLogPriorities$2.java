package com.onfido.android.sdk.capture.internal.util.logging;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.logging.RemoteLoggerTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RemoteLoggerTree$remoteEnabledLogPriorities$2 extends u implements Function0<Set<? extends Integer>> {
    final /* synthetic */ OnfidoRemoteConfig $remoteConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLoggerTree$remoteEnabledLogPriorities$2(OnfidoRemoteConfig onfidoRemoteConfig) {
        super(0);
        this.$remoteConfig = onfidoRemoteConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Set<Integer> invoke() {
        List<String> levels = this.$remoteConfig.getLoggerConfiguration().getLevels();
        RemoteLoggerTree.Companion companion = RemoteLoggerTree.Companion;
        ArrayList arrayList = new ArrayList(w.t(levels, 10));
        Iterator<T> it8 = levels.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(companion.mapToPriority((String) it8.next())));
        }
        return d0.i1(arrayList);
    }
}
