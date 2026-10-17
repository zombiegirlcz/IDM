package v5c;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh5.c f286191a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f286191a, ((d) obj2).f286191a);
    }

    public final int hashCode() {
        sh5.c cVar = this.f286191a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public d(sh5.c cVar) {
        this.f286191a = cVar;
    }
}
