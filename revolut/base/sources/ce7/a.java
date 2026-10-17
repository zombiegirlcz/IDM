package ce7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f23397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f23398b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, b bVar) {
        this.f23397a = controllerContainerFrameLayout;
        this.f23398b = bVar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f23397a;
    }
}
