package kf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class o {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ka9.b(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f183305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183306c;
    public final String d;
    public final List e;

    public /* synthetic */ o(int i, String str, n nVar, String str2, String str3, List list) {
        if (31 != (i & 31)) {
            j1.f(b.f183292a.getDescriptor(), i, 31);
            throw null;
        }
        this.f183304a = str;
        this.f183305b = nVar;
        this.f183306c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f183304a, oVar.f183304a) && Intrinsics.f(this.f183305b, oVar.f183305b) && Intrinsics.f(this.f183306c, oVar.f183306c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c((this.f183305b.hashCode() + (this.f183304a.hashCode() * 31)) * 31, 31, this.f183306c), 31, this.d);
    }
}
