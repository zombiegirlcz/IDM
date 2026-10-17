package xpa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307921a;

    public e(String paymentWidgetId) {
        Intrinsics.checkNotNullParameter(paymentWidgetId, "paymentWidgetId");
        this.f307921a = paymentWidgetId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f307921a, ((e) obj2).f307921a);
    }

    public final int hashCode() {
        return this.f307921a.hashCode();
    }
}
