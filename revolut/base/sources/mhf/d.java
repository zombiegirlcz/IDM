package mhf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f205562a;

    public d(h params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f205562a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f205562a, ((d) obj2).f205562a);
    }

    public final int hashCode() {
        return this.f205562a.hashCode();
    }
}
