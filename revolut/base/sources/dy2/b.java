package dy2;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f121054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f121055b;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, AppCompatImageView appCompatImageView) {
        this.f121054a = controllerContainerConstraintLayout;
        this.f121055b = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f121054a;
    }
}
