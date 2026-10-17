package k59;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f181467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f181468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f181469c;
    public final a d;

    public b(a limitLowerBound, a limitUpperBound, a stopLowerBound, a stopUpperBound) {
        Intrinsics.checkNotNullParameter(limitLowerBound, "limitLowerBound");
        Intrinsics.checkNotNullParameter(limitUpperBound, "limitUpperBound");
        Intrinsics.checkNotNullParameter(stopLowerBound, "stopLowerBound");
        Intrinsics.checkNotNullParameter(stopUpperBound, "stopUpperBound");
        this.f181467a = limitLowerBound;
        this.f181468b = limitUpperBound;
        this.f181469c = stopLowerBound;
        this.d = stopUpperBound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f181467a, bVar.f181467a) && Intrinsics.f(this.f181468b, bVar.f181468b) && Intrinsics.f(this.f181469c, bVar.f181469c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f181469c.hashCode() + ((this.f181468b.hashCode() + (this.f181467a.hashCode() * 31)) * 31)) * 31);
    }
}
