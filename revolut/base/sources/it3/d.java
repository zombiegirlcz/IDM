package it3;

import ft3.j1;
import hs3.g0;
import hs3.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements e, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ks3.b f168325c;
    public final ks3.c d;
    public final v e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f168326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f168327h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j1 f168328j;
    public final gt3.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f168329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f168330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f168331n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f168332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f168333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f168334r;

    public d(String applicationId, boolean z, ks3.b pluginName, ks3.c cVar, v vVar, ArrayList arrayList, boolean z3, boolean z4, f state, j1 productType, gt3.f fVar, int i, String str, String str2, boolean z6, String str3, boolean z11, k kVar) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f168323a = applicationId;
        this.f168324b = z;
        this.f168325c = pluginName;
        this.d = cVar;
        this.e = vVar;
        this.f = arrayList;
        this.f168326g = z3;
        this.f168327h = z4;
        this.i = state;
        this.f168328j = productType;
        this.k = fVar;
        this.f168329l = i;
        this.f168330m = str;
        this.f168331n = str2;
        this.o = z6;
        this.f168332p = str3;
        this.f168333q = z11;
        this.f168334r = kVar;
    }

    @Override // hs3.g0
    public final List a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f168323a, dVar.f168323a) && this.f168324b == dVar.f168324b && this.f168325c == dVar.f168325c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && this.f168326g == dVar.f168326g && this.f168327h == dVar.f168327h && this.i == dVar.i && this.f168328j == dVar.f168328j && Intrinsics.f(this.k, dVar.k) && this.f168329l == dVar.f168329l && Intrinsics.f(this.f168330m, dVar.f168330m) && Intrinsics.f(this.f168331n, dVar.f168331n) && this.o == dVar.o && Intrinsics.f(this.f168332p, dVar.f168332p) && this.f168333q == dVar.f168333q && this.f168334r == dVar.f168334r;
    }

    @Override // hs3.g0
    public final v getMetadata() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f168325c.hashCode() + j6.a.c(this.f168323a.hashCode() * 31, 31, this.f168324b)) * 31;
        ks3.c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        v vVar = this.e;
        int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        List list = this.f;
        int iHashCode4 = (this.f168328j.hashCode() + ((this.i.hashCode() + j6.a.c(j6.a.c((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f168326g), 31, this.f168327h)) * 31)) * 31;
        gt3.f fVar = this.k;
        int iB = j6.a.b(this.f168329l, (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
        String str = this.f168330m;
        int iHashCode5 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f168331n;
        int iC = j6.a.c((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.o);
        String str3 = this.f168332p;
        int iC2 = j6.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f168333q);
        k kVar = this.f168334r;
        return iC2 + (kVar != null ? kVar.hashCode() : 0);
    }
}
