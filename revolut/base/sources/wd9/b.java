package wd9;

import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f296467a;

    public b(p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f296467a = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f296467a, ((b) obj2).f296467a);
    }

    public final int hashCode() {
        return this.f296467a.hashCode();
    }
}
