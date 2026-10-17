package jkg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f175163a;

    public b(f params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f175163a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f175163a, ((b) obj2).f175163a);
    }

    public final int hashCode() {
        return this.f175163a.hashCode();
    }
}
