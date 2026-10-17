package j05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f169972c;

    public /* synthetic */ r(int i, String str, String str2, o oVar) {
        if (7 != (i & 7)) {
            j1.f(p.f169969a.getDescriptor(), i, 7);
            throw null;
        }
        this.f169970a = str;
        this.f169971b = str2;
        this.f169972c = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f169970a, rVar.f169970a) && Intrinsics.f(this.f169971b, rVar.f169971b) && Intrinsics.f(this.f169972c, rVar.f169972c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f169970a.hashCode() * 31, 31, this.f169971b);
        o oVar = this.f169972c;
        return iC + (oVar == null ? 0 : oVar.hashCode());
    }
}
