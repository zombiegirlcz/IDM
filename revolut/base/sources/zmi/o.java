package zmi;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f323538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f323539c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new zj9.a(12)), yhm.j.c(kVar, new zj9.a(13)), null};
    }

    public o(int i, List list, List list2, i iVar) {
        if (6 != (i & 6)) {
            j1.f(m.f323536a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f323537a = f0.f322471a;
        } else {
            this.f323537a = list;
        }
        this.f323538b = list2;
        this.f323539c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f323537a, oVar.f323537a) && Intrinsics.f(this.f323538b, oVar.f323538b) && Intrinsics.f(this.f323539c, oVar.f323539c);
    }

    public final int hashCode() {
        return this.f323539c.hashCode() + p.a.d(this.f323537a.hashCode() * 31, 31, this.f323538b);
    }
}
