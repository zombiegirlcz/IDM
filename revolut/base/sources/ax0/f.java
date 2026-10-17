package ax0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements l, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.f f10831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f10833c;
    public final List d;
    public final ArrayList e;

    public f(yw0.f parent, View backgroundView, ShimmerFrameLayout titleShimmer, ShimmerFrameLayout descriptionShimmer, ShimmerFrameLayout badgeShimmer, ShimmerFrameLayout primaryButtonShimmer, ShimmerFrameLayout secondaryButtonShimmer) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        Intrinsics.checkNotNullParameter(titleShimmer, "titleShimmer");
        Intrinsics.checkNotNullParameter(descriptionShimmer, "descriptionShimmer");
        Intrinsics.checkNotNullParameter(badgeShimmer, "badgeShimmer");
        Intrinsics.checkNotNullParameter(primaryButtonShimmer, "primaryButtonShimmer");
        Intrinsics.checkNotNullParameter(secondaryButtonShimmer, "secondaryButtonShimmer");
        this.f10831a = parent;
        this.f10832b = backgroundView;
        this.f10833c = parent.getBottomGuideline();
        List listK = v.k(titleShimmer, descriptionShimmer, badgeShimmer, primaryButtonShimmer, secondaryButtonShimmer);
        this.d = listK;
        this.e = d0.E0(listK, u.c(backgroundView));
    }

    @Override // ax0.j
    public final List e() {
        return this.e;
    }

    @Override // ax0.j
    public final ConstraintLayout getHostView() {
        return this.f10831a.getHostView();
    }

    @Override // ax0.j
    public final BasicNavBar getNavigationBar() {
        return this.f10831a.getNavigationBar();
    }

    @Override // ax0.l
    public final k getParent() {
        return this.f10831a;
    }

    @Override // ax0.l
    public final void recycle() {
        Iterator it8 = this.d.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            yw0.f fVar = this.f10831a;
            if (!zHasNext) {
                fVar.n0(this.f10832b);
                return;
            } else {
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) it8.next();
                shimmerFrameLayout.f();
                fVar.n0(shimmerFrameLayout);
            }
        }
    }
}
