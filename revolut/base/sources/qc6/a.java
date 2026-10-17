package qc6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f244568a;

    public a(lk0.g gVar) {
        this.f244568a = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f244568a, ((a) obj2).f244568a);
    }

    public final int hashCode() {
        lk0.g gVar = this.f244568a;
        if (gVar == null) {
            return 0;
        }
        return gVar.f196174a.hashCode();
    }
}
