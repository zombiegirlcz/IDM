package ol0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f226305b;

    public q(List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f226304a = children;
        this.f226305b = 0;
    }

    @Override // ol0.e
    public final int a() {
        return this.f226305b;
    }

    @Override // ol0.e
    public final void b(int i) {
        this.f226305b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f226304a, qVar.f226304a) && this.f226305b == qVar.f226305b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f226305b) + (this.f226304a.hashCode() * 31);
    }
}
