package s77;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f260567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f260569c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new s1g.a(26)), yhm.j.c(kVar, new s1g.a(27)), yhm.j.c(kVar, new s1g.a(28)), yhm.j.c(kVar, new s1g.a(29))};
    }

    public /* synthetic */ w(int i, z zVar, List list, List list2, List list3) {
        if (15 != (i & 15)) {
            j1.f(u.f260566a.getDescriptor(), i, 15);
            throw null;
        }
        this.f260567a = zVar;
        this.f260568b = list;
        this.f260569c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f260567a == wVar.f260567a && Intrinsics.f(this.f260568b, wVar.f260568b) && Intrinsics.f(this.f260569c, wVar.f260569c) && Intrinsics.f(this.d, wVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f260567a.hashCode() * 31, 31, this.f260568b), 31, this.f260569c);
    }

    public w(z market, List mainIndexes, ArrayList mainIndexesInfo, ArrayList regionDetails) {
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(mainIndexes, "mainIndexes");
        Intrinsics.checkNotNullParameter(mainIndexesInfo, "mainIndexesInfo");
        Intrinsics.checkNotNullParameter(regionDetails, "regionDetails");
        this.f260567a = market;
        this.f260568b = mainIndexes;
        this.f260569c = mainIndexesInfo;
        this.d = regionDetails;
    }
}
