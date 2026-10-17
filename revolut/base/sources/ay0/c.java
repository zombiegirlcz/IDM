package ay0;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.scrolling.HideOnScrollViewBehavior;
import foh.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends RecyclerView.OnScrollListener implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11005b;
    public final /* synthetic */ HideOnScrollViewBehavior d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11004a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11006c = i.j(30);

    public c(HideOnScrollViewBehavior hideOnScrollViewBehavior) {
        this.d = hideOnScrollViewBehavior;
    }

    public final void b(int i) {
        int i2 = this.f11005b + i;
        this.f11005b = i2;
        int i3 = this.f11006c;
        int i5 = (-i3) / 2;
        HideOnScrollViewBehavior hideOnScrollViewBehavior = this.d;
        if (i2 <= i5) {
            this.f11005b = 0;
            hideOnScrollViewBehavior.d(true);
        } else if (i2 >= i3) {
            this.f11005b = 0;
            hideOnScrollViewBehavior.d(false);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        int iAbs = Math.abs(i);
        int i2 = this.f11004a;
        if (i2 < 0) {
            this.f11004a = iAbs;
        } else {
            this.f11004a = iAbs;
            b(iAbs - i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        b(i2);
    }
}
