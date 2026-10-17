package a3l;

import android.os.Handler;
import com.revolut.core.ui_kit.views.CustomTabLayoutView;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import mx0.p0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f1173b;

    public /* synthetic */ c(int i, Function0 function0) {
        this.f1172a = i;
        this.f1173b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1172a;
        Function0 function0 = this.f1173b;
        switch (i) {
            case 0:
                Handler handler = e.f1177a;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                p0.a aVar = p0.Companion;
                function0.invoke();
                break;
            case 8:
                p0.a aVar2 = p0.Companion;
                function0.invoke();
                break;
            case 9:
                int i2 = CustomTabLayoutView.f58494c;
                function0.invoke();
                break;
            case 10:
                int i3 = CustomTabLayoutView.f58494c;
                function0.invoke();
                break;
            case 11:
                function0.invoke();
                break;
            case 12:
                KProperty[] kPropertyArr = PlanRewardsRevealScreen.R;
                function0.invoke();
                break;
            case 13:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
