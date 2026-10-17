package hoc;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdh.a f154274a;

    public f(pdh.a performancePoint) {
        Intrinsics.checkNotNullParameter(performancePoint, "performancePoint");
        this.f154274a = performancePoint;
    }

    @Override // hoc.h
    public final BigDecimal a() {
        return null;
    }

    @Override // hoc.h
    public final long b() {
        return this.f154274a.f235227a.getMillis();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f154274a, ((f) obj2).f154274a);
    }

    @Override // hoc.h
    public final BigDecimal getValue() {
        return this.f154274a.f235229c;
    }

    public final int hashCode() {
        return this.f154274a.hashCode();
    }
}
