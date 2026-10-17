package mu5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f208970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f208971c;
    public final /* synthetic */ n9l.b d;

    public /* synthetic */ d(xi0.b bVar, f fVar, n9l.b bVar2, int i) {
        this.f208969a = i;
        this.f208970b = bVar;
        this.f208971c = fVar;
        this.d = bVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f208969a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                xi0.b bVar2 = this.f208970b;
                if (bVar2 != null) {
                    bVar = bVar2;
                }
                if (list.isEmpty()) {
                    return zi0.c.j(new PocketBalancesWithSum(f0.f322471a, new dj0.d(0L, bVar)));
                }
                List list2 = list;
                HashSet hashSet = new HashSet();
                ArrayList<io3.d> arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (hashSet.add(((io3.d) obj3).f163147c)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (io3.d dVar : arrayList) {
                    xi0.a aVar = xi0.b.Companion;
                    String str = dVar.f163147c;
                    aVar.getClass();
                    arrayList2.add(new Pair(xi0.a.a(str), bVar));
                }
                boolean z = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        String str2 = ((io3.d) it8.next()).f163147c;
                        if (r6.b.B(xi0.b.Companion, str2) || cp5.d.y(xi0.a.a(str2))) {
                            z = true;
                        }
                    }
                }
                f fVar = this.f208971c;
                return pd.b.s(ue0.e.E(fVar.f(arrayList2, z, this.d), new Data(f0.f322471a, null, false, 6, null)), new c(fVar, list, bVar, 1));
            default:
                CryptoCommodityPositions cryptoPositions = (CryptoCommodityPositions) obj2;
                Intrinsics.checkNotNullParameter(cryptoPositions, "cryptoPositions");
                xi0.b bVar3 = this.f208970b;
                if (bVar3 == null) {
                    return zi0.c.j(cryptoPositions);
                }
                ArrayList<CryptoCommodityPosition> arrayList3 = cryptoPositions.f71383b;
                ArrayList arrayList4 = new ArrayList();
                for (CryptoCommodityPosition cryptoCommodityPosition : arrayList3) {
                    xi0.b bVar4 = cryptoCommodityPosition.f71380b.f115083b;
                    Pair pair2 = (Intrinsics.f(bVar4, bVar3) || !Intrinsics.f(bVar4, cryptoCommodityPosition.d.f126704b)) ? null : new Pair(bVar4, bVar3);
                    if (pair2 != null) {
                        arrayList4.add(pair2);
                    }
                }
                List listU = d0.U(arrayList4);
                if (listU.isEmpty()) {
                    return zi0.c.j(cryptoPositions);
                }
                f fVar2 = this.f208971c;
                return pd.b.s(ue0.e.E(fVar2.f(listU, true, this.d), new Data(f0.f322471a, null, false, 6, null)), new moe.c(cryptoPositions, 5, fVar2, bVar3));
        }
    }
}
