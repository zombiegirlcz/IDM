package zzg;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f326734a;

    public e(BigDecimal bigDecimal) {
        this.f326734a = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f326734a, ((e) obj2).f326734a);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f326734a;
        if (bigDecimal == null) {
            return 0;
        }
        return bigDecimal.hashCode();
    }
}
