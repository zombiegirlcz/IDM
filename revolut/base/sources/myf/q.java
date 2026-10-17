package myf;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Duration f210488a;

    public q(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f210488a = duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f210488a, ((q) obj2).f210488a);
    }

    public final int hashCode() {
        return this.f210488a.hashCode();
    }
}
