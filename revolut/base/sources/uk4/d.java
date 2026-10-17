package uk4;

import cli.j;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3ScreenContract$SelectAutopayConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectAutopayMethodV3ScreenContract$SelectAutopayConfig f280676a;

    public d(SelectAutopayMethodV3ScreenContract$SelectAutopayConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f280676a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f280676a, ((d) obj2).f280676a);
    }

    public final int hashCode() {
        return this.f280676a.hashCode();
    }
}
