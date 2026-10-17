package ax0;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements l, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.f f10817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateView f10818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10819c;

    public a(yw0.f parent, FullScreenStateView fullScreenStateView) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(fullScreenStateView, "fullScreenStateView");
        this.f10817a = parent;
        this.f10818b = fullScreenStateView;
        this.f10819c = u.c(fullScreenStateView);
    }

    @Override // ax0.j
    public final List e() {
        return this.f10819c;
    }

    @Override // ax0.j
    public final ConstraintLayout getHostView() {
        return this.f10817a.getHostView();
    }

    @Override // ax0.j
    public final BasicNavBar getNavigationBar() {
        return this.f10817a.getNavigationBar();
    }

    @Override // ax0.l
    public final k getParent() {
        return this.f10817a;
    }

    @Override // ax0.l
    public final void recycle() {
        this.f10817a.n0(this.f10818b);
    }
}
