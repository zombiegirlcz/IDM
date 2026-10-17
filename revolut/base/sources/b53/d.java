package b53;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12425a;

    public d(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f12425a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f12425a, ((d) obj2).f12425a);
    }

    public final int hashCode() {
        return this.f12425a.hashCode();
    }
}
