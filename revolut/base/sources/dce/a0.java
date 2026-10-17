package dce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f112857a;

    public a0(ty0.a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f112857a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f112857a, ((a0) obj2).f112857a);
    }

    public final int hashCode() {
        return this.f112857a.hashCode();
    }
}
