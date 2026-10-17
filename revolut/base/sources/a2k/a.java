package a2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f888a;

    public a(String paymentWidgetId) {
        Intrinsics.checkNotNullParameter(paymentWidgetId, "paymentWidgetId");
        this.f888a = paymentWidgetId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f888a, ((a) obj2).f888a);
    }

    public final int hashCode() {
        return this.f888a.hashCode();
    }
}
