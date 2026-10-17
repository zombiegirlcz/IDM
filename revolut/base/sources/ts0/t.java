package ts0;

import android.content.Context;
import android.util.AttributeSet;
import com.revolut.core.ui_kit.internal.views.TooltipView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ux0.a;
import ux0.w0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f273907b;

    public /* synthetic */ t(Context context, int i) {
        this.f273906a = i;
        this.f273907b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f273906a;
        AttributeSet attributeSet = null;
        Context context = this.f273907b;
        switch (i) {
            case 0:
                HistogramView.Companion companion = HistogramView.INSTANCE;
                return new TooltipView(context, attributeSet, 6, 0);
            case 1:
                return new up0.l0(context);
            case 2:
                a.C1569a c1569a = ux0.a.Companion;
                return rr0.l.a(context);
            case 3:
                w0.a aVar = w0.Companion;
                return rr0.l.a(context);
            case 4:
                try {
                    return jh.d.f(context).Y();
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            case 5:
                ReactionsKeyboardView.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return Integer.valueOf((int) (((double) c8g.c.G(context)) * 0.38d));
            case 6:
                ReactionsKeyboardView.Companion companion2 = ReactionsKeyboardView.INSTANCE;
                return Integer.valueOf(kli.a.k(context, 44.0f));
            case 7:
                ReactionsKeyboardView.Companion companion3 = ReactionsKeyboardView.INSTANCE;
                return Integer.valueOf(kli.a.k(context, 44.0f));
            case 8:
                ReactionsKeyboardView.Companion companion4 = ReactionsKeyboardView.INSTANCE;
                return Integer.valueOf(kli.a.k(context, 55.0f));
            default:
                ReactionsKeyboardView.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return Integer.valueOf((int) (((double) c8g.c.G(context)) * 0.38d));
        }
    }
}
