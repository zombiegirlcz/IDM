package com.revolut.feature.corporate_events.impl.ui.screen.home;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.corporate_events.impl.R$string;
import com.revolut.feature.corporate_events.navigation.CorporateEventsFeatureConfig;
import g2e.t;
import h8b.c;
import hp3.m;
import hp3.n;
import hp3.r;
import hp3.s;
import hp3.u;
import hp3.y;
import iel.i;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jlh.g;
import jp3.f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import vkm.j2;
import yhl.d;
import yji.l;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements n {

    @NotNull
    public static final s Companion = new s();
    public final ihm.b A;
    public final ihm.b B;
    public LocalDate C;
    public LocalDate D;
    public final t E;
    public final f F;
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f66140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f66141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fkg.a f66142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f66143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f66144t;
    public final h8b.a u;
    public final aah.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LocalDate f66145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f66146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.b f66147y;
    public final ihm.b z;

    public b(y stateMapper, y eventsDialogMapper, d corporateEventsInteractor, ybl.b instrumentTickerInteractor, fkg.a corporateEventsInstrumentTransformer, j60.a bottomDialogExtension, c eventInfoMapperWrapper, h8b.a corporateEventDetailsNavigator, jp3.a paginationHelperFactory, CorporateEventsHomeScreenContract$Input inputData, i4b.f corporateEventsFilterResolver, aah.h wealthDisclaimersControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(eventsDialogMapper, "eventsDialogMapper");
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(corporateEventsInstrumentTransformer, "corporateEventsInstrumentTransformer");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(eventInfoMapperWrapper, "eventInfoMapperWrapper");
        Intrinsics.checkNotNullParameter(corporateEventDetailsNavigator, "corporateEventDetailsNavigator");
        Intrinsics.checkNotNullParameter(paginationHelperFactory, "paginationHelperFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(corporateEventsFilterResolver, "corporateEventsFilterResolver");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        this.o = eventsDialogMapper;
        this.f66140p = corporateEventsInteractor;
        this.f66141q = instrumentTickerInteractor;
        this.f66142r = corporateEventsInstrumentTransformer;
        this.f66143s = bottomDialogExtension;
        this.f66144t = eventInfoMapperWrapper;
        this.u = corporateEventDetailsNavigator;
        this.v = wealthDisclaimersControllerModelExtension;
        CorporateEventsFeatureConfig.CorporateEventsConfig corporateEventsConfig = inputData.f66136a;
        String str = "ALL_EVENTS_TAB_ID";
        if (!corporateEventsConfig.f66159b && corporateEventsConfig.f66158a == null) {
            str = "MY_EVENTS_TAB_ID";
        }
        String str2 = str;
        LocalDate initialDate = LocalDate.now();
        this.f66145w = initialDate;
        Intrinsics.checkNotNullExpressionValue(initialDate, "initialDate");
        Set setA = corporateEventsInteractor.a();
        Set set = corporateEventsConfig.f66160c;
        Set setA2 = ((d) corporateEventsFilterResolver.f158330b).a();
        if (set != null && !set.isEmpty()) {
            setA2 = d0.h0(set, setA2);
        }
        cli.y yVarB = mra.d.b(this, new m(initialDate, setA, setA2, str2, false, null, f0.f322471a, null, null, false, false, corporateEventsConfig.f66158a, new Data(null, null, true, 3, null), corporateEventsConfig.f66158a == null, null), stateMapper, null, false, 12);
        j2 j2Var = (j2) yVarB.f22677a;
        this.f66146x = yVarB;
        ihm.b bVarE = ihm.b.e(new Object());
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f66147y = bVarE;
        ihm.b bVarE2 = ihm.b.e(((m) j2Var.getValue()).d);
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.z = bVarE2;
        ihm.b bVarE3 = ihm.b.e(((m) j2Var.getValue()).f154415c);
        Intrinsics.checkNotNullExpressionValue(bVarE3, "createDefault(...)");
        this.A = bVarE3;
        String str3 = ((m) j2Var.getValue()).f;
        ihm.b bVarE4 = ihm.b.e(str3 == null ? "" : str3);
        Intrinsics.checkNotNullExpressionValue(bVarE4, "createDefault(...)");
        this.B = bVarE4;
        t delegate = new t(this, 11);
        this.E = delegate;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.F = new f(delegate);
    }

    @Override // yji.l
    public final void I1() {
        cli.y yVar = this.f66146x;
        String str = ((m) ((j2) yVar.f22677a).getValue()).f154419l;
        Continuation continuation = null;
        if (str != null) {
            l2(new hg0.n(this, str, continuation, 16), new yi5.b(26));
        } else {
            H2(yVar, new r(1));
        }
        String str2 = ((m) ((j2) yVar.f22677a).getValue()).f154419l;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        f fVar = this.F;
        efm.r map = fVar.f177202b.switchMap(new jof.a(7, new g(fVar, 8))).doOnNext(new jof.a(8, new je2.d(fVar, ref$BooleanRef, 29))).map(new jof.a(9, new jn2.a(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.a1(this, e.b(map), null, null, null, 7);
        l.a1(this, nim.a.v(this.v.f2828l.w0(), new r(0)), null, null, new u(this, null, 0), 3);
        efm.r rVarDistinctUntilChanged = this.z.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged2 = this.A.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged3 = this.B.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged3, "distinctUntilChanged(...)");
        l.a1(this, e.b(w.n(this.f66147y, rVarDistinctUntilChanged, rVarDistinctUntilChanged2, rVarDistinctUntilChanged3)), null, null, new f23.y(this, str2, continuation, 21), 3);
    }

    public final void I2(LocalDate localDate) {
        i iVarA;
        i iVarA2;
        i iVarA3;
        cli.y yVar = this.f66146x;
        LocalDate selectedDate = ((m) ((j2) yVar.f22677a).getValue()).f154413a;
        LocalDate minAvailableDate = this.f66145w.withDayOfMonth(1).minusMonths(2L);
        Intrinsics.checkNotNullExpressionValue(minAvailableDate, "minusMonths(...)");
        List list = ((m) ((j2) yVar.f22677a).getValue()).f154416g;
        ArrayList events = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Iterable iterable = (List) ((hp3.l) it8.next()).f154412c.getContent();
            if (iterable == null) {
                iterable = f0.f322471a;
            }
            a0.x(iterable, events);
        }
        this.o.getClass();
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
        Intrinsics.checkNotNullParameter(events, "events");
        LocalDate localDate2 = localDate == null ? selectedDate : localDate;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : events) {
            LocalDate localDateF = ((kp3.b) obj2).a().f();
            Object objU = linkedHashMap.get(localDateF);
            if (objU == null) {
                objU = h30.l.u(linkedHashMap, localDateF);
            }
            ((List) objU).add(obj2);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it9 = linkedHashMap.entrySet().iterator();
        while (true) {
            jw0.a aVar = null;
            if (!it9.hasNext()) {
                List listC = zhm.u.c(new g5("DATE_PICKER_ID", localDate2, selectedDate, false, null, minAvailableDate, null, r0.t(arrayList), null, null, 0, 0, 1047736));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                sfm.b bVarG = this.f66143s.G(new rp0.y(d0.F0(new LargeActionButtonDelegate.Model("CALENDAR_TODAY_BUTTON_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.feature_corporate_events_calendar_button_today, null, null, 14), false, null, null, null, null, 1000), listC), null, rp0.l.WINDOW, 0, "CALENDAR_PARCEL", null, 970)).g(efm.r.just(Unit.f186387a));
                Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                l.a1(this, e.b(bVarG), null, null, null, 7);
                return;
            }
            Map.Entry entry = (Map.Entry) it9.next();
            LocalDate localDate3 = (LocalDate) entry.getKey();
            List list2 = (List) entry.getValue();
            kp3.b bVar = (kp3.b) d0.e0(0, list2);
            jw0.a aVar2 = (bVar == null || (iVarA3 = bVar.a()) == null) ? null : new jw0.a(j8b.i.b(iVarA3));
            kp3.b bVar2 = (kp3.b) d0.e0(1, list2);
            jw0.a aVar3 = (bVar2 == null || (iVarA2 = bVar2.a()) == null) ? null : new jw0.a(j8b.i.b(iVarA2));
            kp3.b bVar3 = (kp3.b) d0.e0(2, list2);
            jw0.a aVar4 = (bVar3 == null || (iVarA = bVar3.a()) == null) ? null : new jw0.a(j8b.i.b(iVarA));
            if (((kp3.b) d0.e0(3, list2)) != null) {
                aVar = new jw0.a(R$attr.uikit_colorGreyTone50);
            }
            arrayList.add(new Pair(localDate3, new vf0.h(aVar2, aVar3, aVar4, aVar)));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        cli.y yVar = this.f66146x;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (((m) j2Var.getValue()).k || ((m) j2Var2.getValue()).f154416g.isEmpty()) {
            return;
        }
        List<hp3.l> list = ((m) j2Var2.getValue()).f154416g;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (hp3.l lVar : list) {
                if (lVar.f154412c.getLoading() || lVar.f154412c.getError() != null) {
                    return;
                }
            }
        }
        if (Intrinsics.f(((m) j2Var2.getValue()).d, "MY_EVENTS_TAB_ID")) {
            this.f66147y.onNext(new Object());
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f66146x;
    }
}
