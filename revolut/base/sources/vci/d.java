package vci;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yci.a f287758a;

    public d(yci.a frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f287758a = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f287758a == ((d) obj2).f287758a;
    }

    public final int hashCode() {
        return this.f287758a.hashCode();
    }
}
