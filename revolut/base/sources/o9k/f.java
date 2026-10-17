package o9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f223307a;

    public f(qua.p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f223307a = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f223307a, ((f) obj2).f223307a);
    }

    public final int hashCode() {
        return this.f223307a.hashCode();
    }
}
