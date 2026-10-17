package yj2;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import ar9.r;
import aw0.f2;
import aw0.l2;
import aw0.w1;
import aw0.y1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.api.model.AtmBoundBox;
import com.revolut.feature.atm.api.model.AtmLocation;
import com.revolut.feature.atm.api.model.SurchargeFreeState;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.BlockMerchantFlowContract$Step;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.trading.advanced.charts.api.models.StockAdvancedChartSymbol;
import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.feature.wealth.ui.impl.actions.handler.WealthTransferFlowControllerFactory$Step;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$Output;
import com.revolut.kompot.navigable.TransitionAnimation;
import do3.n;
import efm.d0;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kg.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lr2.a;
import op0.y0;
import op0.z0;
import pcd.s;
import rnb.u;
import x5f.m;
import yg6.v;
import yjh.k0;
import ylh.a0;
import ylh.b0;
import ylh.q;
import ylh.t;
import ylh.w;
import ylh.x;
import ylh.y;
import ylh.z;
import ypg.p;
import zhm.r0;
import zr2.d;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f314381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f314382c;

    public /* synthetic */ b(WealthAction wealthAction, Set set, k0 k0Var) {
        this.f314380a = 3;
        this.f314381b = wealthAction;
        this.f314382c = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7, types: [ar9.q] */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8, types: [ar9.p] */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AtmBoundBox atmBoundBox;
        boolean zH3;
        w wVar;
        int i;
        dj0.d dVarO;
        r rVar;
        String str;
        int i2;
        ?? r212;
        ?? r222;
        int i3 = this.f314380a;
        int i5 = 3;
        String text = null;
        Object obj3 = this.f314382c;
        Object obj4 = this.f314381b;
        switch (i3) {
            case 0:
                AtmLocation atmLocation = (AtmLocation) obj4;
                x39.b bVar = (x39.b) obj3;
                List atms = (List) obj2;
                Intrinsics.checkNotNullParameter(atms, "atms");
                if (atms.isEmpty()) {
                    atmBoundBox = new AtmBoundBox(atmLocation, atmLocation, atmLocation);
                } else {
                    Iterator it8 = atms.iterator();
                    if (!it8.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    float fMax = ((Atm) it8.next()).d;
                    while (it8.hasNext()) {
                        fMax = Math.max(fMax, ((Atm) it8.next()).d);
                    }
                    double d = atmLocation.f63138a;
                    double d5 = ((fMax / 1000.0f) / 111.111f) * 1.05f;
                    double d6 = atmLocation.f63139b;
                    atmBoundBox = new AtmBoundBox(new AtmLocation(d + d5, d6 + d5), new AtmLocation(d - d5, d6 - d5), atmLocation);
                }
                return new sj2.b(atms, atmBoundBox, bVar == x39.b.ENABLED);
            case 1:
                l lVar = (l) obj3;
                AtmLocation atmLocation2 = (AtmLocation) obj4;
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (!enabled.booleanValue()) {
                    ufm.b bVarM = d0.m(new SurchargeFreeState(false, false));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                od0.i.Companion.getClass();
                ufm.b bVarM2 = d0.m(od0.h.a(atmLocation2));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                ufm.i iVar = new ufm.i(bVarM2, new a(i5, new g(lVar, 0)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 2:
                yj7.i iVar2 = (yj7.i) obj4;
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.a output = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                List listF = output.f(((yj7.e) iVar2.t2()).f314428b, (CFACClaimExpense) obj3);
                iVar2.f314431p.c(listF);
                iVar2.x2(new m(listF, 20));
                return Unit.f186387a;
            case 3:
                Set set = (Set) obj3;
                WealthAccount account = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                hih.a aVarL = ((WealthAction) obj4).getF95897b();
                if (aVarL != null) {
                    zH3 = k0.h3(account, aVarL);
                } else {
                    Set set2 = set;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        zH3 = true;
                    } else {
                        Iterator it9 = set2.iterator();
                        while (it9.hasNext()) {
                            if (k0.h3(account, (hih.a) it9.next())) {
                                zH3 = false;
                            }
                        }
                        zH3 = true;
                    }
                }
                return Boolean.valueOf(zH3);
            case 4:
                WealthTransferPickerControllerContract$Output output2 = (WealthTransferPickerControllerContract$Output) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                oki.h.t2((com.revolut.feature.wealth.ui.impl.actions.handler.a) obj4, (yki.l) obj3, new WealthTransferFlowControllerFactory$Step.TransferDestination(output2), false, TransitionAnimation.FADE.f98392a, false, 8);
                return Unit.f186387a;
            case 5:
                aii.r it10 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((Function2) obj4).invoke((ky4.h) obj3, it10);
                return Unit.f186387a;
            case 6:
                aii.r it11 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((Function2) obj4).invoke((ky4.h) obj3, it11);
                return Unit.f186387a;
            case 7:
                z zVar = (z) obj4;
                t tVar = (t) obj3;
                q updateUserActionState = (q) obj2;
                Intrinsics.checkNotNullParameter(updateUserActionState, "$this$updateUserActionState");
                Intrinsics.checkNotNullParameter(zVar, "<this>");
                if (zVar instanceof x) {
                    wVar = w.ALL_TIME;
                } else if (zVar instanceof y) {
                    wVar = w.CUSTOM;
                } else if (zVar instanceof a0) {
                    wVar = w.MONTH;
                } else {
                    if (!(zVar instanceof b0)) {
                        if (zVar instanceof z.a) {
                            throw new IllegalArgumentException("No type available for the empty period!");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    wVar = w.TAX_YEAR;
                }
                ylh.a aVar = (ylh.a) tVar.f314732q.getValue();
                updateUserActionState.getClass();
                return new q(wVar, aVar);
            case 8:
                ym2.d dVar = (ym2.d) obj2;
                km2.x xVar = ((ym2.i) obj3).f314843p;
                xVar.getClass();
                km2.x.Companion.getClass();
                Intrinsics.checkNotNullParameter("VIEWED_FEATURED_THEMES", "id");
                return ym2.d.a(dVar, (Map) obj4, xVar.a(), 9);
            case 9:
                ymf.k kVar = (ymf.k) obj4;
                File file = (File) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.f) {
                    kVar.l2(new v(kVar, file, null, 6), new yi5.b(26));
                }
                return Unit.f186387a;
            case 10:
                n nVar = (n) obj4;
                qla.a aVar2 = (qla.a) obj3;
                yna.a aVar3 = (yna.a) obj2;
                String strI = te0.w.I(nVar);
                String str2 = nVar.f;
                Boolean bool = nVar.f116421t;
                return yna.a.a(aVar3, strI, str2, null, null, aVar2, null, null, bool != null ? bool.booleanValue() : false, false, null, false, null, null, null, null, 65244);
            case 11:
                String id10 = (String) obj3;
                rpb.k savingsProgress = (rpb.k) obj2;
                Intrinsics.checkNotNullParameter(savingsProgress, "savedThisMonthData");
                ypb.g gVar = ((ypb.c) obj4).f315807c;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(savingsProgress, "savingsProgress");
                ejb.e eVar = savingsProgress.f256328b.f256326c;
                rpb.j jVar = savingsProgress.f256329c;
                ejb.e eVar2 = jVar != null ? jVar.f256326c : null;
                long j2 = 0;
                List listA = gVar.a(0L, eVar2);
                if (eVar2 != null && (dVarO = pyd.c.O(pyd.c.O(eVar2.f126841a, eVar2.f126842b), eVar2.f126843c)) != null) {
                    j2 = dVarO.f115082a;
                }
                List listA2 = gVar.a(j2, eVar);
                int i6 = ypb.f.f315812a[savingsProgress.f256327a.ordinal()];
                if (i6 == 1) {
                    i = R$string.savings_widget_saved_this_month_title;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.savings_widget_saved_this_week_title;
                }
                z0 z0Var = new z0(new TextLocalisedClause(i, null, null, 14), y0.TWO_LINES);
                MoneyClause moneyClause = new MoneyClause(pyd.c.O(pyd.c.O(eVar.f126841a, eVar.f126842b), eVar.f126843c), new MoneyClause.Format.Defaults(null, null, false, false, 15), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 12);
                w1 w1Var = y1.Companion;
                ?? arrayList = listA;
                if (arrayList.isEmpty()) {
                    List<ejb.d> list = eVar.d;
                    arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (ejb.d dVar2 : list) {
                        arrayList.add(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                    }
                }
                return new ComparisonLineChartWidgetDelegate.Model(id10, z0Var, moneyClause, (CompositeClause) null, w1.b(w1Var, null, listA2, (List) arrayList, null, 57), l2.GREATER_VALUE_GREEN, f2.LAST_OF_PREVIOUS_LINE, op0.q.SMALL, savingsProgress.d, (TrackableAction.Custom) null, 1152);
            case 12:
                Map imagesByVaultId = (Map) obj2;
                Intrinsics.checkNotNullParameter(imagesByVaultId, "imagesByVaultId");
                ((ypg.b) obj4).getClass();
                List<s> list2 = (List) obj3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (s sVar : list2) {
                    arrayList2.add(new npg.b(sVar, (Image) r0.h(sVar.f234881a, imagesByVaultId)));
                }
                return arrayList2;
            case 13:
                Set set3 = (Set) obj3;
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                ((p) obj4).getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : vaults) {
                    if (set3.contains(((s) obj5).f234883c)) {
                        arrayList3.add(obj5);
                    }
                }
                return arrayList3;
            case 14:
                String recipient = (String) obj3;
                s vault = (s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                xvh.a filter = opg.c.b(vault);
                b6d.r rVar2 = (b6d.r) ((p) obj4).e;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                efm.r rVarDistinctUntilChanged = pd.b.r(rVar2.m(filter), new b4d.c(rVar2, filter, recipient, 5)).distinctUntilChanged((kfm.d) new yma.r(new ypg.h(i5), 29));
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                return rVarDistinctUntilChanged;
            case 15:
                ((yq9.c) obj4).f315995b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 16:
                String str3 = (String) obj3;
                ((yq9.c) obj4).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups_bills WHERE groupId = ?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdBy");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyCode");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangedAmount");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionId");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionCategory");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionLogo");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lineItems");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiptImageUri");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        int i21 = columnIndexOrThrow;
                        int i22 = columnIndexOrThrow15;
                        columnIndexOrThrow15 = i22;
                        arrayList4.add(new ar9.j(text2, sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), xq9.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), xq9.c.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14)), sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22)));
                        columnIndexOrThrow = i21;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList4;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 17:
                ((yq9.e) obj4).f316000b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 18:
                ((yq9.h) obj4).f316006b.insert((SQLiteConnection) obj2, (r) obj3);
                return null;
            case 19:
                String str4 = (String) obj3;
                xq9.a aVar4 = ((yq9.h) obj4).f316007c;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups WHERE id = ?");
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str4);
                    }
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "name");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "imageUrl");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "currencyCode");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "balance");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "isTrusted");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "updatedDate");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "lastFullSettlementDate");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "settings_calculationType");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "settings_baseCurrency");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "analytics_totalSpentByGroup");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "analytics_totalSpentByCurrentMember");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "analytics_currency");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "analytics_totalSpentByGroupByCurrency");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "analytics_totalSpentByCurrentMemberByCurrency");
                    if (sQLiteStatementPrepare2.step()) {
                        rVar = new r(sQLiteStatementPrepare2.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow16), sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow17), sQLiteStatementPrepare2.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow18), sQLiteStatementPrepare2.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow19), xq9.b.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow20)), ((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow21)) != 0, sQLiteStatementPrepare2.getLong(columnIndexOrThrow22), sQLiteStatementPrepare2.isNull(columnIndexOrThrow23) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow23)), new ar9.d(yq9.h.a(sQLiteStatementPrepare2.getText(columnIndexOrThrow24)), sQLiteStatementPrepare2.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow25)), (sQLiteStatementPrepare2.isNull(columnIndexOrThrow26) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow27) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow28) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow29) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow30)) ? null : new ar9.a(sQLiteStatementPrepare2.getLong(columnIndexOrThrow26), sQLiteStatementPrepare2.getLong(columnIndexOrThrow27), sQLiteStatementPrepare2.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow28), xq9.a.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow29)), xq9.a.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow30))));
                    } else {
                        rVar = null;
                    }
                    sQLiteStatementPrepare2.close();
                    return rVar;
                } finally {
                }
            case 20:
                String str5 = (String) obj3;
                ((yq9.i) obj4).getClass();
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups_debts WHERE groupId = ?");
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str5);
                    }
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "id");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "groupId");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "type");
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "state");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "amount");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "currencyCode");
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "displayAmount");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "displayCurrencyCode");
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "payerId");
                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "payeeId");
                    int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "transferReasonRequired");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        String text3 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow31) ? text : sQLiteStatementPrepare3.getText(columnIndexOrThrow31);
                        String text4 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow32) ? text : sQLiteStatementPrepare3.getText(columnIndexOrThrow32);
                        if (sQLiteStatementPrepare3.isNull(columnIndexOrThrow33)) {
                            str = text;
                        } else {
                            str = text;
                            text = sQLiteStatementPrepare3.getText(columnIndexOrThrow33);
                        }
                        int i32 = columnIndexOrThrow31;
                        if (text != null) {
                            o oVarA = GsonHolder.a();
                            i2 = columnIndexOrThrow32;
                            Type type = new TypeToken<ar9.q>() { // from class: com.revolut.feature.payments.groups.impl.data.database.converters.PaymentGroupDebtTypeTypeConverter$fromJson$lambda$0$$inlined$fromJson$1
                            }.getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            Object objD = oVarA.d(text, type);
                            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                            r212 = (ar9.q) objD;
                        } else {
                            i2 = columnIndexOrThrow32;
                            r212 = str;
                        }
                        String text5 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow34) ? str : sQLiteStatementPrepare3.getText(columnIndexOrThrow34);
                        if (text5 != null) {
                            o oVarA2 = GsonHolder.a();
                            Type type2 = new TypeToken<ar9.p>() { // from class: com.revolut.feature.payments.groups.impl.data.database.converters.PaymentGroupDebtStateTypeConverter$fromJson$lambda$0$$inlined$fromJson$1
                            }.getType();
                            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            Object objD2 = oVarA2.d(text5, type2);
                            Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
                            r222 = (ar9.p) objD2;
                        } else {
                            r222 = str;
                        }
                        arrayList5.add(new ar9.o(text3, text4, r212, r222, sQLiteStatementPrepare3.getLong(columnIndexOrThrow35), sQLiteStatementPrepare3.isNull(columnIndexOrThrow36) ? str : sQLiteStatementPrepare3.getText(columnIndexOrThrow36), sQLiteStatementPrepare3.getLong(columnIndexOrThrow37), sQLiteStatementPrepare3.isNull(columnIndexOrThrow38) ? str : sQLiteStatementPrepare3.getText(columnIndexOrThrow38), sQLiteStatementPrepare3.isNull(columnIndexOrThrow39) ? str : sQLiteStatementPrepare3.getText(columnIndexOrThrow39), sQLiteStatementPrepare3.isNull(columnIndexOrThrow40) ? str : sQLiteStatementPrepare3.getText(columnIndexOrThrow40), ((int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow41)) != 0));
                        columnIndexOrThrow31 = i32;
                        text = str;
                        columnIndexOrThrow32 = i2;
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return arrayList5;
                } finally {
                }
            case 21:
                ((yq9.i) obj4).f316009b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 22:
                ((yq9.o) obj4).f316024b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 23:
                ((yqj.c) obj4).f316039b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 24:
                mw0.f it12 = (mw0.f) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ((yr0.o) obj4).dismiss();
                ((u) obj3).invoke(it12);
                return Unit.f186387a;
            case 25:
                BlockMerchantFlowContract$Step blockMerchantFlowContract$Step = (BlockMerchantFlowContract$Step) obj4;
                com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a aVar5 = (com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.a) obj3;
                zr2.d output3 = (zr2.d) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof d.b) {
                    if (((BlockMerchantFlowContract$Step.BlockMerchant) blockMerchantFlowContract$Step).f64227b) {
                        aVar5.K2(new dki.h((Function1) new ypd.i(11), true));
                    } else {
                        aVar5.G2(a.C1129a.f199377a);
                        Unit unit = Unit.f186387a;
                        aVar5.I2();
                    }
                } else if (!(output3 instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((yr5.q) obj4).b((yr5.f) obj3);
            case 27:
                yra.j updateState = (yra.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return yra.j.a(updateState, (PushToCardTransferData) ((Function1) obj4).invoke(((yra.x) obj3).y2()), null, 0, null, 29);
            case 28:
                ReferenceData referenceData = (ReferenceData) obj3;
                return yra.j.a((yra.j) obj2, (PushToCardTransferData) obj4, null, 0, new yra.o(referenceData, referenceData.f92120a), 13);
            default:
                yrb.x update = (yrb.x) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ((yrb.s) obj4).n3(((StockAdvancedChartSymbol) ((AdvancedChartSymbol) obj3)).f83400a.f214596b);
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f314380a = i;
        this.f314381b = obj2;
        this.f314382c = obj3;
    }

    public /* synthetic */ b(d dVar, AtmLocation atmLocation, x39.b bVar) {
        this.f314380a = 0;
        this.f314381b = atmLocation;
        this.f314382c = bVar;
    }

    public /* synthetic */ b(l lVar, AtmLocation atmLocation) {
        this.f314380a = 1;
        this.f314382c = lVar;
        this.f314381b = atmLocation;
    }
}
