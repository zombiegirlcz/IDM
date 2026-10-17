package com.revolut.core.ui_kit.views.navbar;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import aw0.s8;
import aw0.v1;
import aw0.x8;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.core.ui_kit.internal.views.stories.StoriesHorizontalStepsProgressView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ix0.s0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.n4;
import tx0.o4;
import tx0.p4;
import tx0.q4;
import tx0.u2;
import tx0.x2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\b\"#$%&'()B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/StoryNavBarContentView;", "Landroid/widget/FrameLayout;", "Ltx0/x2;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "offset", "", "setBackgroundOffset", "(I)V", "", "Lcom/revolut/core/ui_kit/views/navbar/StoryNavBarContentView$b;", "items", "setStories", "(Ljava/util/List;)V", "setLoading", "()V", "", "autoScroll", "setAutoScroll", "(Z)V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Ltx0/u2;", "listener", "setColorSchemeListener", "(Ltx0/u2;)V", "Companion", "LoadingStoryPageDelegate", "RegularStoryPageDelegate", "com/revolut/core/ui_kit/views/navbar/x", "com/revolut/core/ui_kit/views/navbar/z", "tx0/q4", "b", "tx0/o4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoryNavBarContentView extends FrameLayout implements x2, ur0.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ArgbEvaluator f59473s = new ArgbEvaluator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f59474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoriesHorizontalStepsProgressView f59475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59476c;
    public u2 d;
    public final z4l.j e;
    public o4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o4 f59477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f59478h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f59479j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f59481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f59482n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f59483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f59484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f59485r;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/StoryNavBarContentView$LoadingStoryPageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/x;", "Lcom/revolut/core/ui_kit/views/navbar/y;", "Lcom/revolut/core/ui_kit/views/navbar/StoryNavBarContentView;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class LoadingStoryPageDelegate extends BaseRecyclerViewDelegate<x, y> {
        public LoadingStoryPageDelegate() {
            super(R$layout.internal_delegate_nav_bar_regular_loading_story_page, new tw8.g(4));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new y(this, kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_nav_bar_regular_loading_story_page));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(y holder, x data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            ShimmerFrameLayout shimmerFrameLayout = holder.f59556h;
            ifk.b.q(shimmerFrameLayout, v1.DARK, 1);
            if (!jo0.m.f176851h) {
                shimmerFrameLayout.a();
            }
            holder.j();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/StoryNavBarContentView$RegularStoryPageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/z;", "Lcom/revolut/core/ui_kit/views/navbar/b0;", "Lcom/revolut/core/ui_kit/views/navbar/StoryNavBarContentView;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class RegularStoryPageDelegate extends BaseRecyclerViewDelegate<z, b0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ihm.f f59487c;
        public final ihm.f d;

        public RegularStoryPageDelegate() {
            super(R$layout.internal_delegate_nav_bar_regular_story_page, new tw8.g(5));
            this.f59487c = v0.a.d("create(...)");
            this.d = v0.a.d("create(...)");
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            b0 b0Var = new b0(this, kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_nav_bar_regular_story_page));
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            b0Var.F(s0.d(null, context, s8.DEFAULT));
            StoryNavBarContentView.a(StoryNavBarContentView.this, b0Var);
            return b0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(b0 holder, z data, int i, List payloads) {
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            ImageView imageView = holder.f59517j;
            TextView textView = holder.i;
            View view = holder.k;
            boolean zN = ue0.e.n(payloads);
            boolean zN2 = ue0.e.n(payloads);
            boolean zN3 = ue0.e.n(payloads);
            boolean zN4 = ue0.e.n(payloads);
            Iterator it8 = payloads.iterator();
            while (true) {
                i2 = 1;
                i3 = 0;
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (next instanceof q4) {
                    zN = zN || ((q4) next).f275231a;
                    zN2 = zN2 || ((q4) next).f275232b;
                    zN3 = zN3 || ((q4) next).d;
                    if (zN4 == 0 && !((q4) next).f275233c) {
                        i2 = 0;
                    }
                    zN4 = i2;
                }
            }
            if (zN) {
                kli.a.b(holder.f59516h, data.f59560c, ty0.f.f275450a);
            }
            int i5 = 8;
            if (zN2) {
                kli.a.b(textView, data.d, ty0.f.f275450a);
                view.setVisibility(data.d != null ? 0 : 8);
            }
            if (zN4 != 0) {
                view.setOnTouchListener(data.e ? new j01.e(new View[]{textView, imageView}) : null);
            }
            WallpaperView wallpaperView = holder.f59515g;
            view.setOnClickListener(data.e ? new a0(this, data, i3) : null);
            if (zN2 || zN4 != 0) {
                if (data.d != null && data.e) {
                    i5 = 0;
                }
                imageView.setVisibility(i5);
            }
            if (zN3) {
                holder.setItemRenderState(xv0.f.f309149a);
                wallpaperView.setBackground(data.f59559b, new p4(holder, i3));
            }
            wallpaperView.setOnClickListener(new a0(this, data, i2));
            holder.j();
            holder.n();
            StoryNavBarContentView storyNavBarContentView = StoryNavBarContentView.this;
            holder.E(storyNavBarContentView.f59482n, storyNavBarContentView.f59481m);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static abstract class b implements koi.j, qv0.p {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryNavBarContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        z4l.j jVar = new z4l.j(7, zhm.v.k(new RegularStoryPageDelegate(), new LoadingStoryPageDelegate()), false);
        this.e = jVar;
        this.f59478h = 1.0f;
        this.i = true;
        this.f59482n = 1.0f;
        Paint paint = new Paint(1);
        paint.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        this.f59484q = paint;
        this.f59485r = new Rect();
        setWillNotDraw(false);
        View.inflate(context, R$layout.internal_view_story_nav_bar_content, this);
        View viewFindViewById = findViewById(R$id.storyNavBarContent_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f59474a = recyclerView;
        recyclerView.setOverScrollMode(2);
        View viewFindViewById2 = findViewById(R$id.storyNavBarContent_progressView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        StoriesHorizontalStepsProgressView storiesHorizontalStepsProgressView = (StoriesHorizontalStepsProgressView) viewFindViewById2;
        this.f59475b = storiesHorizontalStepsProgressView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        new PagerSnapHelper().attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new bs0.e(new n4(this)));
        recyclerView.getItemAnimator();
        storiesHorizontalStepsProgressView.setPageChangeListener(new tpl.o(this, 29));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(StoryNavBarContentView storyNavBarContentView, RecyclerView.ViewHolder viewHolder) {
        if ((storyNavBarContentView.f instanceof y) && viewHolder.getBindingAdapterPosition() == 0) {
            storyNavBarContentView.f = (o4) viewHolder;
        }
        if (viewHolder.equals(storyNavBarContentView.f) || viewHolder.equals(storyNavBarContentView.f59477g)) {
            storyNavBarContentView.c();
        }
    }

    @Override // tx0.x2
    public final void H(int i) {
        if (this.k != i) {
            this.k = i;
            b();
        }
    }

    public final void b() {
        int iK;
        int i = this.k - this.f59480l;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.o = kli.a.k(context, 38.0f) + i;
        if (this.f59475b.getVisibility() == 0) {
            iK = this.o;
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 34.0f) + i;
        }
        this.f59483p = iK;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        or0.u.z(this.f59475b, 0, 0, 0, kli.a.k(context3, 18.0f) + i, false, 23);
        RecyclerView recyclerView = this.f59474a;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Object objFindContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i2));
            o4 o4Var = objFindContainingViewHolder instanceof o4 ? (o4) objFindContainingViewHolder : null;
            if (o4Var != null) {
                o4Var.j();
            }
        }
    }

    public final void c() {
        x8 x8VarL;
        o4 o4Var = this.f;
        if (o4Var == null || (x8VarL = o4Var.l()) == null) {
            return;
        }
        int i = x8VarL.e;
        int i2 = x8VarL.f10611c;
        int i3 = x8VarL.f10610b;
        v1 v1Var = x8VarL.f10609a;
        o4 o4Var2 = this.f59477g;
        x8 x8VarL2 = o4Var2 != null ? o4Var2.l() : null;
        if (x8VarL2 == null) {
            u2 u2Var = this.d;
            if (u2Var != null) {
                u2Var.a(v1Var, i3, i2, i);
                return;
            }
            return;
        }
        u2 u2Var2 = this.d;
        if (u2Var2 != null) {
            v1 v1Var2 = x8VarL2.f10609a;
            float f = this.f59478h;
            if (f <= 0.5d) {
                v1Var = v1Var2;
            }
            Integer numValueOf = Integer.valueOf(x8VarL2.f10610b);
            Integer numValueOf2 = Integer.valueOf(i3);
            ArgbEvaluator argbEvaluator = f59473s;
            Object objEvaluate = argbEvaluator.evaluate(f, numValueOf, numValueOf2);
            Intrinsics.i(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) objEvaluate).intValue();
            Object objEvaluate2 = argbEvaluator.evaluate(this.f59478h, Integer.valueOf(x8VarL2.f10611c), Integer.valueOf(i2));
            Intrinsics.i(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
            u2Var2.a(v1Var, iIntValue, ((Integer) objEvaluate2).intValue(), i);
        }
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
        this.f59481m = i;
        this.f59482n = f;
        e();
    }

    @Override // tx0.x2
    public final /* bridge */ void d0(int i) {
    }

    public final void e() {
        RecyclerView recyclerView = this.f59474a;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            o4 o4Var = childViewHolder instanceof o4 ? (o4) childViewHolder : null;
            if (o4Var != null) {
                o4Var.E(this.f59482n, this.f59481m);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getRecyclerView, reason: from getter */
    public final RecyclerView getF59474a() {
        return this.f59474a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(this.f59485r, this.f59484q);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        setBackgroundOffset(this.f59480l);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(colorScheme.a(), context);
        StoriesHorizontalStepsProgressView storiesHorizontalStepsProgressView = this.f59475b;
        storiesHorizontalStepsProgressView.setProgressColor(iS);
        storiesHorizontalStepsProgressView.setBaseColor(ColorUtils.setAlphaComponent(iS, 76));
    }

    public final void setAutoScroll(boolean autoScroll) {
        this.i = autoScroll;
        StoriesHorizontalStepsProgressView storiesHorizontalStepsProgressView = this.f59475b;
        if (autoScroll) {
            storiesHorizontalStepsProgressView.c(this.f59476c, 5000L);
        } else {
            storiesHorizontalStepsProgressView.f57578m.a();
        }
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int offset) {
        this.f59480l = offset;
        setClipChildren(offset == 0);
        boolean z = offset == 0;
        RecyclerView recyclerView = this.f59474a;
        recyclerView.setClipChildren(z);
        ViewParent parent = recyclerView.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setClipChildren(offset == 0);
        this.f59485r.set(recyclerView.getLeft(), recyclerView.getTop() + offset, recyclerView.getRight(), recyclerView.getBottom() + offset);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            o4 o4Var = childViewHolder instanceof o4 ? (o4) childViewHolder : null;
            if (o4Var != null) {
                o4Var.n();
            }
        }
        b();
        invalidate();
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }

    public final void setLoading() {
        if (this.f59479j) {
            return;
        }
        this.f59479j = true;
        this.f59475b.setVisibility(4);
        Intrinsics.checkNotNullParameter("story_loading", "listId");
        this.e.c(zhm.u.c(new x()));
    }

    public final void setStories(@NotNull List<? extends b> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f59479j = false;
        this.e.c(items);
        boolean z = items.size() > 1;
        int i = z ? 0 : 8;
        StoriesHorizontalStepsProgressView storiesHorizontalStepsProgressView = this.f59475b;
        storiesHorizontalStepsProgressView.setVisibility(i);
        if (z) {
            storiesHorizontalStepsProgressView.setItemsCount(items.size());
            if (this.i) {
                storiesHorizontalStepsProgressView.c(this.f59476c, 5000L);
            } else {
                storiesHorizontalStepsProgressView.setOverallProgress(this.f59476c + 1);
            }
        }
        b();
    }

    @Override // tx0.x2
    public final int w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryNavBarContentView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
