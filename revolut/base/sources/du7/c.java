package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f117616g = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ds7.a(9)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117619c;
    public final String d;
    public final List e;
    public final q7 f;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, List list, q7 q7Var) {
        if (63 != (i & 63)) {
            qlm.j1.f(a.f117594a.getDescriptor(), i, 63);
            throw null;
        }
        this.f117617a = str;
        this.f117618b = str2;
        this.f117619c = str3;
        this.d = str4;
        this.e = list;
        this.f = q7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f117617a, cVar.f117617a) && Intrinsics.f(this.f117618b, cVar.f117618b) && Intrinsics.f(this.f117619c, cVar.f117619c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.c(p.a.c(p.a.c(this.f117617a.hashCode() * 31, 31, this.f117618b), 31, this.f117619c), 31, this.d), 31, this.e);
    }
}
