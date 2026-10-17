package ztl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f325183a;

    public a(BigDecimal initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        this.f325183a = initialValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f325183a, ((a) obj2).f325183a);
    }

    public final int hashCode() {
        return this.f325183a.hashCode();
    }
}
