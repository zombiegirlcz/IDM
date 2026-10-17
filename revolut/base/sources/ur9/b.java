package ur9;

import kotlin.jvm.internal.Intrinsics;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f282258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f282259b;

    public b(o member, boolean z) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f282258a = member;
        this.f282259b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f282258a, bVar.f282258a) && this.f282259b == bVar.f282259b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f282259b) + (this.f282258a.hashCode() * 31);
    }
}
