package c4g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f21273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormsActionButton f21274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputText f21275c;

    public j(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FormsActionButton formsActionButton, InputText inputText) {
        this.f21273a = controllerContainerConstraintLayout;
        this.f21274b = formsActionButton;
        this.f21275c = inputText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f21273a;
    }
}
