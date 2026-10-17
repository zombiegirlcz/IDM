package aw0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10648c;

    public z8(long j2, long j3, ArrayList candles) {
        Intrinsics.checkNotNullParameter(candles, "candles");
        this.f10646a = j2;
        this.f10647b = j3;
        this.f10648c = candles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj2;
        return this.f10646a == z8Var.f10646a && this.f10647b == z8Var.f10647b && this.f10648c.equals(z8Var.f10648c);
    }

    public final int hashCode() {
        return this.f10648c.hashCode() + a0.d.c(Long.hashCode(this.f10646a) * 31, 31, this.f10647b);
    }
}
