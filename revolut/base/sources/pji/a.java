package pji;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.kompot.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f236786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f236787b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f236786a = controllerContainerFrameLayout;
        this.f236787b = screenContentRecyclerView;
    }

    public static a a(View view) {
        int i = R$id.recyclerView;
        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
        if (screenContentRecyclerView != null) {
            return new a((ControllerContainerFrameLayout) view, screenContentRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f236786a;
    }
}
