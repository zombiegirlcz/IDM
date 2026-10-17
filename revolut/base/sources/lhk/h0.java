package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zfk.b f195343a;

    public h0(zfk.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f195343a = error;
    }

    @Override // xfk.a
    public final zfk.b a() {
        return this.f195343a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f195343a, ((h0) obj2).f195343a);
    }

    public final int hashCode() {
        return this.f195343a.hashCode();
    }
}
