package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272768a;

    public g7(Set apmTypes) {
        Intrinsics.checkNotNullParameter(apmTypes, "apmTypes");
        this.f272768a = apmTypes;
    }

    public final Set a() {
        return this.f272768a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g7) && Intrinsics.f(this.f272768a, ((g7) obj2).f272768a);
    }

    public final int hashCode() {
        return this.f272768a.hashCode();
    }
}
