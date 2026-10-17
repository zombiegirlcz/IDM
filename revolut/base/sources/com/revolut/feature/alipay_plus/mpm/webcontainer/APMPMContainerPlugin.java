package com.revolut.feature.alipay_plus.mpm.webcontainer;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPlugin;", "", "<init>", "()V", "actions", "", "", "handleEvent", "", "event", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerEvent;", "interceptEvent", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class APMPMContainerPlugin {
    @NotNull
    public abstract Set<String> actions();

    public boolean handleEvent(@NotNull APMPMContainerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    public boolean interceptEvent(@NotNull APMPMContainerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }
}
