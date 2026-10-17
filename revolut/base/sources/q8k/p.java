package q8k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243156a;

    public p(String paymentWidgetId) {
        Intrinsics.checkNotNullParameter(paymentWidgetId, "paymentWidgetId");
        this.f243156a = paymentWidgetId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f243156a, ((p) obj2).f243156a);
    }

    public final int hashCode() {
        return this.f243156a.hashCode();
    }
}
