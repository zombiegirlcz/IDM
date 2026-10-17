package n67;

import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f212713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f212714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f212715c;
    public final ControllerContainerConstraintLayout d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ImageView imageView, ImageView imageView2, ControllerContainerConstraintLayout controllerContainerConstraintLayout2) {
        this.f212713a = controllerContainerConstraintLayout;
        this.f212714b = imageView;
        this.f212715c = imageView2;
        this.d = controllerContainerConstraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f212713a;
    }
}
