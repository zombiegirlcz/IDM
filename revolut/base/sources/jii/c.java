package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f174501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerFrameLayout f174502b;

    public c(ControllerContainerFrameLayout controllerContainerFrameLayout, ControllerContainerFrameLayout controllerContainerFrameLayout2) {
        this.f174501a = controllerContainerFrameLayout;
        this.f174502b = controllerContainerFrameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174501a;
    }
}
