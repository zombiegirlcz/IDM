package x0b;

import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.ApmAliasClaimFormFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState;
import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsExtensionState;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.feature.wealth_discovery.api.declaration.collection.PopularFirstBuyDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.n;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import skm.p0;
import tv5.a;
import v4e.p;
import wr1.s;
import x5f.m;
import x5f.q;
import xzg.o;
import z0d.t;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f301542b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f301541a = i;
        this.f301542b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        wnh.c cVar;
        r rVarH;
        final ArrayList arrayList;
        final ArrayList arrayList2;
        int i = this.f301541a;
        int i2 = 22;
        int i3 = 10;
        int i5 = 2;
        final int i6 = 1;
        Object obj3 = this.f301542b;
        switch (i) {
            case 0:
                g0b.c update = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g0b.c.a(update, null, null, null, null, null, null, null, null, null, false, null, null, (c1b.i) obj3, 1048575);
            case 1:
                g0b.c update2 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return g0b.c.a(update2, null, (d1b.e) obj3, null, null, null, null, null, null, null, false, null, null, null, 2097147);
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (t) ((x0d.b) obj3).f301567b.get("MEMORY_CACHE_KEY_SUPERVISION_CONFIG");
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (List) ((x0d.e) obj3).f301572b.get("CACHE_KEY_GUARDIAN_INVITATIONS");
            case 4:
                AutoTopUpState autoTopUpState = (AutoTopUpState) obj3;
                Intrinsics.h(autoTopUpState);
                return x0f.h.a((x0f.h) obj2, null, autoTopUpState, null, null, 29);
            case 5:
                com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.a) obj3;
                b22.h result = (b22.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof b22.f) {
                    aVar.C2(x12.c.f302088a);
                } else {
                    if (!(result instanceof b22.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar, aVar.o, new ApmAliasClaimFormFlowContract$Step.AdditionalInfo(((b22.g) result).f11859a), false, null, false, 12);
                }
                return Unit.f186387a;
            case 6:
                return DeFiAccountsExtensionState.a((DeFiAccountsExtensionState) obj2, null, null, (z16.b) obj3, null, null, null, 59);
            case 7:
                Pair pair = (Pair) obj2;
                return (((Boolean) pair.f186385a).booleanValue() || ((Boolean) pair.f186386b).booleanValue()) ? ((com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) obj3).o.f76439a : h0.f322473a;
            case 8:
                s3g.e eVar = (s3g.e) obj3;
                x1g.i update3 = (x1g.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return x1g.i.a(update3, eVar.f259668a, eVar.f259669b, null, null, false, null, null, null, null, 32671);
            case 9:
                x1g.i update4 = (x1g.i) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return x1g.i.a(update4, null, null, (TravelExperiencesPointsOption) obj3, null, false, null, null, null, null, 32511);
            case 10:
                x23.j update5 = (x23.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return x23.j.a(update5, null, null, null, false, false, false, false, null, ((b53.c) ((b53.b) obj3)).f12423a, 2047);
            case 11:
                n nVar = (n) obj3;
                return x23.j.a((x23.j) obj2, null, nVar, zi0.c.P(nVar.d, false, null, 3), false, false, false, false, null, null, 4085);
            case 12:
                Boolean it10 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                k39.b bVar = ((x28.k) obj3).f302530b;
                boolean zBooleanValue = it10.booleanValue();
                if (zBooleanValue) {
                    cVar = wnh.c.ETFS;
                } else {
                    if (zBooleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = wnh.c.STOCKS;
                }
                return bVar.a(u0.f(new PopularFirstBuyDestination(cVar)));
            case 13:
                QrScanningScreenContract$ProcessingState processingState = (QrScanningScreenContract$ProcessingState) obj3;
                x32.c update6 = (x32.c) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                update6.getClass();
                Intrinsics.checkNotNullParameter(processingState, "processingState");
                return new x32.c(processingState);
            case 14:
                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.b bVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.b) obj3;
                u37.j output = (u37.j) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof u37.i) && !(output instanceof u37.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2.n2(new com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.a(bVar2, output, null), new whi.b(6));
                return Unit.f186387a;
            case 15:
                x42.l lVar = (x42.l) obj3;
                hii.a result2 = (hii.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                lVar.H2(lVar.f302783p, new cab.j(result2, i5));
                return Unit.f186387a;
            case 16:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                ((x43.b) obj3).f302786a.c(command);
                return Boolean.TRUE;
            case 17:
                Set params = (Set) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                ConcurrentHashMap concurrentHashMap = ((x46.b) obj3).d;
                ArrayList arrayList3 = new ArrayList();
                Iterator it11 = params.iterator();
                while (it11.hasNext()) {
                    qta.c cVar2 = (qta.c) concurrentHashMap.get((Pair) it11.next());
                    if (cVar2 != null) {
                        arrayList3.add(cVar2);
                    }
                }
                if (arrayList3.size() < params.size()) {
                    return null;
                }
                return arrayList3;
            case 18:
                x52.d dVar = (x52.d) obj3;
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                return !isEnabled.booleanValue() ? new pfm.a(pd.b.n(p0.f264003c, new s(dVar, null, i2)), mfm.f.f205044g, i6).f(((ty1.b) dVar.f302905b).e()) : d0.m(Boolean.TRUE);
            case 19:
                yja.b it12 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                oki.h.D2(((com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b) obj3).f84275s);
                return Unit.f186387a;
            case 20:
                return x5e.c.a((x5e.c) obj2, null, (p) obj3, 1);
            case 21:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                return q.c((a6f.i) obj3, instruments);
            case 22:
                x64.c cVar3 = (x64.c) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                cVar3.H2(cVar3.f303035r, new x16.h(new Data(null, error, false, 5, null), 11));
                cVar3.U1(new x64.a(0));
                return Boolean.TRUE;
            case 23:
                x6e.g gVar = (x6e.g) obj3;
                Pair it13 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return ((ypg.p) gVar.f303066a).h(true).map(new x0i.i(new wma.e(1, gVar, x6e.g.class, "mapInvitesData", "mapInvitesData(Lcom/revolut/data/model/Data;)Ljava/util/List;", 0, 14), 22));
            case 24:
                com.revolut.retail.feature.commodity.order_flow.impl.ui.a aVar2 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.a) obj3;
                Intrinsics.checkNotNullParameter((l7j.i) obj2, "output");
                NaviCommand naviCommand = aVar2.f99816p.f99811b;
                if (naviCommand != null) {
                    aVar2.C1(u0.b(naviCommand));
                }
                oki.h.D2(aVar2.f99818r);
                return Unit.f186387a;
            case 25:
                return x82.b.a((x82.b) obj2, zi0.c.P((MultibancoWithdrawalCode) obj3, false, null, 3), null, 0L, 6);
            case 26:
                x8b.b currencyAndMarketCaps = (x8b.b) obj2;
                Intrinsics.checkNotNullParameter(currencyAndMarketCaps, "currencyAndMarketCaps");
                ((x8b.d) obj3).getClass();
                List<Pair> listP0 = zhm.d0.P0(currencyAndMarketCaps.f303308b, new x8b.c());
                ArrayList arrayList4 = new ArrayList();
                for (Pair pair2 : listP0) {
                    xi0.b bVar3 = cp5.d.z((xi0.b) pair2.f186385a) ? (xi0.b) pair2.f186385a : null;
                    if (bVar3 != null) {
                        arrayList4.add(bVar3);
                    }
                }
                return arrayList4;
            case 27:
                x8h.c cVar4 = (x8h.c) obj3;
                com.revolut.feature.wealth.impl.data.repositories.a aVar3 = cVar4.f303327a;
                List collections = (List) obj2;
                Intrinsics.checkNotNullParameter(collections, "collections");
                if (collections.isEmpty()) {
                    r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                List<xzg.d> list = collections;
                ArrayList arrayList5 = new ArrayList(w.t(list, 10));
                for (final xzg.d dVar2 : list) {
                    List list2 = dVar2.f309981j;
                    o oVar = dVar2.f309977b;
                    final List list3 = dVar2.i;
                    List list4 = list2 == null ? f0.f322471a : list2;
                    List list5 = list3 == null ? f0.f322471a : list3;
                    int i21 = 20;
                    if (!list4.isEmpty()) {
                        int i22 = x8h.b.f303325a[oVar.ordinal()];
                        if (i22 == 1) {
                            if (list2 != null) {
                                List list6 = list2;
                                arrayList = new ArrayList(w.t(list6, i3));
                                Iterator it14 = list6.iterator();
                                while (it14.hasNext()) {
                                    arrayList.add(((xzg.e) it14.next()).f309984b);
                                }
                            } else {
                                arrayList = null;
                            }
                            if (list3 == null) {
                                list3 = f0.f322471a;
                            }
                            if (arrayList == null) {
                                throw new IllegalArgumentException("Wrong type of collection provided.");
                            }
                            rVarH = nim.a.w(u1.d(ybl.b.b(cVar4.f303328b, null, null, new m(arrayList, i5), 3), nim.a.w(aVar3.a(list3, oVar), new x64.a(i21))), new Function1() { // from class: x8h.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    Pair pair3 = (Pair) obj4;
                                    switch (i6) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                                            List list7 = (List) pair3.f186385a;
                                            List list8 = (List) pair3.f186386b;
                                            xzg.d dVar3 = dVar2;
                                            String str = dVar3.f309978c;
                                            String str2 = dVar3.f309976a;
                                            String str3 = dVar3.d;
                                            ArrayList arrayList6 = new ArrayList();
                                            Iterator it15 = list7.iterator();
                                            while (true) {
                                                boolean zHasNext = it15.hasNext();
                                                List list9 = arrayList;
                                                if (!zHasNext) {
                                                    List listP02 = zhm.d0.P0(arrayList6, new b83.a(list9, 8));
                                                    xzg.m mVar = new xzg.m(str2, str, str3, listP02, zhm.d0.P0(list8, new b83.a(list3, 9)), dVar3);
                                                    if (listP02.isEmpty()) {
                                                        return null;
                                                    }
                                                    return mVar;
                                                }
                                                Object next = it15.next();
                                                if (list9.contains(((xi0.b) next).f306286a)) {
                                                    arrayList6.add(next);
                                                }
                                            }
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                                            List list10 = (List) pair3.f186385a;
                                            List list11 = (List) pair3.f186386b;
                                            xzg.d dVar4 = dVar2;
                                            String str4 = dVar4.f309978c;
                                            String str5 = dVar4.f309976a;
                                            String str6 = dVar4.d;
                                            List listP03 = zhm.d0.P0(list10, new b83.a(arrayList, 10));
                                            xzg.n nVar2 = new xzg.n(str5, str4, str6, listP03, zhm.d0.P0(list11, new b83.a(list3, 11)), dVar4);
                                            if (listP03.isEmpty()) {
                                                return null;
                                            }
                                            return nVar2;
                                    }
                                }
                            });
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (list2 != null) {
                                List list7 = list2;
                                arrayList2 = new ArrayList(w.t(list7, i3));
                                Iterator it15 = list7.iterator();
                                while (it15.hasNext()) {
                                    arrayList2.add(((xzg.e) it15.next()).f309984b);
                                }
                            } else {
                                arrayList2 = null;
                            }
                            if (list3 == null) {
                                list3 = f0.f322471a;
                            }
                            if (arrayList2 == null) {
                                throw new IllegalArgumentException("Wrong type of collection provided.");
                            }
                            tv5.b bVar4 = cVar4.f303329c;
                            int i32 = x8h.b.f303325a[oVar.ordinal()];
                            if (i32 == 1) {
                                throw new IllegalStateException("Unsupported");
                            }
                            if (i32 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            final int i33 = 0;
                            rVarH = nim.a.w(u1.d(nim.a.w(((xv5.h) bVar4).a(a.b.f274717a), new m(arrayList2, i6)), nim.a.w(aVar3.a(list3, oVar), new x64.a(i21))), new Function1() { // from class: x8h.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    Pair pair3 = (Pair) obj4;
                                    switch (i33) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                                            List list72 = (List) pair3.f186385a;
                                            List list8 = (List) pair3.f186386b;
                                            xzg.d dVar3 = dVar2;
                                            String str = dVar3.f309978c;
                                            String str2 = dVar3.f309976a;
                                            String str3 = dVar3.d;
                                            ArrayList arrayList6 = new ArrayList();
                                            Iterator it152 = list72.iterator();
                                            while (true) {
                                                boolean zHasNext = it152.hasNext();
                                                List list9 = arrayList2;
                                                if (!zHasNext) {
                                                    List listP02 = zhm.d0.P0(arrayList6, new b83.a(list9, 8));
                                                    xzg.m mVar = new xzg.m(str2, str, str3, listP02, zhm.d0.P0(list8, new b83.a(list3, 9)), dVar3);
                                                    if (listP02.isEmpty()) {
                                                        return null;
                                                    }
                                                    return mVar;
                                                }
                                                Object next = it152.next();
                                                if (list9.contains(((xi0.b) next).f306286a)) {
                                                    arrayList6.add(next);
                                                }
                                            }
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                                            List list10 = (List) pair3.f186385a;
                                            List list11 = (List) pair3.f186386b;
                                            xzg.d dVar4 = dVar2;
                                            String str4 = dVar4.f309978c;
                                            String str5 = dVar4.f309976a;
                                            String str6 = dVar4.d;
                                            List listP03 = zhm.d0.P0(list10, new b83.a(arrayList2, 10));
                                            xzg.n nVar2 = new xzg.n(str5, str4, str6, listP03, zhm.d0.P0(list11, new b83.a(list3, 11)), dVar4);
                                            if (listP03.isEmpty()) {
                                                return null;
                                            }
                                            return nVar2;
                                    }
                                }
                            });
                        }
                    } else if (list5.isEmpty()) {
                        rVarH = te0.w.h(new Data(null, null, false, 7, null));
                    } else {
                        if (list3 == null) {
                            throw new IllegalArgumentException("Wrong type of collection provided.");
                        }
                        rVarH = nim.a.w(nim.a.w(aVar3.a(list3, oVar), new x64.a(i21)), new x52.a(dVar2, list3, 6));
                    }
                    arrayList5.add(rVarH);
                    i3 = 10;
                }
                return mif.a.l(arrayList5);
            case 28:
                zzg.r rVar = (zzg.r) obj3;
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new zzg.g(it16, zzg.f.PRIMARY, rVar.f326750c, rVar.d);
            default:
                x8h.g gVar2 = (x8h.g) obj3;
                zzg.r instrumentCollection = (zzg.r) obj2;
                Intrinsics.checkNotNullParameter(instrumentCollection, "instrumentCollection");
                zhm.q qVarK1 = zhm.d0.k1(instrumentCollection.f326749b);
                int iB = q0.b(w.t(qVarK1, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                Iterator it17 = qVarK1.iterator();
                while (true) {
                    kotlin.jvm.internal.d dVar3 = (kotlin.jvm.internal.d) it17;
                    if (!((Iterator) dVar3.f186416c).hasNext()) {
                        return rd0.e.b(nim.a.w(nim.a.w(ybl.b.b(gVar2.d, null, w4l.h.f294642c, new awk.j(linkedHashMap, 25), 1), new awk.j(linkedHashMap, 26)), new c(instrumentCollection, 28)));
                    }
                    IndexedValue indexedValue = (IndexedValue) dVar3.next();
                    linkedHashMap.put(((zzg.i) indexedValue.f186392b).f326738a, Integer.valueOf(indexedValue.f186391a));
                }
                break;
        }
    }

    public /* synthetic */ c(q qVar, a6f.i iVar) {
        this.f301541a = 21;
        this.f301542b = iVar;
    }
}
