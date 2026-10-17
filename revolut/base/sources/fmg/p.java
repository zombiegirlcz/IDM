package fmg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
@yhm.d
public final class p implements u {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f136445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f136446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f136447c;
    public final t d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new fk8.a(27)), yhm.j.c(kVar, new fk8.a(28))};
    }

    public /* synthetic */ p(int i, d dVar, k kVar, List list, t tVar) {
        if (15 != (i & 15)) {
            j1.f(a.f136410a.getDescriptor(), i, 15);
            throw null;
        }
        this.f136445a = dVar;
        this.f136446b = kVar;
        this.f136447c = list;
        this.d = tVar;
    }

    public final t a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f136445a, pVar.f136445a) && Intrinsics.f(this.f136446b, pVar.f136446b) && Intrinsics.f(this.f136447c, pVar.f136447c) && this.d == pVar.d;
    }

    public final int hashCode() {
        d dVar = this.f136445a;
        return this.d.hashCode() + p.a.d((this.f136446b.hashCode() + ((dVar == null ? 0 : dVar.f136416a.hashCode()) * 31)) * 31, 31, this.f136447c);
    }
}
