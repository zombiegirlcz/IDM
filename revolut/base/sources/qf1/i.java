package qf1;

import aii.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f245218a;

    public i(x request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f245218a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f245218a, ((i) obj2).f245218a);
    }

    public final int hashCode() {
        return this.f245218a.hashCode();
    }
}
