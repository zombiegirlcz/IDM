package ema;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f127636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f127637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f127638c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f127636a = controllerContainerConstraintLayout;
        this.f127637b = appCompatTextView;
        this.f127638c = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f127636a;
    }
}
