package jr;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f177771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f177772c;
    public final String d;
    public final f e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, yhm.j.c(kVar, new jp9.l(9)), yhm.j.c(kVar, new jp9.l(10)), null, null};
    }

    public /* synthetic */ c(int i, String str, List list, List list2, String str2, f fVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(a.f177758a.getDescriptor(), i, 15);
            throw null;
        }
        this.f177770a = str;
        this.f177771b = list;
        this.f177772c = list2;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = fVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f177770a, cVar.f177770a) && Intrinsics.f(this.f177771b, cVar.f177771b) && Intrinsics.f(this.f177772c, cVar.f177772c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.d(this.f177770a.hashCode() * 31, 31, this.f177771b), 31, this.f177772c), 31, this.d);
        f fVar = this.e;
        return iC + (fVar == null ? 0 : Boolean.hashCode(fVar.f177784a));
    }
}
