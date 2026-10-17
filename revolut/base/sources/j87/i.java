package j87;

import aw0.p9;
import aw0.wa;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nel.p0;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f172145w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f172145w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f172145w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f172145w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v19, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        ArrayList<vel.c> arrayList2;
        ?? arrayList3;
        String str;
        hyl.a aVar;
        l87.c cVar;
        String str2;
        LinkedHashMap linkedHashMap;
        hyl.a aVar2;
        String string;
        ?? r262;
        Double d;
        lel.b bVar;
        int i = this.u;
        j jVar = this.f172145w;
        switch (i) {
            case 0:
                Data assets = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List<vel.f> list = (List) assets.getContent();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (vel.f fVar : list) {
                        vel.c cVar2 = fVar instanceof vel.c ? (vel.c) fVar : null;
                        wi0.b bVar2 = (cVar2 == null || (bVar = cVar2.f288349a) == null) ? null : bVar.f;
                        if (bVar2 != null) {
                            arrayList.add(bVar2);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                List listU = d0.U((Iterable) arrayList);
                l87.c cVar3 = jVar.f172149n;
                cVar3.getClass();
                RoundingMode roundingMode = l87.c.f192805b;
                Intrinsics.checkNotNullParameter(assets, "assets");
                List list2 = (List) assets.getContent();
                if (list2 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof vel.c) {
                            arrayList2.add(obj3);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList3 = f0.f322471a;
                } else {
                    ArrayList<Pair> arrayList4 = new ArrayList();
                    for (vel.c cVar4 : arrayList2) {
                        lel.b bVar3 = cVar4.f288349a;
                        Double d5 = bVar3.f194592g;
                        Pair pair = (d5 == null || (d = bVar3.f194593h) == null) ? null : new Pair(new Pair(d5, d), cVar4);
                        if (pair != null) {
                            arrayList4.add(pair);
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Pair pair2 : arrayList4) {
                        Pair pair3 = (Pair) pair2.f186385a;
                        Object arrayList5 = linkedHashMap2.get(pair3);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            linkedHashMap2.put(pair3, arrayList5);
                        }
                        ((List) arrayList5).add((vel.c) pair2.f186386b);
                    }
                    arrayList3 = new ArrayList(linkedHashMap2.size());
                    Iterator it8 = linkedHashMap2.entrySet().iterator();
                    while (it8.hasNext()) {
                        Map.Entry entry = (Map.Entry) it8.next();
                        Pair pair4 = (Pair) entry.getKey();
                        List list3 = (List) entry.getValue();
                        double dDoubleValue = ((Number) pair4.f186385a).doubleValue();
                        double dDoubleValue2 = ((Number) pair4.f186386b).doubleValue();
                        List list4 = list3;
                        int iB = q0.b(w.t(list4, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
                        for (Object obj4 : list4) {
                            linkedHashMap3.put(obj4, adh.a.b((vel.c) obj4));
                        }
                        Collection<BigDecimal> collectionValues = linkedHashMap3.values();
                        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                        for (BigDecimal bigDecimal : collectionValues) {
                            if (bigDecimal == null) {
                                bigDecimal = BigDecimal.ZERO;
                            }
                            Intrinsics.h(bigDecimal);
                            bigDecimalValueOf = bigDecimalValueOf.add(bigDecimal);
                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
                        }
                        String str3 = dDoubleValue + "_" + dDoubleValue2;
                        hyl.a aVarA = l87.c.a(bigDecimalValueOf);
                        ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
                        Iterator it9 = list4.iterator();
                        while (it9.hasNext()) {
                            vel.c cVar5 = (vel.c) it9.next();
                            Iterator it10 = it9;
                            BigDecimal bigDecimal2 = (BigDecimal) linkedHashMap3.get(cVar5);
                            String strA = cVar5.a();
                            Iterator it11 = it8;
                            InstrumentTicker instrumentTicker = cVar5.f288350b;
                            String strC = cVar5.c();
                            p0 p0Var = instrumentTicker.v;
                            int[] iArr = l87.b.f192804a;
                            int i2 = iArr[p0Var.ordinal()];
                            double d6 = dDoubleValue2;
                            if (i2 == 1) {
                                str = "icn_24_sun";
                            } else if (i2 == 2) {
                                str = "icn_24_sunrise_outline";
                            } else if (i2 == 3) {
                                str = "icn_24_sunrise";
                            } else {
                                if (i2 != 4 && i2 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "icn_24_moon";
                            }
                            int i3 = iArr[instrumentTicker.v.ordinal()];
                            if (i3 == 1) {
                                aVar = hyl.a.YELLOW;
                            } else if (i3 == 2) {
                                aVar = hyl.a.DEEP_PURPLE;
                            } else if (i3 == 3) {
                                aVar = hyl.a.TERRACOTTA;
                            } else {
                                if (i3 != 4 && i3 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar = hyl.a.INDIGO;
                            }
                            hyl.a aVar4 = aVar;
                            if (bigDecimal2 != null) {
                                cVar = cVar3;
                                str2 = str;
                                linkedHashMap = linkedHashMap3;
                                aVar2 = null;
                                string = cVar3.f192806a.b(new PercentageClause(bigDecimal2, new PercentageClause.Format.Custom(2, p9.NEVER, wa.SHOW_ALL_ZEROES, roundingMode), (Style) null, 4)).toString();
                            } else {
                                cVar = cVar3;
                                str2 = str;
                                linkedHashMap = linkedHashMap3;
                                aVar2 = null;
                                string = null;
                            }
                            hyl.a aVarA2 = bigDecimal2 != null ? l87.c.a(bigDecimal2) : aVar2;
                            if (bigDecimal2 != null) {
                                int iD = xqi.a.d(bigDecimal2, true, roundingMode);
                                r262 = iD > 0 ? "icn_10_stocks_arrow_up" : iD < 0 ? "icn_10_stocks_arrow_down" : aVar2;
                            } else {
                                r262 = aVar2;
                            }
                            arrayList6.add(new hyl.n(strA, strC, str2, aVar4, string, aVarA2, r262, bigDecimal2 != null ? l87.c.a(bigDecimal2) : aVar2));
                            it9 = it10;
                            it8 = it11;
                            dDoubleValue2 = d6;
                            cVar3 = cVar;
                            linkedHashMap3 = linkedHashMap;
                        }
                        arrayList3.add(new hyl.o(str3, dDoubleValue, dDoubleValue2, aVarA, arrayList6));
                    }
                }
                jVar.X2(jVar.f172151q, new h(assets, listU, arrayList3));
                return Unit.f186387a;
            default:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jVar.X2(jVar.f172151q, new j45.m(data, jVar));
                return Unit.f186387a;
        }
    }
}
