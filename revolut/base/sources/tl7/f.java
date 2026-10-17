package tl7;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.MonthPickerDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import ip0.cl0;
import ip0.mx;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q97.p1;
import rp0.l;
import rp0.t;
import rp0.y;
import th9.k;
import tif.g;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60.a f272009c;
    public final vn7.a d;
    public final LargeActionButtonDelegate e;
    public final TwinHorizontalButtonDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SingleChoiceDelegate f272010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DatePickerDelegate f272011h;
    public final MonthPickerDelegate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimePickerDelegate f272012j;
    public final PlainTextDelegate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LocalTime f272013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function0 f272014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function0 f272015n;
    public Function1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function1 f272016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function1 f272017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f272018r;

    public f(j60.a innerExtension, vn7.a hintPopupFactory, in7.a choicePopupFactory, yl7.a datePickerPopupFactory, yl7.b monthPickerPopupFactory, yl7.e timePickerPopupFactory) {
        Intrinsics.checkNotNullParameter(innerExtension, "innerExtension");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        Intrinsics.checkNotNullParameter(choicePopupFactory, "choicePopupFactory");
        Intrinsics.checkNotNullParameter(datePickerPopupFactory, "datePickerPopupFactory");
        Intrinsics.checkNotNullParameter(monthPickerPopupFactory, "monthPickerPopupFactory");
        Intrinsics.checkNotNullParameter(timePickerPopupFactory, "timePickerPopupFactory");
        this.f272009c = innerExtension;
        this.d = hintPopupFactory;
        this.e = new LargeActionButtonDelegate();
        this.f = new TwinHorizontalButtonDelegate();
        this.f272010g = new SingleChoiceDelegate();
        this.f272011h = new DatePickerDelegate();
        this.i = new MonthPickerDelegate();
        this.f272012j = new TimePickerDelegate();
        this.k = new PlainTextDelegate();
        LocalTime localTimeNow = LocalTime.now();
        Intrinsics.checkNotNullExpressionValue(localTimeNow, "now(...)");
        this.f272013l = localTimeNow;
        this.f272014m = new k(28);
        this.f272015n = new k(29);
        this.o = new g(23);
        this.f272016p = new g(24);
        this.f272017q = new g(25);
        this.f272018r = new g(26);
    }

    public static void R(f fVar, int i, int i2, List list, Integer num, Integer num2, Function1 onClauseClick, qba.b bVar, p1 p1Var, int i3) {
        if ((i3 & 4) != 0) {
            list = f0.f322471a;
        }
        List descriptionArgs = list;
        if ((i3 & 8) != 0) {
            num = Integer.valueOf(R$string.car_insurance_common_close);
        }
        Integer num3 = num;
        if ((i3 & 16) != 0) {
            num2 = null;
        }
        Integer num4 = num2;
        if ((i3 & 32) != 0) {
            onClauseClick = new g(20);
        }
        Function0 onPositiveButtonClick = bVar;
        if ((i3 & 64) != 0) {
            onPositiveButtonClick = new k(26);
        }
        Function0 onNegativeButtonClick = (i3 & 128) != 0 ? new k(27) : p1Var;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(descriptionArgs, "descriptionArgs");
        Intrinsics.checkNotNullParameter(onClauseClick, "onClauseClick");
        Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
        Intrinsics.checkNotNullParameter(onNegativeButtonClick, "onNegativeButtonClick");
        fVar.x(vn7.a.d(fVar.d, i, i2, descriptionArgs, num3, num4, 80));
        fVar.o = onClauseClick;
        fVar.f272014m = onPositiveButtonClick;
        fVar.f272015n = onNegativeButtonClick;
    }

    public static void S(f fVar, int i, int i2, int i3, Function0 onPositiveButtonClick, int i5) {
        int i6 = R$string.car_insurance_common_continue;
        if ((i5 & 8) != 0) {
            i3 = R$string.car_insurance_common_cancel;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
        fVar.x(vn7.a.a(i, i6, i3, Integer.valueOf(i2)));
        fVar.f272014m = onPositiveButtonClick;
    }

    @Override // yji.d
    public final void M() {
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(this.e.d.f121375b), new b(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f;
        yji.d.H(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new c(this, continuation, 0), 3);
        yji.d.H(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new c(this, continuation, 1), 3);
        yji.d.H(this, rd0.e.b(this.f272010g.p()), new d(this, null), 3);
        yji.d.H(this, rd0.e.b(this.f272011h.f52176c.f121375b), new e(this, null, 0), 3);
        yji.d.H(this, rd0.e.b(this.i.f52775c.f121375b), new e(this, null, 1), 3);
        yji.d.H(this, rd0.e.b(this.f272012j.p()), new e(this, null, 2), 3);
        yji.d.H(this, rd0.e.b(this.k.d.f121375b), new e(this, null, 3), 3);
    }

    public final void Q(int i, List answers, Answer answer, Function1 onSelected) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Intrinsics.checkNotNullParameter(answers, "answers");
        List<Answer> list = answers;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Answer answer2 : list) {
            arrayList.add(new SingleChoiceDelegate.Model(answer2.toString(), xl7.d.d(answer2), answer2.equals(answer), null, answer2, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        x(new y(arrayList, new t(new TextLocalisedClause(i, null, null, 14), null, null, 30), l.WINDOW, null, null, null, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, null, 3320));
        this.f272016p = new js7.c(27, onSelected);
    }

    public final void T(int i, LocalDate min, LocalDate max, LocalDate currentSelection, Function1 onSelected) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        t tVar = new t(new TextLocalisedClause(i, null, null, 14), null, null, 30);
        mx mxVar = new mx("MONTH_PICKER_ITEM_ID", currentSelection.getYear(), YearMonth.from(currentSelection), YearMonth.from(min), YearMonth.from(max));
        yp0.b.l(mxVar, 0, 0, 0, 0, null, false, 63);
        x(new y(u.c(mxVar), tVar, l.WINDOW, null, null, null, 1016));
        this.f272017q = onSelected;
    }

    public final void U(int i, LocalTime defaultTime, Function1 onSelected) {
        Intrinsics.checkNotNullParameter(defaultTime, "defaultTime");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        this.f272013l = defaultTime;
        Intrinsics.checkNotNullParameter(defaultTime, "defaultTime");
        t tVar = new t(new TextLocalisedClause(i, null, null, 14), null, null, 30);
        cl0 cl0Var = new cl0("TIME_PICKER_ITEM_ID", defaultTime, null, null, 12);
        yp0.b.l(cl0Var, 0, 0, 0, 0, null, false, 63);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("TIME_PICKER_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.car_insurance_common_done, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, R$attr.uikit_dp16, 0, 0, 13);
        x(new y(v.k(cl0Var, model), tVar, l.WINDOW, null, null, null, 1016));
        this.f272018r = onSelected;
    }

    @Override // yji.d
    public final void onCreate() {
        this.f272009c.d(v.k(this.e, this.f, this.f272010g, this.f272011h, this.i, this.f272012j, this.k, new CellDetailsDelegate()));
    }

    public final void x(y dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.f272014m = new a(0);
        this.f272015n = new a(1);
        this.o = new g(27);
        this.f272016p = new g(28);
        this.f272017q = new g(21);
        this.f272018r = new g(22);
        this.f272009c.x(dialogModel);
    }
}
