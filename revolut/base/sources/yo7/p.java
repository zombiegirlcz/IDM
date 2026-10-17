package yo7;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import au0.c4;
import aw0.b0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.bottom_sheet.picket.PickerBottomSheetController;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.external_accounts.api.OpenBankingConsentsApi$Toggles$BrazilOpenBanking;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import ip0.v7;
import ix0.i1;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mx0.la;
import mx0.w5;
import nii.y0;
import nii.z;
import tof.hc;
import ys.x;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f315630b;

    public /* synthetic */ p(Object obj2, int i) {
        this.f315629a = i;
        this.f315630b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        ar9.a aVar;
        b0 b0Var;
        int i2 = this.f315629a;
        int i3 = 7;
        int i5 = 25;
        int i6 = 2;
        boolean z = false;
        i = 0;
        i = 0;
        int i21 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        c4 c4Var = 0;
        Object obj3 = this.f315630b;
        switch (i2) {
            case 0:
                h updateState = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return h.a(updateState, null, null, null, null, null, null, null, null, null, null, null, (Answer.EmploymentStatus) obj3, null, 12287);
            case 1:
                h updateState2 = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return h.a(updateState2, null, null, null, null, null, null, null, null, (Answer.PenaltyPoints) obj3, null, null, null, null, 15871);
            case 2:
                h updateState3 = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return h.a(updateState3, null, null, null, null, (Answer.LicenceType) obj3, null, null, null, null, null, null, null, null, 16351);
            case 3:
                smd.s sVar = (smd.s) obj3;
                l71.d userCompany = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(userCompany, "userCompany");
                if (l71.f.a(userCompany) && ((jte.d) ((gte.a) sVar.f264433b)).c(OpenBankingConsentsApi$Toggles$BrazilOpenBanking.f72207c)) {
                    return new tla.c(false, true);
                }
                tla.c.Companion.getClass();
                return tla.c.f272042c;
            case 4:
                PickerBottomSheetController pickerBottomSheetController = (PickerBottomSheetController) obj3;
                Pair pair = (Pair) obj2;
                KProperty[] kPropertyArr = PickerBottomSheetController.W;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return pickerBottomSheetController.U.d.f121375b.map(new yma.r(new vvc.t(pickerBottomSheetController, ((Number) pair.f186386b).intValue(), 4), 24)).take(1L);
            case 5:
                ypg.b bVar = (ypg.b) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                ArrayList arrayListE0 = d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
                ArrayList<pcd.s> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayListE0) {
                    if (opg.c.g((pcd.s) obj4)) {
                        arrayList.add(obj4);
                    } else {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
                for (pcd.s sVar2 : arrayList) {
                    arrayList3.add(new npg.b(sVar2, ((s6e.d) bVar.f315867c).c(ypg.b.d(sVar2).c())));
                }
                go.g gVar = new go.g(zi0.c.P(arrayList3, false, null, 3), 2);
                bVar.f315866b.getClass();
                return rd0.e.c(nim.a.v(u0.m(gVar, nim.a.v(ypg.c.a(arrayList2), new yj2.b(bVar, arrayList2, 12))), new ypd.i(1)), kotlin.coroutines.g.f186406a);
            case 6:
                fo3.c wallet = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                return ((mjf.b0) ((ypg.i) obj3).f315874b).g(new hc(wallet.f136801a, null));
            case 7:
                efm.r observable = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(observable, "observable");
                return observable.switchMap(new ypg.l((ypg.p) obj3, 1));
            case 8:
                String tabId = (String) obj2;
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                return ((u9j.e) ((ypk.g) obj3).o).e(tabId);
            case 9:
                xq9.a aVar2 = ((yq9.h) obj3).f316007c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups ORDER BY updatedDate DESC");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "imageUrl");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyCode");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "balance");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTrusted");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastFullSettlementDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings_calculationType");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings_baseCurrency");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_totalSpentByGroup");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_totalSpentByCurrentMember");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_currency");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_totalSpentByGroupByCurrency");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_totalSpentByCurrentMemberByCurrency");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        ar9.e eVarA = xq9.b.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                        int i22 = columnIndexOrThrow2;
                        int i32 = columnIndexOrThrow3;
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0;
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                        int i33 = columnIndexOrThrow;
                        ar9.d dVar = new ar9.d(yq9.h.a(sQLiteStatementPrepare.getText(columnIndexOrThrow9)), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11) && sQLiteStatementPrepare.isNull(columnIndexOrThrow12) && sQLiteStatementPrepare.isNull(columnIndexOrThrow13) && sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                            i = columnIndexOrThrow15;
                            if (sQLiteStatementPrepare.isNull(i)) {
                                aVar = null;
                                arrayList4.add(new ar9.r(text, text2, text3, text4, eVarA, z3, j2, lValueOf, dVar, aVar));
                                columnIndexOrThrow15 = i;
                                columnIndexOrThrow2 = i22;
                                columnIndexOrThrow3 = i32;
                                columnIndexOrThrow = i33;
                            }
                        } else {
                            i = columnIndexOrThrow15;
                        }
                        aVar = new ar9.a(sQLiteStatementPrepare.getLong(columnIndexOrThrow11), sQLiteStatementPrepare.getLong(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), xq9.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14)), xq9.a.a(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i)));
                        arrayList4.add(new ar9.r(text, text2, text3, text4, eVarA, z3, j2, lValueOf, dVar, aVar));
                        columnIndexOrThrow15 = i;
                        columnIndexOrThrow2 = i22;
                        columnIndexOrThrow3 = i32;
                        columnIndexOrThrow = i33;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList4;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 10:
                yr0.u uVar = (yr0.u) obj3;
                Configuration it8 = (Configuration) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                yr0.p pVar = (yr0.p) uVar.f.get();
                if (pVar != null) {
                    View view = pVar.f316085a;
                    yr0.p pVar2 = (yr0.p) uVar.f.get();
                    if (pVar2 != null && (b0Var = pVar2.f316086b) != null) {
                        c4 c4Var2 = uVar.f316099g;
                        if (c4Var2 != null) {
                            c4Var2.cancel();
                        }
                        yr0.p pVar3 = (yr0.p) uVar.f.get();
                        if (pVar3 != null) {
                            View view2 = pVar3.f316085a;
                            c4 c4Var3 = new c4(view2, uVar, view, b0Var, 4);
                            view2.addOnLayoutChangeListener(c4Var3);
                            c4Var = c4Var3;
                        }
                        uVar.f316099g = c4Var;
                    }
                }
                return Unit.f186387a;
            case 11:
                yr3.a key = (yr3.a) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                return (List) ((yr3.b) obj3).f316116b.get(key.f316114c);
            case 12:
                yr5.f updateState4 = (yr5.f) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return yr5.f.a(updateState4, null, null, null, new Data(null, new IllegalArgumentException(j6.a.q("Unknown crypto ref: ", ((yr5.i) ((yr5.n) obj3).c3().f310975b).f316137b)), false, 5, null), 31);
            case 13:
                return yra.j.a((yra.j) obj2, null, (yra.k) obj3, 0, null, 27);
            case 14:
                List stockFinancials = (List) obj2;
                Intrinsics.checkNotNullParameter(stockFinancials, "stockFinancials");
                int i43 = yrk.f.f316330b[((uqk.l) obj3).ordinal()];
                if (i43 == 1) {
                    List list = stockFinancials;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            if (((uqk.d) it9.next()).d != null) {
                                z = true;
                            }
                        }
                    }
                } else if (i43 == 2) {
                    List list2 = stockFinancials;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            if (((uqk.d) it10.next()).e != null) {
                                z = true;
                            }
                        }
                    }
                } else {
                    if (i43 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list3 = stockFinancials;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            if (((uqk.d) it11.next()).f != null) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 15:
                x calendar = (x) obj3;
                ys.j update = (ys.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                Intrinsics.checkNotNullParameter(calendar, "calendar");
                Intrinsics.checkNotNullParameter("", "year");
                Intrinsics.checkNotNullParameter("", "month");
                Intrinsics.checkNotNullParameter("", "day");
                return new ys.j(calendar, "", "", "");
            case 16:
                com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.a aVar3 = (com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.a) obj3;
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                eii.i iVar = output instanceof eii.i ? (eii.i) output : null;
                Object obj5 = iVar != null ? iVar.f126655a : null;
                x xVar = obj5 instanceof x ? (x) obj5 : null;
                if (xVar != null) {
                    aVar3.I2(new ys.m(xVar));
                }
                return Unit.f186387a;
            case 17:
                ys1.k kVar = (ys1.k) obj3;
                at1.c output2 = (at1.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, at1.a.f8980a)) {
                    kVar.v2(ys1.d.f316386a);
                } else {
                    if (!Intrinsics.f(output2, at1.b.f8981a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.v2(ys1.b.f316384a);
                }
                return Unit.f186387a;
            case 18:
                String facilityId = (String) obj2;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return (xr7.f) v7.r("credit-insurance-state-", facilityId, ((ys7.d) obj3).f316420b);
            case 19:
                xsk.c update2 = (xsk.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xsk.c.a(update2, null, (xsk.g) obj3, 1);
            case 20:
                return xsk.c.a((xsk.c) obj2, (xsk.f) obj3, null, 2);
            case 21:
                int iIntValue = ((Integer) obj2).intValue();
                com.revolut.core.ui_kit.views.o oVar = ((yt0.j) obj3).f316567a;
                if (iIntValue > 0 && oVar.getContentContainer$ui_kit_components_release().getMeasuredWidth() > 0) {
                    Context context = oVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    float f = iIntValue;
                    int iC = rim.d.c((rr0.q.a(oVar.getContentContainer$ui_kit_components_release().getMeasuredWidth(), context) * f) - f);
                    if (iC >= 0) {
                        i21 = iC;
                    }
                }
                return Integer.valueOf(i21);
            case 22:
                yt0.v vVar = (yt0.v) obj3;
                Boolean bool = (Boolean) obj2;
                la laVar = vVar.m().f58780a;
                Object obj6 = vVar.o;
                Intrinsics.h(bool);
                kotlin.jvm.internal.s.x(laVar, obj6, bool.booleanValue());
                yt0.b0 b0Var2 = vVar.k;
                boolean zBooleanValue = bool.booleanValue();
                ValueAnimator valueAnimator = b0Var2.i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                b0Var2.i = null;
                float f4 = zBooleanValue ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                float fB = i1.b(b0Var2.a(), 1.0f, b0Var2.f316522h);
                float fB2 = i1.b(b0Var2.a(), 1.0f, f4);
                float f5 = b0Var2.f316522h;
                if (f5 == f4 || fB == fB2) {
                    b0Var2.f316522h = f4;
                } else {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, f4);
                    valueAnimatorOfFloat.setDuration((long) (Math.abs(f4 - b0Var2.f316522h) * 300));
                    valueAnimatorOfFloat.addUpdateListener(new w5(b0Var2, 20));
                    valueAnimatorOfFloat.addListener(new vt0.f(b0Var2, i3));
                    valueAnimatorOfFloat.start();
                    b0Var2.i = valueAnimatorOfFloat;
                }
                return Unit.f186387a;
            case 23:
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return ((ypg.b) ((yt9.g) obj3).f316686c).b(vault).map(new ypg.l(new ysk.a(i6), i5));
            case 24:
                toh.d dVar2 = (toh.d) obj3;
                Long lastShownDate = (Long) obj2;
                Intrinsics.checkNotNullParameter(lastShownDate, "lastShownDate");
                return Boolean.valueOf(lastShownDate.longValue() == 0 ? true : LocalDate.now((Clock) dVar2.f273215b).isAfter(Instant.ofEpochMilli(lastShownDate.longValue()).atZone(((Clock) dVar2.f273215b).getZone()).toLocalDate().plusWeeks(1L)));
            case 25:
                Integer counter = (Integer) obj2;
                Intrinsics.checkNotNullParameter(counter, "counter");
                return ((aua.f) ((tul.b) obj3).f274637b).d(counter.intValue() + 1);
            case 26:
                return new OrderQuoteResult((OrderQuote) obj2, (OrderQuoteParams) obj3);
            case 27:
                yu4.g gVar2 = (yu4.g) obj3;
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                yji.l.b1(gVar2, gVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, 7);
                return Boolean.FALSE;
            case 28:
                yu5.g updateState5 = (yu5.g) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                List list4 = ((yu5.n) obj3).f316894p.f71440a;
                ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                Iterator it13 = list4.iterator();
                while (it13.hasNext()) {
                    arrayList5.add(((CryptoTransactionFilter) it13.next()).c());
                }
                return yu5.g.a(updateState5, arrayList5);
            default:
                yu7.k kVar2 = (yu7.k) obj3;
                f9i.c request = (f9i.c) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                kVar2.A1(new yg6.v(kVar2, request, c4Var, 26), new yi5.b(i5));
                return Unit.f186387a;
        }
    }
}
