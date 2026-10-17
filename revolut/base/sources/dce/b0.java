package dce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f112859a;

    public b0(ty0.a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f112859a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f112859a, ((b0) obj2).f112859a);
    }

    public final int hashCode() {
        return this.f112859a.hashCode();
    }
}
