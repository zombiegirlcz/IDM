package rwg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f257917g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new rr4.a(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257920c;
    public final String d;
    public final r e;
    public final List f;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, r rVar, List list) {
        if (63 != (i & 63)) {
            j1.f(d.f257912a.getDescriptor(), i, 63);
            throw null;
        }
        this.f257918a = str;
        this.f257919b = str2;
        this.f257920c = str3;
        this.d = str4;
        this.e = rVar;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f257918a, fVar.f257918a) && Intrinsics.f(this.f257919b, fVar.f257919b) && Intrinsics.f(this.f257920c, fVar.f257920c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f257918a.hashCode() * 31, 31, this.f257919b), 31, this.f257920c), 31, this.d)) * 31);
    }
}
