package gp3;

import android.os.Parcelable;
import aw0.c7;
import aw0.n6;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.corporate_events.impl.R$string;
import iel.a0;
import iel.w;
import iel.x;
import iel.y;
import iel.z;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h8b.c f145246a;

    public r(h8b.c infoMapperWrapper) {
        Intrinsics.checkNotNullParameter(infoMapperWrapper, "infoMapperWrapper");
        this.f145246a = infoMapperWrapper;
    }

    public static n6 a(int i, d dVar) {
        return new n6(new TextLocalisedClause(i, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, dVar, 508);
    }

    public static n6 b() {
        return new n6(new TextLocalisedClause(R$string.feature_corporate_events_bubble_stock_details, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, d.ASSET_DETAILS, 508);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g gVar;
        final b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f145226a;
        List list = null;
        if (data != null) {
            final int i = 1;
            gVar = (g) iii.c.f(data, new gn.a(16), new n(3), new Function3(this) { // from class: gp3.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f145244b;

                {
                    this.f145244b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
                    List listE0;
                    m8b.o oVar;
                    List listA;
                    List listA2;
                    Pair pair;
                    qv0.i iVar;
                    int i2 = i;
                    b bVar = domainState;
                    r rVar = this.f145244b;
                    switch (i2) {
                        case 0:
                            c eventData = (c) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(eventData, "eventData");
                            h8b.c cVar = rVar.f145246a;
                            kp3.b corporateEvent = eventData.f145229a;
                            BigDecimal userOwnership = eventData.f145231c;
                            boolean z = bVar.f145228c;
                            List restructuredInstruments = eventData.f145230b;
                            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
                            Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
                            Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
                            jx0.a aVar = cVar.f149972a;
                            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
                            Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
                            Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
                            m8b.r rVar2 = (m8b.r) aVar.f179039c;
                            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
                            Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
                            Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
                            Iterable iterableG = null;
                            if (corporateEvent instanceof kp3.a) {
                                ib7.j jVar2 = rVar2.f203470a;
                                iel.a aVar2 = ((kp3.a) corporateEvent).f188164a;
                                k8b.a aVarA = jVar2.a(aVar2);
                                if (aVarA == null) {
                                    hx7.e.n(new IllegalStateException("No AssetEventMapper registered for ".concat(aVar2.getClass().getSimpleName())));
                                    listE0 = f0.f322471a;
                                } else {
                                    List listB = aVarA.b(aVar2, userOwnership, false, restructuredInstruments);
                                    if (aVar2 instanceof iel.h) {
                                        iel.h hVar = (iel.h) aVar2;
                                        pair = new Pair(v.l(null), Boolean.valueOf(!(z && ((oi0.d.A(hVar) && hVar.f != null) || (!oi0.d.A(hVar) && hVar.e != null)))));
                                    } else {
                                        pair = (!(aVar2 instanceof iel.c) && (aVar2 instanceof z)) ? new Pair(v.l(null), Boolean.TRUE) : new Pair(v.l(null), Boolean.TRUE);
                                    }
                                    List list2 = (List) pair.f186385a;
                                    boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                                    qv0.i iVarC = aVarA.c(aVar2);
                                    if (iVarC != null) {
                                        yp0.b.r(iVarC, 0, zBooleanValue ? R$attr.uikit_dp32 : R$attr.uikit_dp8, 0, 0, 13);
                                        iVar = iVarC;
                                    } else {
                                        iVar = null;
                                    }
                                    yp0.b.k(listB, R$attr.uikit_dp16, (iVar == null && zBooleanValue) ? R$attr.uikit_dp24 : R$attr.uikit_dp0, 0, 0, 28);
                                    listE0 = d0.E0(list2, d0.E0(v.l(iVar), listB));
                                }
                            } else {
                                if (!(corporateEvent instanceof kp3.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iel.i iVar2 = ((kp3.c) corporateEvent).f188166a;
                                if (!(iVar2 instanceof iel.p)) {
                                    if (!(iVar2 instanceof iel.b) && !(iVar2 instanceof iel.d) && !(iVar2 instanceof iel.h) && !(iVar2 instanceof iel.k) && !(iVar2 instanceof iel.o) && !(iVar2 instanceof iel.r) && !(iVar2 instanceof iel.v) && !(iVar2 instanceof x) && !(iVar2 instanceof y) && !(iVar2 instanceof a0) && !(iVar2 instanceof iel.c) && !(iVar2 instanceof iel.m) && !(iVar2 instanceof iel.g) && !(iVar2 instanceof iel.q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalStateException((iVar2 + " is not a valid GeneralCorporateEvent").toString());
                                }
                                iel.p pVar = (iel.p) iVar2;
                                String str = pVar.f160802a;
                                List listK = v.k(new CellDetailsDelegate.Model(a0.d.r(str, "_type"), new t0((Clause) new TextLocalisedClause(com.revolut.feature.retail.corporate_events.common.R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.k(pVar), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model(a0.d.r(str, "_date"), new t0((Clause) new TextLocalisedClause(com.revolut.feature.retail.corporate_events.common.R$string.feature_corporate_events_bubble_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, pVar.f160803b, LocalDateClause$DateFormat.DateLong.f57804a), null, null, null, null, 0, null, false, false, null, null, 32760));
                                yp0.b.k(listK, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 28);
                                listE0 = listK;
                            }
                            List list3 = listE0;
                            kp3.b corporateEvent2 = eventData.f145229a;
                            Map expandedState = bVar.d;
                            Intrinsics.checkNotNullParameter(corporateEvent2, "corporateEvent");
                            Intrinsics.checkNotNullParameter(expandedState, "expandedState");
                            Intrinsics.checkNotNullParameter(corporateEvent2, "corporateEvent");
                            Intrinsics.checkNotNullParameter(expandedState, "expandedState");
                            Intrinsics.checkNotNullParameter(corporateEvent2, "corporateEvent");
                            Intrinsics.checkNotNullParameter(expandedState, "expandedState");
                            iel.i iVarA = corporateEvent2.a();
                            if ((iVarA instanceof iel.d) || (iVarA instanceof iel.k)) {
                                oVar = m8b.g.e;
                            } else if (iVarA instanceof x) {
                                oVar = m8b.m.e;
                            } else if (iVarA instanceof a0) {
                                oVar = m8b.n.e;
                            } else if (iVarA instanceof iel.h) {
                                oVar = m8b.h.e;
                            } else if (iVarA instanceof y) {
                                w wVar = ((y) iVarA).f160829g;
                                oVar = wVar.f160821a < wVar.f160822b ? m8b.i.e : m8b.k.e;
                            } else if (iVarA instanceof iel.r) {
                                oVar = m8b.j.e;
                            } else if (iVarA instanceof iel.v) {
                                oVar = m8b.l.e;
                            } else if (iVarA instanceof iel.b) {
                                oVar = m8b.f.e;
                            } else {
                                if (!(iVarA instanceof iel.o) && !(iVarA instanceof iel.p) && !(iVarA instanceof iel.c) && !(iVarA instanceof iel.m) && !(iVarA instanceof iel.g) && !(iVarA instanceof iel.q)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oVar = null;
                            }
                            if (oVar != null) {
                                m8b.p pVar2 = (m8b.p) oVar.f203465a;
                                m8b.d dVar = m8b.d.OVERVIEW;
                                List listA3 = m8b.q.a(pVar2, "OVERVIEW", pd.b.j((Boolean) expandedState.get(dVar)), dVar);
                                m8b.p pVar3 = (m8b.p) oVar.f203466b;
                                m8b.d dVar2 = m8b.d.IMPACT;
                                List listA4 = m8b.q.a(pVar3, "IMPACT", pd.b.j((Boolean) expandedState.get(dVar2)), dVar2);
                                m8b.p pVar4 = (m8b.p) oVar.f203467c;
                                if (pVar4 != null) {
                                    m8b.d dVar3 = m8b.d.RATIONALE;
                                    listA = m8b.q.a(pVar4, "RATIONALE", pd.b.j((Boolean) expandedState.get(dVar3)), dVar3);
                                } else {
                                    listA = null;
                                }
                                m8b.p pVar5 = (m8b.p) oVar.d;
                                if (pVar5 != null) {
                                    m8b.d dVar4 = m8b.d.OTHERS;
                                    listA2 = m8b.q.a(pVar5, "OTHERS", pd.b.j((Boolean) expandedState.get(dVar4)), dVar4);
                                } else {
                                    listA2 = null;
                                }
                                List[] elements = {listA3, listA4, listA, listA2};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                iterableG = yp0.b.g(zhm.w.u(kotlin.collections.d.L(elements)), new ListSubheaderDelegate.Model("CORPORATE_EVENT_FAQ_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.corporate_events.common.R$string.trading_corporate_event_learn_more_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                            }
                            if (iterableG == null) {
                                iterableG = f0.f322471a;
                            }
                            if (iterableG == null) {
                                iterableG = f0.f322471a;
                            }
                            return d0.E0(iterableG, list3);
                        default:
                            c eventData2 = (c) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(eventData2, "eventData");
                            m8b.e eVarB = rVar.f145246a.b(eventData2.f145229a, eventData2.f145230b, bVar.f145227b);
                            m8b.c cVar2 = eVarB.e;
                            if (cVar2 instanceof m8b.b) {
                                return f.f145233a;
                            }
                            CircleBadgeModel circleBadgeModel = eVarB.d;
                            Clause title = eVarB.f203462a;
                            Clause clause = eVarB.f203463b;
                            Image image = eVarB.f203464c;
                            Intrinsics.checkNotNullParameter(title, "title");
                            return new e(new m8b.e(title, clause, image, circleBadgeModel, cVar2));
                    }
                }
            });
        } else {
            gVar = null;
        }
        aw0.i iVar = data != null ? (aw0.i) iii.c.f(data, new gn.a(15), new n(2), new gna.i(this, domainState, 3)) : null;
        if (data != null) {
            final int i2 = 0;
            list = (List) iii.c.f(data, new gn.a(14), new n(1), new Function3(this) { // from class: gp3.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f145244b;

                {
                    this.f145244b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
                    List listE0;
                    m8b.o oVar;
                    List listA;
                    List listA2;
                    Pair pair;
                    qv0.i iVar2;
                    int i22 = i2;
                    b bVar = domainState;
                    r rVar = this.f145244b;
                    switch (i22) {
                        case 0:
                            c eventData = (c) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(eventData, "eventData");
                            h8b.c cVar = rVar.f145246a;
                            kp3.b corporateEvent = eventData.f145229a;
                            BigDecimal userOwnership = eventData.f145231c;
                            boolean z = bVar.f145228c;
                            List restructuredInstruments = eventData.f145230b;
                            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
                            Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
                            Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
                            jx0.a aVar = cVar.f149972a;
                            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
                            Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
                            Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
                            m8b.r rVar2 = (m8b.r) aVar.f179039c;
                            Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
                            Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
                            Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
                            Iterable iterableG = null;
                            if (corporateEvent instanceof kp3.a) {
                                ib7.j jVar2 = rVar2.f203470a;
                                iel.a aVar2 = ((kp3.a) corporateEvent).f188164a;
                                k8b.a aVarA = jVar2.a(aVar2);
                                if (aVarA == null) {
                                    hx7.e.n(new IllegalStateException("No AssetEventMapper registered for ".concat(aVar2.getClass().getSimpleName())));
                                    listE0 = f0.f322471a;
                                } else {
                                    List listB = aVarA.b(aVar2, userOwnership, false, restructuredInstruments);
                                    if (aVar2 instanceof iel.h) {
                                        iel.h hVar = (iel.h) aVar2;
                                        pair = new Pair(v.l(null), Boolean.valueOf(!(z && ((oi0.d.A(hVar) && hVar.f != null) || (!oi0.d.A(hVar) && hVar.e != null)))));
                                    } else {
                                        pair = (!(aVar2 instanceof iel.c) && (aVar2 instanceof z)) ? new Pair(v.l(null), Boolean.TRUE) : new Pair(v.l(null), Boolean.TRUE);
                                    }
                                    List list2 = (List) pair.f186385a;
                                    boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                                    qv0.i iVarC = aVarA.c(aVar2);
                                    if (iVarC != null) {
                                        yp0.b.r(iVarC, 0, zBooleanValue ? R$attr.uikit_dp32 : R$attr.uikit_dp8, 0, 0, 13);
                                        iVar2 = iVarC;
                                    } else {
                                        iVar2 = null;
                                    }
                                    yp0.b.k(listB, R$attr.uikit_dp16, (iVar2 == null && zBooleanValue) ? R$attr.uikit_dp24 : R$attr.uikit_dp0, 0, 0, 28);
                                    listE0 = d0.E0(list2, d0.E0(v.l(iVar2), listB));
                                }
                            } else {
                                if (!(corporateEvent instanceof kp3.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iel.i iVar22 = ((kp3.c) corporateEvent).f188166a;
                                if (!(iVar22 instanceof iel.p)) {
                                    if (!(iVar22 instanceof iel.b) && !(iVar22 instanceof iel.d) && !(iVar22 instanceof iel.h) && !(iVar22 instanceof iel.k) && !(iVar22 instanceof iel.o) && !(iVar22 instanceof iel.r) && !(iVar22 instanceof iel.v) && !(iVar22 instanceof x) && !(iVar22 instanceof y) && !(iVar22 instanceof a0) && !(iVar22 instanceof iel.c) && !(iVar22 instanceof iel.m) && !(iVar22 instanceof iel.g) && !(iVar22 instanceof iel.q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalStateException((iVar22 + " is not a valid GeneralCorporateEvent").toString());
                                }
                                iel.p pVar = (iel.p) iVar22;
                                String str = pVar.f160802a;
                                List listK = v.k(new CellDetailsDelegate.Model(a0.d.r(str, "_type"), new t0((Clause) new TextLocalisedClause(com.revolut.feature.retail.corporate_events.common.R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.k(pVar), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model(a0.d.r(str, "_date"), new t0((Clause) new TextLocalisedClause(com.revolut.feature.retail.corporate_events.common.R$string.feature_corporate_events_bubble_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, pVar.f160803b, LocalDateClause$DateFormat.DateLong.f57804a), null, null, null, null, 0, null, false, false, null, null, 32760));
                                yp0.b.k(listK, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 28);
                                listE0 = listK;
                            }
                            List list3 = listE0;
                            kp3.b corporateEvent2 = eventData.f145229a;
                            Map expandedState = bVar.d;
                            Intrinsics.checkNotNullParameter(corporateEvent2, "corporateEvent");
                            Intrinsics.checkNotNullParameter(expandedState, "expandedState");
                            Intrinsics.checkNotNullParameter(corporateEvent2, "corporateEvent");
                            Intrinsics.checkNotNullParameter(expandedState, "expandedState");
                            Intrinsics.checkNotNullParameter(corporateEvent2, "corporateEvent");
                            Intrinsics.checkNotNullParameter(expandedState, "expandedState");
                            iel.i iVarA = corporateEvent2.a();
                            if ((iVarA instanceof iel.d) || (iVarA instanceof iel.k)) {
                                oVar = m8b.g.e;
                            } else if (iVarA instanceof x) {
                                oVar = m8b.m.e;
                            } else if (iVarA instanceof a0) {
                                oVar = m8b.n.e;
                            } else if (iVarA instanceof iel.h) {
                                oVar = m8b.h.e;
                            } else if (iVarA instanceof y) {
                                w wVar = ((y) iVarA).f160829g;
                                oVar = wVar.f160821a < wVar.f160822b ? m8b.i.e : m8b.k.e;
                            } else if (iVarA instanceof iel.r) {
                                oVar = m8b.j.e;
                            } else if (iVarA instanceof iel.v) {
                                oVar = m8b.l.e;
                            } else if (iVarA instanceof iel.b) {
                                oVar = m8b.f.e;
                            } else {
                                if (!(iVarA instanceof iel.o) && !(iVarA instanceof iel.p) && !(iVarA instanceof iel.c) && !(iVarA instanceof iel.m) && !(iVarA instanceof iel.g) && !(iVarA instanceof iel.q)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oVar = null;
                            }
                            if (oVar != null) {
                                m8b.p pVar2 = (m8b.p) oVar.f203465a;
                                m8b.d dVar = m8b.d.OVERVIEW;
                                List listA3 = m8b.q.a(pVar2, "OVERVIEW", pd.b.j((Boolean) expandedState.get(dVar)), dVar);
                                m8b.p pVar3 = (m8b.p) oVar.f203466b;
                                m8b.d dVar2 = m8b.d.IMPACT;
                                List listA4 = m8b.q.a(pVar3, "IMPACT", pd.b.j((Boolean) expandedState.get(dVar2)), dVar2);
                                m8b.p pVar4 = (m8b.p) oVar.f203467c;
                                if (pVar4 != null) {
                                    m8b.d dVar3 = m8b.d.RATIONALE;
                                    listA = m8b.q.a(pVar4, "RATIONALE", pd.b.j((Boolean) expandedState.get(dVar3)), dVar3);
                                } else {
                                    listA = null;
                                }
                                m8b.p pVar5 = (m8b.p) oVar.d;
                                if (pVar5 != null) {
                                    m8b.d dVar4 = m8b.d.OTHERS;
                                    listA2 = m8b.q.a(pVar5, "OTHERS", pd.b.j((Boolean) expandedState.get(dVar4)), dVar4);
                                } else {
                                    listA2 = null;
                                }
                                List[] elements = {listA3, listA4, listA, listA2};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                iterableG = yp0.b.g(zhm.w.u(kotlin.collections.d.L(elements)), new ListSubheaderDelegate.Model("CORPORATE_EVENT_FAQ_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.corporate_events.common.R$string.trading_corporate_event_learn_more_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                            }
                            if (iterableG == null) {
                                iterableG = f0.f322471a;
                            }
                            if (iterableG == null) {
                                iterableG = f0.f322471a;
                            }
                            return d0.E0(iterableG, list3);
                        default:
                            c eventData2 = (c) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(eventData2, "eventData");
                            m8b.e eVarB = rVar.f145246a.b(eventData2.f145229a, eventData2.f145230b, bVar.f145227b);
                            m8b.c cVar2 = eVarB.e;
                            if (cVar2 instanceof m8b.b) {
                                return f.f145233a;
                            }
                            CircleBadgeModel circleBadgeModel = eVarB.d;
                            Clause title = eVarB.f203462a;
                            Clause clause = eVarB.f203463b;
                            Image image = eVarB.f203464c;
                            Intrinsics.checkNotNullParameter(title, "title");
                            return new e(new m8b.e(title, clause, image, circleBadgeModel, cVar2));
                    }
                }
            });
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new h(gVar, iVar, list);
    }
}
