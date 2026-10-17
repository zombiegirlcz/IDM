package ya6;

import androidx.room.util.DBUtil;
import ba6.l0;
import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import com.revolut.feature.donations.api.model.quote.DonationQuoteResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ya6.u;
import zhm.q0;
import zhm.t0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f311982b;

    public /* synthetic */ s(z zVar, int i) {
        this.f311981a = i;
        this.f311982b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listC;
        Iterator it8;
        String str;
        ba6.d dVar;
        List listC2;
        Pair pair;
        List list;
        List listC3;
        Pair pair2;
        List list2;
        switch (this.f311981a) {
            case 0:
                w params = (w) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (l0) this.f311982b.e.get(params.a());
            case 1:
                DonationQuoteRequest params2 = (DonationQuoteRequest) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (DonationQuoteResponse) this.f311982b.f.get(params2.a());
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                efm.d0<va6.d> charitiesOverview = this.f311982b.f311988b.getCharitiesOverview();
                f fVar = new f(new y99.x(13), 3);
                charitiesOverview.getClass();
                ufm.i iVar = new ufm.i(charitiesOverview, fVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (ba6.h) this.f311982b.d.get("charities_overview_cache_key");
            case 4:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                xe0.e eVar = this.f311982b.f311990g;
                Type type = a0.f311951a;
                Intrinsics.checkNotNullExpressionValue(type, "<get-CHARITIES_OVERVIEW_TYPE>(...)");
                la6.d dVar2 = (la6.d) eVar.T2("STORAGE_KEY_CHARITIES_OVERVIEW", type);
                if (dVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                return new ba6.h(dVar2.getTotalDonors(), hx7.a.v(dVar2.getTotalDonation()));
            case 5:
                ne0.d dVar3 = this.f311982b.d;
                u params3 = (u) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                if (params3 instanceof u.a) {
                    return (List) dVar3.get("charities_cache_key");
                }
                if (!(params3 instanceof v)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list3 = (List) dVar3.get("charities_cache_key");
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list3) {
                        if (Intrinsics.f(((ba6.l) obj3).f13938a, ((v) params3).f311984a)) {
                            arrayList.add(obj3);
                        }
                    }
                    List list4 = (List) ue0.e.M(arrayList);
                    if (list4 != null) {
                        return list4;
                    }
                }
                ba6.l lVar = (ba6.l) v1.c.s("single_charity_", ((v) params3).f311984a, dVar3);
                if (lVar != null) {
                    return zhm.u.c(lVar);
                }
                return null;
            case 6:
                ja6.f fVar2 = this.f311982b.f311989c;
                u params4 = (u) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                if (params4 instanceof u.a) {
                    List list5 = (List) DBUtil.performBlocking(fVar2.f172454a, true, false, new ja6.e(fVar2, 0));
                    if (list5.isEmpty()) {
                        list5 = null;
                    }
                    listC = list5;
                } else {
                    if (!(params4 instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    la6.h hVar = (la6.h) DBUtil.performBlocking(fVar2.f172454a, true, false, new ja6.d(fVar2, ((v) params4).f311984a, 1));
                    listC = hVar != null ? zhm.u.c(hVar) : null;
                }
                if (listC == null) {
                    return null;
                }
                String str2 = "<this>";
                Intrinsics.checkNotNullParameter(listC, "<this>");
                List list6 = listC;
                char c2 = '\n';
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it12 = list6.iterator();
                while (it12.hasNext()) {
                    la6.h hVar2 = (la6.h) it12.next();
                    Intrinsics.checkNotNullParameter(hVar2, str2);
                    String str3 = hVar2.f193332a;
                    String str4 = hVar2.f193333b;
                    String str5 = hVar2.d;
                    String str6 = hVar2.e;
                    String str7 = hVar2.f;
                    String str8 = hVar2.f193335g;
                    dj0.d dVarV = hx7.a.v(hVar2.f193336h);
                    dj0.d dVarV2 = hx7.a.v(hVar2.i);
                    String str9 = hVar2.f193334c;
                    la6.a aVar = hVar2.f193337j;
                    if (aVar != null) {
                        Intrinsics.checkNotNullParameter(aVar, str2);
                        String code = aVar.getCode();
                        it8 = it12;
                        str = str2;
                        ba6.c cVar = (ba6.c) u1.v(aVar.getType(), q0.c(new Pair("CHARITY_CARD", ba6.c.CHARITY_CARD)));
                        if (cVar != null) {
                            b93.b bVar = new b93.b(aVar.getCardCode());
                            ba6.b bVar2 = (ba6.b) u1.v(aVar.getStatus(), ta6.a.p());
                            if (bVar2 != null) {
                                List minDonationsToUnlock = aVar.getMinDonationsToUnlock();
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(minDonationsToUnlock, 10));
                                Iterator it13 = minDonationsToUnlock.iterator();
                                while (it13.hasNext()) {
                                    arrayList3.add(hx7.a.v((jo3.b) it13.next()));
                                }
                                dVar = new ba6.d(code, cVar, bVar, bVar2, arrayList3);
                                arrayList2.add(new ba6.l(str3, str4, str9, str5, str6, str7, str8, dVarV, dVarV2, dVar, hVar2.k, hVar2.f193338l, (ba6.i) u1.u(hVar2.f193339m, ta6.a.n()), hVar2.f193340n, hVar2.f193341p, hVar2.o, (ba6.j) u1.t(hVar2.f193342q, ba6.j.NOT_AVAILABLE, ta6.a.o()), hVar2.f193343r));
                                it12 = it8;
                                str2 = str;
                                c2 = '\n';
                            }
                        }
                    } else {
                        it8 = it12;
                        str = str2;
                    }
                    dVar = null;
                    arrayList2.add(new ba6.l(str3, str4, str9, str5, str6, str7, str8, dVarV, dVarV2, dVar, hVar2.k, hVar2.f193338l, (ba6.i) u1.u(hVar2.f193339m, ta6.a.n()), hVar2.f193340n, hVar2.f193341p, hVar2.o, (ba6.j) u1.t(hVar2.f193342q, ba6.j.NOT_AVAILABLE, ta6.a.o()), hVar2.f193343r));
                    it12 = it8;
                    str2 = str;
                    c2 = '\n';
                }
                return arrayList2;
            case 7:
                int iIntValue = ((Integer) obj2).intValue();
                Map map = (Map) this.f311982b.d.get("suggestions_cache_key");
                if (map == null || (listC2 = t0.C(map)) == null || (pair = (Pair) zhm.d0.d0(listC2)) == null || (list = (List) pair.f186386b) == null || list.size() != iIntValue) {
                    return null;
                }
                return map;
            case 8:
                int iIntValue2 = ((Integer) obj2).intValue();
                xe0.e eVar2 = this.f311982b.f311990g;
                Type type2 = a0.f311952b;
                Intrinsics.checkNotNullExpressionValue(type2, "<get-SUGGESTIONS_TYPE>(...)");
                Map map2 = (Map) eVar2.T2("STORAGE_KEY_SUGGESTIONS", type2);
                if (map2 == null || (listC3 = t0.C(map2)) == null || (pair2 = (Pair) zhm.d0.d0(listC3)) == null || (list2 = (List) pair2.f186386b) == null || list2.size() != iIntValue2) {
                    return null;
                }
                return map2;
            default:
                z zVar = this.f311982b;
                zVar.d.remove("STORAGE_KEY_CHARITIES_OVERVIEW");
                zVar.f311990g.I0("STORAGE_KEY_CHARITIES_OVERVIEW");
                return Unit.f186387a;
        }
    }
}
