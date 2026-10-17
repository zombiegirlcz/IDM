package l2a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f191722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f191723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitImageView f191724c;
    public final RecyclerView d;
    public final SearchButton e;
    public final InputText f;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, RecyclerView recyclerView, UIKitImageView uIKitImageView, RecyclerView recyclerView2, SearchButton searchButton, InputText inputText) {
        this.f191722a = controllerContainerConstraintLayout;
        this.f191723b = recyclerView;
        this.f191724c = uIKitImageView;
        this.d = recyclerView2;
        this.e = searchButton;
        this.f = inputText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f191722a;
    }
}
