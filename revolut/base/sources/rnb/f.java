package rnb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4l.k f255553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f255554c;

    public /* synthetic */ f(i iVar, w4l.k kVar, int i) {
        this.f255552a = i;
        this.f255554c = iVar;
        this.f255553b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f255552a) {
            case 0:
                List moneyBoxWithBalance = (List) obj2;
                Intrinsics.checkNotNullParameter(moneyBoxWithBalance, "moneyBoxWithBalance");
                List<npg.a> list = moneyBoxWithBalance;
                int iB = q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (npg.a aVar : list) {
                    linkedHashMap.put(((pcd.s) aVar.f218206b).f234881a, aVar.f218205a);
                }
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add((pcd.s) ((npg.a) it8.next()).f218206b);
                }
                i iVar = this.f255554c;
                akg.n nVarD = iVar.d(arrayList, this.f255553b);
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                return nim.a.w(kli.a.h(rd0.e.c(nVarD, gVar), rd0.e.c(new ahe.l(iVar.e.k(), 14), gVar)), new awk.j(linkedHashMap, 16));
            case 1:
                ppg.b bVar = this.f255554c.f255558b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                xi0.b bVar2 = (xi0.b) pair.f186386b;
                w4l.j jVar = w4l.j.f294644c;
                w4l.k kVar = this.f255553b;
                if (Intrinsics.f(kVar, jVar)) {
                    return rd0.e.c(((ypg.p) bVar).m(list2, bVar2, kVar, npg.l.AMOUNT_BALANCE), kotlin.coroutines.g.f186406a);
                }
                return rd0.e.c(((ypg.p) bVar).n(list2, bVar2, npg.l.AMOUNT_BALANCE), kotlin.coroutines.g.f186406a);
            default:
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return nim.a.w(rd0.e.c(this.f255554c.d(zhm.u.c(vault), this.f255553b), kotlin.coroutines.g.f186406a), new rm2.s(21));
        }
    }

    public /* synthetic */ f(w4l.k kVar, i iVar) {
        this.f255552a = 1;
        this.f255553b = kVar;
        this.f255554c = iVar;
    }
}
