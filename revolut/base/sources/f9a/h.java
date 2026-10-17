package f9a;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f132881a;

    public h() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f132881a, ((h) obj2).f132881a);
    }

    public final int hashCode() {
        y yVar = this.f132881a;
        if (yVar == null) {
            return 0;
        }
        return yVar.hashCode();
    }

    public h(y yVar) {
        this.f132881a = yVar;
    }
}
