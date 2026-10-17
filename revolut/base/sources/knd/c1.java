package knd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186059a;

    public c1(List newIntervals) {
        Intrinsics.checkNotNullParameter(newIntervals, "newIntervals");
        this.f186059a = newIntervals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f186059a, ((c1) obj2).f186059a);
    }

    public final int hashCode() {
        return this.f186059a.hashCode();
    }
}
