package jfb;

import android.os.Handler;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebResourceException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReverywhereWebAppScreen f173795b;

    public /* synthetic */ d0(ReverywhereWebAppScreen reverywhereWebAppScreen, int i) {
        this.f173794a = i;
        this.f173795b = reverywhereWebAppScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int iIntValue;
        int i = this.f173794a;
        int i2 = 26;
        int i3 = 1;
        Continuation continuation = null;
        ReverywhereWebAppScreen reverywhereWebAppScreen = this.f173795b;
        switch (i) {
            case 0:
                String termsScope = (String) obj2;
                KProperty[] kPropertyArr = ReverywhereWebAppScreen.g0;
                Intrinsics.checkNotNullParameter(termsScope, "termsScope");
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                dVar.getClass();
                Intrinsics.checkNotNullParameter(termsScope, "termsScope");
                dVar.l2(new u0(dVar, termsScope, null), new yi5.b(i2));
                break;
            case 1:
                ReverywhereWebResourceException error = (ReverywhereWebResourceException) obj2;
                KProperty[] kPropertyArr2 = ReverywhereWebAppScreen.g0;
                Intrinsics.checkNotNullParameter(error, "error");
                a0 a0VarG3 = reverywhereWebAppScreen.g3();
                Integer num = error.f82925a;
                if (a0VarG3.e != 0) {
                    a0VarG3.i = num != null ? num.intValue() : 0;
                }
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar2 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                cli.y yVar = dVar2.B;
                Intrinsics.checkNotNullParameter(error, "error");
                a2 a2Var = dVar2.f82941w;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                Integer num2 = error.f82925a;
                if (num2 == null || 400 > (iIntValue = num2.intValue()) || iIntValue >= 500 || ((com.revolut.feature.retail.reverywhere.impl.web_app.b) ((j2) yVar.f22677a).getValue()).e >= 2) {
                    dVar2.H2(yVar, new jeg.g(error, i3));
                } else {
                    dVar2.J2(((com.revolut.feature.retail.reverywhere.impl.web_app.b) ((j2) yVar.f22677a).getValue()).e + 1);
                }
                break;
            case 2:
                String it8 = (String) obj2;
                KProperty[] kPropertyArr3 = ReverywhereWebAppScreen.g0;
                Intrinsics.checkNotNullParameter(it8, "it");
                reverywhereWebAppScreen.f82914a0 = true;
                fp0.l lVar = reverywhereWebAppScreen.f82915b0;
                Handler handler = reverywhereWebAppScreen.X;
                reverywhereWebAppScreen.h3().evaluateJavascript(kotlin.text.t.e("\n            javascript:didThemeChange(\"" + (((c90.c) reverywhereWebAppScreen.e3().f113850h.get()).d() ? "dark" : "light") + "\")\n        "), null);
                a0 a0VarG32 = reverywhereWebAppScreen.g3();
                if (a0VarG32.e != 0) {
                    a0VarG32.f173773g = System.currentTimeMillis();
                    if (!a0VarG32.f173779p) {
                        a0VarG32.b();
                    }
                    if (a0VarG32.f173777m != null) {
                        a0VarG32.a();
                    } else {
                        a0VarG32.f173781r = true;
                    }
                }
                handler.removeCallbacks(lVar);
                handler.postDelayed(lVar, 5000L);
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar3 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                a2 a2Var2 = dVar3.f82941w;
                if (a2Var2 != null) {
                    a2Var2.f(null);
                }
                dVar3.H2(dVar3.B, new je5.n(10));
                dVar3.l2(new s0(dVar3, continuation, i), new yi5.b(i2));
                break;
            default:
                String universalLink = (String) obj2;
                KProperty[] kPropertyArr4 = ReverywhereWebAppScreen.g0;
                Intrinsics.checkNotNullParameter(universalLink, "universalLink");
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar4 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(universalLink, "universalLink");
                dVar4.f82937q.d3(new l(universalLink));
                break;
        }
        return Unit.f186387a;
    }
}
