package ryd;

import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.Result3A;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.ui.text.input.ImeAction;
import aw0.m6;
import aw0.n6;
import com.revolut.core.deeplink.DeeplinkDroppedException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.models.SpareChangeAmount;
import com.revolut.feature.rev_points.models.SpareChangeCalculation;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.models.SpareChangeRate;
import com.revolut.feature.statements.api.models.ConsolidatedStatementProductType;
import com.revolut.feature.statements.api.models.StatementUrlState;
import efm.d0;
import ip0.nb0;
import ip0.p10;
import ip0.pb0;
import ip0.s7;
import ip0.t10;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import s06.u;
import zhm.h0;
import zhm.z0;
import zw7.z;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258348a;

    public /* synthetic */ k(int i) {
        this.f258348a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strO;
        switch (this.f258348a) {
            case 0:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) hVar.f288433a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) hVar.f288434b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) hVar.f288435c).booleanValue();
                boolean zBooleanValue4 = ((Boolean) hVar.d).booleanValue();
                ConsolidatedStatementProductType consolidatedStatementProductType = ConsolidatedStatementProductType.CRYPTO;
                if (!zBooleanValue) {
                    consolidatedStatementProductType = null;
                }
                ConsolidatedStatementProductType consolidatedStatementProductType2 = ConsolidatedStatementProductType.STOCK;
                if (!zBooleanValue4) {
                    consolidatedStatementProductType2 = null;
                }
                ConsolidatedStatementProductType consolidatedStatementProductType3 = ConsolidatedStatementProductType.COMMODITIES;
                if (!zBooleanValue3) {
                    consolidatedStatementProductType3 = null;
                }
                return z0.i(consolidatedStatementProductType, consolidatedStatementProductType2, consolidatedStatementProductType3, zBooleanValue2 ? ConsolidatedStatementProductType.SAVINGS : null);
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof m) {
                    return zi0.c.P(new StatementUrlState.InPreparation(null, 1, null), false, null, 3);
                }
                throw it8;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0VarB = nb0.b(pb0.Companion, "LIST_ID_REFUNDS_AMOUNT", true, 0, false, 28);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                s7 s7Var = new s7("LIST_ID_REFUNDS_AMOUNT", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(pb0VarB, s7Var);
            case 3:
                do3.n it9 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return do3.q.y(it9);
            case 4:
                al0.a it10 = (al0.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10 == al0.a.ONLINE);
            case 5:
                al0.a it11 = (al0.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 == al0.a.ONLINE);
            case 6:
                lz4.a aVar = (lz4.a) obj2;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, null, "LOAN FORBEARANCE APPLICATION STATUS: " + aVar.f200935b + "id: " + aVar.f200934a, null, null, 16);
                return Unit.f186387a;
            case 7:
                z it12 = (z) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                z.Companion.getClass();
                z[] zVarArrValues = z.values();
                ArrayList arrayList = new ArrayList();
                for (z zVar : zVarArrValues) {
                    if (zVar != z.UNKNOWN) {
                        arrayList.add(zVar);
                    }
                }
                return Boolean.valueOf(arrayList.contains(it12));
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new qzb.h(rzb.b.a(null, null));
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return rzb.d.a();
            case 11:
                String currencyCode = (String) obj2;
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                xi0.b.Companion.getClass();
                return xi0.a.a(currencyCode);
            case 12:
                return Boolean.valueOf(CapturePipelineImpl.waitForResult$lambda$0((FrameInfo) obj2));
            case 13:
                return FlashControl.setTorchForScreenFlash$lambda$1$1((Throwable) obj2);
            case 14:
                return FlashControl.setExternalFlashAeModeAsync$lambda$1$1((Throwable) obj2);
            case 15:
                return TorchControl.setTorchAsync_Oup_wC0$lambda$1$3((Result3A) obj2);
            case 16:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.getCause();
            case 17:
                Boolean actionHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(actionHandled, "actionHandled");
                return new s06.v(actionHandled.booleanValue());
            case 18:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof DeeplinkDroppedException) {
                    return d0.m(u.a.f258875a);
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "DeeplinkRouterImpl", "Error performing deeplink action", error, h0Var);
                return d0.m(new s06.v(false));
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                String str2 = (String) pair.f186386b;
                String str3 = str2.length() > 0 ? str2 : null;
                return (str3 == null || (strO = com.google.android.gms.internal.mlkit_vision_face.a.o(str, "=", str3)) == null) ? str : strO;
            case 20:
                k71.q it14 = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new Data(it14, null, false, 6, null);
            case 21:
                RevPointsTransaction transaction = (RevPointsTransaction) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                if (transaction.f84063p != null) {
                    return transaction;
                }
                throw new IllegalArgumentException("transaction must have earning details");
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new lw0.h(lw0.i.TITLE_SUBTITLE);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                IntRange intRangeO = kotlin.ranges.f.o(0, 2);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it15 = intRangeO.iterator();
                while (it15.f289625c) {
                    arrayList2.add(nb0.b(pb0.Companion, a0.d.n("ROW_DELEGATE_LOADING_ITEM_ID", it15.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                s7 s7Var2 = new s7("CELL_DELEGATE_LOADING_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var2);
                return zhm.u.a(eVarB);
            case 24:
                return LegacyTextInputMethodRequest.onEditCommand$lambda$0((List) obj2);
            case 25:
                return LegacyTextInputMethodRequest.onImeActionPerformed$lambda$0((ImeAction) obj2);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listC = zhm.u.c(new t10("ID_LOADING_ITEM", p10.f165755a));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new s15.g(listC, null, false, new TextLocalisedClause(R$string.financial_difficulties_title, null, null, 14), 10);
            case 27:
                s1a.a update = (s1a.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return s1a.a.a(update, update.f259115a + 1);
            case 28:
                s1a.a update2 = (s1a.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return s1a.a.a(update2, update2.f259115a - 1);
            default:
                r1c.d it16 = (r1c.d) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Intrinsics.checkNotNullParameter(it16, "<this>");
                r1c.f rate = it16.getRate();
                Intrinsics.checkNotNullParameter(rate, "<this>");
                SpareChangeRate spareChangeRate = new SpareChangeRate(rate.getPerCurrencyUnitsSpent(), qvb.a.a(rate.getPoints()));
                r1c.b spent = it16.getSpent();
                Intrinsics.checkNotNullParameter(spent, "<this>");
                SpareChangeAmount spareChangeAmount = new SpareChangeAmount(spent.getAmount(), spent.getCurrency());
                List<r1c.c> calculations = it16.getCalculations();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(calculations, 10));
                for (r1c.c cVar : calculations) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    int multiplier = cVar.getMultiplier();
                    r1c.b roundUp = cVar.getRoundUp();
                    Intrinsics.checkNotNullParameter(roundUp, "<this>");
                    arrayList3.add(new SpareChangeCalculation(multiplier, new SpareChangeAmount(roundUp.getAmount(), roundUp.getCurrency()), qvb.a.a(cVar.getPoints())));
                }
                return new SpareChangeCalculations(spareChangeRate, spareChangeAmount, arrayList3);
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f258348a = i;
    }
}
