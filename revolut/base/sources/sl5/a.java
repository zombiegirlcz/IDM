package sl5;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayBillerData;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPaymentData;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlowContract$FlowPagerItem;
import com.revolut.feature.spending_analytics.impl.ui.budget.models.MissingBudgetException;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$BudgetPickerAccount;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureCompetitorCompanyChoice;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.a;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import dod.l;
import e6d.k;
import e6d.m;
import e6d.r;
import efm.d0;
import h93.f0;
import ip0.c0;
import ip0.gu;
import ip0.is;
import ip0.nb0;
import ip0.pb0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import nii.y0;
import nii.z;
import org.joda.time.DateTime;
import pcd.s;
import rv0.f;
import rv1.x;
import skm.p0;
import sl3.i;
import slm.t;
import te0.w;
import til.n;
import til.o;
import til.p;
import til.q;
import vkm.j2;
import zh9.u0;
import zhm.a0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f264144b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f264143a = i;
        this.f264144b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v51 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object data) {
        List listC;
        Data content;
        int paddingTop;
        int iIntValue;
        int i = this.f264143a;
        int i2 = 2;
        int i3 = 3;
        Object obj2 = this.f264144b;
        switch (i) {
            case 0:
                yvh.b autoInvest = (yvh.b) data;
                Intrinsics.checkNotNullParameter(autoInvest, "autoInvest");
                if (((Boolean) ((i) obj2).invoke(autoInvest)).booleanValue()) {
                    return autoInvest;
                }
                yvh.b.Companion.getClass();
                return yvh.b.f317175m;
            case 1:
                f fVar = (f) obj2;
                yvh.b autoInvest2 = (yvh.b) data;
                Intrinsics.checkNotNullParameter(autoInvest2, "autoInvest");
                if (!autoInvest2.f317177b) {
                    ufm.b bVarM = d0.m(autoInvest2);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                xvh.c cVar = fVar.f264150b;
                String id10 = autoInvest2.f317176a;
                Intrinsics.checkNotNullParameter(id10, "id");
                r rVar = ((b6d.r) cVar).f12732a;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                ufm.i iVarA = r.a(rVar.f122986a.updateAutoInvestState(id10, new d6d.c()));
                k kVar = k.f;
                ufm.i iVar = new ufm.i(iVarA, new dug.e(8), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                ufm.i iVarD = rVar.d(iVar);
                m mVar = m.f;
                ufm.i iVar2 = new ufm.i(iVarD, new dug.e(7), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                ufm.f fVar2 = new ufm.f(iVar2, new e31.e(22, new e6d.a(rVar, i2)), i3);
                Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                return w.i0(fVar2);
            case 2:
                t tVar = (t) obj2;
                JsonElement node = (JsonElement) data;
                Intrinsics.checkNotNullParameter(node, "node");
                tVar.m(node, (String) zhm.d0.m0(tVar.f264280a));
                return Unit.f186387a;
            case 3:
                sm9.e update = (sm9.e) data;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return sm9.e.a(update, null, ((PayeesOverviewFlowContract$FlowPagerItem) obj2).getF94249a(), 1);
            case 4:
                ou5.b bVar = (ou5.b) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Pair pair2 = (Pair) pair.f186385a;
                Pair pair3 = (Pair) pair.f186386b;
                AccountId accountId = (AccountId) pair2.f186385a;
                od0.i iVar3 = (od0.i) pair2.f186386b;
                lzi.h hVar = (lzi.h) pair3.f186385a;
                List list = (List) pair3.f186386b;
                lzi.m mVar2 = (lzi.m) iVar3.f224257a;
                if (mVar2 != null) {
                    return nim.a.v(((wmd.f) bVar.d).a(accountId, mVar2.f200989c, hVar, mVar2.f200988b.f115083b, null), new s06.e(mVar2, 12, list, hVar));
                }
                throw new MissingBudgetException();
            case 5:
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b bVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) obj2;
                eii.k result = (eii.k) data;
                Intrinsics.checkNotNullParameter(result, "result");
                eii.i iVar4 = result instanceof eii.i ? (eii.i) result : null;
                Object obj3 = iVar4 != null ? iVar4.f126655a : null;
                analyticsDashboardContract$BudgetPickerAccount = obj3 instanceof AnalyticsDashboardContract$BudgetPickerAccount ? (AnalyticsDashboardContract$BudgetPickerAccount) obj3 : 0;
                if (analyticsDashboardContract$BudgetPickerAccount == 0) {
                    return Unit.f186387a;
                }
                AccountId accountId2 = analyticsDashboardContract$BudgetPickerAccount.f87516a;
                bVar2.l1().M0(analyticsDashboardContract$BudgetPickerAccount.f87517b ? new dod.d(accountId2) : new l(accountId2));
                return Unit.f186387a;
            case 6:
                so1.f update2 = (so1.f) data;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                BPayPaymentData bPayPaymentData = update2.f264673a;
                BPayBillerData billerData = BPayBillerData.a(bPayPaymentData.f61212a, null, ((po1.f) ((po1.g) obj2)).f237878a, 31);
                dj0.d amount = bPayPaymentData.f61213b;
                dj0.d totalAmount = bPayPaymentData.f61214c;
                LocalDate localDate = bPayPaymentData.d;
                Intrinsics.checkNotNullParameter(billerData, "billerData");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
                return so1.f.a(update2, new BPayPaymentData(billerData, amount, totalAmount, localDate), null, 126);
            case 7:
                sob.g gVar = (sob.g) obj2;
                s vault = (s) data;
                Intrinsics.checkNotNullParameter(vault, "vault");
                rnb.r rVar2 = gVar.f264809q;
                List listC2 = u.c(vault);
                int year = vault.i.getYear();
                DateTime dateTime = vault.i;
                LocalDate localDateOf = LocalDate.of(year, dateTime.getMonthOfYear(), dateTime.getDayOfMonth());
                Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
                return rVar2.c(localDateOf, ((l80.f) gVar.f264810r).e(), listC2, kii.e.u(vault, xi0.b.Companion));
            case 8:
                sog.e eVar = (sog.e) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                if (!(data instanceof x7a.a)) {
                    throw new IllegalArgumentException(v0.a.g(data, "Expected type is Countries but was ").toString());
                }
                x7a.a aVar = (x7a.a) data;
                ArrayList arrayList = aVar.f303175a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(eVar.q((wi0.b) it8.next()));
                }
                ArrayList arrayList3 = aVar.f303176b;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(eVar.q((wi0.b) it9.next()));
                }
                return new sog.b(arrayList2, arrayList4);
            case 9:
                Clause message = (Clause) data;
                Intrinsics.checkNotNullParameter(message, "message");
                ufm.c cVar2 = new ufm.c(new pu9.a(message, (UserAvatarImage) obj2, 23), i2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                return cVar2;
            case 10:
                sp5.c cVar3 = (sp5.c) obj2;
                qp5.b action = (qp5.b) data;
                Intrinsics.checkNotNullParameter(action, "action");
                pfm.h hVarN = pd.b.n(p0.f264003c, new sp5.b(cVar3, action, null));
                sl3.r rVar3 = new sl3.r(new sdi.k(cVar3, action, 13), 26);
                dfm.c cVar4 = mfm.f.d;
                en.a aVar2 = mfm.f.f205043c;
                pfm.l lVar = new pfm.l(new pfm.t(hVarN, rVar3, cVar4, aVar2, aVar2, aVar2, aVar2), new rzc.b(cVar3, action, 12), 0);
                Intrinsics.checkNotNullExpressionValue(lVar, "doFinally(...)");
                return lVar;
            case 11:
                Pair pair4 = (Pair) data;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return ((sp9.b) obj2).f264907a.b((Set) pair4.f186386b, u.c(((xi0.b) pair4.f186385a).f306286a), io3.l.CURRENT, AccountId.Personal.f51414a);
            case 12:
                sph.g loadingConfig = (sph.g) obj2;
                Intrinsics.checkNotNullParameter((Function0) data, "<unused var>");
                Intrinsics.checkNotNullParameter(loadingConfig, "loadingConfig");
                List list2 = loadingConfig.f264953a;
                ArrayList arrayList5 = new ArrayList();
                int i5 = 0;
                for (Object obj4 : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    sph.h loadingFilter = (sph.h) obj4;
                    String listIdSuffix = String.valueOf(i5);
                    Intrinsics.checkNotNullParameter(listIdSuffix, "listIdSuffix");
                    Intrinsics.checkNotNullParameter(loadingFilter, "loadingFilter");
                    int i21 = sph.i.f264954a[loadingFilter.ordinal()];
                    if (i21 == 1) {
                        listC = u.c(new is(j6.a.q("slider-", listIdSuffix)));
                    } else if (i21 == 2) {
                        listC = u.c(new c0(j6.a.q("actions-", listIdSuffix), new u.a(3, 2), 0, 0, 60));
                    } else {
                        if (i21 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nb0 nb0Var = pb0.Companion;
                        listC = v.k(nb0.b(nb0Var, j6.a.q("row-0-", listIdSuffix), false, 0, false, 30), nb0.b(nb0Var, j6.a.q("row-1-", listIdSuffix), false, 0, false, 30), nb0.b(nb0Var, j6.a.q("row-2-", listIdSuffix), false, 0, false, 30));
                    }
                    a0.x(yp0.b.h(listC, new gu(j6.a.q("subheader-", listIdSuffix), 0, 0, 30), null, 0, 126), arrayList5);
                    i5 = i6;
                }
                return arrayList5;
            case 13:
                KeyboardSuggestionsDelegate keyboardSuggestionsDelegate = (KeyboardSuggestionsDelegate) obj2;
                KeyboardSuggestionsDelegate.Companion aVar3 = KeyboardSuggestionsDelegate.INSTANCE;
                py0.c cVar5 = new py0.c(((d01.b) data).f110278b);
                Activity activity = keyboardSuggestionsDelegate.f98560h;
                py0.f fVarN0 = jh.d.f(activity).n0();
                View viewFindViewById = activity.findViewById(R.id.content);
                if (viewFindViewById == null) {
                    viewFindViewById = activity.getWindow().getDecorView();
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "getDecorView(...)");
                }
                TrackableItem.Companion companion = TrackableItem.INSTANCE;
                fVarN0.a(viewFindViewById, new CustomTrackableComponent(keyboardSuggestionsDelegate.i, KeyboardSuggestionsDelegate.class), cVar5);
                return Unit.f186387a;
            case 14:
                sqd.a update3 = (sqd.a) data;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return sqd.a.a(update3, null, !((sqd.a) ((j2) ((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) obj2).z.f22677a).getValue()).f265042b, null, 5);
            case 15:
                Unit it10 = (Unit) data;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (List) ((sre.k) obj2).f265205c.get("USER_DOCUMENTS_KEY");
            case 16:
                sth.e eVar2 = (sth.e) obj2;
                Throwable e = (Throwable) data;
                Intrinsics.checkNotNullParameter(e, "e");
                TextLocalisedClause textLocalisedClauseB = eVar2.f265602q.b(e);
                if (textLocalisedClauseB == null) {
                    textLocalisedClauseB = new TextLocalisedClause(R$string.common_error_state_title, null, null, 14);
                }
                yji.l.a1(eVar2, eVar2.X1(new y0("errorDialog", new z(textLocalisedClauseB, null, new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new se4.c(eVar2, analyticsDashboardContract$BudgetPickerAccount, 20), 3);
                return Boolean.TRUE;
            case 17:
                InternalStep.Polling polling = (InternalStep.Polling) obj2;
                WorkflowScreenConfiguration screenConfiguration = polling.e;
                int i22 = polling.f;
                String workflowId = ((sth.b) data).f265597a;
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
                return new sth.b(workflowId, screenConfiguration, i22);
            case 18:
                com.revolut.feature.card.terminate.impl.ui.flow.a aVar4 = (com.revolut.feature.card.terminate.impl.ui.flow.a) obj2;
                tu2.d result2 = (tu2.d) data;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, tu2.b.f274521a)) {
                    aVar4.I2();
                } else {
                    if (!(result2 instanceof tu2.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f0 f0Var = ((tu2.c) result2).f274522a;
                    aVar4.C1(u0.b(new FeatureCommand(new CardDesignFeatureConfig(f0Var.d0() ? b93.e.JUNIOR_VIRTUAL : f0Var.b0() ? b93.e.JUNIOR : f0Var.f150112c ? b93.e.VIRTUAL : b93.e.PHYSICAL, AccountId.Personal.f51414a, f0Var.f150112c ? null : aVar4.f64387t.f64383a, null, f0Var.b0() ? f0Var.u : null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870866))));
                    aVar4.I2();
                }
                return Unit.f186387a;
            case 19:
                xm4.a aVar5 = (xm4.a) obj2;
                su4.i update4 = (su4.i) data;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data data2 = update4.f265649a;
                try {
                    Object content2 = data2.getContent();
                    content = new Data(content2 != null ? com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a.L2(su4.h.a((su4.h) content2, null, null, false, false, null, aVar5, 3071)) : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    content = new Data(null, th10, data2.getLoading());
                }
                Intrinsics.checkNotNullParameter(content, "content");
                return new su4.i(content);
            case 20:
                Unit it11 = (Unit) data;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (List) ((suf.h) obj2).f265755c.get("USER_TRANSIT_TICKETS_KEY");
            case 21:
                sug.f update5 = (sug.f) data;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return sug.f.a(update5, (AccountClosureCompetitorCompanyChoice.Other) obj2);
            case 22:
                sug.f update6 = (sug.f) data;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return sug.f.a(update6, (AccountClosureCompetitorCompanyChoice) obj2);
            case 23:
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b bVar3 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b) obj2;
                d67.u output = (d67.u) data;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof d67.s) {
                    bVar3.C2(a.C0602a.f98874a);
                }
                return Unit.f186387a;
            case 24:
                sv0.c cVar6 = (sv0.c) obj2;
                WindowInsetsCompat insets = (WindowInsetsCompat) data;
                Intrinsics.checkNotNullParameter(insets, "insets");
                cVar6.k = Integer.valueOf(insets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
                uv0.b bVar4 = cVar6.f265811a;
                boolean zIsVisible = insets.isVisible(WindowInsetsCompat.Type.ime());
                int i32 = insets.getInsets(WindowInsetsCompat.Type.ime()).bottom;
                cVar6.f265816j.f274682h = i32;
                f.a aVar6 = f.a.f257638a;
                if (zIsVisible) {
                    if (!(cVar6.f265817l instanceof rv0.e)) {
                        cVar6.f265817l = new f.b(i32);
                    }
                    uv0.d dVar = (uv0.d) bVar4;
                    int i33 = dVar.f283259a.getInt("system_keyboard_height_px_v2", -1);
                    Integer numValueOf = i33 != -1 ? Integer.valueOf(i33) : null;
                    if (numValueOf == null || numValueOf.intValue() != i32) {
                        a80.e eVar3 = cVar6.f265821q;
                        Activity activity2 = (Activity) eVar3.f1989c;
                        if (!activity2.isInMultiWindowMode() && i32 >= eVar3.f1988b && i32 <= c8g.c.G(activity2) / 2) {
                            View currentFocus = activity2.getCurrentFocus();
                            if (currentFocus instanceof TextView) {
                                int inputType = ((TextView) currentFocus).getInputType();
                                if ((inputType & 15) == 1) {
                                    int i43 = inputType & 4080;
                                    if ((inputType & 524288) == 0 && i43 != 128 && i43 != 144 && i43 != 224 && i43 != 32 && i43 != 208 && i43 != 16 && i43 != 176) {
                                        dVar.f283259a.edit().putInt("system_keyboard_height_px_v2", i32).apply();
                                        cVar6.f265818m = true;
                                    }
                                }
                            }
                        }
                    }
                } else if (cVar6.f265817l instanceof f.b) {
                    cVar6.f265817l = aVar6;
                }
                rv0.f fVar3 = cVar6.f265817l;
                if (!(fVar3 instanceof rv0.e)) {
                    if (Intrinsics.f(fVar3, aVar6) || (fVar3 instanceof f.b)) {
                        return insets;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                rv0.e eVar4 = (rv0.e) fVar3;
                rv0.g gVarE = cVar6.e();
                if (gVarE != null) {
                    paddingTop = insets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
                    int i59 = Build.VERSION.SDK_INT;
                    iIntValue = gVarE.getImeInsetPx();
                    if (i59 >= 30) {
                        iIntValue += paddingTop;
                    }
                } else {
                    FrameLayout frameLayoutD = cVar6.d();
                    paddingTop = (frameLayoutD.getLayoutParams().height - frameLayoutD.getPaddingTop()) - frameLayoutD.getPaddingBottom();
                    rv0.d dVar2 = eVar4.f257635a;
                    if (dVar2 instanceof rv0.c) {
                        iIntValue = ((Number) cVar6.f265820p.getValue()).intValue();
                        iIntValue += paddingTop;
                    } else {
                        if (!dVar2.equals(rv0.b.f257633a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iIntValue = paddingTop;
                    }
                }
                cVar6.f265817l = rv0.e.b(eVar4, iIntValue, 3);
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setInsets(WindowInsetsCompat.Type.ime(), Insets.of(0, 0, 0, iIntValue)).setVisible(WindowInsetsCompat.Type.ime(), true).build();
                    Intrinsics.h(windowInsetsCompatBuild);
                    return windowInsetsCompatBuild;
                }
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                WindowInsetsCompat windowInsetsCompatBuild2 = new WindowInsetsCompat.Builder(insets).setInsets(WindowInsetsCompat.Type.systemBars(), Insets.of(insets2.left, insets2.top, insets2.right, insets2.bottom + iIntValue)).build();
                Intrinsics.h(windowInsetsCompatBuild2);
                return windowInsetsCompatBuild2;
            case 25:
                kul.b bVar5 = (kul.b) obj2;
                til.r result3 = (til.r) data;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof o) && !(result3 instanceof p)) {
                    if (!Intrinsics.f(result3, n.f271581a) && !Intrinsics.f(result3, q.f271586a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar5.invoke();
                }
                return Unit.f186387a;
            case 26:
                sw1.b bVar6 = (sw1.b) obj2;
                g12.q result4 = (g12.q) data;
                Intrinsics.checkNotNullParameter(result4, "result");
                x xVarJ = ofm.q.j(result4);
                if (xVarJ != null) {
                    bVar6.A2(((com.revolut.feature.apm.breb.impl.a) bVar6.f266069l).m(xVarJ.f257683a, hrf.f.OUTGOING, xVarJ.f257684b));
                }
                return Unit.f186387a;
            case 27:
                swi.c cVar7 = (swi.c) obj2;
                Throwable error = (Throwable) data;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                cVar7.l1().M0(new aii.i(error, (aii.a) null, 6));
                oki.h.D2(cVar7.f266228q);
                return Boolean.TRUE;
            case 28:
                ((sx1.g) obj2).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) data).prepare("SELECT * FROM aani_contacts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRequestEnabled");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList6.add(new sx1.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sx1.g.j(sQLiteStatementPrepare.getText(columnIndexOrThrow8)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0));
                        break;
                    }
                    return arrayList6;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            default:
                sx2.c0 update7 = (sx2.c0) data;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return sx2.c0.a(update7, null, null, null, null, zi0.c.P((e93.q) obj2, false, null, 3), null, null, null, null, false, false, 32223);
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f264143a = i;
        this.f264144b = obj3;
    }
}
