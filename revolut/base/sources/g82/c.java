package g82;

import com.revolut.feature.apm.core.ui.api.navigation.qr.QrFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrFlowInputData f141243a;

    public c(QrFlowInputData config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f141243a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f141243a, ((c) obj2).f141243a);
    }

    public final int hashCode() {
        return this.f141243a.hashCode();
    }
}
