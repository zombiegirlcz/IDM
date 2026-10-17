package xr6;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f308259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx7.i f308260b;

    public g(LocalDateTime date, hx7.i event) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f308259a = date;
        this.f308260b = event;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f308259a, gVar.f308259a) && Intrinsics.f(this.f308260b, gVar.f308260b);
    }

    public final int hashCode() {
        return this.f308260b.hashCode() + (this.f308259a.hashCode() * 31);
    }
}
