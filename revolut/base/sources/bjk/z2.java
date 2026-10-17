package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class z2 {

    @NotNull
    public static final y2 Companion = new y2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2 f16155c;

    public /* synthetic */ z2(int i, v2 v2Var, String str, String str2) {
        if (7 != (i & 7)) {
            qlm.j1.f(x2.f16123a.getDescriptor(), i, 7);
            throw null;
        }
        this.f16153a = str;
        this.f16154b = str2;
        this.f16155c = v2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.f16153a, z2Var.f16153a) && Intrinsics.f(this.f16154b, z2Var.f16154b) && Intrinsics.f(this.f16155c, z2Var.f16155c);
    }

    public final int hashCode() {
        String str = this.f16153a;
        return this.f16155c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f16154b);
    }
}
