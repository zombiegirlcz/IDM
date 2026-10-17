package u40;

import kotlin.jvm.internal.Intrinsics;
import kse.e;
import org.joda.time.Instant;
import v30.z;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f276962a;

    public c(z detailedTicket) {
        Intrinsics.checkNotNullParameter(detailedTicket, "detailedTicket");
        this.f276962a = detailedTicket;
    }

    @Override // u40.d
    public final String a() {
        return this.f276962a.f285839a.f189436a;
    }

    @Override // u40.d
    public final Instant b() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.f276962a.f285839a.f189440h.getEpochSecond());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    @Override // u40.d
    public final boolean c() {
        return this.f276962a.f285839a.f189439g == e.ACTIVE;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f276962a, ((c) obj2).f276962a);
    }

    public final int hashCode() {
        return this.f276962a.hashCode();
    }
}
