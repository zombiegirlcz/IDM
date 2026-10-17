package nof;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nn3.z;
import tfm.n4;
import tof.a3;
import tof.i7;
import tof.qb;
import tof.va;
import yhm.r;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f218035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f218036c;

    public /* synthetic */ j(m mVar, a3 a3Var, int i) {
        this.f218034a = i;
        this.f218035b = mVar;
        this.f218036c = a3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f218034a;
        a3 a3Var = this.f218036c;
        m mVar = this.f218035b;
        switch (i) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                l lVar = (l) rVar.f314201a;
                List list = (List) rVar.f314202b;
                xi0.b bVar = (xi0.b) rVar.f314203c;
                List list2 = lVar.f218037a;
                mVar.getClass();
                List list3 = list2;
                HashSet hashSet = new HashSet();
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    hashSet.add(((a3) it8.next()).k.f115083b);
                }
                if (hashSet.size() == 1) {
                    bVar = (xi0.b) d0.J0(hashSet);
                }
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList.add(t1.a0((a3) it9.next(), bVar));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    dj0.d.Companion.getClass();
                    if (((dj0.d) obj3).i(dj0.d.e)) {
                        arrayList2.add(obj3);
                    }
                }
                dj0.d sentAmount = m.a(arrayList2, mVar, bVar, list).l();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((dj0.d) obj4).f(dj0.d.e)) {
                        arrayList3.add(obj4);
                    }
                }
                dj0.d receivedAmount = m.a(arrayList3, mVar, bVar, list);
                Intrinsics.checkNotNullParameter(sentAmount, "sentAmount");
                Intrinsics.checkNotNullParameter(receivedAmount, "receivedAmount");
                return (sentAmount.k() && receivedAmount.k()) ? new Data(null, null, false, 7, null) : mVar.f218040a.e(this.f218036c, lVar.f218037a.size(), sentAmount, receivedAmount, lVar.f218038b);
            case 1:
                mVar.f218043g.put(a3Var, (Data) obj2);
                return Unit.f186387a;
            default:
                Set pocketIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {new qb(m.f218039j), mVar.f218040a.c(a3Var), new va(pocketIds)};
                cVar.getClass();
                efm.r rVarB = mVar.b(i7.c.a(i7VarArr));
                h hVar = mVar.f218040a;
                hVar.getClass();
                if (!(hVar instanceof a)) {
                    return rVarB;
                }
                n4 n4VarE = rVarB.replay(1).e();
                Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
                int i2 = 22;
                efm.r rVarStartWith = n4VarE.map(new njf.c(new nnf.h(16), 21)).distinctUntilChanged().switchMap(new njf.c(new z(mVar, i2), i2)).startWith(Optional.empty());
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                efm.r map = te0.w.l(n4VarE, rVarStartWith).map(new njf.c(new nnf.h(15), 20));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
        }
    }
}
