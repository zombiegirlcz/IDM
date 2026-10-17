package k6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f181699a;

    public b(f recurringPaymentClickData) {
        Intrinsics.checkNotNullParameter(recurringPaymentClickData, "recurringPaymentClickData");
        this.f181699a = recurringPaymentClickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f181699a, ((b) obj2).f181699a);
    }

    public final int hashCode() {
        return this.f181699a.hashCode();
    }
}
