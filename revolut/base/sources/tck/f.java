package tck;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f269861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f269862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f269863c;

    public /* synthetic */ f(int i, c cVar, int i2, Long l2) {
        if (7 != (i & 7)) {
            j1.f(d.f269860a.getDescriptor(), i, 7);
            throw null;
        }
        this.f269861a = cVar;
        this.f269862b = i2;
        this.f269863c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f269861a, fVar.f269861a) && this.f269862b == fVar.f269862b && Intrinsics.f(this.f269863c, fVar.f269863c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f269862b, this.f269861a.hashCode() * 31, 31);
        Long l2 = this.f269863c;
        return iB + (l2 == null ? 0 : l2.hashCode());
    }
}
