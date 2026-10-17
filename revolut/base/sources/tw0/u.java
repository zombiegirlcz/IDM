package tw0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.recycler.ScrollOffsetData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f274884a = v0.a.d("create(...)");

    public static final void a(u uVar, String str, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, OrientationHelper orientationHelper) {
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        uVar.f274884a.onNext(new ScrollOffsetData(str, linearLayoutManager.getPosition(childAt), orientationHelper.getDecoratedStart(childAt) - orientationHelper.getStartAfterPadding()));
    }

    public final void b(final String itemId, final RecyclerView recyclerView, final j jVar) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (jVar == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        if (!(jVar instanceof h)) {
            if (!(jVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            i iVar = (i) jVar;
            linearLayoutManager.scrollToPositionWithOffset(iVar.f274818a, iVar.f274819b);
            return;
        }
        final int i = ((h) jVar).f274810a;
        if (i <= -1) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: tw0.s
            @Override // java.lang.Runnable
            public final void run() {
                LinearLayoutManager linearLayoutManager2;
                View childAt;
                g gVar = ((h) jVar).f274811b;
                boolean zF = Intrinsics.f(gVar, e.f274802a);
                RecyclerView recyclerView2 = recyclerView;
                int i2 = i;
                if (zF) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                    linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                    if (linearLayoutManager2 != null && (childAt = recyclerView2.getChildAt(1)) != null) {
                        linearLayoutManager2.scrollToPositionWithOffset(i2, (((recyclerView2.getWidth() - (recyclerView2.getPaddingEnd() + recyclerView2.getPaddingStart())) - childAt.getWidth()) / 2) - linearLayoutManager2.getLeftDecorationWidth(childAt));
                    }
                } else {
                    if (!Intrinsics.f(gVar, f.f274807a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RecyclerView.LayoutManager layoutManager3 = recyclerView2.getLayoutManager();
                    linearLayoutManager2 = layoutManager3 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager3 : null;
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.scrollToPositionWithOffset(i2, 0);
                    }
                }
                boolean zIsLaidOut = recyclerView2.isLaidOut();
                u uVar = this.f274873a;
                String str = itemId;
                LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
                if (!zIsLaidOut || recyclerView2.isLayoutRequested()) {
                    recyclerView2.addOnLayoutChangeListener(new byl.f(uVar, str, recyclerView2, linearLayoutManager3, 2));
                    return;
                }
                OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(linearLayoutManager3);
                Intrinsics.checkNotNullExpressionValue(orientationHelperCreateHorizontalHelper, "createHorizontalHelper(...)");
                u.a(uVar, str, recyclerView2, linearLayoutManager3, orientationHelperCreateHorizontalHelper);
            }
        };
        if (recyclerView.isLaidOut()) {
            runnable.run();
        } else {
            recyclerView.post(runnable);
        }
    }

    public final void c(RecyclerView recyclerView, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int i = R$id.internal_scroll_offset_tracker;
        Object tag2 = recyclerView.getTag(i);
        RecyclerView.OnScrollListener onScrollListener = tag2 instanceof RecyclerView.OnScrollListener ? (RecyclerView.OnScrollListener) tag2 : null;
        if (onScrollListener != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        t tVar = new t(this, itemId, linearLayoutManager, OrientationHelper.createHorizontalHelper(linearLayoutManager));
        recyclerView.addOnScrollListener(tVar);
        recyclerView.setTag(i, tVar);
    }
}
