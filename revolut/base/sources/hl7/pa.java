package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class pa {

    @NotNull
    public static final oa Companion = new oa();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ma(0)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3 f153261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153262c;
    public final la d;

    public /* synthetic */ pa(int i, String str, t3 t3Var, List list, la laVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(na.f153234a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153260a = str;
        this.f153261b = t3Var;
        this.f153262c = list;
        this.d = laVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj2;
        return Intrinsics.f(this.f153260a, paVar.f153260a) && Intrinsics.f(this.f153261b, paVar.f153261b) && Intrinsics.f(this.f153262c, paVar.f153262c) && Intrinsics.f(this.d, paVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f153261b.hashCode() + (this.f153260a.hashCode() * 31)) * 31, 31, this.f153262c);
        la laVar = this.d;
        return iD + (laVar == null ? 0 : laVar.hashCode());
    }
}
