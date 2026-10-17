package c69;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import ccb.c0;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.android.bug_report.api.BugReportApi$Toggles$InAppBugReporting;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.ShoppingCartFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.a;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$UiData;
import com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.InvestTransactionsListScreen;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nii.y0;
import nii.z;
import o97.e0;
import rp0.k1;
import xl2.h0;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21740b;

    public /* synthetic */ v(Object obj2, int i) {
        this.f21739a = i;
        this.f21740b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v30, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xk xkVar;
        Object next;
        int i = this.f21739a;
        rfm.h hVar = rfm.h.f253943a;
        int i2 = 2;
        int i3 = 10;
        Continuation continuation = null;
        RowDelegate.Model model = null;
        Object obj3 = this.f21740b;
        switch (i) {
            case 0:
                DirectDebitData updateDirectDebitData = (DirectDebitData) obj2;
                Intrinsics.checkNotNullParameter(updateDirectDebitData, "$this$updateDirectDebitData");
                return DirectDebitData.a(updateDirectDebitData, null, ((p) obj3).f21735b.toString(), null, null, 29);
            case 1:
                c6h.c params = (c6h.c) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (i6h.d) ((c6h.e) obj3).f21805b.get(params.a());
            case 2:
                ((c72.f) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM apm_multibanco_withdrawal_code");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "revolutCardId");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "expirationDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionId");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount_amount");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount_currency");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        int i5 = columnIndexOrThrow;
                        arrayList.add(new c72.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? continuation : sQLiteStatementPrepare.getText(columnIndexOrThrow), c72.f.d(sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? continuation : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? continuation : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? continuation : sQLiteStatementPrepare.getText(columnIndexOrThrow5), new jo3.b(sQLiteStatementPrepare.getLong(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? continuation : sQLiteStatementPrepare.getText(columnIndexOrThrow11)), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? continuation : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                        columnIndexOrThrow = i5;
                        continuation = null;
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 3:
                c7b.t tVar = (c7b.t) obj3;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                yji.l.a1(tVar, tVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5)), null, null, new c7b.s(tVar, null), 3);
                return Boolean.TRUE;
            case 4:
                c7e.g gVar = (c7e.g) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    gVar.A2(FreelancerBizFeatureConfig.AutomaticSaleTransfer.f73191a);
                }
                return Unit.f186387a;
            case 5:
                c7e.n nVar = (c7e.n) obj3;
                k1 k1Var = nVar.f21971s;
                nVar.f21969q.getClass();
                k1Var.d(c7e.b.a());
                return Unit.f186387a;
            case 6:
                c7i.r update = (c7i.r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return c7i.r.a(update, null, 0L, 0L, null, null, ((e7i.l) ((e7i.m) obj3)).f123342a, null, null, null, 479);
            case 7:
                c7i.r update2 = (c7i.r) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return c7i.r.a(update2, null, 0L, 0L, (c7i.f) obj3, null, null, null, null, null, 503);
            case 8:
                return c7i.r.a((c7i.r) obj2, new Data((c7i.p) obj3, null, false, 6, null), 0L, 0L, null, null, null, null, null, null, 510);
            case 9:
                return c7i.r.a((c7i.r) obj2, null, 0L, 0L, null, null, null, (h7i.p) obj3, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 10:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return new pfm.h(new a08.l((c86.g) obj3, command, i3), i2);
            case 11:
                k1j.b bVar = (k1j.b) obj3;
                List balances = (List) obj2;
                Intrinsics.checkNotNullParameter(balances, "balances");
                if (balances.isEmpty()) {
                    return hVar;
                }
                Intrinsics.h(bVar);
                return efm.k.g(k1j.b.a(bVar, balances));
            case 12:
                BalanceWrapper balanceWrapper = (BalanceWrapper) obj3;
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.booleanValue() ? efm.k.g(balanceWrapper) : hVar;
            case 13:
                List balanceGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(balanceGroups, "balanceGroups");
                ((c8i.s) obj3).getClass();
                return balanceGroups;
            case 14:
                c9f.g params2 = (c9f.g) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (List) ((ne0.j) ((c9f.b) obj3).f22369b.get()).get(c9f.b.a(params2));
            case 15:
                c9f.g params3 = (c9f.g) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (List) ((ne0.j) ((c9f.f) obj3).f22375b.get()).get("TRANSFER_INSTRUMENTS_LIST_" + params3.f22378b + "_" + params3.f22377a);
            case 16:
                ca7.e eVar = (ca7.e) obj3;
                o97.r rVar = eVar.e;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List<p97.b> list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                ArrayList arrayList2 = new ArrayList();
                for (p97.b bVar2 : list) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((p97.a) next).f234280a, bVar2)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    p97.a aVar = (p97.a) next;
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                List listV0 = d0.V0(arrayList2, 4);
                if (listV0.isEmpty()) {
                    xkVar = null;
                } else {
                    List list3 = listV0;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(w97.a.a((p97.a) it10.next(), rVar));
                    }
                    xkVar = new xk("SUGGESTION_ITEM_ID", arrayList3, null, null, null, 60);
                    yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
                }
                if (((jte.d) eVar.f22532c).c(BugReportApi$Toggles$InAppBugReporting.f50349c)) {
                    RowDelegate.Model model2 = new RowDelegate.Model("REPORT_BUG_ID", new ResourceImage(R$drawable.uikit_icn_24_bug, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(com.revolut.feature.bugreport.api.R$string.profile_bug_reporting_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.bugreport.api.R$string.bug_reporting_global_search_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, new o97.y(rVar, null, null, 62), null, 0, 0, 0, 0, 1056964460);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    model = model2;
                }
                koi.j[] elements = {xkVar, model};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return zhm.u.c(new e0(kotlin.collections.d.L(elements)));
            case 17:
                String juniorRegId = (String) obj2;
                Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
                return (List) ((ca8.a) obj3).f22534b.get(ca8.a.a(juniorRegId));
            case 18:
                KProperty[] kPropertyArr = InvestTransactionsListScreen.Z;
                ((cbh.y) ((InvestTransactionsListScreen) obj3).e3()).f22854s.Z2();
                return Unit.f186387a;
            case 19:
                return cbh.j.a((cbh.j) obj2, null, null, null, null, ((cbh.l) obj3).f22827a, null, false, null, 991);
            case 20:
                cbk.o oVar = (cbk.o) obj3;
                h1j.b output = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof h1j.d) {
                    oVar.getClass();
                    oVar.T2(new c84.y(oVar, (h1j.d) output, continuation, 8), new yi5.b(27));
                }
                return Unit.f186387a;
            case 21:
                cc7.d updateDetailedSurveyDialog = (cc7.d) obj2;
                Intrinsics.checkNotNullParameter(updateDetailedSurveyDialog, "$this$updateDetailedSurveyDialog");
                return cc7.d.a(updateDetailedSurveyDialog, zb7.g.a(updateDetailedSurveyDialog.f22944a, (zb7.c) obj3), null, null, 6);
            case 22:
                c0 c0Var = (c0) obj3;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                c0Var.v.k(Boolean.TRUE);
                return Boolean.valueOf(c0Var.B2(throwable, c0.A2(com.revolut.feature.vaults.R$string.vaults_common_withdraw_error)));
            case 23:
                ccb.i updateState = (ccb.i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ccb.i.a(updateState, ((ccb.g) obj3).f22985a, null, null, null, null, null, null, null, null, null, 16382);
            case 24:
                return ccb.i.a((ccb.i) obj2, null, (bcb.e) obj3, null, null, null, null, null, null, null, null, 16379);
            case 25:
                return ccb.i.a((ccb.i) obj2, null, null, null, null, null, null, null, null, null, (MoneyBoxAmountInputScreenContract$UiData) obj3, 8191);
            case 26:
                return (ccb.i) obj3;
            case 27:
                cd0.e request = (cd0.e) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                String str = request.f23144a;
                h0 h0Var = request.f23145b;
                int i6 = 28;
                return new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new c34.d((Function3) obj3, str, h0Var, (Continuation) null)), new c64.a(new v(h0Var, i6), i6), 1);
            case 28:
                ValidationResult result2 = (ValidationResult) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                return new Pair((h0) obj3, result2);
            default:
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.b bVar3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.b) obj3;
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.a result3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof a.C0453a) {
                    bVar3.G2(a.C0451a.f60764a);
                } else if (result3 instanceof df1.j) {
                    bVar3.E2(new ShoppingCartFlowContract$Step.EditCustomProduct(((df1.j) result3).f113753a), true, null, false);
                } else if (result3 instanceof df1.i) {
                    bVar3.E2(new ShoppingCartFlowContract$Step.EditCatalogProductEntry(((df1.i) result3).f113752a), true, null, false);
                } else {
                    if (!Intrinsics.f(result3, a.b.f60836a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar3.G2(a.b.f60765a);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v(Function3 function3) {
        this.f21739a = 27;
        this.f21740b = (gim.i) function3;
    }
}
