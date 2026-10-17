package j1f;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170369c;
    public final a0 d;
    public final List e;

    public /* synthetic */ c(int i, String str, String str2, String str3, a0 a0Var, List list) {
        if (31 != (i & 31)) {
            j1.f(a.f170361a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170367a = str;
        this.f170368b = str2;
        this.f170369c = str3;
        this.d = a0Var;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f170367a, cVar.f170367a) && Intrinsics.f(this.f170368b, cVar.f170368b) && Intrinsics.f(this.f170369c, cVar.f170369c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f170367a.hashCode() * 31, 31, this.f170368b), 31, this.f170369c)) * 31);
    }
}
