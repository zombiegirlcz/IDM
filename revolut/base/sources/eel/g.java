package eel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f125231a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof g) {
            return Intrinsics.f(this.f125231a, ((g) obj2).f125231a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f125231a.hashCode();
    }

    public final String toString() {
        return "Percentage(value=" + this.f125231a + ")";
    }
}
