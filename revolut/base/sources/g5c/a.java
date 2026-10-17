package g5c;

import com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXInAppInstallDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExternalAppDestination;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f140739b;

    public /* synthetic */ a(f fVar, int i) {
        this.f140738a = i;
        this.f140739b = fVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f140738a) {
            case 0:
                this.f140739b.f140745b.c(new ActivityNavigateCommand(new ExternalAppDestination("com.revolut.revolutx"), null, null, null, 268435456, null, null, null, null, false, 1006));
                break;
            default:
                this.f140739b.f140745b.c(vhi.c.c(RevolutXInAppInstallDestination.f84264a, yhi.b.SOLID, null, false, 12));
                break;
        }
    }
}
