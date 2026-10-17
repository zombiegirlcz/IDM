package jii;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f174515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f174516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f174517c;
    public final BasicNavBar d;
    public final RecyclerView e;

    public e0(ControllerContainerLinearLayout controllerContainerLinearLayout, RecyclerView recyclerView, FooterTextView footerTextView, BasicNavBar basicNavBar, RecyclerView recyclerView2) {
        this.f174515a = controllerContainerLinearLayout;
        this.f174516b = recyclerView;
        this.f174517c = footerTextView;
        this.d = basicNavBar;
        this.e = recyclerView2;
    }

    public static e0 a(View view) {
        int i = R$id.settingPreview_bottomSectionRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R$id.settingPreview_disclaimer;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(view, i);
            if (footerTextView != null) {
                i = R$id.settingPreview_navBar;
                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(view, i);
                if (basicNavBar != null) {
                    i = R$id.settingPreview_previewRecyclerView;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView2 != null) {
                        return new e0((ControllerContainerLinearLayout) view, recyclerView, footerTextView, basicNavBar, recyclerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174515a;
    }
}
