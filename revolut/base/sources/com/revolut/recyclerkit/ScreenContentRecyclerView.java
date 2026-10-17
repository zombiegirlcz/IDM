package com.revolut.recyclerkit;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import goi.c;
import goi.e;
import goi.f;
import goi.i;
import hoi.s;
import ix0.e1;
import jo0.g;
import joi.m;
import joi.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ny0.l;
import ny0.q;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import z4l.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010#\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010&\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/revolut/recyclerkit/ScreenContentRecyclerView;", "Lcom/revolut/recyclerkit/UIKitRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgoi/i;", "model", "", "setModel", "(Lgoi/i;)V", "Lgoi/f;", "state", "setNavbarMaskState", "(Lgoi/f;)V", "", "enabled", "setInteractionsEnabled", "(Z)V", "setInsetsAdjustmentsEnabled", "getInsetsAdjustable", "()Z", "insetsAdjustable", "Ljoi/c;", "getCollapsibleSectionPressFeedbackDelegate", "()Ljoi/c;", "getCollapsibleSectionPressFeedbackDelegate$annotations", "()V", "collapsibleSectionPressFeedbackDelegate", "getCurrentModel", "()Lgoi/i;", "currentModel", "getConsumedBottomInset", "()I", "consumedBottomInset", "Companion", "a", "recycler_kit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenContentRecyclerView extends UIKitRecyclerView {

    @NotNull
    private static final a Companion = new a();
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f98529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f98530h;
    public m i;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenContentRecyclerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getCollapsibleSectionPressFeedbackDelegate$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getInsetsAdjustable() {
        return ((Boolean) g.f176835s.getValue()).booleanValue() && !this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        c cVar = this.f98529g;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (cVar.e && canvas.isHardwareAccelerated() && (i = cVar.i) > 0) {
            float f = i + cVar.f145163h;
            canvas.save();
            canvas.scale(1.0f, f);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, cVar.f145159a.getWidth(), 1.0f, cVar.f145160b);
            canvas.restore();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final joi.c getCollapsibleSectionPressFeedbackDelegate() {
        if (((Boolean) g.f176839y.getValue()).booleanValue() && this.i == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            p pVar = new p(context);
            m mVar = new m(pVar);
            this.i = mVar;
            addItemDecoration(pVar);
            addOnItemTouchListener(mVar);
            addOnChildAttachStateChangeListener(mVar);
            addOnScrollListener(mVar.f177106b);
        }
        return this.i;
    }

    public final int getConsumedBottomInset() {
        Intrinsics.checkNotNullParameter("BOTTOM_INSETS_REQUEST_TOKEN", "requestToken");
        q qVar = this.f98533b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter("BOTTOM_INSETS_REQUEST_TOKEN", "requestToken");
        ny0.m mVar = (ny0.m) qVar.i.get("BOTTOM_INSETS_REQUEST_TOKEN");
        if (mVar == null) {
            ny0.m.Companion.getClass();
            mVar = ny0.m.e;
        }
        return mVar.d;
    }

    @NotNull
    /* JADX INFO: renamed from: getCurrentModel, reason: from getter */
    public final i getF98530h() {
        return this.f98530h;
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        c cVar = this.f98529g;
        if (cVar.e) {
            cVar.a();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (getInsetsAdjustable()) {
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
            int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
            Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
            Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
            l.a(this, insets2.bottom, "BOTTOM_INSETS_REQUEST_TOKEN", 7);
            Insets insetsOf = Insets.of(insets2.left, insets2.top, insets2.right, 0);
            Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
            WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
            if (windowInsets != null) {
                insets = windowInsets;
            }
        } else {
            l.a(this, 0, "BOTTOM_INSETS_REQUEST_TOKEN", 15);
        }
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
        addOnLayoutChangeListener(this.f98529g.f145164j);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [koi.i, z4l.g] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f98529g.f145164j);
        RecyclerView.Adapter adapter = getAdapter();
        j jVar = adapter instanceof j ? (j) adapter : null;
        if (jVar != null) {
            jVar.k.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.revolut.recyclerkit.UIKitRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @d
    public final void setInsetsAdjustmentsEnabled(boolean enabled) {
        setModel(i.a(this.f98530h, false, enabled, 1));
    }

    @d
    public final void setInteractionsEnabled(boolean enabled) {
        setModel(i.a(this.f98530h, enabled, false, 2));
    }

    public final void setModel(@NotNull i model) {
        boolean z;
        Intrinsics.checkNotNullParameter(model, "model");
        i iVar = this.f98530h;
        this.f98530h = model;
        boolean z3 = iVar.f145171a;
        boolean z4 = model.f145171a;
        if (z3 != z4) {
            this.e = !z4;
        }
        boolean z6 = iVar.f145172b;
        boolean z11 = model.f145172b;
        if (z6 == z11 || this.f == (!z11)) {
            return;
        }
        this.f = z;
        if (!z11) {
            l.a(this, 0, "BOTTOM_INSETS_REQUEST_TOKEN", 15);
        }
        if (isAttachedToWindow()) {
            requestApplyInsets();
        }
    }

    public final void setNavbarMaskState(@NotNull f state) {
        Intrinsics.checkNotNullParameter(state, "state");
        c cVar = this.f98529g;
        ScreenContentRecyclerView screenContentRecyclerView = cVar.f145159a;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.f(state, cVar.d)) {
            return;
        }
        cVar.d = state;
        if (state instanceof e) {
            cVar.f145161c = ((e) state).f145166a;
            cVar.e = true;
            jb3.l.s(screenContentRecyclerView).a(e1.SCROLL_EDGE_TOP_EFFECT, true);
            cVar.a();
        } else {
            if (!(state instanceof goi.d)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.f145161c = null;
            cVar.e = false;
            cVar.i = 0;
            jb3.l.s(screenContentRecyclerView).a(e1.SCROLL_EDGE_TOP_EFFECT, false);
        }
        screenContentRecyclerView.invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenContentRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    public ScreenContentRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98529g = new c(this);
        this.f98530h = new i(false, 3);
        if (((Boolean) g.f176835s.getValue()).booleanValue()) {
            setClipToPadding(false);
        }
        if (((Boolean) g.f176839y.getValue()).booleanValue()) {
            setItemAnimator(new s(this, getCollapsibleSectionPressFeedbackDelegate()));
        }
    }

    public /* synthetic */ ScreenContentRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
