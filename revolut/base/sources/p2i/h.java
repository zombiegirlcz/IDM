package p2i;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.g5;
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
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.joda.time.LocalDate;
import rp0.y;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f232238b;

    public /* synthetic */ h(r rVar, int i) {
        this.f232237a = i;
        this.f232238b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        char c2;
        char c3;
        TextLocalisedClause textLocalisedClause;
        int i = this.f232237a;
        PlainTextDelegate.Model model = null;
        final int i2 = 0;
        pfm.m mVar = pfm.m.f235744a;
        final int i3 = 1;
        final r rVar = this.f232238b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                LocalDate date = (LocalDate) pair.f186385a;
                f2i.g selectedPeriod = (f2i.g) pair.f186386b;
                ypi.i iVar = rVar.f232255p;
                ((u) rVar.f232252l).getClass();
                Intrinsics.checkNotNullParameter(date, "selectedDate");
                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                Date date2 = date.toDate();
                Intrinsics.checkNotNullExpressionValue(date2, "toDate(...)");
                long jP = ebm.a.P(ebm.a.N(date2));
                TimeClause.Format.DateLong dateLong = TimeClause.Format.DateLong.f57962b;
                TimeClause timeClause = new TimeClause(jP, dateLong, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
                int i5 = t.f232257a[selectedPeriod.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    c2 = 2;
                    c3 = 1;
                    textLocalisedClause = new TextLocalisedClause(R$string.fx_orders_recurring_description, v.k(new TextLocalisedClause(selectedPeriod.a(), null, null, 14), timeClause), null, 12);
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2 = 2;
                    int i6 = R$string.fx_orders_recurring_description_extended;
                    c3 = 1;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(selectedPeriod.a(), null, null, 14);
                    Date date3 = date.toDate();
                    Intrinsics.checkNotNullExpressionValue(date3, "toDate(...)");
                    textLocalisedClause = new TextLocalisedClause(i6, v.k(textLocalisedClause2, new TimeClause(ebm.a.P(ebm.a.N(date3)), TimeClause.Format.DayOfWeek.f57966b, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), timeClause), null, 12);
                }
                iVar.t(new ypi.l(textLocalisedClause));
                Intrinsics.checkNotNullParameter(date, "selectedDate");
                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                Intrinsics.checkNotNullParameter(date, "date");
                InputTextDelegate.Model model2 = new InputTextDelegate.Model("START_DATE_ITEM_ID", edl.a.m(date) ? new TextLocalisedClause(R$string.fx_orders_recurring_start_date_today, null, null, 14) : new TimeClause(date.toDate().getTime(), dateLong, null, null, 12), new TextLocalisedClause(R$string.fx_orders_recurring_start_date, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model modelE = InputTextDelegate.Model.e(yp0.r.a(new InputTextDelegate.Model("FREQUENCY_ITEM_ID", new TextLocalisedClause(selectedPeriod.b(), null, null, 14), new TextLocalisedClause(R$string.fx_orders_recurring_frequency, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, -2049);
                yp0.b.l(modelE, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
                PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("END_OF_MONTH_DISCLAIMER_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.fx_orders_recurring_schedule_end_of_month_disclaimer, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                if (selectedPeriod == f2i.g.MONTHLY && date.getDayOfMonth() > 28) {
                    model = model3;
                }
                qv0.i[] elements = new qv0.i[3];
                elements[0] = model2;
                elements[c3] = modelE;
                elements[c2] = model;
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 1:
                g1i.a aVar = rVar.k;
                InputTextDelegate.Model it8 = (InputTextDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String str = it8.f52580a;
                int i21 = 4;
                if (Intrinsics.f(str, "START_DATE_ITEM_ID")) {
                    d0 d0VarFirstOrError = ((g1i.d0) aVar).H3().firstOrError();
                    p24.b bVar = new p24.b(22, new h(rVar, i21));
                    d0VarFirstOrError.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarFirstOrError, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    pfm.a aVar2 = new pfm.a(o70.a.i(iVar2), new p24.b(23, new h(rVar, 5)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                    return aVar2;
                }
                if (!Intrinsics.f(str, "FREQUENCY_ITEM_ID")) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                d0 d0VarFirstOrError2 = ((g1i.d0) aVar).G3().firstOrError();
                p24.b bVar2 = new p24.b(25, new h(rVar, 6));
                d0VarFirstOrError2.getClass();
                ufm.i iVar3 = new ufm.i(d0VarFirstOrError2, bVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                pfm.a aVar3 = new pfm.a(o70.a.i(iVar3), new p24.b(26, new h(rVar, 7)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return aVar3;
            case 2:
                return ((l0) rVar.f232251j).e();
            case 3:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                LocalDate selectedDate = (LocalDate) pair2.f186385a;
                f2i.g selectedPeriodType = (f2i.g) pair2.f186386b;
                g1i.a aVar4 = rVar.k;
                g1i.d0 d0Var = (g1i.d0) aVar4;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                pfm.t tVarZ0 = w.z0(((m0) d0Var.e).G0(), selectedDate);
                g1i.d0 d0Var2 = (g1i.d0) aVar4;
                d0Var2.getClass();
                Intrinsics.checkNotNullParameter(selectedPeriodType, "selectedPeriodType");
                return tVarZ0.e(w.z0(((m0) d0Var2.e).F0(), selectedPeriodType)).e(((opi.b) rVar.f232253m).O());
            case 4:
                LocalDate selectedDate2 = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(selectedDate2, "date");
                ((u) rVar.f232252l).getClass();
                Intrinsics.checkNotNullParameter(selectedDate2, "selectedDate");
                Date date4 = selectedDate2.toDate();
                Intrinsics.checkNotNullExpressionValue(date4, "toDate(...)");
                java.time.LocalDate localDateN = ebm.a.N(date4);
                Date date5 = LocalDate.now().toDate();
                Intrinsics.checkNotNullExpressionValue(date5, "toDate(...)");
                java.time.LocalDate localDateN2 = ebm.a.N(date5);
                Date date6 = selectedDate2.toDate();
                Intrinsics.checkNotNullExpressionValue(date6, "toDate(...)");
                List listC = zhm.u.c(new g5("START_DATE_PICKER_ITEM_ID", localDateN, ebm.a.N(date6), false, null, localDateN2, null, null, null, null, 0, 0, 1048504));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new y(listC, new rp0.t(new TextLocalisedClause(R$string.fx_orders_recurring_start_date, null, null, 14), null, null, 30), rp0.l.WINDOW, null, "START_DATE_DIALOG_TAG", null, 984);
            case 5:
                final y dialogConfig = (y) obj2;
                Intrinsics.checkNotNullParameter(dialogConfig, "dialogConfig");
                return new pfm.h(new kfm.a() { // from class: p2i.i
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                opi.d dVar = rVar.f232253m;
                                y yVar = dialogConfig;
                                Intrinsics.h(yVar);
                                ((opi.b) dVar).Z(yVar);
                                break;
                            default:
                                opi.d dVar2 = rVar.f232253m;
                                y yVar2 = dialogConfig;
                                Intrinsics.h(yVar2);
                                ((opi.b) dVar2).Z(yVar2);
                                break;
                        }
                    }
                }, 2);
            case 6:
                f2i.g periodType = (f2i.g) obj2;
                Intrinsics.checkNotNullParameter(periodType, "periodType");
                return ((u) rVar.f232252l).a(periodType);
            case 7:
                final y dialogConfig2 = (y) obj2;
                Intrinsics.checkNotNullParameter(dialogConfig2, "dialogConfig");
                return new pfm.h(new kfm.a() { // from class: p2i.i
                    @Override // kfm.a
                    public final void run() {
                        switch (i3) {
                            case 0:
                                opi.d dVar = rVar.f232253m;
                                y yVar = dialogConfig2;
                                Intrinsics.h(yVar);
                                ((opi.b) dVar).Z(yVar);
                                break;
                            default:
                                opi.d dVar2 = rVar.f232253m;
                                y yVar2 = dialogConfig2;
                                Intrinsics.h(yVar2);
                                ((opi.b) dVar2).Z(yVar2);
                                break;
                        }
                    }
                }, 2);
            case 8:
                vd clickData = (vd) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                g1i.a aVar5 = rVar.k;
                int year = clickData.f166807b.getYear();
                java.time.LocalDate localDate = clickData.f166807b;
                LocalDate selectedDate3 = new LocalDate(year, localDate.getMonthValue(), localDate.getDayOfMonth());
                g1i.d0 d0Var3 = (g1i.d0) aVar5;
                d0Var3.getClass();
                Intrinsics.checkNotNullParameter(selectedDate3, "selectedDate");
                return w.z0(((m0) d0Var3.e).G0(), selectedDate3);
            case 9:
                SingleChoiceDelegate.Model item = (SingleChoiceDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj3 = item.f;
                if (!(obj3 instanceof f2i.g)) {
                    return mVar;
                }
                f2i.g selectedPeriodType2 = (f2i.g) obj3;
                g1i.d0 d0Var4 = (g1i.d0) rVar.k;
                d0Var4.getClass();
                Intrinsics.checkNotNullParameter(selectedPeriodType2, "selectedPeriodType");
                return w.z0(((m0) d0Var4.e).F0(), selectedPeriodType2);
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                g1i.a aVar6 = rVar.k;
                pfm.t tVarP3 = ((g1i.d0) aVar6).P3();
                g1i.d0 d0Var5 = (g1i.d0) aVar6;
                pfm.a aVarE = tVarP3.e(d0Var5.O3()).e(d0Var5.m3()).e(((l0) rVar.f232251j).e());
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
        }
    }
}
