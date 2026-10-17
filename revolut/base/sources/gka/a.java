package gka;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.lightprompt.LightPromptFullScreenView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f144369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LightPromptFullScreenView f144370b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, LightPromptFullScreenView lightPromptFullScreenView) {
        this.f144369a = controllerContainerFrameLayout;
        this.f144370b = lightPromptFullScreenView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f144369a;
    }
}
