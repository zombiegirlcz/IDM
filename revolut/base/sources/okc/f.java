package okc;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f225970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225971b;

    public /* synthetic */ f(int i, boolean z, boolean z3) {
        if (3 != (i & 3)) {
            j1.f(d.f225969a.getDescriptor(), i, 3);
            throw null;
        }
        this.f225970a = z;
        this.f225971b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f225970a == fVar.f225970a && this.f225971b == fVar.f225971b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225971b) + (Boolean.hashCode(this.f225970a) * 31);
    }
}
