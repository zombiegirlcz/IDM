package mhf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f205561a;

    public c(g params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f205561a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f205561a, ((c) obj2).f205561a);
    }

    public final int hashCode() {
        return this.f205561a.hashCode();
    }
}
