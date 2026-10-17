package nz2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jz2.a f220940a;

    public h(jz2.a aVar) {
        this.f220940a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f220940a, ((h) obj2).f220940a);
    }

    public final int hashCode() {
        jz2.a aVar = this.f220940a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
