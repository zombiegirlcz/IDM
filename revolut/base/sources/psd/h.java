package psd;

import aim.o;
import akl.w0;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.gift.asset.api.CryptoGiftAssetApi$Toggles$CryptoGiftAsset;
import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import efm.r;
import io3.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.lds.LDSFile;
import pqg.v;
import vf0.k;
import zhm.a0;
import zhm.d0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f239477b;

    public /* synthetic */ h(j jVar, int i) {
        this.f239476a = i;
        this.f239477b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair;
        xi0.b bVar;
        Flow flowB;
        switch (this.f239476a) {
            case 0:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                j jVar = this.f239477b;
                mu5.f fVar = jVar.f239479b;
                r rVarE = fVar.e(nim.a.w(osg.b.e(jVar.f239478a, false, null, null, io3.i.INTERNAL, null, null, null, LDSFile.EF_DG4_TAG), new h(jVar, 3)), baseCurrency, null);
                r rVarA = gt5.a.a(fVar, baseCurrency, false, 2);
                ur5.c cVar = jVar.f;
                return nim.a.w(kli.a.h(kli.a.h(rVarE, rVarA), kli.a.h(cVar.c(baseCurrency, n9l.b.SEC_3), ur5.a.a(cVar, null, baseCurrency, 5))), new v(24));
            case 1:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                PocketBalancesWithSum pocketBalancesWithSum = (PocketBalancesWithSum) hVar.f288433a;
                CryptoCommodityPositions cryptoCommodityPositions = (CryptoCommodityPositions) hVar.f288434b;
                dj0.d dVar = (dj0.d) hVar.f288435c;
                List<io3.g> list = (List) hVar.d;
                List<CombinedPocketsBalance> list2 = pocketBalancesWithSum.f71384a;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (CombinedPocketsBalance combinedPocketsBalance : list2) {
                    v1.c.A(arrayList, combinedPocketsBalance.f71373a.f115083b, combinedPocketsBalance.e);
                }
                ArrayList arrayList2 = new ArrayList();
                for (io3.g gVar : list) {
                    dj0.d dVar2 = gVar.e;
                    if (dVar2 == null || (bVar = dVar2.f115083b) == null) {
                        pair = null;
                    } else {
                        xi0.a aVar = xi0.b.Companion;
                        String str = gVar.f163163a.f163147c;
                        aVar.getClass();
                        pair = new Pair(xi0.a.a(str), bVar);
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return nim.a.w(nim.a.w(cpk.a.a(this.f239477b.d, d0.E0(arrayList2, arrayList)), new v(25)), new n68.w(pocketBalancesWithSum, cryptoCommodityPositions, dVar, list, 27));
            case 2:
                k kVar = (k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                PocketBalancesWithSum pocketBalancesWithSum2 = (PocketBalancesWithSum) kVar.f288454a;
                List list3 = (List) kVar.f288455b;
                CryptoCommodityPositions cryptoCommodityPositions2 = (CryptoCommodityPositions) kVar.f288456c;
                dj0.d dVar3 = (dj0.d) kVar.d;
                List list4 = (List) kVar.e;
                j jVar2 = this.f239477b;
                d dVar4 = jVar2.f239482h;
                xi0.b baseCurrency2 = pocketBalancesWithSum2.f71385b.f115083b;
                Intrinsics.checkNotNullParameter(baseCurrency2, "baseCurrency");
                if (dVar4.f239474b.a()) {
                    flowB = rd0.e.b(pd.b.r(rd0.e.c(k18.c.D(dVar4.f239473a), kotlin.coroutines.g.f186406a), new pj3.b(dVar4, baseCurrency2, 21)));
                } else {
                    c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(baseCurrency2, "baseCurrency");
                    flowB = new go.g(new Data(new c(null, new dj0.d(0L, baseCurrency2)), null, false, 6, null), 2);
                }
                return nim.a.u(new w0(jVar2, pocketBalancesWithSum2, list3, cryptoCommodityPositions2, list4, dVar3, null), flowB);
            default:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                o oVar = new o();
                oVar.add(l.CURRENT);
                oVar.add(l.BLOCKING);
                oVar.add(l.STAKING);
                oVar.add(l.STAKING_PROXY);
                if (((jte.d) this.f239477b.f239481g).c(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c)) {
                    oVar.add(l.LOCKED_GIFT);
                }
                o oVarA = y0.a(oVar);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : pockets) {
                    io3.d dVar5 = (io3.d) obj3;
                    if (r6.b.B(xi0.b.Companion, dVar5.f163147c)) {
                        if (oVarA.f5338a.containsKey(dVar5.e) && j.i.contains(dVar5.f)) {
                            arrayList3.add(obj3);
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList3) {
                    String str2 = ((io3.d) obj4).f163147c;
                    Object objO = linkedHashMap.get(str2);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str2);
                    }
                    ((List) objO).add(obj4);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    List list5 = (List) entry.getValue();
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it8 = list5.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                            }
                            if (((io3.d) it8.next()).i > 0) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                            break;
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it9 = linkedHashMap2.entrySet().iterator();
                while (it9.hasNext()) {
                    a0.x((Iterable) ((Map.Entry) it9.next()).getValue(), arrayList4);
                }
                return arrayList4;
        }
    }
}
