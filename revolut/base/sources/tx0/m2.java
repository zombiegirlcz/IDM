package tx0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithBigTile f275200b;

    public /* synthetic */ m2(NavBarWithBigTile navBarWithBigTile, int i) {
        this.f275199a = i;
        this.f275200b = navBarWithBigTile;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View viewFindFocus;
        switch (this.f275199a) {
            case 0:
                return NavBarWithBigTile.B(this.f275200b, ((Boolean) obj2).booleanValue());
            case 1:
                NavBarWithBigTile navBarWithBigTile = this.f275200b;
                if (navBarWithBigTile.K) {
                    au0.j4 animation = au0.j4.FADE;
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    navBarWithBigTile.F(true, animation);
                    SearchView searchView = navBarWithBigTile.C;
                    searchView.o();
                    if (navBarWithBigTile.M && (viewFindFocus = searchView.findFocus()) != null) {
                        kli.c.d(viewFindFocus, 0L);
                    }
                }
                return Unit.f186387a;
            case 2:
                NavBarWithBigTile navBarWithBigTile2 = this.f275200b;
                if (navBarWithBigTile2.K) {
                    au0.j4 animation2 = au0.j4.FADE;
                    Intrinsics.checkNotNullParameter(animation2, "animation");
                    navBarWithBigTile2.F(false, animation2);
                }
                return Unit.f186387a;
            case 3:
                return NavBarWithBigTile.D(this.f275200b, ((Float) obj2).floatValue());
            case 4:
                return NavBarWithBigTile.C(this.f275200b, ((Boolean) obj2).booleanValue());
            default:
                return NavBarWithBigTile.y(this.f275200b, ((Float) obj2).floatValue());
        }
    }
}
