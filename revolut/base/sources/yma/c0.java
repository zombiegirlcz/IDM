package yma;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c0 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f314901b;

    public /* synthetic */ c0(e0 e0Var, int i) {
        this.f314900a = i;
        this.f314901b = e0Var;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f314900a) {
            case 0:
                this.f314901b.f(new FinishCommand(null, null, null, 7));
                break;
            case 1:
                this.f314901b.f(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)));
                break;
            case 2:
                this.f314901b.f(new FinishCommand(null, null, null, 7));
                break;
            case 3:
                this.f314901b.f(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.MAIN", zhm.u.c("android.intent.category.APP_EMAIL"), null, null, null, 28), null, null, null, 268435456, null, null, null, null, false, 1006));
                break;
            case 4:
                this.f314901b.f(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)));
                break;
            case 5:
                this.f314901b.i.onNext(new FinishCommand(null, null, null, 7));
                break;
            default:
                this.f314901b.f(new FinishCommand(null, null, null, 7));
                break;
        }
    }
}
