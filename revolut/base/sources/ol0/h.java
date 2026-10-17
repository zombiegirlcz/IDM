package ol0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f226289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f226290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f226291c;

    public h(int i, List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f226289a = i;
        this.f226290b = children;
        this.f226291c = 0;
    }

    @Override // ol0.e
    public final int a() {
        return this.f226291c;
    }

    @Override // ol0.e
    public final void b(int i) {
        this.f226291c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f226289a == hVar.f226289a && Intrinsics.f(this.f226290b, hVar.f226290b) && this.f226291c == hVar.f226291c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f226291c) + p.a.d(Integer.hashCode(this.f226289a) * 31, 31, this.f226290b);
    }
}
