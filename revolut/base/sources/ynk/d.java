package ynk;

import cli.j;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f315496a;

    public d(Instant instant) {
        this.f315496a = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f315496a, ((d) obj2).f315496a);
    }

    public final int hashCode() {
        Instant instant = this.f315496a;
        if (instant == null) {
            return 0;
        }
        return instant.hashCode();
    }
}
