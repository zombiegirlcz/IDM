package xmb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f307098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogHeaderView f307099b;

    public b(ControllerContainerLinearLayout controllerContainerLinearLayout, DialogHeaderView dialogHeaderView) {
        this.f307098a = controllerContainerLinearLayout;
        this.f307099b = dialogHeaderView;
    }

    public static b a(View view) {
        int i = R$id.savingsScreenDialog_header;
        DialogHeaderView dialogHeaderView = (DialogHeaderView) ViewBindings.findChildViewById(view, i);
        if (dialogHeaderView != null) {
            i = R$id.savingsScreenDialog_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                return new b((ControllerContainerLinearLayout) view, dialogHeaderView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307098a;
    }
}
