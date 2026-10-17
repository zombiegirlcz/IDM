package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f174496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f174497b;

    public b(ControllerContainerFrameLayout controllerContainerFrameLayout, ViewPager2 viewPager2) {
        this.f174496a = controllerContainerFrameLayout;
        this.f174497b = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174496a;
    }
}
