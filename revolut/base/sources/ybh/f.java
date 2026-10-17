package ybh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f312303a;

    public f(Object parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f312303a = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f312303a, ((f) obj2).f312303a);
    }

    public final int hashCode() {
        return this.f312303a.hashCode();
    }
}
