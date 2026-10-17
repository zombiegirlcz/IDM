package dce;

import ip0.x10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x10 f112861a;

    public d0(x10 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f112861a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f112861a, ((d0) obj2).f112861a);
    }

    public final int hashCode() {
        return this.f112861a.hashCode();
    }
}
