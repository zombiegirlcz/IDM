package tj1;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes20.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f271597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f271598c;

    static {
        k kVar = k.PUBLICATION;
        d = new Lazy[]{null, j.c(kVar, new th9.k(8)), j.c(kVar, new th9.k(9))};
    }

    public /* synthetic */ c(int i, String str, e eVar, d dVar) {
        if (7 != (i & 7)) {
            j1.f(a.f271595a.getDescriptor(), i, 7);
            throw null;
        }
        this.f271596a = str;
        this.f271597b = eVar;
        this.f271598c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f271596a, cVar.f271596a) && this.f271597b == cVar.f271597b && this.f271598c == cVar.f271598c;
    }

    public final int hashCode() {
        return this.f271598c.hashCode() + ((this.f271597b.hashCode() + (this.f271596a.hashCode() * 31)) * 31);
    }

    public c(String id10, e type, d context) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f271596a = id10;
        this.f271597b = type;
        this.f271598c = context;
    }
}
