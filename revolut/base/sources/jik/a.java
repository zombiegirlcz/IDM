package jik;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f174591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f174592b;

    public a(Period duration, double d) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f174591a = duration;
        this.f174592b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f174591a, aVar.f174591a) && Double.compare(this.f174592b, aVar.f174592b) == 0;
    }

    @Override // jik.c
    public final Period getDuration() {
        return this.f174591a;
    }

    public final int hashCode() {
        return Double.hashCode(this.f174592b) + (this.f174591a.hashCode() * 31);
    }
}
