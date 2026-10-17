package gmg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f144818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f144820c;
    public final List d;
    public final Boolean e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, yhm.j.c(kVar, new gla.k(5)), null, yhm.j.c(kVar, new gla.k(6)), null};
    }

    public /* synthetic */ a0(int i, k kVar, List list, d dVar, List list2, Boolean bool) {
        if (31 != (i & 31)) {
            j1.f(a.f144817a.getDescriptor(), i, 31);
            throw null;
        }
        this.f144818a = kVar;
        this.f144819b = list;
        this.f144820c = dVar;
        this.d = list2;
        this.e = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f144818a, a0Var.f144818a) && Intrinsics.f(this.f144819b, a0Var.f144819b) && Intrinsics.f(this.f144820c, a0Var.f144820c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e);
    }

    public final int hashCode() {
        k kVar = this.f144818a;
        int iD = p.a.d((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f144819b);
        d dVar = this.f144820c;
        int iHashCode = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
