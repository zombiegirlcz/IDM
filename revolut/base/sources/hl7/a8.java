package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a8 {

    @NotNull
    public static final z7 Companion = new z7();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(20)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f153022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa f153024c;

    public /* synthetic */ a8(int i, dj0.d dVar, List list, sa saVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(y7.f153380a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153022a = dVar;
        this.f153023b = list;
        this.f153024c = saVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj2;
        return Intrinsics.f(this.f153022a, a8Var.f153022a) && Intrinsics.f(this.f153023b, a8Var.f153023b) && Intrinsics.f(this.f153024c, a8Var.f153024c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f153022a.hashCode() * 31, 31, this.f153023b);
        sa saVar = this.f153024c;
        return iD + (saVar == null ? 0 : saVar.hashCode());
    }
}
