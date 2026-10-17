package uu9;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.widget.TextView;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.github.devnied.emvnfccard.model.EmvCard;
import com.revolut.camerakit.ui.views.view.MaskHintView;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.deeplink.impl.ui.external.ExternalDeeplinkRoutingActivity;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$Step;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocumentPage;
import com.revolut.feature.selfserve.sot.api.models.SubmissionActionToDo;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreenContract$Input;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.revolut.trading.orders.ui.invest.placement.wrapper_flow.InvestOrderWrapperFlowContract$WrapperFlowStep;
import ip0.v7;
import ipa.j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nd.p;
import nii.n1;
import od0.i;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatterBuilder;
import pfm.m;
import pfm.t;
import skm.p0;
import uv1.d0;
import uv6.l;
import uvk.o;
import uz.c0;
import v0f.u;
import yhm.r;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f283175b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f283174a = i;
        this.f283175b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strConcat;
        int i;
        String str;
        int i2 = this.f283174a;
        int i3 = 8;
        strConcat = "";
        m mVar = m.f235744a;
        int i5 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = this.f283175b;
        switch (i2) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new pfm.h(new r2d.e((c) obj3, 17, (ipa.g) pair.f186385a, (ipa.c) pair.f186386b), 2);
            case 1:
                j jVar = (j) obj3;
                Bitmap groupAvatar = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(groupAvatar, "groupAvatar");
                od0.h hVar = i.Companion;
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                String str2 = (String) jVar.get("groupName");
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String strF = hx7.a.f(jVar);
                if (strF == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                vu9.a aVar = new vu9.a(groupAvatar, str2, strF);
                hVar.getClass();
                return od0.h.a(aVar);
            case 2:
                uug.f update = (uug.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                kel.b bVar = ((AccountClosureStatus.AccountClosureProgressBlocked) obj3).f104503b;
                update.getClass();
                return new uug.f(bVar);
            case 3:
                com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b bVar2 = (com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) obj3;
                wtl.d output = (wtl.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                ztl.a aVar2 = output.f300037b;
                if (aVar2 == null) {
                    bVar2.C2(new uul.a(output.f300036a));
                } else {
                    yki.i iVar = bVar2.f107026w;
                    oki.h.r2(iVar);
                    oki.h.s2(iVar, new InvestOrderWrapperFlowContract$WrapperFlowStep.Order(InvestOrderContract$InputData.Companion.e(InvestOrderContract$InputData.INSTANCE, bVar2.u, bVar2.v, aVar2.f325183a, 24)), false, TransitionAnimation.NONE.f98393a, true);
                }
                return Unit.f186387a;
            case 4:
                d0 d0Var = (d0) obj3;
                d0Var.l2(new rf9.h(12, objArr == true ? 1 : 0, d0Var, ((Boolean) obj2).booleanValue()), new yi5.b(26));
                return Unit.f186387a;
            case 5:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                hha.d dVar = (hha.d) rVar.f314201a;
                rr6.m mVar2 = (rr6.m) rVar.f314202b;
                FreelancerCashbackRates freelancerCashbackRates = (FreelancerCashbackRates) rVar.f314203c;
                pi3.h hVar2 = ((l) obj3).f283336p.f73264a;
                hha.d dVar2 = hVar2 != null ? hVar2.f236404a : null;
                if (dVar2 == null) {
                    return new ht6.a(mVar2.f256721a, dVar);
                }
                LinkedHashMap linkedHashMap = freelancerCashbackRates.f73279a;
                String str3 = dVar2.f152289c;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return new ht6.a((BigDecimal) linkedHashMap.getOrDefault(str3, ZERO), dVar2);
            case 6:
                o oVar = (o) obj3;
                uvk.e update2 = (uvk.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                p pVar = oVar.f283485p;
                AddKeyStatsViewGroupsScreenContract$Input addKeyStatsViewGroupsScreenContract$Input = oVar.o;
                trk.a assetType = addKeyStatsViewGroupsScreenContract$Input.f104021a;
                Set preselectedAssetStatsIdSet = addKeyStatsViewGroupsScreenContract$Input.f104022b;
                hel.b bVar3 = addKeyStatsViewGroupsScreenContract$Input.f104023c;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(assetType, "assetType");
                Intrinsics.checkNotNullParameter(preselectedAssetStatsIdSet, "preselectedAssetStatsIdSet");
                List listC = zvk.b.c(assetType);
                int iB = q0.b(w.t(listC, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                for (Object obj4 : listC) {
                    AssetStatsGroup assetStatsGroup = (AssetStatsGroup) obj4;
                    Set set = preselectedAssetStatsIdSet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it8 = set.iterator();
                        i = 0;
                        while (it8.hasNext()) {
                            if (zvk.b.a((AssetStatsId) it8.next(), bVar3).equals(assetStatsGroup) && (i = i + 1) < 0) {
                                v.r();
                                throw null;
                            }
                        }
                    }
                    linkedHashMap2.put(obj4, Integer.valueOf(i));
                }
                return uvk.e.a(update2, linkedHashMap2, null, null, null, 30);
            case 7:
                uc.d dVar3 = (uc.d) obj3;
                Boolean isPersisted = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isPersisted, "isPersisted");
                if (isPersisted.booleanValue()) {
                    return mVar;
                }
                p0 p0Var = p0.f264001a;
                pfm.h hVarN = pd.b.n(elm.f.f127540b, new eh1.g((Object) dVar3, (Continuation) (objArr2 == true ? 1 : 0), i3));
                ty7.b bVar4 = new ty7.b(dVar3, 6);
                dfm.c cVar = mfm.f.d;
                en.a aVar3 = mfm.f.f205043c;
                t tVar = new t(hVarN, cVar, cVar, aVar3, aVar3, aVar3, bVar4);
                Intrinsics.checkNotNullExpressionValue(tVar, "doOnDispose(...)");
                return tVar;
            case 8:
                ((ux1.g) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM blik_contacts_temp");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new ux1.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), ux1.g.j(sQLiteStatementPrepare.getText(columnIndexOrThrow8))));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 9:
                uxh.l lVar = (uxh.l) obj3;
                dii.g output2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if ((output2 instanceof dii.c) && Intrinsics.f(((dii.c) output2).f115066a.f275445a, "CRYPTO_PRICE_EXPLANATION_TEXT_ID")) {
                    lVar.getClass();
                    lVar.V2(new uxe.l(lVar, objArr3 == true ? 1 : 0, i5), new yi5.b(29));
                }
                return Unit.f186387a;
            case 10:
                uy1.j jVar2 = (uy1.j) obj3;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (List) jVar2.f284045c.get(jVar2.f);
            case 11:
                uyc.j update3 = (uyc.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                SubmissionActionToDo submissionActionToDo = ((EvidenceDocumentPage) obj3).e;
                String str4 = submissionActionToDo != null ? submissionActionToDo.f85878a : null;
                return uyc.j.a(update3, str4 != null ? str4 : "", null, 27);
            case 12:
                List list = (List) obj2;
                Intrinsics.h(list);
                ((BaseLayoutBuilderFragment) ((uyc.c) obj3)).setItems(list);
                return Unit.f186387a;
            case 13:
                uyh.j update4 = (uyh.j) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return uyh.j.a(update4, (CryptoOrderDraft) obj3, null, false, null, 30);
            case 14:
                TextView cardNumberView = ((uyl.m) obj3).f.getCardNumberView();
                if (((Boolean) obj2).booleanValue()) {
                    cardNumberView.requestFocus();
                    kli.c.d(cardNumberView, 300L);
                } else if (cardNumberView != null) {
                    kli.c.b(cardNumberView, 300, true);
                }
                return Unit.f186387a;
            case 15:
                ((Integer) obj2).getClass();
                ((c0) obj3).f284497w.invalidate();
                return Unit.f186387a;
            case 16:
                Configuration it10 = (Configuration) obj2;
                int i6 = MaskHintView.f50866n;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((MaskHintView) obj3).a();
                return Unit.f186387a;
            case 17:
                String facilityId = (String) obj2;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return (List) v7.r("FORBEARANCE_APPLICATIONS_KEY-", facilityId, ((uz4.c) obj3).f284590c);
            case 18:
                n1 result = (n1) obj2;
                ExternalDeeplinkRoutingActivity.Companion aVar4 = ExternalDeeplinkRoutingActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(result, "result");
                v06.e eVar = (v06.e) ((ExternalDeeplinkRoutingActivity) obj3).f218652a0;
                if (eVar != null) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, ((v06.j) eVar).f284764h);
                }
                return Unit.f186387a;
            case 19:
                NaviCommand naviCommand = (NaviCommand) obj2;
                sri.m mVar3 = ((v06.j) obj3).f284764h;
                Intrinsics.h(naviCommand);
                mVar3.c(naviCommand);
                return Unit.f186387a;
            case 20:
                Context context = (Context) obj2;
                CardDetailsScreen.a aVar5 = CardDetailsScreen.Companion;
                Intrinsics.checkNotNullParameter(context, "context");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(context, 2, 8);
                screenGridLayoutManager.setSpanSizeLookup(new v0f.e((koi.h) obj3, screenGridLayoutManager));
                return screenGridLayoutManager;
            case 21:
                EmvCard emvCard = (EmvCard) obj3;
                u update5 = (u) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                String cardNumber = emvCard.getCardNumber();
                Intrinsics.checkNotNullExpressionValue(cardNumber, "getCardNumber(...)");
                Date date = emvCard.getExpireDate();
                Intrinsics.checkNotNullExpressionValue(date, "getExpireDate(...)");
                Intrinsics.checkNotNullParameter(date, "date");
                String strPrint = new DateTimeFormatterBuilder().appendPattern("MMyy").toFormatter().print(LocalDate.fromDateFields(date));
                Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                return u.a(update5, cardNumber, strPrint, "", null, null, v0f.t.CARD, null, yte.a.NFC, false, false, false, true, true, false, 10056);
            case 22:
                x53.a aVar6 = (x53.a) obj3;
                u update6 = (u) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                String str5 = aVar6.f302907a;
                Intrinsics.checkNotNullParameter(aVar6, "<this>");
                String str6 = aVar6.f302908b;
                if (str6 != null && (str = aVar6.f302909c) != null) {
                    strConcat = str6.concat(str);
                }
                return u.a(update6, str5, strConcat, "", null, null, v0f.t.CARD, null, yte.a.CAMERA, false, false, false, true, true, false, 10056);
            case 23:
                return u.a((u) obj2, null, null, null, null, (t61.j) obj3, null, null, null, false, false, false, false, false, false, 16367);
            case 24:
                v0l.e eVar2 = (v0l.e) obj3;
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (!Intrinsics.f(clickData.f54722b.f51590a, "CHOSE_PARTNER_CORRECTLY_WIDGET_ID")) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                ActionWidgetDelegate.a aVar7 = clickData.f54721a;
                if (Intrinsics.f(aVar7, ActionWidgetDelegate.a.c.f51609a)) {
                    return eVar2.f284929b.Z2();
                }
                if (!(aVar7 instanceof com.revolut.core.ui_kit.delegates.h) && !Intrinsics.f(aVar7, ActionWidgetDelegate.a.d.f51610a) && !Intrinsics.f(aVar7, ActionWidgetDelegate.a.C0395a.f51607a) && !Intrinsics.f(aVar7, ActionWidgetDelegate.a.b.f51608a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 25:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                return new FreelancerSalesFilters$CompoundFreelancerSalesFilter(((v17.r) obj3).f285260r.f74140a.f73469a, 254);
            case 26:
                yki.a aVar8 = ((com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c) obj3).f79878s;
                u1a.i output3 = (u1a.i) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                boolean z = output3 instanceof u1a.g;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    u1a.g gVar = (u1a.g) output3;
                    oki.h.z2(aVar8, new SplitBillQrFlowContract$Step.EditSplit(gVar.f276371b, gVar.f276370a), bottom_dialog);
                } else {
                    if (!Intrinsics.f(output3, u1a.h.f276372a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.z2(aVar8, SplitBillQrFlowContract$Step.GenerateNewLink.f79868a, bottom_dialog);
                }
                return Unit.f186387a;
            case 27:
                ne0.d dVar4 = ((v21.c) obj3).f285621b;
                String param = (String) obj2;
                Intrinsics.checkNotNullParameter(param, "param");
                if (Intrinsics.f(param, "ALL_NEWS")) {
                    List all2 = dVar4.getAll();
                    if (all2.isEmpty()) {
                        return null;
                    }
                    return all2;
                }
                w61.a aVar9 = (w61.a) dVar4.get(param);
                if (aVar9 != null) {
                    return zhm.u.c(aVar9);
                }
                return null;
            case 28:
                ne0.d dVar5 = ((v21.f) obj3).f285626b;
                String params = (String) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                if (Intrinsics.f(params, "ALL_NEWS")) {
                    List all3 = dVar5.getAll();
                    if (all3.isEmpty()) {
                        return null;
                    }
                    return all3;
                }
                w61.a aVar10 = (w61.a) dVar5.get(params);
                if (aVar10 != null) {
                    return zhm.u.c(aVar10);
                }
                return null;
            default:
                v25.o oVar2 = (v25.o) obj3;
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.e) {
                    yx4.b.Companion.getClass();
                    oVar2.d3(yx4.a.a("ID_ABANDON_LOAN_HIDING"));
                } else if (result2 instanceof dii.f) {
                    yx4.b.Companion.getClass();
                    oVar2.d3(yx4.a.a("ID_CONFIRM_LOAN_HIDING"));
                } else {
                    int i21 = jli.h.f175850a;
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(x53.a aVar, com.revolut.feature.topup_screen.impl.screens.card_details.b bVar) {
        this.f283174a = 22;
        this.f283175b = aVar;
    }
}
