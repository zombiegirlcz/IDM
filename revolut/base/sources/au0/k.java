package au0;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends AppBarLayout.Behavior.DragCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingAppBarLayout$Behavior f9245a;

    public k(CollapsingAppBarLayout$Behavior collapsingAppBarLayout$Behavior) {
        this.f9245a = collapsingAppBarLayout$Behavior;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
    public final boolean canDrag(AppBarLayout appBarLayout) {
        View view;
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        WeakReference weakReference = this.f9245a.f57240c;
        if (weakReference == null) {
            return true;
        }
        return (weakReference == null || (view = (View) weakReference.get()) == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
    }
}
