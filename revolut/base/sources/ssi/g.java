package ssi;

import kotlin.jvm.internal.Intrinsics;
import oqk.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f265414a;

    public g(h0 parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f265414a = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f265414a, ((g) obj2).f265414a);
    }

    public final int hashCode() {
        return this.f265414a.hashCode();
    }
}
