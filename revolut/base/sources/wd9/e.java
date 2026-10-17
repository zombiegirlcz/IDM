package wd9;

import com.revolut.feature.orders.ui.api.OrdersWidgetContract$Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrdersWidgetContract$Config f296468a;

    public e(OrdersWidgetContract$Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f296468a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f296468a, ((e) obj2).f296468a);
    }

    public final int hashCode() {
        return this.f296468a.hashCode();
    }
}
