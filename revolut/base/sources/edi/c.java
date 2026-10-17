package edi;

import aii.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f125026a;

    public c(List thresholds) {
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        this.f125026a = thresholds;
    }

    public final List b() {
        return this.f125026a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f125026a, ((c) obj2).f125026a);
    }

    public final int hashCode() {
        return this.f125026a.hashCode();
    }
}
