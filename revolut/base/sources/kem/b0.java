package kem;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();
    public static final b0 d = new b0("HTTP", 3, 0);
    public static final b0 e = new b0("HTTP", 2, 0);
    public static final b0 f = new b0("HTTP", 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f183186g = new b0("HTTP", 1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f183187h = new b0("SPDY", 3, 0);
    public static final b0 i = new b0("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f183189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f183190c;

    public b0(String name, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f183188a = name;
        this.f183189b = i2;
        this.f183190c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f183188a.equals(b0Var.f183188a) && this.f183189b == b0Var.f183189b && this.f183190c == b0Var.f183190c;
    }

    public final int hashCode() {
        return (((this.f183188a.hashCode() * 31) + Integer.hashCode(this.f183189b)) * 31) + Integer.hashCode(this.f183190c);
    }

    public final String toString() {
        return this.f183188a + '/' + this.f183189b + CoreConstants.DOT + this.f183190c;
    }
}
