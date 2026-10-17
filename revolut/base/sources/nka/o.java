package nka;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f216789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216790c;
    public final k d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f216791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f216792h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f216793j;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        k = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new nk4.d(8)), yhm.j.c(kVar, new nk4.d(9)), yhm.j.c(kVar, new nk4.d(10)), yhm.j.c(kVar, new nk4.d(11)), yhm.j.c(kVar, new nk4.d(12)), yhm.j.c(kVar, new nk4.d(13))};
    }

    public /* synthetic */ o(int i, String str, int i2, n nVar, k kVar, List list, List list2, List list3, List list4, List list5, List list6) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(d.f216778a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f216788a = str;
        this.f216789b = i2;
        this.f216790c = nVar;
        this.d = kVar;
        this.e = list;
        this.f = list2;
        this.f216791g = list3;
        if ((i & 128) == 0) {
            this.f216792h = null;
        } else {
            this.f216792h = list4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list5;
        }
        if ((i & 512) == 0) {
            this.f216793j = null;
        } else {
            this.f216793j = list6;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f216788a, oVar.f216788a) && this.f216789b == oVar.f216789b && Intrinsics.f(this.f216790c, oVar.f216790c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f216791g, oVar.f216791g) && Intrinsics.f(this.f216792h, oVar.f216792h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f216793j, oVar.f216793j);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f216789b, this.f216788a.hashCode() * 31, 31);
        n nVar = this.f216790c;
        int iHashCode = (iB + (nVar == null ? 0 : nVar.f216787a.hashCode())) * 31;
        k kVar = this.d;
        int iD = p.a.d(p.a.d(p.a.d((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f216791g);
        List list = this.f216792h;
        int iHashCode2 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f216793j;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public o(String id10, int i, n nVar, k kVar, ArrayList blocks, ArrayList actions, List complianceFeatures, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(complianceFeatures, "complianceFeatures");
        this.f216788a = id10;
        this.f216789b = i;
        this.f216790c = nVar;
        this.d = kVar;
        this.e = blocks;
        this.f = actions;
        this.f216791g = complianceFeatures;
        this.f216792h = arrayList;
        this.i = arrayList2;
        this.f216793j = arrayList3;
    }
}
