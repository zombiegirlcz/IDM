package ke7;

import android.net.Uri;
import aw0.o9;
import c55.n0;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.webview.LinkExternalAccountWebViewScreen;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.youTransactor.uCube.rpc.Constants;
import ip0.c0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.qm0;
import ip0.s7;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jf7.j1;
import kkf.d3;
import kkf.i1;
import kkf.q4;
import klf.g1;
import knd.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import tof.fc;
import tof.g9;
import tof.i7;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f183039b;

    public /* synthetic */ v(Object obj2, int i) {
        this.f183038a = i;
        this.f183039b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f183038a;
        boolean z = true;
        Object obj3 = null;
        boolean z3 = false;
        int i2 = 0;
        Object obj4 = this.f183039b;
        switch (i) {
            case 0:
                return n.a((n) obj2, null, null, false, (fe7.a) obj4, null, null, null, false, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 1:
                com.revolut.feature.passcode.ui.biometric_passcode_verification.b bVar = (com.revolut.feature.passcode.ui.biometric_passcode_verification.b) obj4;
                de9.m result = (de9.m) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof de9.i) {
                    bVar.C2(ke9.f.f183055a);
                } else if (result instanceof de9.j) {
                    bVar.C2(new ke9.g(((de9.j) result).f113326a));
                } else if (result instanceof de9.k) {
                    de9.k kVar = (de9.k) result;
                    bVar.C2(new ke9.d(kVar.f113327a, kVar.f113328b));
                } else {
                    if (!(result instanceof de9.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C2(ke9.h.f183057a);
                }
                return Unit.f186387a;
            case 2:
                kea.c cVar = (kea.c) obj4;
                ste.u result2 = (ste.u) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof ste.s) {
                    if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "UAE_COUNTRY_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                        cVar.A2(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.uae-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                    }
                } else if (!(result2 instanceof ste.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 3:
                whf.p transactionsContent = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                return new kg7.b(transactionsContent.f297646a, transactionsContent.f297647b, ((j1) obj4).f173686b.size() > 3);
            case 4:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                return ((kgf.c) obj4).f183980b.d(pockets);
            case 5:
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a aVar = (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) obj4;
                od0.i account = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                vrl.s sVar = aVar.f95841r;
                String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) account.c()).f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return rd0.e.b(sVar.a(string, aVar.f95845x.f183996a, bfl.g.BUY, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : w4l.h.f294642c));
            case 6:
                dda.h accountDetailsItem = (dda.h) obj2;
                Intrinsics.checkNotNullParameter(accountDetailsItem, "accountDetailsItem");
                return ((khb.f) obj4).f184093a.b(new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_email_body_account_details_placeholder, zhm.v.k(new TextClause(accountDetailsItem.f113178a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(accountDetailsItem.f113179b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)).toString();
            case 7:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((gig.t) obj4).b();
            case 8:
                com.revolut.feature.checkout.impl.resume.flow.a aVar2 = (com.revolut.feature.checkout.impl.resume.flow.a) obj4;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Unable to resume checkout flow", throwable, h0Var);
                aVar2.f65840r.getClass();
                yji.l.a1(aVar2, aVar2.X1(new y0("RESUME_CHECKOUT_ERROR_DIALOG_ID", new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_ok, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new k22.c(aVar2, z3 ? 1 : 0, 22), 3);
                return Boolean.TRUE;
            case 9:
                kj0.n nVar = (kj0.n) obj4;
                ulm.j1 request = (ulm.j1) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                String str = request.f281095a.d;
                lbm.l lVar = (lbm.l) nVar.d.getValue();
                jbm.h hVar = (jbm.h) nVar.f184273b.getValue();
                nhm.l lVar2 = new nhm.l(nhm.e.f215587a.c(0, 3292052, "kind", "Global", nhm.c.PUT));
                lVar.getClass();
                lbm.k kVar2 = new lbm.k(lVar, str, hVar, lVar2);
                ks0.n nVar2 = lVar.f193732a;
                Objects.requireNonNull(str, "Name must not be null");
                lbm.j jVar = (lbm.j) ((ConcurrentHashMap) nVar2.f189085b).computeIfAbsent(str, new pbm.a(lVar, kVar2));
                Intrinsics.checkNotNullExpressionValue(jVar, "circuitBreaker(...)");
                return jVar;
            case 10:
                Map params = (Map) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (ui7.b) ((kj7.f) obj4).f184324b.get("CLAIM_CALCULATED_AMOUNT_CACHE_PREFIX_" + params.hashCode());
            case 11:
                com.revolut.feature.product.lifecycle.flow.a aVar3 = (com.revolut.feature.product.lifecycle.flow.a) obj4;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                kja.g gVar = new kja.g(aVar3, i2);
                aVar3.f81210q.Z2(error, gVar, new kja.g(aVar3, z ? 1 : 0), new k8e.a(aVar3, gVar, 17));
                return Boolean.TRUE;
            case 12:
                String articleId = (String) obj2;
                Intrinsics.checkNotNullParameter(articleId, "articleId");
                return new nka.q(articleId, ((ProductArticleParams) obj4).f81275b);
            case 13:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((hbc.b) ((i1) obj4).o).getClass();
                return yp0.b.i(new qm0("flightDetailsLoading"), hbc.b.a(), null, 0, 0, 126);
            case 14:
                LoanDetails it10 = (LoanDetails) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.h hVar2 = od0.i.Companion;
                Clause clauseD = ((n0) ((d3) obj4).f184640c).d(it10);
                hVar2.getClass();
                return od0.h.a(clauseD);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ((q4) obj4).getClass();
                return zhm.u.c(new s7("LIST_ID_MANAGE_PAYMENT_LOADING", 0, 0, 0, 0, false, null, 126));
            case 16:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                c0 c0Var = new c0("ID_MY_NUMBERS_ACTIONS_LOADING", new u.a(2, 2), 0, 0, 60);
                yp0.b.r(c0Var, 0, 0, 0, 0, 15);
                gu guVar = new gu("ID_MY_NUMBERS_PRIMARY_SUBHEADER_LOADING", 0, 0, 30);
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "ID_MY_NUMBERS_PRIMARY_NUMBER_LOADING", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                gu guVar2 = new gu("ID_MY_NUMBERS_SECONDARY_SUBHEADER_LOADING", 0, 0, 30);
                pb0 pb0VarB2 = nb0.b(nb0Var, "ID_MY_NUMBERS_SECONDARY_NUMBER_LOADING", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                return new kkj.m(zhm.v.k(c0Var, guVar, pb0VarB, guVar2, pb0VarB2), kkj.s.a(null, ((kkj.f) obj4).f185072c));
            case 17:
                yhm.r rVar = (yhm.r) obj2;
                return new kkk.q((lha.j) obj4, (ggk.k) rVar.f314201a, (hha.d) rVar.f314202b, (InsuranceDocumentsAvailability) rVar.f314203c);
            case 18:
                g1 g1Var = (g1) obj4;
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                od0.h hVar3 = od0.i.Companion;
                Iterator it12 = transactions.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next = it12.next();
                        if (((ql4.u) next).f247185b.contains(g1Var.f185484b.a())) {
                            obj3 = next;
                        }
                    }
                }
                hVar3.getClass();
                return od0.h.a(obj3);
            case 19:
                klj.i update = (klj.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new klj.i(null, (EsimPhoneNumberPortingScheduleOption) obj4);
            case 20:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a aVar4 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a) obj4;
                vlj.c result3 = (vlj.c) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                aVar4.H2(aVar4.f101336p, new v(result3, 21));
                return Unit.f186387a;
            case 21:
                klj.i update2 = (klj.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return new klj.i(((vlj.c) obj4).f290476a, update2.f185638b);
            case 22:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return new Pair((em2.b) obj4, data);
            case 23:
                String url2 = (String) obj2;
                Intrinsics.checkNotNullParameter(url2, "url");
                km6.g gVar2 = (km6.g) ((LinkExternalAccountWebViewScreen) obj4).Q.getValue();
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                Uri uriG = ((f80.b) gVar2.o).g(url2);
                if (uriG != null) {
                    List<String> pathSegments = uriG.getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                    if (Intrinsics.f(d0.d0(pathSegments), "institution-auth")) {
                        List<String> pathSegments2 = uriG.getPathSegments();
                        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                        String str2 = (String) d0.e0(1, pathSegments2);
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (kotlin.text.d0.W(str2)) {
                            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unsupported institution-auth redirect: ", url2));
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                        } else if (str2.equals("choose")) {
                            String queryParameter = uriG.getQueryParameter("state");
                            if (queryParameter == null) {
                                queryParameter = "";
                            }
                            String queryParameter2 = uriG.getQueryParameter("token");
                            gVar2.C2(new km6.e(new ExternalInstitutionAuthData(str2, queryParameter, queryParameter2 != null ? queryParameter2 : "")));
                        } else {
                            gVar2.C2(new km6.d(str2, !uriG.getQueryParameterNames().contains("errorCode")));
                        }
                    }
                }
                return Unit.f186387a;
            case 24:
                jnc.f fVar = (jnc.f) obj4;
                OnboardingFlowContract$State update3 = (OnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return OnboardingFlowContract$State.a(update3, null, fVar.f176687a, fVar.f176688b, fVar.f176689c, 3);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return ((kme.g) obj4).a();
            case 26:
                g9 g9Var = (g9) obj4;
                List filters = (List) obj2;
                Intrinsics.checkNotNullParameter(filters, "filters");
                Iterator it13 = filters.iterator();
                if (!it13.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it13.next();
                while (it13.hasNext()) {
                    next2 = fc.c((i7) next2, (i7) it13.next());
                }
                i7 i7Var = (i7) next2;
                return g9Var != null ? fc.a(i7Var, g9Var) : i7Var;
            case 27:
                ((z0) obj4).invoke();
                return Unit.f186387a;
            case 28:
                ((z0) obj4).invoke();
                return Unit.f186387a;
            default:
                kob.h hVar4 = (kob.h) obj4;
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                if (it14.getError() == null) {
                    return it14;
                }
                List listK = (List) it14.getContent();
                if (listK == null) {
                    listK = zhm.v.k(hVar4.m(0, 0, false), o97.h0.f223107a);
                }
                return Data.copy$default(it14, listK, null, false, 6, null);
        }
    }

    public /* synthetic */ v(kkj.s sVar, kkj.f fVar) {
        this.f183038a = 16;
        this.f183039b = fVar;
    }
}
