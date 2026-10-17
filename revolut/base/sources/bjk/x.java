package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f16118c;
    public final r d;
    public final c3 e;

    public /* synthetic */ x(int i, String str, String str2, r rVar, r rVar2, c3 c3Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(v.f16087a.getDescriptor(), i, 31);
            throw null;
        }
        this.f16116a = str;
        this.f16117b = str2;
        this.f16118c = rVar;
        this.d = rVar2;
        this.e = c3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f16116a, xVar.f16116a) && Intrinsics.f(this.f16117b, xVar.f16117b) && Intrinsics.f(this.f16118c, xVar.f16118c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e);
    }

    public final int hashCode() {
        String str = this.f16116a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f16117b);
        r rVar = this.f16118c;
        int iHashCode = (iC + (rVar == null ? 0 : rVar.hashCode())) * 31;
        r rVar2 = this.d;
        int iHashCode2 = (iHashCode + (rVar2 == null ? 0 : rVar2.hashCode())) * 31;
        c3 c3Var = this.e;
        return iHashCode2 + (c3Var != null ? c3Var.hashCode() : 0);
    }
}
