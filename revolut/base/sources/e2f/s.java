package e2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2f.d f122083a;

    public s(u2f.d agent) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.f122083a = agent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f122083a, ((s) obj2).f122083a);
    }

    public final int hashCode() {
        return this.f122083a.hashCode();
    }
}
