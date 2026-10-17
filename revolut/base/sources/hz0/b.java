package hz0;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.views.KeypadView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156934a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeypadView f156935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f156936c;

    public /* synthetic */ b(KeypadView keypadView, e eVar) {
        this.f156935b = keypadView;
        this.f156936c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f156934a) {
            case 0:
                WindowInsets newInsets = (WindowInsets) obj2;
                Intrinsics.checkNotNullParameter(newInsets, "newInsets");
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(newInsets);
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
                int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
                e eVar = this.f156936c;
                Context context = eVar.f156938a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK = kli.a.k(context, 8.0f) + i;
                KeypadView keypadView = this.f156935b;
                ViewGroup.LayoutParams layoutParams = keypadView.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams2.bottomMargin != iK) {
                    layoutParams2.bottomMargin = iK;
                    keypadView.requestLayout();
                }
                boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
                if (eVar.f156940c != i || eVar.d != zIsVisible) {
                    eVar.f156940c = i;
                    eVar.d = zIsVisible;
                    if (keypadView.getVisibility() == 0) {
                        eVar.g();
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter((Configuration) obj2, "<unused var>");
                if (this.f156935b.getVisibility() == 0) {
                    this.f156936c.g();
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ b(e eVar, KeypadView keypadView) {
        this.f156936c = eVar;
        this.f156935b = keypadView;
    }
}
