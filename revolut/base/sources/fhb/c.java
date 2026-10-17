package fhb;

import fed.a0;
import ghb.d;
import gr2.y;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f135194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ghb.b f135195c;
    public final y d;

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{null, j.c(kVar, new a0(6)), j.c(kVar, new a0(7)), null};
    }

    public /* synthetic */ c(int i, String str, d dVar, ghb.b bVar, y yVar) {
        if (1 != (i & 1)) {
            j1.f(a.f135192a.getDescriptor(), i, 1);
            throw null;
        }
        this.f135193a = str;
        if ((i & 2) == 0) {
            this.f135194b = d.UNKNOWN;
        } else {
            this.f135194b = dVar;
        }
        if ((i & 4) == 0) {
            this.f135195c = ghb.b.UNKNOWN;
        } else {
            this.f135195c = bVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = yVar;
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
        return Intrinsics.f(this.f135193a, cVar.f135193a) && this.f135194b == cVar.f135194b && this.f135195c == cVar.f135195c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f135195c.hashCode() + ((this.f135194b.hashCode() + (this.f135193a.hashCode() * 31)) * 31)) * 31;
        y yVar = this.d;
        return iHashCode + (yVar == null ? 0 : yVar.hashCode());
    }
}
