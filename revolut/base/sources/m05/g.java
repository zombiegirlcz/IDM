package m05;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f201059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f201060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f201061c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new lv4.b(29)), yhm.j.c(kVar, new d(0)), yhm.j.c(kVar, new d(1))};
    }

    public /* synthetic */ g(int i, List list, List list2, List list3) {
        if (7 != (i & 7)) {
            j1.f(e.f201058a.getDescriptor(), i, 7);
            throw null;
        }
        this.f201059a = list;
        this.f201060b = list2;
        this.f201061c = list3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f201059a, gVar.f201059a) && Intrinsics.f(this.f201060b, gVar.f201060b) && Intrinsics.f(this.f201061c, gVar.f201061c);
    }

    public final int hashCode() {
        return this.f201061c.hashCode() + p.a.d(this.f201059a.hashCode() * 31, 31, this.f201060b);
    }

    public g(ArrayList scores, ArrayList preapprovedOffers, ArrayList activeApplications) {
        Intrinsics.checkNotNullParameter(scores, "scores");
        Intrinsics.checkNotNullParameter(preapprovedOffers, "preapprovedOffers");
        Intrinsics.checkNotNullParameter(activeApplications, "activeApplications");
        this.f201059a = scores;
        this.f201060b = preapprovedOffers;
        this.f201061c = activeApplications;
    }
}
