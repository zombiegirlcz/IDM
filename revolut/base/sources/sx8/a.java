package sx8;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.card_order_new.impl.virtual.IssueVirtualCardActivity;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreen;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.statements.api.models.TaxFilingData;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.youTransactor.uCube.rpc.Constants;
import i26.l;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jq9.a0;
import jq9.b0;
import jq9.m;
import jq9.p;
import jq9.q;
import jq9.s;
import jq9.v;
import jq9.x;
import jq9.y;
import jq9.z;
import kg.o;
import km2.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.h;
import mha.k;
import nii.y0;
import org.jmrtd.PassportService;
import pfm.h;
import pyc.h0;
import pyc.t;
import q09.g0;
import rs8.a;
import s0g.j;
import sxi.i;
import syc.r;
import te0.w;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f266368b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f266367a = i;
        this.f266368b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        efm.b bVarC0;
        pzf.a aVar;
        char c2;
        char c3;
        CellDetailsActionDelegate.Model model;
        Object zVar;
        int i = this.f266367a;
        int i2 = 12;
        int i3 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = this.f266368b;
        switch (i) {
            case 0:
                d dVar = (d) obj3;
                f action = (f) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                mt8.d dVar2 = dVar.f266370a;
                String checkId = action.d;
                av.a scanType = av.a.FRONT;
                File document = action.f266374a;
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                Intrinsics.checkNotNullParameter(scanType, "scanType");
                Intrinsics.checkNotNullParameter(document, "document");
                h hVarN = pd.b.n(g.f186406a, new n(29, dVar2, checkId, scanType, document, (Continuation) null));
                int i5 = c.f266369a[action.f266376c.ordinal()];
                if (i5 == 1) {
                    bVarC0 = dVar.f266371b.c0(new StatusViewConfiguration.Success("KYC_INTERNAL_UPLOAD_DONE_DIALOG_ID", new TextLocalisedClause(R$string.kyc_poa_upload_success, null, null, 14), null, null, null, 2044));
                } else {
                    if (i5 != 2 && i5 != 3 && i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVarC0 = (h) dVar.f266372c.c0(a.C1416a.f257039a);
                }
                pfm.a aVarE = hVarN.e(bVarC0);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 1:
                i loungeData = (i) obj3;
                ((sxi.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(loungeData, "loungeData");
                return new sxi.g(loungeData);
            case 2:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new sxi.h(null, ((com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.b) obj3).b(), false, null);
            case 3:
                FrameLayout frameLayout = (FrameLayout) obj3;
                WeakReference ref2 = (WeakReference) obj2;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                View view = (View) ref2.get();
                return Boolean.valueOf(view == null || view == frameLayout);
            case 4:
                zy.d dVar3 = (zy.d) obj3;
                sy.e update = (sy.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (update instanceof sy.c) {
                    return sy.c.a((sy.c) update, false, null, false, null, ((zy.b) dVar3).f326353a, false, 15);
                }
                if (update instanceof sy.d) {
                    return update;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                Intrinsics.checkNotNullParameter((sy.e) obj2, "$this$update");
                return sy.d.a((sy.d) obj3, false, 13);
            case 6:
                sy.e eVar = (sy.e) obj2;
                return new sy.d((Uri) obj3, true, eVar.f0(), eVar.d());
            case 7:
                r rVar = (r) obj3;
                pyc.f fVar = rVar.f266659j;
                SelectableDelegate.Model selection = (SelectableDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(selection, "selection");
                Object obj4 = ((RowDelegate.Model) selection.f53305b).u;
                List documentGroup = obj4 instanceof List ? (List) obj4 : null;
                if (documentGroup == null) {
                    documentGroup = f0.f322471a;
                }
                t tVar = (t) fVar;
                efm.b bVarV3 = tVar.v3((IncomeSource) ((od0.i) ((h0) tVar.f240799b).C0().get()).c(), documentGroup);
                t tVar2 = (t) fVar;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(documentGroup, "documentGroup");
                h0 h0Var = (h0) tVar2.f240799b;
                efm.b bVarP = efm.b.p(w.A0(h0Var.F0(), documentGroup), w.A0(h0Var.E0(), d0.b0(documentGroup)));
                Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
                pfm.a aVarE2 = bVarV3.e(bVarP.e(((qri.b) rVar.f266660l).m()));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return mo3.a.u(o70.a.g(aVarE2), rVar.f266661m, true);
            case 8:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new g0(((t09.c) obj3).f266959a);
            case 9:
                return t0e.f.a((t0e.f) obj2, zi0.c.P((TaxFilingData) obj3, false, null, 3));
            case 10:
                ((t0g.c) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_experiences_booking");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "experience");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "visitors");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "failureReason");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticket");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pricing");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rewardType");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cashback");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancellationToken");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancellationPolicy");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancellationRefund");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactions");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pointsReward");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pointsOption");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        rzf.g gVarA = s0g.c.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                        List listA = j.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        hzf.b bVarA = s0g.b.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                        a0g.b bVarA2 = s0g.g.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        lzf.a aVarA = s0g.e.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        hzf.a aVarA2 = s0g.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                        int i6 = columnIndexOrThrow;
                        int i21 = columnIndexOrThrow15;
                        jzf.b bVarA3 = s0g.d.a(sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21));
                        columnIndexOrThrow15 = i21;
                        int i22 = columnIndexOrThrow16;
                        List listA2 = s0g.i.a(sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22));
                        columnIndexOrThrow16 = i22;
                        int i32 = columnIndexOrThrow17;
                        String text9 = sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32);
                        columnIndexOrThrow17 = i32;
                        int i33 = columnIndexOrThrow18;
                        columnIndexOrThrow18 = i33;
                        arrayList.add(new u0g.a(text, text2, text3, text4, text5, gVarA, listA, text6, bVarA, bVarA2, text7, aVarA, text8, aVarA2, bVarA3, listA2, text9, s0g.h.a(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33))));
                        columnIndexOrThrow = i6;
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 11:
                ((t0g.e) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_experiences_recently_viewed_dropoff");
                try {
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "experienceId");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "name");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "subtitle");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "image");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "parameters");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text10 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow19);
                        String text11 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow20);
                        String text12 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow21);
                        String text13 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow22);
                        String text14 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow23);
                        if (text14 != null) {
                            o oVarA = GsonHolder.a();
                            Type type = new TypeToken<pzf.a>() { // from class: com.revolut.feature.travel.experiences.impl.database.converter.TravelExperienceDropOffParametersConverter$fromJson$lambda$0$$inlined$fromJson$1
                            }.getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            Object objD = oVarA.d(text14, type);
                            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                            aVar = (pzf.a) objD;
                        } else {
                            aVar = null;
                        }
                        arrayList2.add(new pzf.b(text10, text11, text12, text13, aVar));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 12:
                KProperty[] kPropertyArr = AllInsightsScreen.V;
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) ((AllInsightsScreen) obj3).e3();
                bVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                bVar.l2(new t18.b(bVar, objArr == true ? 1 : 0, i3), new yi5.b(26));
                return Unit.f186387a;
            case 13:
                t27.i update2 = (t27.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return t27.i.a(update2, null, (t27.n) obj3, null, BitmapDescriptorFactory.HUE_RED, 1);
            case 14:
                t2e.g update3 = (t2e.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return t2e.g.a(update3, null, null, (t2e.f) obj3, null, null, null, 59);
            case 15:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                b2i.b summary = (b2i.b) pair.f186385a;
                wi0.b bVar2 = (wi0.b) pair.f186386b;
                t2i.e eVar2 = ((t2i.f) obj3).i;
                boolean zN = com.bumptech.glide.d.n(bVar2);
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(summary, "orderSummary");
                OrderQuote orderQuote = summary.f11950n;
                if (orderQuote != null) {
                    return eVar2.f267578b.j(orderQuote, new d4i.h(zN, null, null, null, false, 62), null);
                }
                t2i.j jVar = eVar2.f267577a;
                CellDetailsDelegate.Model modelF = jVar.f(summary);
                wd6.h hVar = summary.f11942a;
                CellDetailsDelegate.Model modelA = jVar.a(summary, o9.NON_SENSITIVE);
                CellDetailsDelegate.Model modelB = jVar.b(summary);
                Intrinsics.checkNotNullParameter(summary, "summary");
                k kVar = summary.k;
                if (kVar != null) {
                    c3 = 1;
                    c2 = 3;
                    model = new CellDetailsActionDelegate.Model("EXCHANGE_FEE", new TextLocalisedClause(com.revolut.feature_exchange.impl.R$string.market_order_disclaimer_crypto_fees_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature_exchange.impl.R$string.limit_order_exchange_fee_value_up_to, u.c(k1i.a.a(kVar)), null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
                } else {
                    c2 = 3;
                    c3 = 1;
                    model = null;
                }
                Intrinsics.checkNotNullParameter(summary, "<this>");
                if (!cp5.d.A(summary.d.f115083b) || !cp5.d.A(summary.f.f115083b) || !l.p(hVar)) {
                    model = null;
                }
                CellDetailsDelegate.Model modelC = (czi.c.z(summary) || !l.p(hVar)) ? jVar.c(summary) : null;
                qv0.i[] elements = new qv0.i[5];
                elements[0] = modelF;
                elements[c3] = modelA;
                elements[2] = modelB;
                elements[c2] = model;
                elements[4] = modelC;
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
            case 16:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ue0.e.v(((t2i.h) obj3).f267582j.finish());
            case 17:
                List list = (List) obj2;
                Intrinsics.h(list);
                ((IssueVirtualCardActivity) ((t33.h) obj3)).setItems(list);
                return Unit.f186387a;
            case 18:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((t3a.h) obj3).getClass();
                List<jq9.k> list2 = it11;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                for (jq9.k kVar2 : list2) {
                    if (kVar2 instanceof m) {
                        zVar = new v(((m) kVar2).f177508b);
                    } else if (kVar2 instanceof jq9.n) {
                        zVar = new jq9.w(((jq9.n) kVar2).f177510b);
                    } else if (kVar2 instanceof p) {
                        zVar = new y(((p) kVar2).f177514b);
                    } else if (kVar2 instanceof s) {
                        zVar = new b0(((s) kVar2).f177520b);
                    } else if (kVar2 instanceof jq9.r) {
                        zVar = new a0(((jq9.r) kVar2).f177518b);
                    } else if (kVar2 instanceof jq9.o) {
                        zVar = new x(((jq9.o) kVar2).f177512b);
                    } else if (kVar2 instanceof jq9.l) {
                        zVar = new jq9.u(((jq9.l) kVar2).f177506b);
                    } else {
                        if (!(kVar2 instanceof q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zVar = new z(((q) kVar2).f177516b);
                    }
                    arrayList3.add(zVar);
                }
                return arrayList3;
            case 19:
                e4f.c currentState = (e4f.c) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                return e4f.c.a(currentState, null, false, Long.valueOf(((e4f.a) obj3).f122539b), 3);
            case 20:
                TransferData updateTransferData = (TransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return TransferData.e(updateTransferData, null, 0L, null, null, ((x42.b) obj3).f302775a, null, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 21:
                return t42.b.a((t42.b) obj2, (TransferData) obj3, null, 0, null, Constants.TAG_FB_CHARGING_STATUS);
            case 22:
                return t42.b.a((t42.b) obj2, null, (t42.c) obj3, 0, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 23:
                t44.f update4 = (t44.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return t44.f.a(update4, null, new t44.k((hv3.a) obj3), 15);
            case 24:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return t44.q.a((t44.f) obj3, false, (List) getDefaultLoadingItems.invoke());
            case 25:
                LoanDetails loanDetails = (LoanDetails) obj2;
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                return w.o0(g.f186406a, new t45.d((t45.k) obj3, loanDetails, null));
            case 26:
                t48.y yVar = (t48.y) obj3;
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Joint account onboarding consent screen", null, exception, h0Var2);
                yVar.d0(false, false);
                yji.l.a1(yVar, yVar.X1(new y0(null, new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new t05.m(yVar, objArr2 == true ? 1 : 0, 6), 3);
                return Boolean.TRUE;
            case 27:
                t4a.c cVar = (t4a.c) obj3;
                eii.k outputData = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof eii.i) {
                    Object obj5 = ((eii.i) outputData).f126655a;
                    if (obj5 instanceof l4a.a) {
                        cVar.T2(new sx2.r(cVar, obj5, objArr3 == true ? 1 : 0, i2), new yi5.b(27));
                    } else {
                        hx7.e.n(new IllegalStateException(a0.d.m(obj5, "Cannot process: ")));
                    }
                } else {
                    hx7.e.n(new IllegalStateException("Cannot process outputData: " + outputData));
                }
                return Unit.f186387a;
            case 28:
                String ref3 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref3, "ref");
                return ((ael.k) ((t4h.e) obj3).f267997a).e(ref3);
            default:
                k50.y update5 = (k50.y) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return k50.y.a(update5, (z30.e) obj3, zhm.h0.f322473a, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        }
    }

    public /* synthetic */ a(t44.q qVar, t44.f fVar) {
        this.f266367a = 24;
        this.f266368b = fVar;
    }
}
