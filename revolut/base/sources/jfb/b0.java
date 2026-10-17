package jfb;

import android.content.Intent;
import android.webkit.ValueCallback;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReverywhereWebAppScreen f173785b;

    public /* synthetic */ b0(ReverywhereWebAppScreen reverywhereWebAppScreen, int i) {
        this.f173784a = i;
        this.f173785b = reverywhereWebAppScreen;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f173784a;
        ReverywhereWebAppScreen reverywhereWebAppScreen = this.f173785b;
        switch (i) {
            case 0:
                Intent intent = (Intent) obj2;
                Integer num = (Integer) obj3;
                num.getClass();
                KProperty[] kPropertyArr = ReverywhereWebAppScreen.g0;
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (intent.resolveActivity(reverywhereWebAppScreen.m2().getPackageManager()) == null) {
                    d1 d1Var = (d1) reverywhereWebAppScreen.P.getValue();
                    ValueCallback valueCallback = d1Var.f173797b;
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(null);
                    }
                    d1Var.f173797b = null;
                    com.revolut.feature.retail.reverywhere.impl.web_app.d dVar = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                    dVar.getClass();
                    dVar.X1(new nii.y0("id_file_chooser_error", new nii.z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4));
                } else {
                    com.revolut.feature.retail.reverywhere.impl.web_app.d dVar2 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    dVar2.C1(new ExternalDestination.ByIntent(intent, num));
                }
                break;
            default:
                Double d = (Double) obj2;
                d.getClass();
                Double d5 = (Double) obj3;
                double dDoubleValue = d5.doubleValue();
                reverywhereWebAppScreen.X.removeCallbacks(reverywhereWebAppScreen.f82915b0);
                a0 a0VarG3 = reverywhereWebAppScreen.g3();
                if (a0VarG3.f173777m == null) {
                    long j2 = a0VarG3.d;
                    if (j2 <= 0 || dDoubleValue >= j2) {
                        a0VarG3.f173777m = d;
                        if (a0VarG3.k == null) {
                            a0VarG3.k = d5;
                        }
                        if (a0VarG3.f173781r) {
                            a0VarG3.a();
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
