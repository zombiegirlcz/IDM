package ntj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f219083g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f219085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f219086c;
    public final List d;
    public final List e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f219083g = new Lazy[]{yhm.j.c(kVar, new ns1.a(9)), null, null, yhm.j.c(kVar, new ns1.a(10)), yhm.j.c(kVar, new ns1.a(11)), yhm.j.c(kVar, new ns1.a(12))};
    }

    public k1(int i, List list, int i2, int i3, List list2, List list3, List list4) {
        if (31 != (i & 31)) {
            qlm.j1.f(t0.f219126a.getDescriptor(), i, 31);
            throw null;
        }
        this.f219084a = list;
        this.f219085b = i2;
        this.f219086c = i3;
        this.d = list2;
        this.e = list3;
        if ((i & 32) == 0) {
            this.f = zhm.f0.f322471a;
        } else {
            this.f = list4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f219084a, k1Var.f219084a) && this.f219085b == k1Var.f219085b && this.f219086c == k1Var.f219086c && Intrinsics.f(this.d, k1Var.d) && Intrinsics.f(this.e, k1Var.e) && Intrinsics.f(this.f, k1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.d(j6.a.b(this.f219086c, j6.a.b(this.f219085b, this.f219084a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public k1(ArrayList header, int i, int i2, ArrayList challenges, ArrayList internalCampaigns, ArrayList quests) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        Intrinsics.checkNotNullParameter(internalCampaigns, "internalCampaigns");
        Intrinsics.checkNotNullParameter(quests, "quests");
        this.f219084a = header;
        this.f219085b = i;
        this.f219086c = i2;
        this.d = challenges;
        this.e = internalCampaigns;
        this.f = quests;
    }
}
