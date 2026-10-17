package tih;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes10.dex */
@g
public final class c implements qf1.d {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f271526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f271527c;
    public final boolean d;

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{null, j.c(kVar, new th9.k(5)), j.c(kVar, new th9.k(6)), null};
    }

    public /* synthetic */ c(int i, String str, d dVar, hel.b bVar, boolean z) {
        if (7 != (i & 7)) {
            j1.f(a.f271524a.getDescriptor(), i, 7);
            throw null;
        }
        this.f271525a = str;
        this.f271526b = dVar;
        this.f271527c = bVar;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
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
        return Intrinsics.f(this.f271525a, cVar.f271525a) && this.f271526b == cVar.f271526b && this.f271527c == cVar.f271527c && this.d == cVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f271526b.hashCode() + (this.f271525a.hashCode() * 31)) * 31;
        hel.b bVar = this.f271527c;
        return Boolean.hashCode(this.d) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public c(String itemId, d investProductFeature, hel.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(investProductFeature, "investProductFeature");
        this.f271525a = itemId;
        this.f271526b = investProductFeature;
        this.f271527c = bVar;
        this.d = z;
    }
}
