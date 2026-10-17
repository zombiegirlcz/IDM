package lu0;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import com.revolut.core.ui_kit.R$bool;
import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.internal.drawables.BottomGradientDrawable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.internal.views.TinyActionButton;
import com.revolut.core.ui_kit.internal.views.TooltipView;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardBottomBarView;
import com.revolut.core.ui_kit.internal.views.stackedchart.StackedChartView;
import com.revolut.core.ui_kit.internal.views.stackedchart.StackedChartWithHeaderAndLegendView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.core.ui_kit.views.StatusProgressBarView;
import com.revolut.core.ui_kit.views.buttons.GooglePayButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f199981b;

    public /* synthetic */ a(Context context, int i) {
        this.f199980a = i;
        this.f199981b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f199980a;
        int i2 = 6;
        Object[] objArr = 0;
        boolean z = true;
        int i3 = 0;
        Context context = this.f199981b;
        switch (i) {
            case 0:
                int i5 = ReactionsKeyboardBottomBarView.i;
                return Integer.valueOf(kli.a.s(R$attr.uikit_colorForeground, context));
            case 1:
                int i6 = ReactionsKeyboardBottomBarView.i;
                return Integer.valueOf(kli.a.s(R$attr.uikit_colorGrey50, context));
            case 2:
                KProperty[] kPropertyArr = LinearGaugeChartView.E;
                Paint paint = new Paint();
                paint.setColor(kli.a.s(R$attr.uikit_colorForeground, context));
                paint.setAntiAlias(true);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(kli.a.l(context, 1.0f));
                paint.setPathEffect(new DashPathEffect(new float[]{kli.a.l(context, 2.0f), kli.a.l(context, 2.0f)}, kli.a.l(context, 2.0f)));
                return paint;
            case 3:
                NewBadgeView.Companion aVar = NewBadgeView.INSTANCE;
                return Integer.valueOf(kli.a.k(context, 5.0f));
            case 4:
                NewBadgeView.Companion aVar2 = NewBadgeView.INSTANCE;
                return Integer.valueOf(kli.a.k(context, 8.0f));
            case 5:
                NewBadgeView.Companion aVar3 = NewBadgeView.INSTANCE;
                return Integer.valueOf(kli.a.k(context, 8.0f));
            case 6:
                NewBadgeView.Companion aVar4 = NewBadgeView.INSTANCE;
                return Integer.valueOf(kli.a.k(context, 24.0f));
            case 7:
                int i21 = TinyActionButton.f56451n;
                return new RoundedBackgroundDrawable(context, i3, i2);
            case 8:
                int i22 = ChatInputView.I0;
                return Integer.valueOf(kli.a.s(R$attr.uikit_colorGreyTone50, context));
            case 9:
                int i32 = ChatInputView.I0;
                return Integer.valueOf(kli.a.s(R$attr.uikit_colorGreyTone20, context));
            case 10:
                DateInputView.Companion aVar5 = DateInputView.INSTANCE;
                ColorStateList colorStateListT = kli.a.t(R$color.internal_color_input_text_error, context);
                if (colorStateListT != null) {
                    return colorStateListT;
                }
                throw new IllegalStateException("Required value was null.");
            case 11:
                DateInputView.Companion aVar6 = DateInputView.INSTANCE;
                ColorStateList colorStateListT2 = kli.a.t(R$color.internal_color_input_text_focused, context);
                if (colorStateListT2 != null) {
                    return colorStateListT2;
                }
                throw new IllegalStateException("Required value was null.");
            case 12:
                FooterTextView.Companion companion = FooterTextView.INSTANCE;
                BottomGradientDrawable bottomGradientDrawable = new BottomGradientDrawable(context);
                bottomGradientDrawable.c(dr0.g.DEFAULT);
                bottomGradientDrawable.setTint(kli.a.s(R$attr.uikit_colorBlack_80, context));
                return bottomGradientDrawable;
            case 13:
                int i33 = PhoneInputTextView.f58821g;
                return yem.h.b(context);
            case 14:
                StatusProgressBarView.Companion aVar7 = StatusProgressBarView.INSTANCE;
                Paint paint2 = new Paint();
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(kli.a.s(R$attr.uikit_colorForeground, context));
                return paint2;
            case 15:
                od0.a aVar8 = od0.a.f224253a;
                if (od0.a.c() != od0.l.MOCK) {
                    PackageManager pm7 = context.getPackageManager();
                    Intrinsics.checkNotNullExpressionValue(pm7, "getPackageManager(...)");
                    Intrinsics.checkNotNullParameter(pm7, "pm");
                    String packageName = context.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                    Intrinsics.checkNotNullParameter(packageName, "packageName");
                    String installingPackageName = Build.VERSION.SDK_INT >= 30 ? pm7.getInstallSourceInfo(packageName).getInstallingPackageName() : pm7.getInstallerPackageName(packageName);
                    if (!Intrinsics.f(installingPackageName, "com.android.vending") && !Intrinsics.f(installingPackageName, "com.huawei.appmarket")) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 16:
                int i43 = AccountsNavBarContentView.C;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                phm.a aVar9 = (phm.a) ue0.e.j(applicationContext).a().get(ckg.a.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 != null) {
                    return ((ckg.a) aVar10.b()).b();
                }
                throw new IllegalStateException(a0.d.q("Api ", ckg.a.class, " is not found"));
            case 17:
                int i59 = GooglePayButton.o;
                return Boolean.valueOf(context.getResources().getBoolean(R$bool.google_pay_button_shadows_enabled));
            case 18:
                return (KeyguardManager) context.getSystemService(KeyguardManager.class);
            case 19:
                BarChartView.Companion aVar11 = BarChartView.INSTANCE;
                return context.getDrawable(R$drawable.internal_bar_chart_selected_category_background);
            case 20:
                int i66 = StackedChartView.o;
                return Integer.valueOf(kli.a.s(R$attr.uikit_colorForeground, context));
            case 21:
                int i74 = StackedChartWithHeaderAndLegendView.f57573h;
                return Integer.valueOf(kli.a.k(context, 16.0f));
            case 22:
                int i92 = StackedChartWithHeaderAndLegendView.f57573h;
                return new TooltipView(context, objArr == true ? 1 : 0, i2, i3);
            case 23:
                int i96 = CandleSticksView.S;
                return rs0.d.a(context);
            case 24:
                InputText.Companion companion2 = InputText.INSTANCE;
                return Integer.valueOf(kli.a.s(R$attr.uikit_colorAccent, context));
            case 25:
                InputText.Companion companion3 = InputText.INSTANCE;
                ColorStateList colorStateListT3 = kli.a.t(R$color.internal_color_input_text_focused, context);
                if (colorStateListT3 != null) {
                    return colorStateListT3;
                }
                throw new IllegalStateException("Required value was null.");
            case 26:
                InputText.Companion companion4 = InputText.INSTANCE;
                return Integer.valueOf(kli.a.s(R$attr.uikit_colorStatusDanger, context));
            case 27:
                InputText.Companion companion5 = InputText.INSTANCE;
                ColorStateList colorStateListT4 = kli.a.t(R$color.internal_color_input_text_error, context);
                if (colorStateListT4 != null) {
                    return colorStateListT4;
                }
                throw new IllegalStateException("Required value was null.");
            case 28:
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                return applicationContext2;
            default:
                HistogramView.Companion companion6 = HistogramView.INSTANCE;
                return Integer.valueOf(kli.a.k(context, 8.0f));
        }
    }

    public /* synthetic */ a(Context context, yf.c cVar, qi0.b bVar) {
        this.f199980a = 15;
        this.f199981b = context;
    }
}
