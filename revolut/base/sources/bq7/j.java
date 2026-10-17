package bq7;

import ab4.q;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.x1;
import aw0.x8;
import bs4.o;
import bs4.r;
import bs4.w;
import bt9.t;
import bw4.n;
import bw4.v;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperAssetOverlayDrawable;
import com.revolut.core.ui_kit.internal.views.navbar.preview.WallpaperPreviewView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.storiesdelegates.ErrorStoriesPageDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreenContract$InputData;
import com.revolut.feature.rev_points.api.extension.earning_rates.RevPointsEarningRateAggregate;
import com.revolut.feature.rev_points.models.RevPointsEarningBreakdown;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.TransactionsDayNightLimitsFlowContract$FlowState;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.TransactionsDayNightLimitsFlowContract$PagerItem;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import er9.x;
import ip0.e00;
import ip0.g00;
import ip0.qb;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import le.u1;
import mx0.a4;
import org.jmrtd.lds.LDSFile;
import ql4.y;
import we6.u0;
import we6.v0;
import we6.w0;
import whf.p;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17785b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f17784a = i;
        this.f17785b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String groupId;
        String id10;
        Data data;
        wx1.d dVar;
        Boolean boolValueOf;
        RevPointsEarningRateAggregate revPointsEarningRateAggregate;
        RevPointsEarningRateAggregate.PlanInfo planInfo;
        switch (this.f17784a) {
            case 0:
                l lVar = (l) this.f17785b;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                lVar.x2(new q(error, 5));
                return Boolean.TRUE;
            case 1:
                Data data2 = new Data(((kl7.b) this.f17785b).f185293b, null, false, 6, null);
                ((f) obj2).getClass();
                return f.a(data2);
            case 2:
                Data data3 = new Data((kl7.a) this.f17785b, null, false, 6, null);
                ((f) obj2).getClass();
                return f.a(data3);
            case 3:
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.a aVar = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.a) this.f17785b;
                hq9.m output = (hq9.m) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof hq9.l) {
                    aVar.C2(new bq9.b(((hq9.l) output).f154647a));
                } else {
                    if (!(output instanceof hq9.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(bq9.a.f17799a);
                }
                return Unit.f186387a;
            case 4:
                return new bs4.f((p) obj2, (y) this.f17785b);
            case 5:
                w wVar = (w) this.f17785b;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new r(wVar.f18064a.f69385c ? o.f18056a : bs4.k.f18053a, yr4.a.a());
            case 6:
                a4 a4Var = (a4) this.f17785b;
                bs9.o update = (bs9.o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return bs9.o.a(update, null, null, false, false, false, a4Var, null, 0, null, f0.f322471a, null, 6111);
            case 7:
                bsc.b bVar = (bsc.b) this.f17785b;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (List) bVar.f18159b.get("CRYPTO_TRUSTED_BENEFICIARIES_MEMORY_KEY");
            case 8:
                bsd.h hVar = (bsd.h) this.f17785b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                x1 x1Var = ((jte.d) hVar.f18171b).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c) ? x1.TALL : x1.REGULAR;
                int i = R$attr.uikit_dp16;
                return new qb("CHART_ID", x1Var, null, i, i, 28);
            case 9:
                bt9.w wVar2 = (bt9.w) this.f17785b;
                Boolean forceLoad = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(forceLoad, "forceLoad");
                dt9.a aVar2 = wVar2.f18480w;
                GroupDetailsBillScreenContract$InputData inputData = wVar2.u;
                boolean zBooleanValue = forceLoad.booleanValue();
                dt9.b bVar2 = (dt9.b) aVar2;
                mq9.f fVar = bVar2.f117399a;
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                boolean z = inputData instanceof GroupDetailsBillScreenContract$InputData.WithBill;
                if (z) {
                    groupId = ((GroupDetailsBillScreenContract$InputData.WithBill) inputData).f79410a.f79285a;
                } else {
                    if (!(inputData instanceof GroupDetailsBillScreenContract$InputData.WithId)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    groupId = ((GroupDetailsBillScreenContract$InputData.WithId) inputData).f79413a.f79285a;
                }
                if (z) {
                    id10 = ((GroupDetailsBillScreenContract$InputData.WithBill) inputData).f79411b.getId();
                } else {
                    if (!(inputData instanceof GroupDetailsBillScreenContract$InputData.WithId)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    id10 = ((GroupDetailsBillScreenContract$InputData.WithId) inputData).f79414b;
                }
                if (z) {
                    GroupDetailsBillScreenContract$InputData.WithBill withBill = (GroupDetailsBillScreenContract$InputData.WithBill) inputData;
                    PaymentGroup paymentGroup = withBill.f79410a;
                    oq9.i iVar = withBill.f79411b;
                    data = zi0.c.P(new bt9.k(paymentGroup, iVar, withBill.f79412c, ofm.q.s(iVar, paymentGroup)), false, null, 3);
                } else {
                    if (!(inputData instanceof GroupDetailsBillScreenContract$InputData.WithId)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    data = new Data(null, null, true, 3, null);
                }
                mr9.a aVar3 = (mr9.a) fVar;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                x xVar = (x) aVar3.f208082a;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                efm.r rVarStartWith = nim.a.w(u1.e(nim.a.w(xVar.f128606q.f(Unit.f186387a, xVar.o.a("RELOAD_STRATEGY_KEY_GROUPS", zBooleanValue)), new e2j.i(groupId, 18)), aVar3.f(groupId, zBooleanValue), bVar2.f117401c.k(false)), new d7a.p(id10, 22)).startWith(data);
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                return rVarStartWith;
            case 10:
                wuh.h hVar2 = (wuh.h) this.f17785b;
                w0 result = (w0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, u0.f296683a)) {
                    hVar2.invoke(new od9.d(null));
                } else {
                    if (!Intrinsics.f(result, v0.f296684a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar2.invoke(new od9.c(null));
                }
                return Unit.f186387a;
            case 11:
                WallpaperPreviewView wallpaperPreviewView = (WallpaperPreviewView) this.f17785b;
                x8 x8Var = (x8) obj2;
                wallpaperPreviewView.f57424g = x8Var;
                WallpaperAssetOverlayDrawable wallpaperAssetOverlayDrawable = wallpaperPreviewView.f57422b;
                if (wallpaperAssetOverlayDrawable != null) {
                    wallpaperAssetOverlayDrawable.a(x8Var.d, false);
                }
                wallpaperPreviewView.i.setFillColor(ColorStateList.valueOf(x8Var.e));
                ViewParent parent = wallpaperPreviewView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    s.c(viewGroup, new bu0.b(x8Var, 0));
                }
                return Unit.f186387a;
            case 12:
                bpf.c cVar = (bpf.c) this.f17785b;
                ManualTransferData updateTransferData = (ManualTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return ManualTransferData.a(updateTransferData, null, null, null, ((bpf.b) cVar).f17621a, 23);
            case 13:
                return buf.c.a((buf.c) obj2, (TransferRequestApprovalData.GroupBillsApproval) this.f17785b, null, null, null, null, null, false, 126);
            case 14:
                return buf.c.a((buf.c) obj2, null, null, null, (buf.b) this.f17785b, null, null, false, LDSFile.EF_SOD_TAG);
            case 15:
                return buf.c.a((buf.c) obj2, null, null, (buf.d) this.f17785b, null, null, null, false, 123);
            case 16:
                bva.d dVar2 = (bva.d) this.f17785b;
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (Set) dVar2.f18975a.get("HIDDEN_PAYMENT_IDS");
            case 17:
                rub.j jVar = (rub.j) this.f17785b;
                bvb.e update2 = (bvb.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return bvb.e.a(update2, null, jVar, null, false, false, null, 61);
            case 18:
                com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a aVar4 = (com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) this.f17785b;
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return new vt4.d(z92.f.j(pocket), aVar4.o.f69732b.f68802b.compareTo(z92.f.j(pocket)) > 0);
            case 19:
                v vVar = (v) this.f17785b;
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                List list = (List) loadingItems.invoke();
                vVar.getClass();
                return new bw4.p(list, n.f19231a);
            case 20:
                TransactionsDayNightLimitsFlowContract$PagerItem transactionsDayNightLimitsFlowContract$PagerItem = (TransactionsDayNightLimitsFlowContract$PagerItem) this.f17785b;
                TransactionsDayNightLimitsFlowContract$FlowState update3 = (TransactionsDayNightLimitsFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                String d = transactionsDayNightLimitsFlowContract$PagerItem.getF103057c();
                List pagerItems = update3.f85711b;
                bwc.d dVar3 = update3.f85712c;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new TransactionsDayNightLimitsFlowContract$FlowState(d, pagerItems, dVar3);
            case 21:
                bwd.c cVar2 = (bwd.c) this.f17785b;
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (vtd.d) cVar2.f19320b.get(bwd.c.a(it11));
            case 22:
                bwk.m mVar = (bwk.m) this.f17785b;
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return rd0.e.c(ybl.q.a(mVar.v, instrument, TradingAccountType.Gia.f105270a), kotlin.coroutines.g.f186406a);
            case 23:
                ihm.f fVar2 = ((ErrorStoriesPageDelegate) this.f17785b).i;
                Unit unit = Unit.f186387a;
                fVar2.onNext(unit);
                return unit;
            case 24:
                pwg.q qVar = (pwg.q) this.f17785b;
                bxg.h update4 = (bxg.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return bxg.h.a(update4, null, qVar, 1);
            case 25:
                com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a aVar5 = (com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) this.f17785b;
                pwg.i assetIndicator = (pwg.i) obj2;
                Intrinsics.checkNotNullParameter(assetIndicator, "assetIndicator");
                return new ba4.x(aVar5.f95030t.B(new t(29)), assetIndicator, 11);
            case 26:
                ((by1.g) this.f17785b).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM qvik_contacts");
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
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings_blockIncomingMoneyRequests");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        wx1.b bVarJ = by1.g.j(sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                            dVar = null;
                        } else {
                            Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                            if (numValueOf == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            }
                            dVar = new wx1.d(boolValueOf);
                        }
                        arrayList.add(new by1.h(text, text2, text3, text4, text5, text6, text7, bVarJ, z3, dVar));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 27:
                byb.c cVar3 = (byb.c) this.f17785b;
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                Data earningBreakdownData = (Data) kVar.f288454a;
                Data pricingPlanData = (Data) kVar.f288455b;
                Data pricingPlanUpgradeAvailableData = (Data) kVar.f288456c;
                Data pocketData = (Data) kVar.d;
                Data cardsData = (Data) kVar.e;
                byb.b bVar3 = cVar3.f19797p;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(earningBreakdownData, "earningBreakdownData");
                Intrinsics.checkNotNullParameter(pricingPlanData, "pricingPlanData");
                Intrinsics.checkNotNullParameter(pricingPlanUpgradeAvailableData, "pricingPlanUpgradeAvailableData");
                Intrinsics.checkNotNullParameter(pocketData, "pocketData");
                Intrinsics.checkNotNullParameter(cardsData, "cardsData");
                try {
                    Object content = earningBreakdownData.getContent();
                    if (content != null) {
                        RevPointsEarningBreakdown revPointsEarningBreakdown = (RevPointsEarningBreakdown) content;
                        hha.d dVar4 = (hha.d) pricingPlanData.getContent();
                        if (dVar4 != null) {
                            Clause clauseA = fgk.b.a(bVar3.f19793a, dVar4);
                            Boolean bool = (Boolean) pricingPlanUpgradeAvailableData.getContent();
                            planInfo = new RevPointsEarningRateAggregate.PlanInfo(clauseA, bool != null ? bool.booleanValue() : false);
                        } else {
                            planInfo = null;
                        }
                        io3.d dVar5 = (io3.d) pocketData.getContent();
                        String str = dVar5 != null ? dVar5.f163145a : null;
                        List list2 = (List) cardsData.getContent();
                        revPointsEarningRateAggregate = new RevPointsEarningRateAggregate(revPointsEarningBreakdown, planInfo, str, list2 != null ? byb.b.b(revPointsEarningBreakdown, list2) : null);
                    } else {
                        revPointsEarningRateAggregate = null;
                    }
                    return new Data(revPointsEarningRateAggregate, earningBreakdownData.getError(), earningBreakdownData.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, earningBreakdownData.getLoading());
                }
            case 28:
                byi.l lVar2 = (byi.l) this.f17785b;
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                e00 e00Var = new e00("ID_ITEM_PASS_CARD", lVar2.a(), g00.f164322a);
                yp0.b.l(e00Var, 0, 0, 0, 0, null, false, 63);
                return u.c(e00Var);
            default:
                bz9.e eVar = (bz9.e) this.f17785b;
                sy9.b flowResult = (sy9.b) obj2;
                Intrinsics.checkNotNullParameter(flowResult, "flowResult");
                eVar.c3(flowResult.f266642a);
                return Unit.f186387a;
        }
    }
}
