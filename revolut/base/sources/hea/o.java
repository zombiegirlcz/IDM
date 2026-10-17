package hea;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f151646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f151647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f151648c;
    public final Data d;
    public final Data e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dda.k f151649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wi0.b f151650h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f151651j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f151652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mn2.a f151653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f151654n;
    public final boolean o;

    public o(io3.d pocket, boolean z, Data pocketDetailsContextData, Data accountsDetailsData, Data slots, String str, dda.k kVar, wi0.b bVar, boolean z3, Data legalEntityContext, d fscsData, boolean z4, mn2.a aVar, Data data, boolean z6) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(pocketDetailsContextData, "pocketDetailsContextData");
        Intrinsics.checkNotNullParameter(accountsDetailsData, "accountsDetailsData");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(fscsData, "fscsData");
        this.f151646a = pocket;
        this.f151647b = z;
        this.f151648c = pocketDetailsContextData;
        this.d = accountsDetailsData;
        this.e = slots;
        this.f = str;
        this.f151649g = kVar;
        this.f151650h = bVar;
        this.i = z3;
        this.f151651j = legalEntityContext;
        this.k = fscsData;
        this.f151652l = z4;
        this.f151653m = aVar;
        this.f151654n = data;
        this.o = z6;
    }

    public static o a(o oVar, io3.d dVar, boolean z, Data data, Data data2, Data data3, String str, dda.k kVar, wi0.b bVar, boolean z3, Data data4, d dVar2, boolean z4, mn2.a aVar, Data data5, boolean z6, int i) {
        io3.d pocket = (i & 1) != 0 ? oVar.f151646a : dVar;
        boolean z11 = (i & 2) != 0 ? oVar.f151647b : z;
        Data pocketDetailsContextData = (i & 4) != 0 ? oVar.f151648c : data;
        Data accountsDetailsData = (i & 8) != 0 ? oVar.d : data2;
        Data slots = (i & 16) != 0 ? oVar.e : data3;
        String str2 = (i & 32) != 0 ? oVar.f : str;
        dda.k kVar2 = (i & 64) != 0 ? oVar.f151649g : kVar;
        wi0.b bVar2 = (i & 128) != 0 ? oVar.f151650h : bVar;
        boolean z12 = (i & 256) != 0 ? oVar.i : z3;
        Data legalEntityContext = (i & 512) != 0 ? oVar.f151651j : data4;
        d fscsData = (i & 1024) != 0 ? oVar.k : dVar2;
        boolean z29 = (i & 2048) != 0 ? oVar.f151652l : z4;
        mn2.a aVar2 = (i & 4096) != 0 ? oVar.f151653m : aVar;
        Data data6 = (i & 8192) != 0 ? oVar.f151654n : data5;
        boolean z31 = (i & 16384) != 0 ? oVar.o : z6;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(pocketDetailsContextData, "pocketDetailsContextData");
        Intrinsics.checkNotNullParameter(accountsDetailsData, "accountsDetailsData");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(fscsData, "fscsData");
        return new o(pocket, z11, pocketDetailsContextData, accountsDetailsData, slots, str2, kVar2, bVar2, z12, legalEntityContext, fscsData, z29, aVar2, data6, z31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f151646a, oVar.f151646a) && this.f151647b == oVar.f151647b && Intrinsics.f(this.f151648c, oVar.f151648c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f151649g, oVar.f151649g) && Intrinsics.f(this.f151650h, oVar.f151650h) && this.i == oVar.i && Intrinsics.f(this.f151651j, oVar.f151651j) && Intrinsics.f(this.k, oVar.k) && this.f151652l == oVar.f151652l && this.f151653m == oVar.f151653m && Intrinsics.f(this.f151654n, oVar.f151654n) && this.o == oVar.o;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f151648c, j6.a.c(this.f151646a.hashCode() * 31, 31, this.f151647b), 31), 31), 31);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dda.k kVar = this.f151649g;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        wi0.b bVar = this.f151650h;
        int iC2 = j6.a.c((this.k.hashCode() + kii.e.c(this.f151651j, j6.a.c((iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.i), 31)) * 31, 31, this.f151652l);
        mn2.a aVar = this.f151653m;
        int iHashCode3 = (iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Data data = this.f151654n;
        return Boolean.hashCode(this.o) + ((iHashCode3 + (data != null ? data.hashCode() : 0)) * 31);
    }
}
