package aw3;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f10700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f10701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f10702c;

    public l(ControllerContainerConstraintLayout controllerContainerConstraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f10700a = controllerContainerConstraintLayout;
        this.f10701b = appCompatTextView;
        this.f10702c = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10700a;
    }
}
