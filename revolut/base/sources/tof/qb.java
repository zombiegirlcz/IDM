package tof;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class qb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273015a;

    public qb(List states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f273015a = states;
    }

    public final List a() {
        return this.f273015a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof qb) && Intrinsics.f(this.f273015a, ((qb) obj2).f273015a);
    }

    public final int hashCode() {
        return this.f273015a.hashCode();
    }
}
