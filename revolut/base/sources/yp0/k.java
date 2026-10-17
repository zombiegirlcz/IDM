package yp0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f315739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f315740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f315741c;
    public final Function0 d;
    public final r5.c e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f315742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public es0.k f315743h;
    public h i;

    public k(RecyclerView recyclerView, d scrollAlignment, Function0 positionProvider, Function0 afterScrolling, r5.c restart) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(scrollAlignment, "scrollAlignment");
        Intrinsics.checkNotNullParameter(positionProvider, "positionProvider");
        Intrinsics.checkNotNullParameter(afterScrolling, "afterScrolling");
        Intrinsics.checkNotNullParameter(restart, "restart");
        this.f315739a = recyclerView;
        this.f315740b = scrollAlignment;
        this.f315741c = positionProvider;
        this.d = afterScrolling;
        this.e = restart;
    }

    public static final void a(k kVar) {
        kVar.c();
        RecyclerView.LayoutManager layoutManager = kVar.f315739a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && kVar.d(linearLayoutManager, ((Number) kVar.f315741c.invoke()).intValue())) {
            kVar.d.invoke();
        }
    }

    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        RecyclerView recyclerView = this.f315739a;
        recyclerView.stopScroll();
        f();
        h hVar = this.i;
        if (hVar != null) {
            recyclerView.removeOnScrollListener(hVar);
        }
        this.i = null;
        c();
    }

    public final void c() {
        int i = R$id.internal_fast_smooth_scroll_operation_tag;
        RecyclerView recyclerView = this.f315739a;
        if (recyclerView.getTag(i) == this) {
            recyclerView.setTag(R$id.internal_fast_smooth_scroll_operation_tag, null);
        }
    }

    public final boolean d(LinearLayoutManager linearLayoutManager, int i) {
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition != -1 && iFindFirstCompletelyVisibleItemPosition <= i && i <= iFindLastCompletelyVisibleItemPosition) {
            return true;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            return false;
        }
        int decoratedTop = linearLayoutManager.getDecoratedTop(viewFindViewByPosition);
        int decoratedBottom = linearLayoutManager.getDecoratedBottom(viewFindViewByPosition);
        RecyclerView recyclerView = this.f315739a;
        return decoratedTop <= recyclerView.getPaddingTop() && decoratedBottom >= recyclerView.getHeight() - recyclerView.getPaddingBottom();
    }

    public final void e() {
        if (this.f) {
            return;
        }
        if (((Number) this.f315741c.invoke()).intValue() == -1) {
            b();
            return;
        }
        b();
        this.f315739a.post(new e(this, 0));
    }

    public final void f() {
        RecyclerView.Adapter adapter;
        j jVar = this.f315742g;
        RecyclerView recyclerView = this.f315739a;
        if (jVar != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.unregisterAdapterDataObserver(jVar);
        }
        this.f315742g = null;
        es0.k kVar = this.f315743h;
        if (kVar != null) {
            recyclerView.removeOnAttachStateChangeListener(kVar);
        }
        this.f315743h = null;
    }
}
