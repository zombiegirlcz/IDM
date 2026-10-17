package tof;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f273205a;

    public z8(Collection currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f273205a = currencies;
    }

    public final Collection a() {
        return this.f273205a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z8) && Intrinsics.f(this.f273205a, ((z8) obj2).f273205a);
    }

    public final int hashCode() {
        return this.f273205a.hashCode();
    }
}
