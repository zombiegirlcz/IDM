package hoh;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f154294a;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout) {
        this.f154294a = controllerContainerConstraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f154294a;
    }
}
