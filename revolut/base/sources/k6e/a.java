package k6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f181698a;

    public a(f recurringPaymentClickData) {
        Intrinsics.checkNotNullParameter(recurringPaymentClickData, "recurringPaymentClickData");
        this.f181698a = recurringPaymentClickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f181698a, ((a) obj2).f181698a);
    }

    public final int hashCode() {
        return this.f181698a.hashCode();
    }
}
