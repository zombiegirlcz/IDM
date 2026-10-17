package o9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f223303a;

    public e(qua.p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f223303a = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f223303a, ((e) obj2).f223303a);
    }

    public final int hashCode() {
        return this.f223303a.hashCode();
    }
}
