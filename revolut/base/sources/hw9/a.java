package hw9;

import ael.q0;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import cfl.m;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$JointAccountsPlanCards;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract$RenewalOptInUpdateSterilizedAction;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.action.PetRenewalActionContract$RenewalOptInAction;
import com.revolut.feature.learn.shared.impl.ui.course.overview.d;
import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesUserCapabilities;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import d67.p;
import d67.q;
import d67.s;
import d67.t;
import e93.f;
import efm.d0;
import efm.r;
import h93.j0;
import h93.l0;
import hul.v;
import hwi.f1;
import hwi.g;
import hwi.m0;
import hwi.x0;
import hy2.k;
import hy2.l;
import hy7.j;
import hz0.e;
import ip0.gf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz8.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kx7.k0;
import od0.i;
import om4.x2;
import svi.u1;
import w4l.h;
import zh9.u0;
import zhm.h0;
import zhm.u;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f156106b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f156105a = i;
        this.f156106b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f156105a) {
            case 0:
                d dVar = (d) this.f156106b;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (iw9.b) dVar.f156110b.get("USERNAME_SUGGESTIONS_KEYS");
            case 1:
                hwg.c cVar = (hwg.c) this.f156106b;
                yoj.a feature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(feature, "feature");
                if ((feature != null ? feature.f315683b : null) == yoj.d.DISABLED) {
                    return zi0.c.i(Boolean.FALSE);
                }
                return nim.a.v(((q0) cVar.f156178c).n(y0.b(TradingAccountType.Robo.f105274a), h.f294642c, m.f23746a), new hwf.b(5));
            case 2:
                hwi.c cVar2 = (hwi.c) this.f156106b;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (List) cVar2.f156198c.get("pass_details_list");
            case 3:
                g gVar = (g) this.f156106b;
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (List) gVar.f156218c.get("KEY_RECENT_PASSENGERS");
            case 4:
                m0 m0Var = (m0) this.f156106b;
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (String) m0Var.f156238c.get("KEY_PRODUCT_ARTICLE");
            case 5:
                x0 x0Var = (x0) this.f156106b;
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (AirportLoungesUserCapabilities) x0Var.f156270c.get("KEY_USER_CAPABILITIES");
            case 6:
                f1 f1Var = (f1) this.f156106b;
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (u1) f1Var.f156215c.get("MEMORY_CACHE_KEY_SCHEME_LOUNGES");
            case 7:
                hx9.a aVar = (hx9.a) this.f156106b;
                Boolean withJunior = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(withJunior, "withJunior");
                if (withJunior.booleanValue()) {
                    return nim.a.w(aVar.f156412a.P(), new hwf.b(21));
                }
                r rVarJust = r.just(new Data(null, null, false, 7, null));
                Intrinsics.h(rVarJust);
                return rVarJust;
            case 8:
                f fVar = (f) this.f156106b;
                List allDesigns = (List) obj2;
                Intrinsics.checkNotNullParameter(allDesigns, "allDesigns");
                List list = allDesigns;
                Iterator it14 = list.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next = it14.next();
                        if (Intrinsics.f(((f) next).c(), fVar.c())) {
                        }
                    } else {
                        next = null;
                    }
                }
                f fVar2 = (f) next;
                if (fVar2 != null) {
                    return fVar2.p();
                }
                String str = fVar.c().f13615a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it15 = list.iterator();
                while (it15.hasNext()) {
                    arrayList.add(((f) it15.next()).c().f13615a);
                }
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                boolean z = fVar.r() == l0.CREDIT;
                boolean zU = ce9.m.u(fVar);
                l0 l0VarR = fVar.r();
                StringBuilder sb6 = new StringBuilder("Cannot find design for cardCode ");
                sb6.append(str);
                sb6.append("; available designs are: ");
                sb6.append(arrayList);
                sb6.append("; creditCard = ");
                t61.a.y(sb6, z, "; freelancerCards = ", zU, "; subProductType = ");
                sb6.append(l0VarR);
                throw new NullPointerException(sb6.toString());
            case 9:
                hy2.f fVar3 = (hy2.f) this.f156106b;
                List cardDesigns = (List) obj2;
                Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
                if (((jte.d) fVar3.f156706c).c(CardDesignApi$Toggles$JointAccountsPlanCards.f64537c)) {
                    return cardDesigns;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : cardDesigns) {
                    e93.d dVar2 = (e93.d) obj3;
                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                    if (dVar2 != null && dVar2.u == j0.JOINT_ACCOUNT) {
                        ArrayList arrayList3 = dVar2.f123828g;
                        c93.h.Companion.getClass();
                        if (arrayList3.contains(c93.h.f22273b)) {
                        }
                    }
                    arrayList2.add(obj3);
                }
                return arrayList2;
            case 10:
                r10.a aVar2 = (r10.a) this.f156106b;
                if (((Boolean) obj2).booleanValue()) {
                    r map = ((hy2.f) aVar2.f250812b).i().map(new l(new k(0), 0));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return map;
                }
                i.Companion.getClass();
                r rVarJust2 = r.just(new Data(i.f224256b, null, false, 6, null));
                Intrinsics.h(rVarJust2);
                return rVarJust2;
            case 11:
                hy7.i iVar = (hy7.i) this.f156106b;
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return okl.m.w(null, null, null, 7, ((j) iVar.f156752m).f156754a);
            case 12:
                CryptoOrderDetailsPagerFlowContract$OrderPage cryptoOrderDetailsPagerFlowContract$OrderPage = (CryptoOrderDetailsPagerFlowContract$OrderPage) this.f156106b;
                hyh.c update = (hyh.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String selectedPagerItemId = cryptoOrderDetailsPagerFlowContract$OrderPage.getF94249a();
                List pagerItems = update.f156877b;
                update.getClass();
                Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new hyh.c(selectedPagerItemId, pagerItems);
            case 13:
                ((e) this.f156106b).e.onNext(new c01.c(String.valueOf(((Integer) obj2).intValue())));
                return Unit.f186387a;
            case 14:
                hz7.b bVar = (hz7.b) this.f156106b;
                PetRenewalActionContract$RenewalOptInAction action = (PetRenewalActionContract$RenewalOptInAction) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                d0 d0VarFirstOrError = m70.a.g(bVar.f157053a.d(action.f76337a), null, new hy2.b(12), 1).firstOrError();
                l lVar = new l(new v(bVar, action, 12), 14);
                d0VarFirstOrError.getClass();
                pfm.a aVar3 = new pfm.a(d0VarFirstOrError, lVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return ue0.e.r(aVar3, h0.f322473a);
            case 15:
                du8.b bVar2 = (du8.b) this.f156106b;
                RenewalDetailsContract$RenewalOptInUpdateSterilizedAction action2 = (RenewalDetailsContract$RenewalOptInUpdateSterilizedAction) obj2;
                Intrinsics.checkNotNullParameter(action2, "action");
                fx7.l lVar2 = (fx7.l) bVar2.f117936c;
                String policyId = action2.f76335a;
                boolean z3 = action2.f76336b;
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                k0 k0Var = lVar2.f138770c;
                k0Var.getClass();
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                pfm.r rVarG0 = te0.w.g0(k0Var.f190469a.updatePetForRenewal(policyId, new jx7.d(z3)));
                r rVarSkipWhile = ((fx7.g) bVar2.f117935b).a().skipWhile(new l(new k(14), 16));
                Intrinsics.checkNotNullExpressionValue(rVarSkipWhile, "skipWhile(...)");
                efm.b bVarIgnoreElements = mo3.a.n(rVarSkipWhile).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                pfm.a aVarE = rVarG0.e(ue0.e.v(bVarIgnoreElements));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return ue0.e.r(aVarE, h0.f322473a);
            case 16:
                hz8.h hVar = (hz8.h) this.f156106b;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                hVar.getClass();
                sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM course_categories");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "variant");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productDomains");
                    ArrayMap arrayMap = new ArrayMap();
                    while (true) {
                        String text = null;
                        if (!sQLiteStatementPrepare.step()) {
                            sQLiteStatementPrepare.reset();
                            hVar.b(sQLiteConnection, arrayMap);
                            ArrayList arrayList4 = new ArrayList();
                            while (sQLiteStatementPrepare.step()) {
                                jz8.f fVar4 = new jz8.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), gz8.c.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
                                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                arrayList4.add(new jz8.h(fVar4, text2 != null ? (ArrayList) arrayMap.get(text2) : new ArrayList()));
                                break;
                            }
                            return arrayList4;
                        }
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        }
                        if (text != null && !arrayMap.containsKey(text)) {
                            arrayMap.put(text, new ArrayList());
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
                break;
            case 17:
                ((hz8.k) this.f156106b).getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM glossary_terms");
                try {
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "glossaryItemId");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "term");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "definition");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productDomain");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "index");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text3 = null;
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                            text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        }
                        arrayList5.add(new n(text4, text5, text6, gz8.c.b(text3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)));
                        break;
                    }
                    return arrayList5;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 18:
                hzb.i iVar2 = (hzb.i) this.f156106b;
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                iVar2.getClass();
                iVar2.A2(u0.c(new RevPointsFeatureConfig.RevPointsChallengesGridDetailsConfig(null)));
                return Boolean.TRUE;
            case 19:
                hzj.j jVar = (hzj.j) this.f156106b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                hzj.b bVar3 = (hzj.b) pair.f186385a;
                WalletLimit walletLimit = (WalletLimit) pair.f186386b;
                String str2 = bVar3.f157198a;
                TextLocalisedClause textLocalisedClause = bVar3.f157199b;
                Clause clause = bVar3.d;
                int i = bVar3.i;
                int i2 = bVar3.f157202h;
                int i3 = bVar3.f157201g;
                jVar.getClass();
                LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(i2), i3, 10.0f, null, null, 48);
                int i5 = bVar3.e.f157195a;
                int i6 = bVar3.f;
                return new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image40(layeredImageB, null, new ProgressStyle(Math.min(i5, 100), 100, i6, i6, R$attr.uikit_colorGreyTone2, 2.0f, 2.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS), false, null, false, 58), textLocalisedClause, null, 0, clause, null, null, 0, null, false, null, false, null, null, null, null, null, null, new czj.c(walletLimit), null, 0, 0, 0, 0, 532676568);
            case 20:
                com.revolut.feature.learn.shared.impl.ui.course.overview.e eVar = (com.revolut.feature.learn.shared.impl.ui.course.overview.e) this.f156106b;
                Unit it18 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return eVar.f78001q.a(eVar.f78000p.f77980a);
            case 21:
                com.revolut.feature.learn.shared.impl.ui.course.overview.f fVar5 = (com.revolut.feature.learn.shared.impl.ui.course.overview.f) this.f156106b;
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new i09.m(fVar5.f78008a, d.a.f77999a);
            case 22:
                i0e.r rVar = (i0e.r) this.f156106b;
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                rVar.getClass();
                gf gfVar = new gf(new TextLocalisedClause(R$string.common_word_period, null, null, 14));
                yp0.b.l(gfVar, 0, 0, 0, 0, null, false, 63);
                return new i0e.v(u.c(gfVar));
            case 23:
                return PaddingKt.padding$lambda$0((PaddingValues) this.f156106b, (InspectorInfo) obj2);
            case 24:
                com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c cVar3 = (com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c) this.f156106b;
                d67.u output = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof p)) {
                    if (output instanceof d67.r) {
                        cVar3.n2(new com.revolut.feature.freelancer.impl.ui.prompt.restrictions.a(cVar3, null), new whi.b(6));
                    } else {
                        if (!(output instanceof s) && !(output instanceof t) && !(output instanceof q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.D2(cVar3.f74110r);
                    }
                }
                return Unit.f186387a;
            case 25:
                return ((opi.b) ((i1i.c) this.f156106b).i).O();
            case 26:
                i25.g gVar2 = (i25.g) this.f156106b;
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return boh.f.e(nim.a.v(vkm.q.q(((x2) gVar2.d).l(h.f294642c)), new i0k.f(19)), new v(gVar2, pocket, 28));
            case 27:
                i26.c cVar4 = (i26.c) this.f156106b;
                i26.a params = (i26.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (d26.c) cVar4.f157856b.get(params.d);
            case 28:
                ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) this.f156106b;
                i stakingPocketOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(stakingPocketOptional, "stakingPocketOptional");
                return new Pair(exchangeOrderDraft, stakingPocketOptional);
            default:
                i2k.f fVar6 = (i2k.f) this.f156106b;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if ((result instanceof dii.c) && Intrinsics.f(((dii.c) result).f115066a.f275445a, "PLAN_INFO_TERMS_CLICK_ID")) {
                    fVar6.A2(new ExternalDestination.Browser("https://www.revolut.com/legal/paid-plans/?geo-redirect=true", null));
                }
                return Unit.f186387a;
        }
    }
}
