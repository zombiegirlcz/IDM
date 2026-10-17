package f2i;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.R$string;
import efm.d0;
import g1i.l0;
import g1i.m0;
import ip0.vd;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f131803b;

    public /* synthetic */ n(z zVar, int i) {
        this.f131802a = i;
        this.f131803b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pfm.a aVar;
        int i = this.f131802a;
        efm.f fVar = pfm.m.f235744a;
        final int i2 = 0;
        final int i3 = 1;
        final z zVar = this.f131803b;
        switch (i) {
            case 0:
                return ((l0) zVar.f131816j).e();
            case 1:
                g1i.a aVar2 = zVar.k;
                InputTextDelegate.Model it8 = (InputTextDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String str = it8.f52580a;
                if (Intrinsics.f(str, "START_DATE_ITEM_ID")) {
                    d0 d0VarFirstOrError = ((g1i.d0) aVar2).H3().firstOrError();
                    o oVar = new o(new x(1, zVar.f131817l, k.class, "mapStartDateDialogConfig", "mapStartDateDialogConfig(Lorg/joda/time/LocalDate;)Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;", 0, 4), 1);
                    d0VarFirstOrError.getClass();
                    ufm.i iVar = new ufm.i(d0VarFirstOrError, oVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    aVar = new pfm.a(o70.a.i(iVar), new o(new n(zVar, 9), 2), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                } else {
                    if (!Intrinsics.f(str, "REPEAT_ITEM_ID")) {
                        Intrinsics.checkNotNullExpressionValue(fVar, "complete(...)");
                        pfm.a aVarE = ((g1i.d0) aVar2).M3().e(fVar);
                        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                        return aVarE;
                    }
                    d0 d0VarFirstOrError2 = ((g1i.d0) aVar2).G3().firstOrError();
                    ey7.a aVar3 = new ey7.a(new x(1, zVar.f131817l, k.class, "mapRepeatDialogConfig", "mapRepeatDialogConfig(Lcom/revolut/feature_exchange/impl/ui/exchange/recurring_order_settings/RecurringOrderSettingsContract$PeriodType;)Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;", 0, 3), 29);
                    d0VarFirstOrError2.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarFirstOrError2, aVar3, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    aVar = new pfm.a(o70.a.i(iVar2), new o(new n(zVar, 8), 0), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                }
                fVar = aVar;
                pfm.a aVarE2 = ((g1i.d0) aVar2).M3().e(fVar);
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                pfm.a aVarE3 = o70.a.g(((g1i.d0) zVar.k).O3()).e(((opi.b) zVar.f131818m).O());
                Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
                return aVarE3;
            case 3:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                te0.e eVarD0 = ((m0) ((g1i.d0) zVar.k).e).D0();
                LocalDate localDateNow = LocalDate.now();
                Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
                pfm.a aVarE4 = o70.a.g(te0.w.z0(eVarD0, localDateNow)).e(((opi.b) zVar.f131818m).O());
                Intrinsics.checkNotNullExpressionValue(aVarE4, "andThen(...)");
                return aVarE4;
            case 4:
                vd clickData = (vd) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                g1i.a aVar4 = zVar.k;
                int year = clickData.f166807b.getYear();
                java.time.LocalDate localDate = clickData.f166807b;
                LocalDate selectedDate = new LocalDate(year, localDate.getMonthValue(), localDate.getDayOfMonth());
                g1i.d0 d0Var = (g1i.d0) aVar4;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                return te0.w.z0(((m0) d0Var.e).G0(), selectedDate);
            case 5:
                SingleChoiceDelegate.Model item = (SingleChoiceDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj3 = item.f;
                if (!(obj3 instanceof g)) {
                    return fVar;
                }
                g selectedPeriodType = (g) obj3;
                g1i.d0 d0Var2 = (g1i.d0) zVar.k;
                d0Var2.getClass();
                Intrinsics.checkNotNullParameter(selectedPeriodType, "selectedPeriodType");
                return te0.w.z0(((m0) d0Var2.e).F0(), selectedPeriodType);
            case 6:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                g1i.a aVar5 = zVar.k;
                pfm.a aVarE5 = ((g1i.d0) aVar5).P3().e(((g1i.d0) aVar5).m3()).e(((l0) zVar.f131816j).e());
                Intrinsics.checkNotNullExpressionValue(aVarE5, "andThen(...)");
                return aVarE5;
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                LocalDate date = (LocalDate) pair.f186385a;
                g selectedPeriod = (g) pair.f186386b;
                k kVar = zVar.f131817l;
                boolean z = selectedPeriod == g.MONTHLY && date.getDayOfMonth() > 28;
                ((b0) kVar).getClass();
                Intrinsics.checkNotNullParameter(date, "selectedDate");
                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                Intrinsics.checkNotNullParameter(date, "date");
                InputTextDelegate.Model model = new InputTextDelegate.Model("START_DATE_ITEM_ID", edl.a.m(date) ? new TextLocalisedClause(R$string.fx_orders_recurring_start_date_today, null, null, 14) : new TimeClause(date.toDate().getTime(), TimeClause.Format.DateLong.f57962b, null, null, 12), new TextLocalisedClause(R$string.fx_orders_recurring_start_date, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model modelE = InputTextDelegate.Model.e(yp0.r.a(new InputTextDelegate.Model("REPEAT_ITEM_ID", new TextLocalisedClause(selectedPeriod.b(), null, null, 14), new TextLocalisedClause(R$string.fx_orders_recurring_repeat, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, -2049);
                yp0.b.l(modelE, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
                PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("END_OF_MONTH_DISCLAIMER_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.fx_orders_recurring_schedule_end_of_month_disclaimer, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                qv0.i[] elements = {model, modelE, z ? model2 : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 8:
                final rp0.y dialogConfig = (rp0.y) obj2;
                Intrinsics.checkNotNullParameter(dialogConfig, "dialogConfig");
                return new pfm.h(new kfm.a() { // from class: f2i.p
                    @Override // kfm.a
                    public final void run() {
                        switch (i3) {
                            case 0:
                                opi.d dVar = zVar.f131818m;
                                rp0.y yVar = dialogConfig;
                                Intrinsics.h(yVar);
                                ((opi.b) dVar).Z(yVar);
                                break;
                            default:
                                opi.d dVar2 = zVar.f131818m;
                                rp0.y yVar2 = dialogConfig;
                                Intrinsics.h(yVar2);
                                ((opi.b) dVar2).Z(yVar2);
                                break;
                        }
                    }
                }, 2);
            default:
                final rp0.y dialogConfig2 = (rp0.y) obj2;
                Intrinsics.checkNotNullParameter(dialogConfig2, "dialogConfig");
                return new pfm.h(new kfm.a() { // from class: f2i.p
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                opi.d dVar = zVar.f131818m;
                                rp0.y yVar = dialogConfig2;
                                Intrinsics.h(yVar);
                                ((opi.b) dVar).Z(yVar);
                                break;
                            default:
                                opi.d dVar2 = zVar.f131818m;
                                rp0.y yVar2 = dialogConfig2;
                                Intrinsics.h(yVar2);
                                ((opi.b) dVar2).Z(yVar2);
                                break;
                        }
                    }
                }, 2);
        }
    }
}
