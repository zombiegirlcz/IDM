package oti;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f229644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f229645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f229646c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new oqj.d(11)), yhm.j.c(kVar, new oqj.d(12)), null};
    }

    public /* synthetic */ i(int i, List list, List list2, f fVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(g.f229638a.getDescriptor(), i, 7);
            throw null;
        }
        this.f229644a = list;
        this.f229645b = list2;
        this.f229646c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f229644a, iVar.f229644a) && Intrinsics.f(this.f229645b, iVar.f229645b) && Intrinsics.f(this.f229646c, iVar.f229646c);
    }

    public final int hashCode() {
        return this.f229646c.f229633a.hashCode() + p.a.d(this.f229644a.hashCode() * 31, 31, this.f229645b);
    }

    public i(ArrayList list, ArrayList recommended, f config) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(recommended, "recommended");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f229644a = list;
        this.f229645b = recommended;
        this.f229646c = config;
    }
}
