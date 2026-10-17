package kj0;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Duration f184258c;

    public b(int i, int i2, Duration openDuration) {
        Intrinsics.checkNotNullParameter(openDuration, "openDuration");
        this.f184256a = i;
        this.f184257b = i2;
        this.f184258c = openDuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f184256a == bVar.f184256a && this.f184257b == bVar.f184257b && Intrinsics.f(this.f184258c, bVar.f184258c);
    }

    public final int hashCode() {
        return this.f184258c.hashCode() + j6.a.b(this.f184257b, Integer.hashCode(this.f184256a) * 31, 31);
    }
}
