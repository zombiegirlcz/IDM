package om4;

import com.revolut.data.model.Data;
import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuoteParams;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSource;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final class r0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f226675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f226676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f226677y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i, Continuation continuation, yji.l lVar) {
        super(3, continuation);
        this.u = i;
        this.f226677y = lVar;
    }

    private final Object b(Object obj2) {
        Flow flowQ;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) this.z;
        rnd.y yVar = (rnd.y) this.f226677y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f226675w;
            od0.i iVar = (od0.i) this.f226676x;
            Continuation continuation = null;
            if (iVar.d()) {
                AnalyticsAccountsSelection analyticsAccountsSelection = (AnalyticsAccountsSelection) iVar.c();
                if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) {
                    jte.d dVar = (jte.d) yVar.f255653m;
                    if (dVar.c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c) && dVar.c(AnalyticsFeatureApi$Toggles.PrivateBankTotalWealth.f87397c)) {
                        rnd.w0 w0Var = yVar.f255652l;
                        jhi.k allAccounts = yVar.d();
                        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
                        flowQ = nim.a.v(allAccounts, new rnd.k(w0Var, 10));
                    } else {
                        flowQ = rnd.y.b(yVar, productAccountDescriptor$Value);
                    }
                } else {
                    flowQ = zi0.c.i(analyticsAccountsSelection);
                }
            } else {
                flowQ = vkm.q.Q(productAccountDescriptor$Value != null ? new go.g(productAccountDescriptor$Value, 2) : yVar.e.b(ibb.c.f160140a), new rnd.u(continuation, yVar, 0));
            }
            this.f226675w = null;
            this.f226676x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowQ, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f226675w;
            Flow gVar = kotlin.collections.d.I((rob.e[]) this.f226677y, (rob.e) this.f226676x) ? (Flow) this.z : new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
            this.f226675w = null;
            this.f226676x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        zel.f fVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f226675w;
            ScreenerStatsGroup statsGroup = (ScreenerStatsGroup) this.f226676x;
            com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a aVar2 = (com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a) this.f226677y;
            jul.o oVar = aVar2.f96280p;
            zel.f instrumentGroup = aVar2.o.f96275a;
            w4l.k loadingStrategy = (w4l.k) this.z;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(statsGroup, "statsGroup");
            Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            jt0.b bVar = (jt0.b) oVar.f178695b;
            Intrinsics.checkNotNullParameter(statsGroup, "statsGroup");
            Intrinsics.checkNotNullParameter(statsGroup, "<this>");
            if (statsGroup instanceof ScreenerStatsGroup.Stocks) {
                fVar = zel.f.STOCKS;
            } else if (statsGroup instanceof ScreenerStatsGroup.ETP) {
                fVar = zel.f.ETP;
            } else {
                if (!(statsGroup instanceof ScreenerStatsGroup.CFD)) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = zel.f.CFD;
            }
            List listA = sph.o.a(fVar);
            ugl.c cVar = (ugl.c) bVar.f178265b;
            ugl.b bVar2 = ugl.c.Companion;
            Flow flowE = boh.f.e(nim.a.v(((yhl.f) cVar).b(listA, w4l.h.f294642c), new tkm.d(bVar, statsGroup, 6)), new qz9.o(oVar, 24, instrumentGroup, loadingStrategy));
            this.f226675w = null;
            this.f226676x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
    
        if (vkm.q.u(r3, r11, r10) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f226677y
            rt4.p r0 = (rt4.p) r0
            com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsControllerContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L28
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r11)
            goto La6
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            java.lang.Object r3 = r10.z
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            yhm.o.b(r11)
            goto L49
        L28:
            yhm.o.b(r11)
            java.lang.Object r11 = r10.f226675w
            r3 = r11
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            java.lang.Object r11 = r10.f226676x
            kotlin.Unit r11 = (kotlin.Unit) r11
            om4.k0 r11 = r0.f257183q
            java.lang.String r7 = r1.f69540a
            yw4.f r8 = yw4.f.CREDIT_LIMIT_DECREASE
            r10.f226675w = r6
            r10.f226676x = r6
            r10.z = r3
            r10.v = r5
            java.lang.Object r11 = r11.b(r7, r8, r10)
            if (r11 != r2) goto L49
            goto La5
        L49:
            go.g r11 = zi0.c.i(r11)
            al4.n r5 = r0.f257182p
            java.lang.String r7 = r1.f69540a
            w4l.i r8 = w4l.i.f294643c
            om4.x2 r5 = (om4.x2) r5
            vkm.d r5 = r5.j(r7, r8)
            rt4.l r7 = rt4.l.f257178a
            cxe.u r5 = n14.k.p(r5, r7)
            al4.o r0 = r0.f257184r
            java.lang.String r1 = r1.f69540a
            om4.c3 r0 = (om4.c3) r0
            r0.getClass()
            java.lang.String r7 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            om4.k0 r7 = r0.f226547c
            yw4.f r8 = yw4.f.CREDIT_LIMIT_INCREASE_PREFERENCES
            w4l.h r9 = w4l.h.f294642c
            akg.n r7 = r7.c(r1, r8, r9)
            od0.h r8 = od0.i.Companion
            r8.getClass()
            au.c0 r8 = new au.c0
            r9 = 20
            r8.<init>(r6, r0, r1, r9)
            kotlinx.coroutines.flow.Flow r0 = xam.a.h(r8, r7)
            rt4.m r1 = rt4.m.f257179a
            cxe.u r0 = n14.k.p(r0, r1)
            akg.n r11 = zh9.u0.i(r11, r5, r0)
            rt4.n r0 = rt4.n.f257180a
            akg.n r11 = nim.a.v(r11, r0)
            r10.f226675w = r6
            r10.f226676x = r6
            r10.z = r6
            r10.v = r4
            java.lang.Object r11 = vkm.q.u(r3, r11, r10)
            if (r11 != r2) goto La6
        La5:
            return r2
        La6:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    private final Object p(Object obj2) {
        ?? arrayList;
        tzg.j jVar;
        Flow nVar;
        Object objA;
        ny5.g gVar = ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) this.f226677y).f71576q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f226675w;
            cw5.f fVar = (cw5.f) ((Data) this.f226676x).getContent();
            if (fVar != null) {
                ArrayList<cw5.c> arrayList2 = fVar.f109542c;
                arrayList = new ArrayList();
                for (cw5.c cVar : arrayList2) {
                    String str = cVar.f109537a;
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        xi0.b.Companion.getClass();
                        objA = xi0.a.a(str);
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    xi0.b bVar = (xi0.b) objA;
                    Pair pair = bVar != null ? new Pair(bVar, cVar.f109539c) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
            } else {
                arrayList = zhm.f0.f322471a;
            }
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                arrayList3.add((xi0.b) ((Pair) it8.next()).f186385a);
            }
            Map mapT = zhm.r0.t(iterable);
            if (arrayList3.isEmpty()) {
                zhm.f0 f0Var = zhm.f0.f322471a;
                nVar = new go.g(new Pair(mapT, zi0.c.P(new cw5.a(f0Var, f0Var, f0Var), false, null, 3)), 2);
            } else {
                vkm.d dVarB = rd0.e.b(gVar.a(arrayList3));
                int i2 = rx5.g.f258032a[((cw5.e) this.z).ordinal()];
                if (i2 == 1) {
                    jVar = tzg.j.ONE_DAY;
                } else if (i2 == 2) {
                    jVar = tzg.j.ONE_WEEK;
                } else if (i2 == 3) {
                    jVar = tzg.j.ONE_MONTH;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar = tzg.j.ONE_YEAR;
                }
                nVar = new qna.n(nim.a.v(zh9.u0.m(dVarB, rd0.e.b(gVar.b(arrayList3, jVar))), new ro7.n(arrayList3, 6)), mapT, 26);
            }
            this.f226675w = null;
            this.f226676x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, nVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object s(Object obj2) throws Throwable {
        boolean z;
        ryj.x xVar = (ryj.x) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f226675w;
            ArrayList arrayList = (ArrayList) this.f226677y;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (true) {
                boolean z3 = false;
                z = false;
                if (!it8.hasNext()) {
                    break;
                }
                ryj.p pVar = (ryj.p) it8.next();
                ryj.o oVar = pVar instanceof ryj.o ? (ryj.o) pVar : null;
                u09.v vVar = oVar != null ? oVar.f258405a : null;
                g09.h hVar = xVar.f258422q;
                if (vVar == null) {
                    z3 = true;
                }
                arrayList2.add(new qna.n(rd0.e.b(nim.a.w(hVar.f139375a.d.f(new a09.v(vVar), z3), new fwf.n(27))), pVar, 28));
            }
            Flow[] flowArr = (Flow[]) zhm.d0.d1(arrayList2).toArray(new Flow[0]);
            this.f226675w = null;
            this.f226676x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objG = mif.e0.g(this, new q2e.c0(flowArr, 7), new r3k.c(z ? 1 : 0, xVar, 18), flowCollector, flowArr);
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            Object obj3 = objG;
            if (objG != aVar2) {
                obj3 = Unit.f186387a;
            }
            if (obj3 != aVar2) {
                obj3 = Unit.f186387a;
            }
            if (obj3 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f226675w;
            xi0.b fiatCurrency = (xi0.b) this.f226676x;
            o36.b bVar = (o36.b) ((rul.e) this.f226677y).f257629a;
            Intrinsics.h(fiatCurrency);
            w4l.k loadingStrategy = (w4l.k) this.z;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            vkm.d dVarA = bVar.f221702b.a(fiatCurrency, loadingStrategy);
            this.f226675w = null;
            this.f226676x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, dVarA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object u(Object obj2) {
        n36.b0 a0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f226675w;
            xi0.b fiatCurrency = (xi0.b) this.f226676x;
            o36.f fVar = (o36.f) ((kgm.i) this.f226677y).f184023b;
            DeFiSwapQuoteParams params = (DeFiSwapQuoteParams) this.z;
            Intrinsics.h(fiatCurrency);
            o36.g gVar = (o36.g) fVar;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            qe0.o oVar = gVar.e;
            String fiatCurrency2 = fiatCurrency.f306286a;
            Intrinsics.checkNotNullParameter(params, "<this>");
            Intrinsics.checkNotNullParameter(fiatCurrency2, "fiatCurrency");
            String str = params.f71729a;
            DeFiSwapSource deFiSwapSource = params.f71730b;
            if (deFiSwapSource instanceof DeFiSwapSource.DeFiAsset) {
                DeFiSwapSource.DeFiAsset deFiAsset = (DeFiSwapSource.DeFiAsset) deFiSwapSource;
                a0Var = new n36.z(deFiAsset.f71737a, deFiAsset.f71738b);
            } else {
                if (!(deFiSwapSource instanceof DeFiSwapSource.Pocket)) {
                    throw new NoWhenBranchMatchedException();
                }
                DeFiSwapSource.Pocket pocket = (DeFiSwapSource.Pocket) deFiSwapSource;
                a0Var = new n36.a0(pocket.f71739a, pocket.f71740b);
            }
            vkm.d dVarA = qe0.o.a(oVar, new n36.l(str, a0Var, new c36.c(params.f71731c, params.d), params.e, new TokenAmountDto(params.f, params.f71732g), params.f71733h, fiatCurrency2), 3L, null, false, null, 28);
            this.f226675w = null;
            this.f226676x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, dVarA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r1v37, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                r0 r0Var = new r0((Continuation) obj4, (u0) this.f226677y, (grl.r2) this.z, 0);
                r0Var.f226675w = (FlowCollector) obj2;
                r0Var.f226676x = obj3;
                return r0Var.invokeSuspend(Unit.f186387a);
            case 1:
                r0 r0Var2 = new r0((Continuation) obj4, (r1) this.f226677y, (w4l.k) this.z, 1);
                r0Var2.f226675w = (FlowCollector) obj2;
                r0Var2.f226676x = obj3;
                return r0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                r0 r0Var3 = new r0(2, (Continuation) obj4, (ot1.b0) this.f226677y);
                r0Var3.f226675w = (FlowCollector) obj2;
                r0Var3.f226676x = obj3;
                return r0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                r0 r0Var4 = new r0((Continuation) obj4, (p26.c) this.f226677y, (qta.f) this.z, 3);
                r0Var4.f226675w = (FlowCollector) obj2;
                r0Var4.f226676x = obj3;
                return r0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                r0 r0Var5 = new r0((Continuation) obj4, (jt0.b) this.f226677y, (mga.d0) this.z, 4);
                r0Var5.f226675w = (FlowCollector) obj2;
                r0Var5.f226676x = obj3;
                return r0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                r0 r0Var6 = new r0((Continuation) obj4, (phe.e) this.f226677y, (sfe.a) this.z, 5);
                r0Var6.f226675w = (FlowCollector) obj2;
                r0Var6.f226676x = obj3;
                return r0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                r0 r0Var7 = new r0((Continuation) obj4, (phe.i) this.f226677y, (sfe.a) this.z, 6);
                r0Var7.f226675w = (FlowCollector) obj2;
                r0Var7.f226676x = obj3;
                return r0Var7.invokeSuspend(Unit.f186387a);
            case 7:
                r0 r0Var8 = new r0((Continuation) obj4, (pkf.v2) this.f226677y, (tof.a3) this.z, 7);
                r0Var8.f226675w = (FlowCollector) obj2;
                r0Var8.f226676x = obj3;
                return r0Var8.invokeSuspend(Unit.f186387a);
            case 8:
                r0 r0Var9 = new r0((Continuation) obj4, (psk.i) this.f226677y, (nel.n) this.z, 8);
                r0Var9.f226675w = (FlowCollector) obj2;
                r0Var9.f226676x = obj3;
                return r0Var9.invokeSuspend(Unit.f186387a);
            case 9:
                r0 r0Var10 = new r0((Continuation) obj4, (k18.c) this.f226677y, (w4l.k) this.z, 9);
                r0Var10.f226675w = (FlowCollector) obj2;
                r0Var10.f226676x = obj3;
                return r0Var10.invokeSuspend(Unit.f186387a);
            case 10:
                r0 r0Var11 = new r0(10, (Continuation) obj4, (q65.m) this.f226677y);
                r0Var11.f226675w = (FlowCollector) obj2;
                r0Var11.f226676x = obj3;
                return r0Var11.invokeSuspend(Unit.f186387a);
            case 11:
                r0 r0Var12 = new r0((Continuation) obj4, (qmc.d) this.f226677y, (RoboPortfolioInfo) this.z, 11);
                r0Var12.f226675w = (FlowCollector) obj2;
                r0Var12.f226676x = obj3;
                return r0Var12.invokeSuspend(Unit.f186387a);
            case 12:
                r0 r0Var13 = new r0((Continuation) obj4, (List) this.f226677y, (qmc.d) this.z, 12);
                r0Var13.f226675w = (FlowCollector) obj2;
                r0Var13.f226676x = obj3;
                return r0Var13.invokeSuspend(Unit.f186387a);
            case 13:
                r0 r0Var14 = new r0((Continuation) obj4, (qmg.l) this.f226677y, (w4l.k) this.z, 13);
                r0Var14.f226675w = (FlowCollector) obj2;
                r0Var14.f226676x = obj3;
                return r0Var14.invokeSuspend(Unit.f186387a);
            case 14:
                r0 r0Var15 = new r0((Continuation) obj4, (kdh.b) this.f226677y, (ftb.b) this.z, 14);
                r0Var15.f226675w = (FlowCollector) obj2;
                r0Var15.f226676x = obj3;
                return r0Var15.invokeSuspend(Unit.f186387a);
            case 15:
                r0 r0Var16 = new r0((Continuation) obj4, (Data) this.f226677y, (qu4.u) this.z, 15);
                r0Var16.f226675w = (FlowCollector) obj2;
                r0Var16.f226676x = obj3;
                return r0Var16.invokeSuspend(Unit.f186387a);
            case 16:
                r0 r0Var17 = new r0((Continuation) obj4, (r38.l) this.f226677y, (Set) this.z, 16);
                r0Var17.f226675w = (FlowCollector) obj2;
                r0Var17.f226676x = obj3;
                return r0Var17.invokeSuspend(Unit.f186387a);
            case 17:
                r0 r0Var18 = new r0((Continuation) obj4, (xi0.b) this.f226677y, (rbj.l) this.z, 17);
                r0Var18.f226675w = (FlowCollector) obj2;
                r0Var18.f226676x = obj3;
                return r0Var18.invokeSuspend(Unit.f186387a);
            case 18:
                r0 r0Var19 = new r0((Function3) this.f226677y, (Function2) this.z, (Continuation) obj4);
                r0Var19.f226675w = (x4l.c) obj2;
                r0Var19.f226676x = obj3;
                return r0Var19.invokeSuspend(Unit.f186387a);
            case 19:
                r0 r0Var20 = new r0((prl.e) this.f226677y, (String) this.z, (Continuation) obj4);
                r0Var20.f226676x = (FlowCollector) obj2;
                return r0Var20.invokeSuspend(Unit.f186387a);
            case 20:
                r0 r0Var21 = new r0((Continuation) obj4, (Flow) this.f226677y, (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) this.z, 20);
                r0Var21.f226675w = (FlowCollector) obj2;
                r0Var21.f226676x = obj3;
                return r0Var21.invokeSuspend(Unit.f186387a);
            case 21:
                r0 r0Var22 = new r0((Continuation) obj4, (rnd.y) this.f226677y, (ProductAccountDescriptor$Value) this.z, 21);
                r0Var22.f226675w = (FlowCollector) obj2;
                r0Var22.f226676x = obj3;
                return r0Var22.invokeSuspend(Unit.f186387a);
            case 22:
                r0 r0Var23 = new r0((Continuation) obj4, (rob.e[]) this.f226677y, (Flow) this.z, 22);
                r0Var23.f226675w = (FlowCollector) obj2;
                r0Var23.f226676x = obj3;
                return r0Var23.invokeSuspend(Unit.f186387a);
            case 23:
                r0 r0Var24 = new r0((Continuation) obj4, (com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a) this.f226677y, (w4l.k) this.z, 23);
                r0Var24.f226675w = (FlowCollector) obj2;
                r0Var24.f226676x = obj3;
                return r0Var24.invokeSuspend(Unit.f186387a);
            case 24:
                r0 r0Var25 = new r0(24, (Continuation) obj4, (rt4.p) this.f226677y);
                r0Var25.f226675w = (FlowCollector) obj2;
                r0Var25.f226676x = obj3;
                return r0Var25.invokeSuspend(Unit.f186387a);
            case 25:
                r0 r0Var26 = new r0((Continuation) obj4, (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) this.f226677y, (cw5.e) this.z, 25);
                r0Var26.f226675w = (FlowCollector) obj2;
                r0Var26.f226676x = obj3;
                return r0Var26.invokeSuspend(Unit.f186387a);
            case 26:
                r0 r0Var27 = new r0((Continuation) obj4, (ArrayList) this.f226677y, (ryj.x) this.z, 26);
                r0Var27.f226675w = (FlowCollector) obj2;
                r0Var27.f226676x = obj3;
                return r0Var27.invokeSuspend(Unit.f186387a);
            case 27:
                r0 r0Var28 = new r0((Continuation) obj4, (rul.e) this.f226677y, (w4l.k) this.z, 27);
                r0Var28.f226675w = (FlowCollector) obj2;
                r0Var28.f226676x = obj3;
                return r0Var28.invokeSuspend(Unit.f186387a);
            case 28:
                r0 r0Var29 = new r0((Continuation) obj4, (kgm.i) this.f226677y, (DeFiSwapQuoteParams) this.z, 28);
                r0Var29.f226675w = (FlowCollector) obj2;
                r0Var29.f226676x = obj3;
                return r0Var29.invokeSuspend(Unit.f186387a);
            default:
                r0 r0Var30 = new r0((Continuation) obj4, (s6e.z) this.f226677y, (Set) this.z, 29);
                r0Var30.f226675w = (FlowCollector) obj2;
                r0Var30.f226676x = obj3;
                return r0Var30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01db  */
    /* JADX WARN: Type inference failed for: r3v110, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Continuation continuation, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.u = i;
        this.f226677y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(Function3 function3, Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.u = 18;
        this.f226677y = (gim.i) function3;
        this.z = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(prl.e eVar, String str, Continuation continuation) {
        super(3, continuation);
        this.u = 19;
        this.f226677y = eVar;
        this.z = str;
    }
}
