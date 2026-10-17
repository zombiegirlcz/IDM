package rz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import rwg.e0;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f258524c;
    public final List d;
    public final h e;

    static {
        k kVar = k.PUBLICATION;
        f = new Lazy[]{null, null, j.c(kVar, new e0(12)), j.c(kVar, new e0(13)), j.c(kVar, new e0(14))};
    }

    public /* synthetic */ c(int i, String str, String str2, List list, List list2, h hVar) {
        if (31 != (i & 31)) {
            j1.f(a.f258521a.getDescriptor(), i, 31);
            throw null;
        }
        this.f258522a = str;
        this.f258523b = str2;
        this.f258524c = list;
        this.d = list2;
        this.e = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f258522a, cVar.f258522a) && Intrinsics.f(this.f258523b, cVar.f258523b) && Intrinsics.f(this.f258524c, cVar.f258524c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.d(p.a.c(this.f258522a.hashCode() * 31, 31, this.f258523b), 31, this.f258524c), 31, this.d);
    }
}
