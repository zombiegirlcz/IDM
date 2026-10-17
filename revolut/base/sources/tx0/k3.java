package tx0;

import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithToolbar f275176b;

    public /* synthetic */ k3(NavBarWithToolbar navBarWithToolbar, int i) {
        this.f275175a = i;
        this.f275176b = navBarWithToolbar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f275175a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                NavBarWithToolbar navBarWithToolbar = this.f275176b;
                if (navBarWithToolbar.f59417v0) {
                    navBarWithToolbar.K0(au0.j4.FADE);
                    navBarWithToolbar.E0();
                }
                break;
            default:
                NavBarWithToolbar navBarWithToolbar2 = this.f275176b;
                if (navBarWithToolbar2.f59417v0) {
                    navBarWithToolbar2.m0(au0.j4.FADE);
                }
                break;
        }
        return Unit.f186387a;
    }
}
