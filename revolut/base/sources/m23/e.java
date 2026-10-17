package m23;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f201693a;

    public e(a parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f201693a = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f201693a, ((e) obj2).f201693a);
    }

    public final int hashCode() {
        return this.f201693a.hashCode();
    }
}
