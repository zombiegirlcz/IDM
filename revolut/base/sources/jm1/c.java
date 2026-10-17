package jm1;

import kotlin.jvm.internal.Intrinsics;
import xo1.g;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f175916a;

    public c(g paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f175916a = paymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f175916a == ((c) obj2).f175916a;
    }

    public final int hashCode() {
        return this.f175916a.hashCode();
    }
}
