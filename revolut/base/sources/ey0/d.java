package ey0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f130510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearSnapHelper f130511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f130512c;
    public boolean d;

    public d(RecyclerView recyclerView, LinearSnapHelper snapHelper) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        this.f130510a = recyclerView;
        this.f130511b = snapHelper;
    }

    public final void a() {
        LinearSnapHelper linearSnapHelper;
        View viewFindSnapView;
        int[] iArrCalculateDistanceToFinalSnap;
        if (this.f130512c) {
            this.d = true;
            RecyclerView recyclerView = this.f130510a;
            recyclerView.stopScroll();
            this.f130512c = false;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (viewFindSnapView = (linearSnapHelper = this.f130511b).findSnapView(linearLayoutManager)) == null || (iArrCalculateDistanceToFinalSnap = linearSnapHelper.calculateDistanceToFinalSnap(linearLayoutManager, viewFindSnapView)) == null) {
                return;
            }
            recyclerView.smoothScrollBy(0, iArrCalculateDistanceToFinalSnap[1]);
        }
    }
}
