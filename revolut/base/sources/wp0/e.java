package wp0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import ms0.p;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f298996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f298997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f298998c;
    public final NavBarWithContainerHeaderView d;
    public final FloatingBottomBarView e;
    public p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FloatingBottomBarView.a f298999g;

    public e(View view) {
        View childAt;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f298996a = view;
        this.f298997b = view.getContext();
        ViewParent parent = view.getParent();
        this.f298998c = (ViewGroup) (parent instanceof ViewGroup ? parent : null);
        ViewGroup viewGroup = (ViewGroup) (view instanceof ViewGroup ? view : null);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                childAt = viewGroup.getChildAt(i);
                Intrinsics.h(childAt);
                if (childAt instanceof NavBarWithContainerHeaderView) {
                    break;
                }
            }
            childAt = null;
        } else {
            childAt = null;
        }
        this.d = (NavBarWithContainerHeaderView) (childAt instanceof NavBarWithContainerHeaderView ? childAt : null);
        this.e = l.k(js0.f.Companion, this.f298996a);
        this.f298999g = new FloatingBottomBarView.a();
    }
}
