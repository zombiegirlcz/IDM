package tal;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;
import tx0.j0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static final void a(TwinVerticalButton twinVerticalButton, c cVar) {
        Intrinsics.checkNotNullParameter(twinVerticalButton, "<this>");
        if (cVar == null) {
            twinVerticalButton.setVisibility(8);
            return;
        }
        b bVar = cVar.f269369c;
        b bVar2 = cVar.f269367a;
        twinVerticalButton.setVisibility(0);
        twinVerticalButton.setCollapsible(cVar.f269368b);
        twinVerticalButton.setMainButtonText((Clause) bVar2.f269364a);
        twinVerticalButton.setMainButtonVisible(true);
        twinVerticalButton.setMainButtonEnabled(bVar2.f269366c);
        twinVerticalButton.setMainButtonStyle(bVar2.f269365b);
        if (bVar == null) {
            twinVerticalButton.setSecondaryButtonVisible(false);
            return;
        }
        twinVerticalButton.setSecondaryButtonText((Clause) bVar.f269364a);
        twinVerticalButton.setSecondaryButtonVisible(true);
        twinVerticalButton.setSecondaryButtonEnabled(bVar.f269366c);
        twinVerticalButton.setSecondaryButtonStyle(bVar.f269365b);
    }

    public static final void b(NavBarWithToolbar navBarWithToolbar, a navBarModel) {
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "<this>");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        navBarWithToolbar.setTitle(navBarModel.f269361a, null);
        navBarWithToolbar.setToolbarTitle(navBarModel.f269362b);
        navBarWithToolbar.setDescriptionVisible(navBarModel.d);
        navBarWithToolbar.setDescriptionText(navBarModel.f269363c);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        UrlImage urlImage = navBarModel.e;
        navBarWithToolbar.setEndImage(urlImage != null ? nz8.d.L(urlImage) : null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(navBarModel.f);
        navBarWithToolbar.setSecondDescriptionText(null);
    }
}
