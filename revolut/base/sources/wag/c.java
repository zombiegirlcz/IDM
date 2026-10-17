package wag;

import beg.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f295939a;

    public c(i output) {
        Intrinsics.checkNotNullParameter(output, "output");
        this.f295939a = output;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f295939a, ((c) obj2).f295939a);
    }

    public final int hashCode() {
        return this.f295939a.hashCode();
    }
}
