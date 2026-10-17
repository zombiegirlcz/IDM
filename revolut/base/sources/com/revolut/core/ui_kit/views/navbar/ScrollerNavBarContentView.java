package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import aw0.s8;
import aw0.x8;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.framelayout.NestedScrollableHost;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import ip0.m4;
import ip0.o4;
import ip0.v4;
import ip0.w4;
import ix0.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.f4;
import tx0.g4;
import tx0.o1;
import tx0.u2;
import tx0.x2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0003!\"#B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/ScrollerNavBarContentView;", "Landroid/widget/FrameLayout;", "Ltx0/x2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Law0/x8;", "getDefaultPalette", "()Law0/x8;", "", "enabled", "", "setForceDynamicBackground", "(Z)V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Lcom/revolut/core/ui_kit/views/navbar/ScrollerNavBarContentView$b;", "model", "setModel", "(Lcom/revolut/core/ui_kit/views/navbar/ScrollerNavBarContentView$b;)V", "", "offset", "setBackgroundOffset", "(I)V", "Ltx0/u2;", "listener", "setColorSchemeListener", "(Ltx0/u2;)V", "Companion", "b", "tx0/f4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScrollerNavBarContentView extends FrameLayout implements x2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsyncDiffRecyclerView f59452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NestedScrollableHost f59453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigTileDelegate f59454c;
    public b d;
    public final z4l.j e;
    public WallpaperView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f59455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u2 f59456h;
    public x8 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x8 f59457j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f59459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f59460n;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f59461a = new a();

            private a() {
            }
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerNavBarContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.f59454c = bigTileDelegate;
        int i = 0;
        z4l.j jVar = new z4l.j(7, zhm.v.k(bigTileDelegate, new BigTileLoadingDelegate()), false);
        this.e = jVar;
        boolean zG = jh.d.g(context);
        this.k = zG;
        this.f59460n = 1.0f;
        if (zG) {
            a();
        }
        AttributeSet attributeSet2 = null;
        int i2 = 6;
        AsyncDiffRecyclerView recyclerView = new AsyncDiffRecyclerView(context, attributeSet2, i2, i);
        this.f59452a = recyclerView;
        recyclerView.setTag("SCROLLER_NAV_BAR_RECYCLER_VIEW_ID");
        NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(context, attributeSet2, i2, i);
        this.f59453b = nestedScrollableHost;
        nestedScrollableHost.addView(recyclerView, new ViewGroup.LayoutParams(-1, -2));
        addView(nestedScrollableHost, new ViewGroup.LayoutParams(-1, -1));
        int iW = kli.a.w(R$attr.uikit_dp16, context);
        int iW2 = kli.a.w(R$attr.uikit_dp12, context);
        recyclerView.setPadding(iW2, iW, iW2, iW);
        recyclerView.setClipToPadding(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setItemAnimator(null);
        int iK = kli.a.k(context, 4.0f);
        recyclerView.addItemDecoration(new tw0.a0(iK, iK, 0, 0));
        new PagerSnapHelper().attachToRecyclerView(recyclerView);
        ur0.c cVar = ur0.d.Companion;
        tpl.o backgroundListener = new tpl.o(this, 28);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(backgroundListener, "backgroundListener");
        new ur0.d(recyclerView, backgroundListener);
    }

    private final x8 getDefaultPalette() {
        x8 x8Var = this.f59457j;
        if (x8Var != null) {
            return x8Var;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorDrawable colorDrawable = new ColorDrawable(kli.a.s(R$attr.uikit_colorBackground, context));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        x8 x8VarD = s0.d(colorDrawable, context2, s8.DEFAULT);
        this.f59457j = x8VarD;
        return x8VarD;
    }

    @Override // tx0.x2
    public final void H(int i) {
        NestedScrollableHost nestedScrollableHost = this.f59453b;
        nestedScrollableHost.setPadding(nestedScrollableHost.getPaddingLeft(), nestedScrollableHost.getPaddingTop(), nestedScrollableHost.getPaddingRight(), i);
    }

    @Override // tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new FrameLayout.LayoutParams(-1, -2);
    }

    public final void a() {
        if (this.f == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            WallpaperView wallpaperView = new WallpaperView(context, null, null, false, 62);
            this.f = wallpaperView;
            addView(wallpaperView, 0);
            wallpaperView.c();
            wallpaperView.setOffset(this.f59458l);
            wallpaperView.d(this.f59460n, this.f59459m);
        }
    }

    public final void b(x8 x8Var) {
        if (Intrinsics.f(this.i, x8Var)) {
            return;
        }
        this.i = x8Var;
        u2 u2Var = this.f59456h;
        if (u2Var != null) {
            u2Var.a(x8Var.f10609a, x8Var.f10610b, x8Var.f10611c, x8Var.e);
        }
    }

    public final void c() {
        ifm.c cVar = this.f59455g;
        if (cVar != null) {
            cVar.dispose();
        }
        WallpaperView wallpaperView = this.f;
        if (wallpaperView == null) {
            b(getDefaultPalette());
            return;
        }
        this.f59455g = wallpaperView.f57381b.h().subscribe(new o1(new g4(1, this, ScrollerNavBarContentView.class, "dispatchPalette", "dispatchPalette(Lcom/revolut/core/ui_kit/models/PicturePalette;)V", 0, 0), 17));
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
        this.f59459m = i;
        this.f59460n = f;
        WallpaperView wallpaperView = this.f;
        if (wallpaperView != null) {
            wallpaperView.d(f, i);
        }
    }

    @Override // tx0.x2
    public final void d0(int i) {
        NestedScrollableHost nestedScrollableHost = this.f59453b;
        nestedScrollableHost.setPadding(nestedScrollableHost.getPaddingLeft(), i, nestedScrollableHost.getPaddingRight(), nestedScrollableHost.getPaddingBottom());
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.f59452a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ifm.c cVar = this.f59455g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f59455g = null;
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int offset) {
        setClipChildren(offset == 0);
        this.f59458l = offset;
        WallpaperView wallpaperView = this.f;
        if (wallpaperView != null) {
            wallpaperView.setOffset(offset);
        }
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (Intrinsics.f(listener, this.f59456h)) {
            return;
        }
        this.f59456h = listener;
        x8 x8Var = this.i;
        if (x8Var != null) {
            this.i = null;
            b(x8Var);
        }
    }

    public final void setForceDynamicBackground(boolean enabled) {
        if (this.k) {
            return;
        }
        if (enabled != (this.f != null)) {
            ifm.c cVar = this.f59455g;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f59455g = null;
            if (enabled) {
                a();
            } else {
                removeView(this.f);
                this.f = null;
            }
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [z4l.j] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setModel(@NotNull b model) {
        ?? C;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.d, model)) {
            return;
        }
        this.d = model;
        if (model instanceof w) {
            List<f4> list = ((w) model).f59554a;
            C = new ArrayList(zhm.w.t(list, 10));
            for (f4 f4Var : list) {
                BigTileDelegate.Model model2 = new BigTileDelegate.Model(f4Var.f275124a, f4Var.f275125b, null, null, f4Var.d, null, new o4(f4Var.f275126c), null, null, true, true, null, f4Var, null, m4.SQUARE, null, 66451624);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                C.add(model2);
            }
        } else {
            if (!(model instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            v4 v4Var = new v4("tile0", w4.SQUARE, 60);
            yp0.b.l(v4Var, 0, 0, 0, 0, null, false, 63);
            C = zhm.u.c(v4Var);
        }
        this.e.c(C);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollerNavBarContentView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
