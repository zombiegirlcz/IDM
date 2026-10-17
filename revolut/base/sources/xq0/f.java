package xq0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import efm.r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo8.u;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends RecyclerView.OnScrollListener implements View.OnAttachStateChangeListener {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f308032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f308033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f308034c;
    public Integer d;
    public ifm.c e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f308035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z4l.j f308036h;
    public OrientationHelper i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OrientationHelper f308037j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f308038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x.b f308039m;

    public f(r forceUpdateRequests, Function2 itemReceiver) {
        Intrinsics.checkNotNullParameter(forceUpdateRequests, "forceUpdateRequests");
        Intrinsics.checkNotNullParameter(itemReceiver, "itemReceiver");
        this.f308032a = forceUpdateRequests;
        this.f308033b = itemReceiver;
        lfm.e eVar = lfm.e.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(eVar, "disposed(...)");
        this.e = eVar;
        this.f = new d(this);
        this.f308039m = new x.b(this, 6);
    }

    public static final void b(f fVar) {
        fVar.f308034c = null;
        fVar.d = null;
        fVar.e();
    }

    public final void c(RecyclerView recyclerView, z4l.j adapter) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f308035g = recyclerView;
        this.f308036h = adapter;
        recyclerView.addOnAttachStateChangeListener(this);
        adapter.registerAdapterDataObserver(this.f);
        if (recyclerView.isAttachedToWindow()) {
            onViewAttachedToWindow(recyclerView);
        }
    }

    public final void d(int i) {
        OrientationHelper orientationHelper;
        View view;
        z4l.j jVar = this.f308036h;
        koi.j jVar2 = null;
        if (jVar == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        if (jVar.getItemCount() != 0) {
            RecyclerView recyclerView = this.f308035g;
            if (recyclerView == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            if (recyclerView.isAttachedToWindow()) {
                RecyclerView recyclerView2 = this.f308035g;
                if (recyclerView2 == null) {
                    Intrinsics.r("recyclerView");
                    throw null;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (layoutManager.canScrollVertically()) {
                    OrientationHelper orientationHelper2 = this.i;
                    if (!Intrinsics.f(orientationHelper2 != null ? orientationHelper2.getLayoutManager() : null, layoutManager)) {
                        this.i = OrientationHelper.createVerticalHelper(layoutManager);
                    }
                    orientationHelper = this.i;
                    if (orientationHelper == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    OrientationHelper orientationHelper3 = this.f308037j;
                    if (!Intrinsics.f(orientationHelper3 != null ? orientationHelper3.getLayoutManager() : null, layoutManager)) {
                        this.f308037j = OrientationHelper.createHorizontalHelper(layoutManager);
                    }
                    orientationHelper = this.f308037j;
                    if (orientationHelper == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                int childCount = layoutManager.getChildCount();
                if (childCount == 0) {
                    view = null;
                } else {
                    int totalSpace = (orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding();
                    int i2 = Integer.MAX_VALUE;
                    view = null;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = layoutManager.getChildAt(i3);
                        int iAbs = Math.abs(((orientationHelper.getDecoratedMeasurement(childAt) / 2) + orientationHelper.getDecoratedStart(childAt)) - totalSpace);
                        if (iAbs < i2) {
                            view = childAt;
                            i2 = iAbs;
                        }
                    }
                }
                if (view != null) {
                    RecyclerView recyclerView3 = this.f308035g;
                    if (recyclerView3 == null) {
                        Intrinsics.r("recyclerView");
                        throw null;
                    }
                    RecyclerView.ViewHolder childViewHolder = recyclerView3.getChildViewHolder(view);
                    koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
                    if (bVar != null) {
                        jVar2 = bVar.e;
                    }
                }
                if (jVar2 != null) {
                    Integer num = this.d;
                    if (num != null && i == num.intValue() && Intrinsics.f(jVar2.getF53379a(), this.f308034c)) {
                        return;
                    }
                    this.f308034c = jVar2.getF53379a();
                    this.d = Integer.valueOf(i);
                    this.f308033b.invoke(jVar2, Integer.valueOf(i));
                }
            }
        }
    }

    public final void e() {
        if (this.f308038l) {
            return;
        }
        this.f308038l = true;
        RecyclerView recyclerView = this.f308035g;
        if (recyclerView != null) {
            recyclerView.post(this.f308039m);
        } else {
            Intrinsics.r("recyclerView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0) {
            this.k = 0L;
            d(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (i == 0 && i2 == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == 0) {
            i = i2;
        }
        int iAbs = Math.abs(i);
        long j2 = this.k;
        if (j2 != 0) {
            long j3 = jCurrentTimeMillis - j2;
            if (j3 != 0 && iAbs != 0) {
                Context context = recyclerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (kli.a.z(iAbs, context) / j3 <= 0.5f) {
                    d(recyclerView.getScrollState());
                }
            }
        }
        this.k = jCurrentTimeMillis;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        RecyclerView recyclerView = this.f308035g;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        recyclerView.addOnScrollListener(this);
        ifm.c cVarSubscribe = this.f308032a.subscribe(new u(4, new xng.l(this, 12)));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.e = cVarSubscribe;
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        RecyclerView recyclerView = this.f308035g;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        recyclerView.removeOnScrollListener(this);
        this.e.dispose();
    }
}
