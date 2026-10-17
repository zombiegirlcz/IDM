package mgb;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f205230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f205231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f205232c;

    public d(boolean z, Instant instant, Instant instant2) {
        this.f205230a = z;
        this.f205231b = instant;
        this.f205232c = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f205230a == dVar.f205230a && Intrinsics.f(this.f205231b, dVar.f205231b) && Intrinsics.f(this.f205232c, dVar.f205232c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f205230a) * 31;
        Instant instant = this.f205231b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f205232c;
        return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
    }
}
