package uc3;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f278975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f278976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f278977c;

    public b(dj0.d limit, dj0.d usage, DateTime resetDate) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(usage, "usage");
        Intrinsics.checkNotNullParameter(resetDate, "resetDate");
        this.f278975a = limit;
        this.f278976b = usage;
        this.f278977c = resetDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f278975a, bVar.f278975a) && Intrinsics.f(this.f278976b, bVar.f278976b) && Intrinsics.f(this.f278977c, bVar.f278977c);
    }

    public final int hashCode() {
        return this.f278977c.hashCode() + v7.c(this.f278975a.hashCode() * 31, 31, this.f278976b);
    }
}
