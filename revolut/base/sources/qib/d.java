package qib;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f246680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f246681b;

    public d(LocalDateTime date, c status) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f246680a = date;
        this.f246681b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f246680a, dVar.f246680a) && this.f246681b == dVar.f246681b;
    }

    public final int hashCode() {
        return this.f246681b.hashCode() + (this.f246680a.hashCode() * 31);
    }
}
