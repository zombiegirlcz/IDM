package oqj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f = {null, null, null, yhm.j.c(k.PUBLICATION, new ok7.b(29)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f227911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f227912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f227913c;
    public final List d;
    public final j e;

    public /* synthetic */ c(int i, long j2, long j3, long j5, List list, j jVar) {
        if (31 != (i & 31)) {
            j1.f(a.f227910a.getDescriptor(), i, 31);
            throw null;
        }
        this.f227911a = j2;
        this.f227912b = j3;
        this.f227913c = j5;
        this.d = list;
        this.e = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f227911a == cVar.f227911a && this.f227912b == cVar.f227912b && this.f227913c == cVar.f227913c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(a0.d.c(a0.d.c(Long.hashCode(this.f227911a) * 31, 31, this.f227912b), 31, this.f227913c), 31, this.d);
        j jVar = this.e;
        return iD + (jVar == null ? 0 : jVar.hashCode());
    }
}
