package ubi;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbi.a f278903a;

    public g(tbi.a occupation) {
        Intrinsics.checkNotNullParameter(occupation, "occupation");
        this.f278903a = occupation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f278903a == ((g) obj2).f278903a;
    }

    public final int hashCode() {
        return this.f278903a.hashCode();
    }
}
