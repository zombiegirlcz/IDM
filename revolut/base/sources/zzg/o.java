package zzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326747a;

    public o(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f326747a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f326747a, ((o) obj2).f326747a);
    }

    public final int hashCode() {
        return this.f326747a.hashCode();
    }
}
