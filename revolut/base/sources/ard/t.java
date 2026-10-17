package ard;

import android.os.Parcelable;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Placeable;
import aw0.l8;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfileSchedule;
import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$DateRange;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import com.revolut.feature.transactions.api.navigation.UpcomingPaymentsPocketInfo;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import com.youTransactor.uCube.rpc.Constants;
import eq5.n1;
import grl.k9;
import ip0.pb0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k50.j4;
import k50.m1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.joda.time.LocalDate;
import s06.u;
import tof.a3;
import v6l.b1;
import v6l.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8683c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t(Data data, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f8681a = 23;
        this.f8683c = data;
        this.e = arrayList;
        this.d = arrayList2;
        this.f8682b = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x073b A[PHI: r5
      0x073b: PHI (r5v15 ??) = (r5v14 ??), (r5v24 ??), (r5v26 ??) binds: [B:293:0x0677, B:303:0x06a8, B:296:0x0680] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08dc  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v90, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r1v1, types: [kce.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v25, types: [zhm.f0] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ard.t.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.feature.spending_analytics.impl.ui.rev10.select.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterable iterableI1;
        ?? linkedHashMap;
        Set setB;
        ArrayList arrayListH;
        ArrayList arrayList;
        nnb.i iVar;
        ds6.a aVar;
        int i = this.f8681a;
        int i2 = 1;
        boolean z = this.f8682b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f8683c;
        switch (i) {
            case 0:
                ?? r110 = (com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                a aVarA = a.a(update, (lk0.g) obj5, null, false, r110.z, null, null, null, null, 990);
                SelectTransactionContract$DateRange selectTransactionContract$DateRange = aVarA.e;
                if (!z) {
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        arrayList3.add(((he3.h) it8.next()).f151559a);
                    }
                    SelectTransactionContract$SelectionMode selectTransactionContract$SelectionMode = r110.o.f87884c;
                    boolean z3 = selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Single;
                    if (!z3) {
                        if (!r110.M2(selectTransactionContract$DateRange)) {
                            iterableI1 = zhm.h0.f322473a;
                        } else if (selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple.AllSelected) {
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj6 : arrayList3) {
                                if (!((SelectTransactionContract$SelectionMode.Multiple.AllSelected) selectTransactionContract$SelectionMode).f87886a.contains(((a3) obj6).f272581b)) {
                                    arrayList4.add(obj6);
                                }
                            }
                            iterableI1 = zhm.d0.i1(arrayList4);
                        } else if (selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple.SpecificTransactions) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj7 : arrayList3) {
                                if (((SelectTransactionContract$SelectionMode.Multiple.SpecificTransactions) selectTransactionContract$SelectionMode).f87888a.contains(((a3) obj7).f272581b)) {
                                    arrayList5.add(obj7);
                                }
                            }
                            iterableI1 = zhm.d0.i1(arrayList5);
                        } else {
                            if (!(selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple.AllDeselected) && !z3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iterableI1 = zhm.h0.f322473a;
                        }
                        if ((selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple.AllSelected) && r110.M2(selectTransactionContract$DateRange)) {
                            Iterable iterable = iterableI1;
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(iterable, 10));
                            Iterator it9 = iterable.iterator();
                            while (it9.hasNext()) {
                                arrayList6.add(((a3) it9.next()).f272581b);
                            }
                            r110.B = zhm.d0.i1(arrayList6);
                        }
                        Set set = aVarA.f8634b;
                        int iB = zhm.q0.b(zhm.w.t(arrayList3, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        ?? linkedHashMap2 = new LinkedHashMap(iB);
                        for (Object obj8 : arrayList3) {
                            linkedHashMap2.put(((a3) obj8).f272581b, obj8);
                        }
                        Set set2 = set;
                        int iB2 = zhm.q0.b(zhm.w.t(set2, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        ?? linkedHashMap3 = new LinkedHashMap(iB2);
                        for (Object obj9 : set2) {
                            linkedHashMap3.put(((a3) obj9).f272581b, obj9);
                        }
                        Set setH1 = zhm.d0.h1(iterableI1);
                        for (Map.Entry entry : r110.A.entrySet()) {
                            String str = (String) entry.getKey();
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                a3 a3Var = (a3) linkedHashMap2.get(str);
                                if (a3Var == null) {
                                    a3Var = (a3) linkedHashMap3.get(str);
                                }
                                if (a3Var != null) {
                                    setH1.add(a3Var);
                                }
                            } else {
                                zhm.a0.D(setH1, new ak7.g(str, 10));
                            }
                        }
                        return a.a(aVarA, null, setH1, r110.K2(setH1, arrayList3, aVarA), null, null, null, null, null, 1013);
                    }
                }
                return aVarA;
            case 1:
                Set set3 = (Set) obj5;
                auj.n nVar = (auj.n) obj4;
                Data data = (Data) obj3;
                auj.g gVar = (auj.g) obj2;
                if (set3 != null) {
                    Map map = gVar.f9844c;
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (set3.contains((String) entry2.getKey())) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                } else {
                    linkedHashMap = gVar.f9844c;
                }
                return auj.g.a(gVar, auj.n.I2(nVar, data, linkedHashMap), linkedHashMap, z, 1);
            case 2:
                String amount = (String) obj4;
                cul.s parcel = (cul.s) obj3;
                cul.v update2 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                g2e.t tVar = ((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) obj5).A;
                InvestInputValue currentInputValue = update2.e;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(currentInputValue, "currentInputValue");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimalA = ((vdf.d) tVar.f140031b).a(amount, parcel.f109165a, parcel.f109166b);
                aul.f fVar = parcel.f109167c;
                if (!fVar.equals(aul.d.f9863a)) {
                    if (!(fVar instanceof aul.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimalA = bigDecimalA.multiply(((aul.e) fVar).f9864a);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalA, "multiply(...)");
                }
                return cul.v.a(update2, null, null, null, InvestInputValue.a(currentInputValue, bigDecimalA, Boolean.valueOf(z), false, false, 4), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -17, 8191);
            case 3:
                UpcomingPaymentsPocketInfo upcomingPaymentsPocketInfo = (UpcomingPaymentsPocketInfo) obj4;
                String str2 = (String) obj3;
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                List list = items;
                dhf.d dVar = ((dhf.b) obj5).f114808a;
                if (upcomingPaymentsPocketInfo instanceof UpcomingPaymentsPocketInfo.AllPockets) {
                    setB = null;
                } else if (upcomingPaymentsPocketInfo instanceof UpcomingPaymentsPocketInfo.ConcretePocket) {
                    setB = y0.b(((UpcomingPaymentsPocketInfo.ConcretePocket) upcomingPaymentsPocketInfo).f92023a);
                } else if (upcomingPaymentsPocketInfo instanceof UpcomingPaymentsPocketInfo.ListOfPockets) {
                    setB = ((UpcomingPaymentsPocketInfo.ListOfPockets) upcomingPaymentsPocketInfo).f92024a;
                } else {
                    if (upcomingPaymentsPocketInfo != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setB = zhm.h0.f322473a;
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj10 : list) {
                    RecurringPaymentWithExtra value = (RecurringPaymentWithExtra) obj10;
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (pd.b.k(setB != null ? Boolean.valueOf(zhm.d0.T(setB, value.getF81653a().f249322h) || (value.getF81653a().f249322h == null && setB.contains(value.getF81653a().i))) : null)) {
                        arrayList7.add(obj10);
                    }
                }
                zsc.m.Companion.getClass();
                zsc.k kVarA = dVar.a(zsc.l.a(str2));
                ArrayList arrayList8 = new ArrayList();
                for (Object obj11 : arrayList7) {
                    if (kVarA.a((RecurringPaymentWithExtra) obj11)) {
                        arrayList8.add(obj11);
                    }
                }
                if (!z) {
                    return arrayList8;
                }
                LocalDate localDatePlusDays = ((l80.f) dVar.f114809a).g().toLocalDate().plusDays(3);
                Intrinsics.h(localDatePlusDays);
                List listC = zhm.u.c(new ehf.f(localDatePlusDays));
                ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("filters", listC);
                for (Object obj12 : arrayList8) {
                    RecurringPaymentWithExtra recurringPaymentWithExtra = (RecurringPaymentWithExtra) obj12;
                    List list2 = listC;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            if (!((zsc.d) it10.next()).a(recurringPaymentWithExtra)) {
                            }
                            break;
                        }
                    }
                    arrayListY.add(obj12);
                }
                return arrayListY;
            case 4:
                xi0.b bVar = (xi0.b) obj5;
                xi0.b bVar2 = (xi0.b) obj4;
                xi0.b bVar3 = (xi0.b) obj3;
                List allRates = (List) obj2;
                Intrinsics.checkNotNullParameter(allRates, "allRates");
                if (z) {
                    Intrinsics.checkNotNullParameter(allRates, "<this>");
                    List<qta.a> list3 = allRates;
                    arrayListH = new ArrayList(zhm.w.t(list3, 10));
                    for (qta.a aVar2 : list3) {
                        Intrinsics.checkNotNullParameter(aVar2, "<this>");
                        arrayListH.add(new n9l.a(aVar2.f249039a, aVar2.f249040b, aVar2.f249041c.doubleValue(), null, null, null));
                    }
                } else {
                    arrayListH = n14.k.H(allRates);
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj13 : arrayListH) {
                    n9l.a aVar3 = (n9l.a) obj13;
                    if (Intrinsics.f(aVar3.f213661a, bVar) && Intrinsics.f(aVar3.f213662b, bVar2)) {
                        arrayList9.add(obj13);
                    }
                }
                if (z) {
                    arrayList = new ArrayList();
                    for (Object obj14 : arrayListH) {
                        n9l.a aVar4 = (n9l.a) obj14;
                        if (Intrinsics.f(aVar4.f213661a, bVar) && Intrinsics.f(aVar4.f213662b, bVar3)) {
                            arrayList.add(obj14);
                        }
                    }
                } else {
                    arrayList = arrayList9;
                }
                return new n1(arrayList9, arrayList);
            case 5:
                Boolean bool = (Boolean) obj4;
                f33.j jVar = (f33.j) obj2;
                Intrinsics.h(bool);
                return f33.j.a(jVar, (d93.b) obj5, null, null, bool.booleanValue(), this.f8682b, (dj0.d) obj3, false, 567);
            case 6:
                hha.d standardPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(standardPlan, "standardPlan");
                return ((pfk.p0) ((ffk.t) obj5).f134850a).c(standardPlan.f152287a, null, (iha.a) obj4, Boolean.valueOf(z), (PricingPlanUpdateSource) obj3, false, null);
            case 7:
                fg8.m mVar = (fg8.m) obj5;
                String str3 = (String) obj4;
                jf0.c cVar = (jf0.c) obj3;
                Boolean featureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(featureEnabled, "featureEnabled");
                if (!featureEnabled.booleanValue()) {
                    return fg8.m.j(cVar);
                }
                pfm.h hVar = new pfm.h(new fg8.h(cVar, str3, mVar, this.f8682b, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 8:
                do3.n nVar2 = (do3.n) obj5;
                xi0.b bVar4 = (xi0.b) obj4;
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                List list4 = (List) obj3;
                List list5 = exchangeRates;
                int iB3 = zhm.q0.b(zhm.w.t(list5, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB3);
                for (Object obj15 : list5) {
                    linkedHashMap4.put(((n9l.a) obj15).f213662b, obj15);
                }
                return new fod.a(nVar2, bVar4, this.f8682b, list4, linkedHashMap4);
            case 9:
                b93.d cardScope = (b93.d) obj4;
                b93.k sortType = (b93.k) obj3;
                List walletIds = (List) obj2;
                Intrinsics.checkNotNullParameter(walletIds, "walletsList");
                b1 b1Var = (b1) ((ha3.x) obj5).f150432a;
                Intrinsics.checkNotNullParameter(walletIds, "walletIds");
                Intrinsics.checkNotNullParameter(cardScope, "cardScope");
                Intrinsics.checkNotNullParameter(sortType, "sortType");
                return pd.b.r(b1Var.f286432n.f(h0.a.f286452a, b1Var.f286430l.a(Unit.f186387a, z)), new sc7.b(b1Var, cardScope, sortType, walletIds, 13));
            case 10:
                return ich.l.a((ich.l) obj2, (Data) obj5, ((com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) obj4).J2((Data) obj3, null), null, this.f8682b, null, null, null, null, null, 500);
            case 11:
                return LazyListMeasureKt.measureLazyList__s_dbAc$lambda$8((MutableState) obj5, (List) obj4, (List) obj3, z, (Placeable.PlacementScope) obj2);
            case 12:
                j4 j4Var = (j4) obj5;
                Function1 function1 = (Function1) obj3;
                k50.h0 update3 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                m1 m1Var = update3.d;
                ArrayList arrayListI3 = j4Var.i3(m1Var, m1Var.f181178a, (List) obj4, zhm.f0.f322471a);
                if (z) {
                    j4Var.f181123b0.h3(arrayListI3);
                }
                m1 m1Var2 = update3.d;
                return k50.h0.a(update3, null, null, null, m1.a(m1Var2, arrayListI3, null, arrayListI3, null, null, null, null, m1Var2.f181182h + 1, null, 762), null, null, null, null, null, null, false, false, null, null, null, null, false, null, (l8) function1.invoke(arrayListI3), null, null, null, null, null, 266338295);
            case 13:
                k6a.j jVar2 = (k6a.j) obj2;
                return k6a.j.a(jVar2, (Data) obj5, (List) obj4, (String) obj3, null, z ? null : jVar2.e, false, 232);
            case 14:
                return a(obj2);
            case 15:
                String str4 = (String) obj5;
                llh.i iVar2 = (llh.i) obj4;
                NaviCommand naviCommand = (NaviCommand) obj3;
                od0.i tradingAccountOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(tradingAccountOptional, "tradingAccountOptional");
                TradingAccount tradingAccount = (TradingAccount) tradingAccountOptional.f224257a;
                if (tradingAccount == null) {
                    return efm.d0.l(new IllegalArgumentException("Can't find an account with ID:".concat(str4)));
                }
                FeatureCommand featureCommandC = iVar2.c();
                TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount withTradingAccount = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount);
                EndPromptParams endPromptParams = new EndPromptParams(z, z ? EndPromptType.JOINT_TRADING : EndPromptType.TRADING);
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig tradingAccountOnboardingFeatureConfig = new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommandC, withTradingAccount, null, endPromptParams, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
                return iVar2.f196818a.b(naviCommand, tradingAccountOnboardingFeatureConfig, z ? new FeatureCommand(tradingAccountOnboardingFeatureConfig) : null);
            case 16:
                InstrumentsCollectionType instrumentsCollectionType = (InstrumentsCollectionType) obj5;
                InstrumentsCollectionSortOption instrumentsCollectionSortOption = (InstrumentsCollectionSortOption) obj3;
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List list6 = (List) ((Data) obj4).getContent();
                if (list6 == null) {
                    list6 = zhm.f0.f322471a;
                }
                ListSubheaderDelegate.Model modelA = mch.b.a(instrumentsCollectionType, list6.size(), instrumentsCollectionSortOption, z);
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList10 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it12 = intRangeO.iterator();
                while (it12.f289625c) {
                    arrayList10.add(new pb0(a0.d.n("INSTRUMENTS_COLLECTION_LOADING_ITEM_LIST_ID_", it12.nextInt())));
                }
                yp0.b.k(arrayList10, 0, 0, 0, 0, 31);
                return ue0.e.J(modelA, arrayList10);
            case 17:
                mu5.f fVar2 = (mu5.f) obj5;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String userId = (String) pair.f186385a;
                xi0.b bVar5 = (xi0.b) pair.f186386b;
                hu5.d dVar2 = fVar2.f208973a;
                String baseCurrency = bVar5.f306286a;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                return pd.b.r(dVar2.d.f(new hu5.c(userId, baseCurrency), z), new mu5.d((xi0.b) obj4, fVar2, (n9l.b) obj3, i2));
            case 18:
                DraggableTabsView draggableTabsView = (DraggableTabsView) obj5;
                String str5 = (String) obj4;
                List list7 = (List) obj3;
                int iIntValue = ((Integer) obj2).intValue();
                es0.d dVar3 = draggableTabsView.e;
                if (str5 == null) {
                    str5 = "";
                }
                dVar3.getClass();
                ArrayList arrayListA = es0.d.a(iIntValue, str5, list7, z);
                z4l.j jVar3 = draggableTabsView.f58522c;
                if (jVar3 == null) {
                    Intrinsics.r("adapter");
                    throw null;
                }
                jVar3.c(arrayListA);
                draggableTabsView.d = arrayListA;
                return Unit.f186387a;
            case 19:
                Set set4 = (Set) obj5;
                nnb.o oVar = (nnb.o) obj4;
                nnb.g gVar2 = (nnb.g) obj3;
                nnb.f update4 = (nnb.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                if (set4.isEmpty()) {
                    iVar = null;
                } else {
                    ncd.g gVar3 = gVar2.f217493b;
                    xi0.b bVar6 = gVar2.f217494c;
                    if (!((Boolean) oVar.f217509s.getValue()).booleanValue()) {
                        gVar3 = null;
                    }
                    iVar = new nnb.i(gVar3, z ? bVar6 : null);
                }
                return nnb.f.a(update4, null, set4, false, iVar, 5);
            case 20:
                return super/*nvg.e*/.f((String) obj4, (String) obj3, z);
            case 21:
                String str6 = (String) obj5;
                Data value2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(value2, "value");
                return iii.c.f(value2, new or4.h(19), new f28.b0(str6, 12), new d8d.a((os5.d) obj4, str6, this.f8682b, (String) obj3, 6));
            case 22:
                String amount2 = (String) obj4;
                oul.i parcel2 = (oul.i) obj3;
                oul.k update5 = (oul.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                kge.d dVar4 = ((com.revolut.trading.orders.ui.invest.placement.target_price.b) obj5).u;
                TargetPriceInputValue currentInputValue2 = update5.f229907c;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(currentInputValue2, "currentInputValue");
                Intrinsics.checkNotNullParameter(amount2, "amount");
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                vdf.d dVar5 = (vdf.d) dVar4.f183974b;
                xi0.b bVar7 = parcel2.f229903a;
                return oul.k.a(update5, TargetPriceInputValue.a(currentInputValue2, dVar5.a(amount2, dVar4.f(bVar7), bVar7.c()), Boolean.valueOf(z), false, false, 12), null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 23:
                Data data2 = (Data) obj5;
                return p40.i.a((p40.i) obj2, null, null, new Data((ArrayList) obj3, data2.getError(), data2.getLoading()), new Data((ArrayList) obj4, data2.getError(), data2.getLoading()), this.f8682b, 63);
            case 24:
                return FocusMeteringControl.propagateToFocusMeteringResultDeferred$lambda$0((skm.q) obj5, (skm.g0) obj4, (FocusMeteringControl) obj3, z, (Throwable) obj2);
            case 25:
                s06.j jVar4 = (s06.j) obj5;
                jf0.c cVar2 = (jf0.c) obj4;
                lg0.a aVar5 = (lg0.a) obj3;
                s06.u outcome = (s06.u) obj2;
                Intrinsics.checkNotNullParameter(outcome, "outcome");
                if (Intrinsics.f(outcome, u.a.f258875a)) {
                    ufm.b bVarM = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (!(outcome instanceof s06.v)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((s06.v) outcome).f258876a) {
                    return efm.d0.m(Boolean.TRUE);
                }
                int i3 = s06.h.f258855a[cVar2.f173628b.ordinal()];
                if (i3 == 1) {
                    ufm.b bVarM2 = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ufm.i iVar3 = new ufm.i(efm.d0.m(uli.e.a()), new ryd.j(new pud.b((Object) jVar4, cVar2, z, 10), 19), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                ufm.i iVar4 = new ufm.i(iVar3, new ryd.j(new s06.e(jVar4, 0, cVar2, aVar5), 24), 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return iVar4;
            case 26:
                String str7 = (String) obj5;
                xi0.b baseCurrency2 = (xi0.b) obj3;
                List list8 = (List) obj2;
                LayeredImage layeredImageK = LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_vegan, R$attr.uikit_colorOnAccent, R$attr.uikit_colorAccent);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(oc.c.q(((uib.a) obj4).f280366a), null, null, 14);
                Intrinsics.checkNotNullParameter(list8, "<this>");
                Intrinsics.checkNotNullParameter(baseCurrency2, "baseCurrency");
                Iterator it13 = list8.iterator();
                long j2 = 0;
                while (it13.hasNext()) {
                    dj0.d dVar6 = ((npg.a) it13.next()).f218205a;
                    j2 += dVar6 != null ? dVar6.f115082a : 0L;
                }
                dj0.d dVar7 = new dj0.d(j2, baseCurrency2);
                npg.a aVar6 = (npg.a) zhm.d0.M0(list8);
                return new spb.c(str7, layeredImageK, textLocalisedClause, dVar7, this.f8682b, new spb.n(aVar6 != null ? (pcd.s) aVar6.f218206b : null));
            case 27:
                return sq5.c.a((sq5.c) obj2, null, null, null, (String) obj5, this.f8682b, (List) obj4, (List) obj3, 7);
            case 28:
                return AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0$0$0$0((Function0) obj5, z, (ImageBitmap) obj4, (ColorFilter) obj3, (ContentDrawScope) obj2);
            default:
                FreelancerTaxProfileSchedule freelancerTaxProfileSchedule = (FreelancerTaxProfileSchedule) obj5;
                return u37.g.a((u37.g) obj2, (Data) obj3, null, (freelancerTaxProfileSchedule == null || (aVar = freelancerTaxProfileSchedule.f73477a) == null) ? (ds6.a) obj4 : aVar, freelancerTaxProfileSchedule != null ? freelancerTaxProfileSchedule.f73478b : null, freelancerTaxProfileSchedule != null ? freelancerTaxProfileSchedule.f73479c : null, this.f8682b, 2);
        }
    }

    public /* synthetic */ t(Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.f8681a = i;
        this.f8683c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f8682b = z;
    }

    public /* synthetic */ t(Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.f8681a = i;
        this.f8683c = obj2;
        this.d = obj3;
        this.f8682b = z;
        this.e = obj4;
    }

    public /* synthetic */ t(Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.f8681a = i;
        this.f8683c = obj2;
        this.f8682b = z;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ t(mch.b bVar, InstrumentsCollectionType instrumentsCollectionType, Data data, InstrumentsCollectionSortOption instrumentsCollectionSortOption, boolean z) {
        this.f8681a = 16;
        this.f8683c = instrumentsCollectionType;
        this.d = data;
        this.e = instrumentsCollectionSortOption;
        this.f8682b = z;
    }

    public /* synthetic */ t(boolean z, Object obj2, Object obj3, Serializable serializable, int i) {
        this.f8681a = i;
        this.f8682b = z;
        this.f8683c = obj2;
        this.d = obj3;
        this.e = serializable;
    }
}
