package tgb;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f271140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f271141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f271142c;

    public h(boolean z, Instant instant, f fVar) {
        this.f271140a = z;
        this.f271141b = instant;
        this.f271142c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f271140a == hVar.f271140a && Intrinsics.f(this.f271141b, hVar.f271141b) && Intrinsics.f(this.f271142c, hVar.f271142c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f271140a) * 31;
        Instant instant = this.f271141b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        f fVar = this.f271142c;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }
}
