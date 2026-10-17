package o7k;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f222889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f222890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReactionsKeyboardView f222891c;
    public final TwinVerticalButton d;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, BasicNavBar basicNavBar, ReactionsKeyboardView reactionsKeyboardView, TwinVerticalButton twinVerticalButton) {
        this.f222889a = controllerContainerConstraintLayout;
        this.f222890b = basicNavBar;
        this.f222891c = reactionsKeyboardView;
        this.d = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f222889a;
    }
}
