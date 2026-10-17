package wvk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final awk.h f300543a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f300543a, ((d) obj2).f300543a);
    }

    public final int hashCode() {
        awk.h hVar = this.f300543a;
        if (hVar == null) {
            return 0;
        }
        return hVar.f10802a.hashCode();
    }

    public d(awk.h hVar) {
        this.f300543a = hVar;
    }
}
