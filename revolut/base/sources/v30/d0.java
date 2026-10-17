package v30;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f285763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f285764c;

    public d0(String title, Instant timestamp, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.f285762a = title;
        this.f285763b = timestamp;
        this.f285764c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f285762a, d0Var.f285762a) && Intrinsics.f(this.f285763b, d0Var.f285763b) && this.f285764c == d0Var.f285764c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f285764c) + t61.a.g(this.f285763b, this.f285762a.hashCode() * 31, 31);
    }
}
