package tx0;

import com.revolut.core.ui_kit.views.navbar.NavBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBar f275148b;

    public /* synthetic */ h1(NavBar navBar, int i) {
        this.f275147a = i;
        this.f275148b = navBar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f275147a) {
            case 0:
                return NavBar.F(this.f275148b, ((Float) obj2).floatValue());
            case 1:
                return NavBar.D(this.f275148b, ((Boolean) obj2).booleanValue());
            case 2:
                return NavBar.A(this.f275148b, ((Float) obj2).floatValue());
            case 3:
                return NavBar.x(this.f275148b, ((Boolean) obj2).booleanValue());
            case 4:
                return NavBar.y(this.f275148b);
            default:
                NavBar navBar = this.f275148b;
                if (navBar.v) {
                    au0.j4 animation = au0.j4.FADE;
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    navBar.H(false, animation);
                }
                return Unit.f186387a;
        }
    }
}
