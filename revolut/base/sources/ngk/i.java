package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FadingImageBackgroundLayout;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.ui_kit_artboard.PlainLabelView;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f215205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FadingImageBackgroundLayout f215206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlainLabelView f215207c;
    public final ActionFooterView d;
    public final PlainLabelView e;

    public i(ControllerContainerFrameLayout controllerContainerFrameLayout, FadingImageBackgroundLayout fadingImageBackgroundLayout, PlainLabelView plainLabelView, ActionFooterView actionFooterView, PlainLabelView plainLabelView2) {
        this.f215205a = controllerContainerFrameLayout;
        this.f215206b = fadingImageBackgroundLayout;
        this.f215207c = plainLabelView;
        this.d = actionFooterView;
        this.e = plainLabelView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215205a;
    }
}
