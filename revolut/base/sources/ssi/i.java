package ssi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f265417a;

    public i(r parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f265417a = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f265417a, ((i) obj2).f265417a);
    }

    public final int hashCode() {
        return this.f265417a.hashCode();
    }
}
