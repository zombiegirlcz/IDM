package tx0;

import android.view.View;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p1 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarLargeCentred f275221b;

    public /* synthetic */ p1(NavBarLargeCentred navBarLargeCentred, int i) {
        this.f275220a = i;
        this.f275221b = navBarLargeCentred;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f275220a) {
            case 0:
                NavBarLargeCentred navBarLargeCentred = this.f275221b;
                boolean zE = navBarLargeCentred.f59294p.e();
                fp0.p pVar = navBarLargeCentred.f59289e0;
                fp0.p.b(pVar, zE);
                View view = pVar.f137029a;
                or0.m.a(view);
                if (!zE) {
                    or0.u.o(view);
                } else {
                    view.setOnClickListener(new b2(navBarLargeCentred, navBarLargeCentred, 3));
                }
                break;
            case 1:
                NavBarLargeCentred navBarLargeCentred2 = this.f275221b;
                boolean zE2 = navBarLargeCentred2.f59293n.e();
                fp0.p pVar2 = navBarLargeCentred2.f59288d0;
                fp0.p.b(pVar2, zE2);
                View view2 = pVar2.f137029a;
                or0.m.a(view2);
                if (!zE2) {
                    or0.u.o(view2);
                } else {
                    view2.setOnClickListener(new b2(navBarLargeCentred2, navBarLargeCentred2, 4));
                }
                break;
            case 2:
                NavBarLargeCentred.K(this.f275221b, 3);
                break;
            default:
                NavBarLargeCentred.K(this.f275221b, 3);
                break;
        }
    }
}
