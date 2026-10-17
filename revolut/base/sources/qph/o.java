package qph;

import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerFilterInfo f248413a;

    public o(ScreenerFilterInfo dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f248413a = dialog;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f248413a, ((o) obj2).f248413a);
    }

    public final int hashCode() {
        return this.f248413a.hashCode();
    }
}
