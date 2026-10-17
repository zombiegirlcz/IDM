package jik;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f174593a;

    public b(Period duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f174593a = duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f174593a, ((b) obj2).f174593a);
    }

    @Override // jik.c
    public final Period getDuration() {
        return this.f174593a;
    }

    public final int hashCode() {
        return this.f174593a.hashCode();
    }
}
