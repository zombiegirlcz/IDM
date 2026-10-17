package aed;

import androidx.room.util.DBUtil;
import com.revolut.data.model.Data;
import efm.d0;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.q;
import pcd.s;
import pcd.v;
import pcd.x;
import skm.p0;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3525b;

    public /* synthetic */ b(o oVar, int i) {
        this.f3524a = i;
        this.f3525b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v vVar;
        LocalDateTime localDateTimeY;
        LocalDateTime localDateTime;
        List listP0;
        int i = 1;
        LocalDateTime localDateTimeY2 = 0;
        localDateTimeY2 = 0;
        ArrayList arrayList = null;
        switch (this.f3524a) {
            case 0:
                o oVar = this.f3525b;
                Data vaultsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(vaultsData, "vaultsData");
                return w.o0(p0.f264003c, new j(vaultsData, oVar, null));
            case 1:
                o oVar2 = this.f3525b;
                s vault = (s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return new ufm.i(w.o0(p0.f264003c, new k(oVar2, vault, null, 1)), new a9j.j(new c(vault, i), 27), 0);
            case 2:
                o oVar3 = this.f3525b;
                s vault2 = (s) obj2;
                Intrinsics.checkNotNullParameter(vault2, "vault");
                wdd.a aVar = oVar3.f3547b;
                vdd.i item = ydd.b.m(vault2);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                ufm.c cVar = new ufm.c(new to7.f(aVar, item, 25), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                return new ufm.i(cVar, new a9j.j(new c(vault2, 2), 28), 1);
            case 3:
                o oVar4 = this.f3525b;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return d0.l(oVar4.e.b(error));
            case 4:
                o oVar5 = this.f3525b;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return w.o0(p0.f264003c, new ad4.c(data, oVar5, localDateTimeY2, 4));
            case 5:
                o oVar6 = this.f3525b;
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                pfm.n nVarN = efm.b.n(oVar6.e.b(error2));
                Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                return nVarN;
            case 6:
                o oVar7 = this.f3525b;
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                oVar7.getClass();
                return zhm.d0.P0(vaults, new a9j.f(new n(), i));
            case 7:
                o oVar8 = this.f3525b;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) oVar8.d.get("CACHE_KEY_PENDING_INVITE");
            case 8:
                o oVar9 = this.f3525b;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List<vdd.j> list = (List) oVar9.f3551j.T2("STORAGE_KEY_PENDING_INVITE", o.f3545p);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (vdd.j jVar : list) {
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    x xVarJ = ydd.b.j(jVar.getInvitee());
                    if (xVarJ != null) {
                        String id10 = jVar.getId();
                        String vaultName = jVar.getVaultName();
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = jVar.getCurrency();
                        aVar2.getClass();
                        xi0.b bVarA = xi0.a.a(currency);
                        List members = jVar.getMembers();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it10 = members.iterator();
                        while (it10.hasNext()) {
                            x xVarJ2 = ydd.b.j((vdd.k) it10.next());
                            if (xVarJ2 != null) {
                                arrayList3.add(xVarJ2);
                            }
                        }
                        vVar = new v(id10, vaultName, bVarA, xVarJ, arrayList3);
                    } else {
                        vVar = null;
                    }
                    if (vVar != null) {
                        arrayList2.add(vVar);
                    }
                }
                return arrayList2;
            case 9:
                o oVar10 = this.f3525b;
                String txnId = (String) obj2;
                Intrinsics.checkNotNullParameter(txnId, "txnId");
                return (q) v7.r("moneybox_transaction_extra_", txnId, oVar10.d);
            case 10:
                o oVar11 = this.f3525b;
                String txnId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(txnId2, "txnId");
                vdd.f fVar = (vdd.f) DBUtil.performBlocking(oVar11.f3548c.f261854a, true, false, new rvc.k(txnId2, 24));
                if (fVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                Long l2 = fVar.f287890b;
                if (l2 != null) {
                    try {
                        localDateTimeY = oi0.d.Y(l2.longValue());
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                        localDateTimeY = null;
                    }
                    localDateTime = localDateTimeY;
                    break;
                } else {
                    localDateTime = null;
                }
                Long l3 = fVar.f287891c;
                if (l3 != null) {
                    try {
                        localDateTimeY2 = oi0.d.Y(l3.longValue());
                    } catch (Exception e2) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                    }
                    break;
                }
                return new q(localDateTime, localDateTimeY2);
            case 11:
                o oVar12 = this.f3525b;
                i params = (i) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                pcd.b bVar = params.f3537a;
                synchronized (oVar12.k) {
                    try {
                        List all2 = oVar12.f3550h.getAll();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : all2) {
                            if (((s) obj3).f234889n == bVar) {
                                arrayList4.add(obj3);
                            }
                        }
                        listP0 = oVar12.i.contains(bVar.name()) ? zhm.d0.P0(arrayList4, new a9j.f(new n(), i)) : null;
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return listP0;
            case 12:
                o oVar13 = this.f3525b;
                i params2 = (i) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                wdd.a aVar3 = oVar13.f3547b;
                pcd.b accountType = params2.f3537a;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                List listE = aVar3.a().e(accountType.name());
                if (listE != null) {
                    List list2 = listE;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it11 = list2.iterator();
                    while (it11.hasNext()) {
                        arrayList.add(ydd.b.h((vdd.i) it11.next()));
                    }
                }
                return arrayList;
            case 13:
                o oVar14 = this.f3525b;
                h params3 = (h) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return oVar14.c(params3.f3535a);
            default:
                o oVar15 = this.f3525b;
                h params4 = (h) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                wdd.a aVar4 = oVar15.f3547b;
                String id11 = params4.f3535a;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                vdd.i iVarD = aVar4.a().d(id11);
                if (iVarD != null) {
                    return ydd.b.h(iVarD);
                }
                return null;
        }
    }
}
