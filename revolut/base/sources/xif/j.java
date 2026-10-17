package xif;

import androidx.room.RxRoom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nif.a4;
import nif.c3;
import nif.e1;
import nif.f3;
import nif.k1;
import nif.l0;
import nif.m1;
import nif.n2;
import nif.y0;
import skm.p0;
import tof.e0;
import tof.q6;
import tof.r2;
import xec.c0;
import zhm.d0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f306361b;

    public /* synthetic */ j(o oVar, int i) {
        this.f306360a = i;
        this.f306361b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean zA;
        switch (this.f306360a) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List dto = (List) rVar.f314201a;
                List list = (List) rVar.f314202b;
                do3.n nVar = (do3.n) rVar.f314203c;
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(dto, "<this>");
                List<yhf.v> list2 = dto;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (yhf.v vVar : list2) {
                    Intrinsics.checkNotNullParameter(vVar, "<this>");
                    arrayList.add(new c3(vVar.getLegId(), vVar.getId(), vVar));
                }
                o oVar = this.f306361b;
                f3 f3Var = null;
                ArrayList<y0> arrayListA = oVar.f.a(dto, nVar.f116408a, null);
                if (list.isEmpty()) {
                    zA = true;
                } else if (list.size() == 1 && arrayListA.size() == 1) {
                    zA = o.a(((n2) d0.b0(list)).f215950a, ((y0) d0.b0(arrayListA)).f216073a);
                } else {
                    List list3 = list;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((n2) it8.next()).f215950a);
                    }
                    int iB = q0.b(zhm.w.t(arrayList2, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj3 : arrayList2) {
                        linkedHashMap.put(((f3) obj3).f215798a, obj3);
                    }
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                    Iterator it9 = arrayListA.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(((y0) it9.next()).f216073a);
                    }
                    int iB2 = q0.b(zhm.w.t(arrayList3, 10));
                    if (iB2 < 16) {
                        iB2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                    for (Object obj4 : arrayList3) {
                        linkedHashMap2.put(((f3) obj4).f215798a, obj4);
                    }
                    Set<String> setH0 = d0.h0(linkedHashMap.keySet(), linkedHashMap2.keySet());
                    ArrayList<Pair> arrayList4 = new ArrayList(zhm.w.t(setH0, 10));
                    for (String str : setH0) {
                        arrayList4.add(new Pair(r0.h(str, linkedHashMap), r0.h(str, linkedHashMap2)));
                    }
                    if (!arrayList4.isEmpty()) {
                        for (Pair pair : arrayList4) {
                            if (o.a((f3) pair.f186385a, (f3) pair.f186386b)) {
                                zA = true;
                            }
                        }
                    }
                    zA = false;
                }
                List list4 = list;
                int iB3 = q0.b(zhm.w.t(list4, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3 >= 16 ? iB3 : 16);
                for (Object obj5 : list4) {
                    linkedHashMap3.put(((n2) obj5).f215950a.f215798a, obj5);
                }
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayListA, 10));
                for (y0 y0Var : arrayListA) {
                    n2 n2Var = (n2) linkedHashMap3.get(y0Var.f216073a.f215798a);
                    f3 f3Var2 = n2Var != null ? n2Var.f215950a : f3Var;
                    f3 f3Var3 = y0Var.f216073a;
                    f3 transactionEntity = f3.a(f3Var3, f3Var2 != null ? f3Var2.R : f3Var, !zA ? f3Var2 != null ? f3Var2.S : f3Var : f3Var3.S, -6145);
                    a4 a4Var = y0Var.f216074b;
                    a4 a4Var2 = y0Var.f216075c;
                    k1 k1Var = y0Var.d;
                    m1 m1Var = y0Var.e;
                    nif.c cVar = y0Var.f;
                    e1 e1Var = y0Var.f216076g;
                    l0 l0Var = y0Var.f216077h;
                    nif.z zVar = y0Var.i;
                    nif.d0 d0Var = y0Var.f216078j;
                    Intrinsics.checkNotNullParameter(transactionEntity, "transactionEntity");
                    arrayList5.add(new y0(transactionEntity, a4Var, a4Var2, k1Var, m1Var, cVar, e1Var, l0Var, zVar, d0Var));
                    f3Var = null;
                }
                efm.f fVarN = zA ? pd.b.n(p0.f264003c, new c0(oVar, arrayListA, null, 14)) : pfm.m.f235744a;
                pfm.r rVarA = tif.d.a(oVar.d, arrayList5);
                mif.j jVar = oVar.e;
                jVar.getClass();
                pfm.a aVarE = rVarA.e(RxRoom.createCompletable(jVar.f205804a, false, true, new ma2.s(jVar, arrayList, 25))).e(fVarN);
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                Iterator it10 = arrayList5.iterator();
                while (it10.hasNext()) {
                    arrayList6.add(((y0) it10.next()).f216073a.f215800b);
                }
                return aVarE.e(pd.b.n(p0.f264003c, new c0(oVar, d0.i1(arrayList6), null, 15))).f(efm.d0.m(arrayList));
            case 1:
                wif.b bVar = (wif.b) obj2;
                Intrinsics.checkNotNullParameter(bVar, "<destruct>");
                return (List) this.f306361b.f306368a.get(bVar.a());
            default:
                wif.b params = (wif.b) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                o oVar2 = this.f306361b;
                wif.d dVar = oVar2.f306370c;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                q6 q6Var = params.f297891b;
                ufm.i iVar = new ufm.i((q6Var instanceof r2 ? dVar.f297893b : q6Var instanceof e0 ? dVar.f297894c : dVar.f297892a).c(params).g(new xg6.k(new xf0.j(oVar2, params, 10), 15)), new xg6.k(new c(oVar2, 2), 16), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
        }
    }
}
