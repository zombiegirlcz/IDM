package myf;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Duration f210489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Duration f210490b;

    public r(Duration fromDuration, Duration toDuration) {
        Intrinsics.checkNotNullParameter(fromDuration, "fromDuration");
        Intrinsics.checkNotNullParameter(toDuration, "toDuration");
        this.f210489a = fromDuration;
        this.f210490b = toDuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f210489a, rVar.f210489a) && Intrinsics.f(this.f210490b, rVar.f210490b);
    }

    public final int hashCode() {
        return this.f210490b.hashCode() + (this.f210489a.hashCode() * 31);
    }
}
