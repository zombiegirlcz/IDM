package to7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingBrazilDestination;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.retail.main_screen.container.models.action_payload.StatementsLoadPayload;
import com.revolut.feature.rewards.api.navigation.ExternalRewardRegistration;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.impl.navigation.ThemeCustomisationDeeplinkDescriptor;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.event_appearance.api.models.EventAppearance;
import com.revolut.shared.feature.wealth_discovery.domain.api.CorporateEventsApi$Toggles$TradingEventsChartHistoryRefetch;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import tof.a3;
import ueg.p0;
import v6l.b1;
import v6l.h0;
import wf0.j0;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f272526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f272527c;

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f272525a = i;
        this.f272526b = obj2;
        this.f272527c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean boolValueOf;
        Object next;
        jq9.o oVar;
        wf0.h0 h0Var;
        String str;
        String str2;
        int i = 10;
        int i2 = 14;
        boolean z = true;
        switch (this.f272525a) {
            case 0:
                Object obj2 = this.f272526b;
                h hVar = (h) this.f272527c;
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.pickers.CountryPickerParams");
                List<wi0.b> list = ((i) obj2).f272534a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (wi0.b bVar : list) {
                    String code = bVar.f297794a;
                    String str3 = bVar.f297794a;
                    o8b.c cVar = (o8b.c) hVar.f272530a;
                    String displayName = cVar.b(code);
                    Intrinsics.checkNotNullParameter(code, "code");
                    Intrinsics.checkNotNullParameter(displayName, "displayName");
                    arrayList.add(new RowDelegate.Model(com.google.android.gms.internal.mlkit_vision_face.a.o(code, "_", displayName), new RowDelegate.Model.MainImage.Image40(new CountryImage(str3, (Integer) null, (ez0.e) null, 14), null, null, false, null, false, 62), new TextClause(cVar.b(str3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862712));
                }
                return new Data(arrayList, null, false, 6, null);
            case 1:
                twh.d dVar = (twh.d) this.f272526b;
                String str4 = (String) this.f272527c;
                synchronized (dVar.e) {
                    try {
                        if (!dVar.f.contains(str4)) {
                            dVar.f.add(str4);
                            z = false;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return boolValueOf;
            case 2:
                twl.p pVar = (twl.p) this.f272526b;
                a3 a3Var = (a3) this.f272527c;
                pVar.i.c(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.d(a3Var.f272581b, a3Var.f272579a), null, null, null, 126))));
                return Unit.f186387a;
            case 3:
                return Boolean.valueOf(((ty1.b) this.f272526b).b((uw1.f) this.f272527c));
            case 4:
                ((tyd.f) this.f272526b).f275562c.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.AS_TOP, new MainContainerActionData(new MainContainerActionId("statementsLoadPayloadActionId"), new StatementsLoadPayload((String) this.f272527c)))));
                return Boolean.TRUE;
            case 5:
                u2i.y yVar = (u2i.y) this.f272526b;
                rp0.y yVarB = yVar.f276704g.b((n0i.a) this.f272527c);
                if (yVarB == null) {
                    return null;
                }
                ((opi.b) yVar.f).Z(yVarB);
                return Unit.f186387a;
            case 6:
                ((uge.j) this.f272526b).f280032a.c(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new ThemeCustomisationDeeplinkDescriptor(Intrinsics.f((String) ((jf0.c) this.f272527c).d.get("tab"), "mode") ? cm2.i.MODE : null))), null, null, 12));
                return Boolean.TRUE;
            case 7:
                uhl.e eVar = (uhl.e) this.f272526b;
                Set set = (Set) this.f272527c;
                od0.i iVarA = od0.i.f224256b;
                if (!((jte.d) eVar.e).c(CorporateEventsApi$Toggles$TradingEventsChartHistoryRefetch.f105366c) || eVar.c().containsAll(set)) {
                    efm.d0 d0VarA = eVar.f280277c.a();
                    ubj.c cVar2 = new ubj.c(28, new p0(i2));
                    d0VarA.getClass();
                    ufm.i iVar = new ufm.i(d0VarA, cVar2, 1);
                    od0.i.Companion.getClass();
                    return iVar.o(new uhl.d(iVarA, zhm.h0.f322473a));
                }
                Long l2 = (Long) eVar.b().get(uhl.e.d(set));
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    od0.h hVar2 = od0.i.Companion;
                    ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), ZoneId.of("UTC"));
                    hVar2.getClass();
                    iVarA = od0.h.a(zonedDateTimeOfInstant);
                } else {
                    od0.i.Companion.getClass();
                }
                return efm.d0.m(new uhl.d(iVarA, set));
            case 8:
                UUID uuid = (UUID) j6.a.k(UUID.class, ((v20.f0) this.f272526b).f285387h, (String) this.f272527c);
                return uuid == null ? new UUID(0L, 0L) : uuid;
            case 9:
                b1 b1Var = (b1) this.f272526b;
                String str5 = (String) this.f272527c;
                Iterator it8 = b1Var.g().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((u6l.j) next).getId(), str5)) {
                        }
                    } else {
                        next = null;
                    }
                }
                u6l.j jVar = (u6l.j) next;
                if (jVar == null) {
                    return null;
                }
                h93.q qVar = h93.q.ACTIVE;
                b1Var.f286432n.j(h0.a.f286452a, b1Var.r(b1Var.p(zhm.u.c(u6l.j.a(jVar, null, null, null, qVar.a(), qVar.a(), 1073741823)), false)));
                return Unit.f186387a;
            case 10:
                return b1.d((List) this.f272526b, (b93.d) this.f272527c);
            case 11:
                b1 b1Var2 = (b1) this.f272526b;
                u6l.j jVarE = u6l.k.e((h93.f0) this.f272527c);
                b1Var2.getClass();
                b1Var2.f286432n.j(h0.a.f286452a, b1Var2.r(b1Var2.p(zhm.u.c(jVarE), false)));
                return Unit.f186387a;
            case 12:
                v7l.e eVar2 = (v7l.e) this.f272526b;
                EventAppearance eventAppearance = (EventAppearance) this.f272527c;
                ue0.c cVar3 = eVar2.f286683a;
                Intrinsics.checkNotNullParameter(eventAppearance, "<this>");
                cVar3.G(new t7l.a(eventAppearance.f104713a), "EVENT_APPEARANCE_KEY", wim.z.d(o0.b(t7l.a.class)));
                w4l.f fVar = eVar2.f286685c;
                Unit unit = Unit.f186387a;
                od0.i.Companion.getClass();
                fVar.k(unit, od0.h.a(eventAppearance));
                return unit;
            case 13:
                v9k.c cVar4 = (v9k.c) this.f272526b;
                jf0.c cVar5 = (jf0.c) this.f272527c;
                if (!(((cn0.g) cVar4.d).d() instanceof mm0.m)) {
                    return efm.d0.m(Boolean.TRUE);
                }
                String strE = cVar5.e(4);
                m70.a.c(t0.f186434a);
                if (!Intrinsics.f(strE, "")) {
                    ufm.b bVarM = efm.d0.m(Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                z95.b bVarB = v9k.c.b(cVar5);
                if (bVarB != null) {
                    ufm.i iVar2 = new ufm.i(new ufm.f(cVar4.f287076b.b(bVarB).f(((y9k.b) cVar4.f287077c).a()), new v6l.e0(17, new v25.k(cVar4, 24)), 3), new v6l.e0(18, new v80.a(i)), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    return iVar2;
                }
                ufm.b bVarM2 = efm.d0.m(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
            case 14:
                vb7.f fVar2 = (vb7.f) this.f272526b;
                String str6 = (String) this.f272527c;
                List list2 = (List) fVar2.f287442b.get("surveys_key");
                if (list2 == null) {
                    return pfm.m.f235744a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!Intrinsics.f(((zb7.g) obj3).f320838a, str6)) {
                        arrayList2.add(obj3);
                    }
                }
                fVar2.f.j(Unit.f186387a, arrayList2);
                return te0.w.g0(fVar2.f287441a.closeSurvey(str6));
            case 15:
                return ((efm.r) this.f272526b).doOnNext(new vf0.n(new ky4.g(new AtomicBoolean(true), (Function1) this.f272527c, 2), 5));
            case 16:
                jf0.c cVar6 = (jf0.c) this.f272526b;
                ((vhc.g) this.f272527c).f289465a.c(vhi.c.c(new ExternalRewardRegistration(cVar6.e(2), cVar6.d), yhi.b.SOLID, null, false, 12));
                return Boolean.TRUE;
            case 17:
                vli.k kVar = (vli.k) this.f272526b;
                FeatureCommand featureCommand = (FeatureCommand) this.f272527c;
                sri.m mVar = kVar.d;
                Intrinsics.h(featureCommand);
                mVar.c(featureCommand);
                return Unit.f186387a;
            case 18:
                ((vli.k) this.f272526b).d.c(new CompositeCommand(jbb.a.a(ibb.c.f160140a, null, null, null, 14), vli.k.b((String) this.f272527c)));
                return Unit.f186387a;
            case 19:
                ((vqb.d) this.f272526b).f291368a.c((NaviCommand) this.f272527c);
                return Boolean.TRUE;
            case 20:
                vw4.f fVar3 = (vw4.f) this.f272526b;
                FeatureCommand featureCommand2 = (FeatureCommand) this.f272527c;
                sri.m mVar2 = fVar3.f292631a;
                Intrinsics.h(featureCommand2);
                mVar2.c(featureCommand2);
                return Unit.f186387a;
            case 21:
                List list3 = (List) this.f272526b;
                List<ba6.l> list4 = (List) this.f272527c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list3) {
                    if (obj4 instanceof ux9.f) {
                        arrayList3.add(obj4);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : arrayList3) {
                    String str7 = ((ux9.f) obj5).f283922a;
                    Object objO = linkedHashMap.get(str7);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str7);
                    }
                    ((List) objO).add(obj5);
                }
                ArrayList arrayList4 = new ArrayList();
                for (ba6.l lVar : list4) {
                    List list5 = (List) linkedHashMap.get(lVar.f13938a);
                    if (list5 != null) {
                        Iterator it9 = list5.iterator();
                        if (!it9.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next2 = it9.next();
                        if (it9.hasNext()) {
                            long timestamp = ((ux9.f) next2).getTimestamp();
                            do {
                                Object next3 = it9.next();
                                long timestamp2 = ((ux9.f) next3).getTimestamp();
                                if (timestamp < timestamp2) {
                                    next2 = next3;
                                    timestamp = timestamp2;
                                }
                            } while (it9.hasNext());
                        }
                        oVar = new jq9.o(lVar, ((ux9.f) next2).f283923b, 0, 12);
                    } else {
                        oVar = null;
                    }
                    if (oVar != null) {
                        arrayList4.add(oVar);
                    }
                }
                return arrayList4;
            case 22:
                vz1.j jVar2 = (vz1.j) this.f272526b;
                n02.c cVar7 = (n02.c) this.f272527c;
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, jVar2.f293367a, "KEY_CONTACT_PERMISSION_DISCLAIMER_" + cVar7, Boolean.TRUE);
                return Unit.f186387a;
            case 23:
                w21.o oVar2 = (w21.o) this.f272526b;
                String str8 = (String) this.f272527c;
                ue0.c cVar8 = oVar2.f293933c;
                String strB = w21.o.b(str8);
                Type EXTERNAL_INSTITUTION_IBAN_STATUS_TYPE = w21.o.f293929l;
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_INSTITUTION_IBAN_STATUS_TYPE, "EXTERNAL_INSTITUTION_IBAN_STATUS_TYPE");
                p21.a entity = (p21.a) cVar8.T2(strB, EXTERNAL_INSTITUTION_IBAN_STATUS_TYPE);
                if (entity == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new x61.c(entity.getIban(), entity.getSubmitted());
            case 24:
                return new Data(((Function1) this.f272527c).invoke(this.f272526b), null, false, 6, null);
            case 25:
                wdd.a aVar = (wdd.a) this.f272526b;
                vdd.i iVar3 = (vdd.i) this.f272527c;
                aVar.a().f(iVar3);
                return iVar3;
            case 26:
                j0 j0Var = (j0) this.f272526b;
                String str9 = (String) this.f272527c;
                synchronized (j0Var) {
                    h0Var = j0Var.f296897c;
                    if (h0Var == null || !Intrinsics.f(h0Var.f296891a, str9)) {
                        zf0.e eVarB = j0Var.f296896b.b("FAQ_PATH_KEY");
                        if (eVarB == null || (str = eVarB.f321839b) == null) {
                            str = "";
                        }
                        if (str.length() <= 0 || str.equals("faq")) {
                            zf0.e eVarB2 = j0Var.f296896b.b("faq-locale");
                            if (!Intrinsics.f(eVarB2 != null ? eVarB2.f321839b : null, str9)) {
                                j0Var.f296896b.c(new zf0.e(j0Var.a(str9), ""));
                                j0Var.f296896b.c(new zf0.e("FAQ_PATH_KEY", "faq"));
                                j0Var.f296896b.c(new zf0.e("faq-locale", str9));
                            }
                            zf0.e eVarB3 = j0Var.f296896b.b(j0Var.a(str9));
                            if (eVarB3 == null || (str2 = eVarB3.f321839b) == null) {
                                str2 = "";
                            }
                            h0Var = new wf0.h0(str9, str2);
                            j0Var.f296897c = h0Var;
                        } else {
                            j0Var.f296895a.b();
                            j0Var.f296896b.a();
                            j0Var.f296896b.c(new zf0.e("FAQ_PATH_KEY", "faq"));
                            j0Var.f296896b.c(new zf0.e("faq-locale", str9));
                            j0Var.f296896b.c(new zf0.e(j0Var.a(str9), ""));
                            h0Var = new wf0.h0(str9, "");
                            j0Var.f296897c = h0Var;
                        }
                    }
                }
                return h0Var.b();
            case 27:
                ((wf6.c) this.f272526b).f296976a.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), wf6.c.b((jf0.c) this.f272527c)))));
                return Boolean.TRUE;
            case 28:
                ((wf6.n) this.f272526b).f297001a.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.IndiaNetBankingPayload(Intrinsics.f(((jf0.c) this.f272527c).d.get("success"), "true"))))));
                return Boolean.TRUE;
            default:
                wf6.v vVar = (wf6.v) this.f272526b;
                jf0.c cVar9 = (jf0.c) this.f272527c;
                sri.m mVar3 = vVar.f297013a;
                OpenBankingBrazilDestination openBankingBrazilDestinationB = wf6.v.b(cVar9);
                mVar3.c(openBankingBrazilDestinationB != null ? u0.f(openBankingBrazilDestinationB) : DummyCommand.f98635a);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ f(Object obj2, Function1 function1) {
        this.f272525a = 24;
        this.f272527c = function1;
        this.f272526b = obj2;
    }

    public /* synthetic */ f(b1 b1Var, List list, b93.d dVar) {
        this.f272525a = 10;
        this.f272526b = list;
        this.f272527c = dVar;
    }
}
