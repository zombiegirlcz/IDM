package fyh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f138994a;

    public a(f fVar) {
        this.f138994a = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f138994a, ((a) obj2).f138994a);
    }

    public final int hashCode() {
        f fVar = this.f138994a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }
}
