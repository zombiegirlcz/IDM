package com.revolut.core.ui_kit.gallery_picker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.RecyclerView;
import aq0.c;
import aq0.d;
import aq0.g;
import aq0.j;
import aq0.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.gallery_picker.BaseGalleryTileDelegate;
import com.revolut.core.ui_kit.internal.gallery_picker.GalleryGridLayoutManager;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import j70.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import jv0.e;
import jv0.s;
import jv0.t;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m0;
import kotlin.ranges.f;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import oz0.b;
import qr0.h;
import qr0.i;
import qr0.l;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0003\u001c\u001d\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\f\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/revolut/core/ui_kit/gallery_picker/GalleryPickerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Laq0/f;", "delegates", "", "setup$ui_kit_components_release", "(Laq0/f;)V", "setup", "", "Lkoi/j;", "items", "setItems", "(Ljava/util/List;)V", "", "zoomEnabled", "setZoomEnabled", "(Z)V", "Laq0/i;", "getContentTransform", "()Laq0/i;", "Laq0/j;", "a", "Laq0/j;", "getIdleListener$ui_kit_components_release", "()Laq0/j;", "setIdleListener$ui_kit_components_release", "(Laq0/j;)V", "idleListener", "Lkotlin/Function1;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "b", "Lkotlin/jvm/functions/Function1;", "getOnViewRecycledListener$ui_kit_components_release", "()Lkotlin/jvm/functions/Function1;", "setOnViewRecycledListener$ui_kit_components_release", "(Lkotlin/jvm/functions/Function1;)V", "onViewRecycledListener", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GalleryPickerView extends RecyclerView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public j idleListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Function1 onViewRecycledListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GalleryGridLayoutManager f55807c;
    public final l d;
    public final Matrix e;
    public final Matrix f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f55809h;
    public d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f55810j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OverScroller f55811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f55812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f55813n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f55814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f55815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f55816r;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.gallery_picker.GalleryPickerView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryPickerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        j jVar = this.idleListener;
        if (jVar != null) {
            l lVar = (l) ((i) jVar).f248595b;
            h hVar = lVar.d;
            if (hVar != null) {
                lVar.f248598c.removeCallbacks(hVar);
            }
            lVar.d = null;
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        boolean z = this.f55812m;
        OverScroller overScroller = this.f55811l;
        if (z) {
            if (!overScroller.computeScrollOffset()) {
                this.f55812m = false;
                f();
                return;
            }
            int currX = overScroller.getCurrX();
            GalleryGridLayoutManager galleryGridLayoutManager = this.f55807c;
            if (galleryGridLayoutManager == null) {
                Intrinsics.r("galleryLayoutManager");
                throw null;
            }
            int i = currX - galleryGridLayoutManager.f56044h;
            int currY = overScroller.getCurrY();
            GalleryGridLayoutManager galleryGridLayoutManager2 = this.f55807c;
            if (galleryGridLayoutManager2 == null) {
                Intrinsics.r("galleryLayoutManager");
                throw null;
            }
            int i2 = currY - galleryGridLayoutManager2.i;
            galleryGridLayoutManager2.f56049p = true;
            scrollBy(i, i2);
            postInvalidateOnAnimation();
            return;
        }
        if (this.f55813n) {
            if (!overScroller.computeScrollOffset()) {
                this.f55813n = false;
                d();
                return;
            }
            int currX2 = overScroller.getCurrX();
            GalleryGridLayoutManager galleryGridLayoutManager3 = this.f55807c;
            if (galleryGridLayoutManager3 == null) {
                Intrinsics.r("galleryLayoutManager");
                throw null;
            }
            int i3 = currX2 - galleryGridLayoutManager3.f56044h;
            int currY2 = overScroller.getCurrY();
            GalleryGridLayoutManager galleryGridLayoutManager4 = this.f55807c;
            if (galleryGridLayoutManager4 == null) {
                Intrinsics.r("galleryLayoutManager");
                throw null;
            }
            int i5 = currY2 - galleryGridLayoutManager4.i;
            galleryGridLayoutManager4.f56049p = true;
            scrollBy(i3, i5);
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        if (!this.k || this.f55812m || this.f55813n) {
            return;
        }
        this.k = false;
        j jVar = this.idleListener;
        if (jVar != null) {
            l lVar = (l) ((i) jVar).f248595b;
            Handler handler = lVar.f248598c;
            h hVar = lVar.d;
            if (hVar != null) {
                handler.removeCallbacks(hVar);
            }
            lVar.d = null;
            h hVar2 = new h(lVar, 2);
            handler.postDelayed(hVar2, 100L);
            lVar.d = hVar2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f55810j) {
            super.dispatchDraw(canvas);
            return;
        }
        h();
        int iSave = canvas.save();
        canvas.concat(this.e);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Matrix matrix = this.e;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f55810j) {
            return super.dispatchTouchEvent(event);
        }
        h();
        event.transform(this.f);
        this.f55808g = true;
        try {
            return super.dispatchTouchEvent(event);
        } finally {
            this.f55808g = false;
            event.transform(matrix);
        }
    }

    public final void f() {
        if (getChildCount() == 0) {
            d();
            return;
        }
        GalleryGridLayoutManager galleryGridLayoutManager = this.f55807c;
        if (galleryGridLayoutManager == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        float f = galleryGridLayoutManager.f;
        float f4 = f * 2.0f;
        float width = (getWidth() / f4) + (galleryGridLayoutManager.f56044h - galleryGridLayoutManager.f56046l);
        if (this.f55807c == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        float height = (getHeight() / f4) + (r4.i - r4.f56047m);
        int childCount = getChildCount();
        float f5 = Float.MAX_VALUE;
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                float width2 = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - width;
                float height2 = ((childAt.getHeight() / 2.0f) + childAt.getTop()) - height;
                float fSqrt = (float) Math.sqrt((height2 * height2) + (width2 * width2));
                if (fSqrt < f5) {
                    view = childAt;
                    f5 = fSqrt;
                }
            }
        }
        if (view == null) {
            d();
            return;
        }
        int iC = rim.d.c(((view.getWidth() / 2.0f) + view.getLeft()) - width);
        int iC2 = rim.d.c(((view.getHeight() / 2.0f) + view.getTop()) - height);
        if (iC == 0 && iC2 == 0) {
            d();
            return;
        }
        GalleryGridLayoutManager galleryGridLayoutManager2 = this.f55807c;
        if (galleryGridLayoutManager2 == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        int iG = f.g(galleryGridLayoutManager2.f56044h + iC, 0, galleryGridLayoutManager2.f56045j);
        GalleryGridLayoutManager galleryGridLayoutManager3 = this.f55807c;
        if (galleryGridLayoutManager3 == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        int iG2 = f.g(galleryGridLayoutManager3.i + iC2, 0, galleryGridLayoutManager3.k);
        GalleryGridLayoutManager galleryGridLayoutManager4 = this.f55807c;
        if (galleryGridLayoutManager4 == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        int i2 = iG - galleryGridLayoutManager4.f56044h;
        int i3 = iG2 - galleryGridLayoutManager4.i;
        if (i2 == 0 && i3 == 0) {
            d();
            return;
        }
        int iSqrt = (int) ((((float) Math.sqrt((i3 * i3) + (i2 * i2))) * f) / 0.5f);
        int i5 = iSqrt < 1 ? 1 : iSqrt;
        OverScroller overScroller = this.f55811l;
        overScroller.forceFinished(true);
        GalleryGridLayoutManager galleryGridLayoutManager5 = this.f55807c;
        if (galleryGridLayoutManager5 == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        overScroller.startScroll(galleryGridLayoutManager5.f56044h, galleryGridLayoutManager5.i, i2, i3, i5);
        this.f55813n = true;
        c();
        postInvalidateOnAnimation();
    }

    public final void g(float f) {
        this.f55814p = true;
        OverScroller overScroller = this.f55811l;
        if (!overScroller.isFinished()) {
            overScroller.forceFinished(true);
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        m0 m0Var = new m0();
        m0Var.f186427a = this.o;
        ValueAnimator valueAnimator = this.f55815q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        GalleryGridLayoutManager galleryGridLayoutManager = this.f55807c;
        if (galleryGridLayoutManager == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        galleryGridLayoutManager.f56043g = Math.min(galleryGridLayoutManager.f, f);
        galleryGridLayoutManager.requestLayout();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.o, f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new g(this, width, height, m0Var));
        valueAnimatorOfFloat.addListener(new k(this, 0));
        valueAnimatorOfFloat.start();
        this.f55815q = valueAnimatorOfFloat;
    }

    @NotNull
    public final aq0.i getContentTransform() {
        if (!this.f55810j) {
            throw new IllegalStateException("setup() must be called before reading the content transform");
        }
        Matrix matrix = new Matrix();
        float f = this.o;
        matrix.setScale(f, f);
        GalleryGridLayoutManager galleryGridLayoutManager = this.f55807c;
        if (galleryGridLayoutManager == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        float f4 = -(galleryGridLayoutManager.f56044h - galleryGridLayoutManager.f56046l);
        if (galleryGridLayoutManager != null) {
            matrix.preTranslate(f4, -(galleryGridLayoutManager.i - galleryGridLayoutManager.f56047m));
            return new aq0.i(this.o, matrix);
        }
        Intrinsics.r("galleryLayoutManager");
        throw null;
    }

    /* JADX INFO: renamed from: getIdleListener$ui_kit_components_release, reason: from getter */
    public final j getIdleListener() {
        return this.idleListener;
    }

    public final Function1<RecyclerView.ViewHolder, Unit> getOnViewRecycledListener$ui_kit_components_release() {
        return this.onViewRecycledListener;
    }

    public final void h() {
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.o;
        matrix.setScale(f, f);
        GalleryGridLayoutManager galleryGridLayoutManager = this.f55807c;
        if (galleryGridLayoutManager == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        float f4 = -(galleryGridLayoutManager.f56044h - galleryGridLayoutManager.f56046l);
        if (galleryGridLayoutManager == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        matrix.preTranslate(f4, -(galleryGridLayoutManager.i - galleryGridLayoutManager.f56047m));
        matrix.invert(this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int iG;
        int i;
        super.onAttachedToWindow();
        c cVar = this.f55809h;
        cVar.getClass();
        cVar.i = VelocityTracker.obtain();
        l lVar = this.d;
        GalleryPickerView galleryPickerView = lVar.f248596a;
        ArrayList arrayList = lVar.f;
        if (arrayList.isEmpty()) {
            qr0.g gVar = lVar.f248597b;
            gVar.getClass();
            int i2 = 6;
            int i3 = 0;
            if (jo0.i.f176844b) {
                iG = 0;
            } else {
                a aVar = gVar.f248590a;
                j70.d dVarA = aVar != null ? ((j70.c) aVar).a() : null;
                int i5 = dVarA == null ? -1 : qr0.f.f248589a[dVarA.ordinal()];
                if (i5 == -1 || i5 == 1 || i5 == 2) {
                    iG = 1;
                } else {
                    if (i5 != 3 && i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.f248591b.getClass();
                    if (Build.VERSION.SDK_INT < 29) {
                        i = 1;
                    } else {
                        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
                        i = 0;
                        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                            if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                                int length = supportedTypes.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < length) {
                                        String str = supportedTypes[i6];
                                        Intrinsics.h(str);
                                        if (a0.H(str, "video/", false)) {
                                            i++;
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                    }
                    iG = f.g(i, 3, 6);
                }
            }
            for (int i21 = 0; i21 < iG; i21++) {
                Context context = galleryPickerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                UiKitPlayerView uiKitPlayerView = new UiKitPlayerView(context, null, i2, i3);
                uiKitPlayerView.setDetachBehavior(s.PAUSE_ON_DETACH);
                uiKitPlayerView.setSurfaceDestructionStrategy(t.KEEP);
                uiKitPlayerView.setScaleType(b.CENTER_CROP);
                uiKitPlayerView.setShutter(VideoShutter.FadeIn.f60094a);
                uiKitPlayerView.setRepeat(true);
                uiKitPlayerView.setVolumeLevel(BitmapDescriptorFactory.HUE_RED);
                uiKitPlayerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                arrayList.add(uiKitPlayerView);
            }
        }
        galleryPickerView.post(new h(lVar, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f55815q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c cVar = this.f55809h;
        VelocityTracker velocityTracker = cVar.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        cVar.i = null;
        OverScroller overScroller = this.f55811l;
        if (!overScroller.isFinished()) {
            overScroller.forceFinished(true);
        }
        l lVar = this.d;
        ArrayList arrayList = lVar.f;
        Handler handler = lVar.f248598c;
        h hVar = lVar.d;
        if (hVar != null) {
            handler.removeCallbacks(hVar);
        }
        lVar.d = null;
        LinkedHashMap linkedHashMap = lVar.e;
        List listD1 = d0.d1(linkedHashMap.keySet());
        int size = listD1.size();
        for (int i = 0; i < size; i++) {
            qr0.b bVar = (qr0.b) listD1.get(i);
            linkedHashMap.remove(bVar);
            e eVar = ((qr0.d) bVar).f;
            UiKitPlayerView uiKitPlayerView = eVar.f178737a;
            if (uiKitPlayerView != null) {
                uiKitPlayerView.h();
                uiKitPlayerView.setVisibility(8);
                eVar.f178737a = null;
                eVar.removeView(uiKitPlayerView);
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            UiKitPlayerView uiKitPlayerView2 = (UiKitPlayerView) arrayList.get(i2);
            uiKitPlayerView2.m();
            jv0.i iVar = uiKitPlayerView2.f57717t;
            iVar.a();
            if (uiKitPlayerView2.getExternalMediaRegistry() != null) {
                ExoPlayer exoPlayer = uiKitPlayerView2.f57712n;
                if (exoPlayer != null) {
                    exoPlayer.stop();
                }
            } else {
                uiKitPlayerView2.k();
            }
            iVar.onPlayWhenReadyChanged(false, 1);
            uiKitPlayerView2.k();
            handler.postDelayed(new jv0.h(uiKitPlayerView2, 3), ((long) i2) * 50);
        }
        arrayList.clear();
        linkedHashMap.clear();
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        Matrix matrix = this.f;
        Intrinsics.checkNotNullParameter(e, "e");
        boolean z = this.f55808g;
        c cVar = this.f55809h;
        if (!z) {
            return cVar.b(e);
        }
        e.transform(this.e);
        try {
            return cVar.b(e);
        } finally {
            e.transform(matrix);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent e) {
        Matrix matrix = this.f;
        Intrinsics.checkNotNullParameter(e, "e");
        boolean z = this.f55808g;
        c cVar = this.f55809h;
        if (!z) {
            cVar.a(e);
            return true;
        }
        e.transform(this.e);
        try {
            cVar.a(e);
            return true;
        } finally {
            e.transform(matrix);
        }
    }

    public final void setIdleListener$ui_kit_components_release(j jVar) {
        this.idleListener = jVar;
    }

    public final void setItems(@NotNull List<? extends koi.j> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        int iSqrt = (int) Math.sqrt(items.size());
        if (iSqrt < 1) {
            iSqrt = 1;
        }
        GalleryGridLayoutManager galleryGridLayoutManager = this.f55807c;
        if (galleryGridLayoutManager == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        galleryGridLayoutManager.f56040a = iSqrt;
        galleryGridLayoutManager.requestLayout();
        d dVar = this.i;
        if (dVar == null) {
            Intrinsics.r("galleryAdapter");
            throw null;
        }
        dVar.c(items);
        l lVar = this.d;
        lVar.f248596a.post(new h(lVar, 1));
    }

    public final void setOnViewRecycledListener$ui_kit_components_release(Function1<? super RecyclerView.ViewHolder, Unit> function1) {
        this.onViewRecycledListener = function1;
    }

    public final void setZoomEnabled(boolean zoomEnabled) {
        this.f55816r = zoomEnabled;
        if (zoomEnabled || this.o == 1.0f) {
            return;
        }
        g(1.0f);
    }

    public final void setup$ui_kit_components_release(@NotNull aq0.f delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        if (this.f55810j) {
            throw new IllegalStateException("setup() has already been called");
        }
        List delegates2 = delegates.a();
        List list = delegates2;
        Iterator it8 = list.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        int iQ = ((BaseGalleryTileDelegate) it8.next()).getF54211c();
        while (it8.hasNext()) {
            int iQ2 = ((BaseGalleryTileDelegate) it8.next()).getF54211c();
            if (iQ < iQ2) {
                iQ = iQ2;
            }
        }
        Iterator it9 = list.iterator();
        if (!it9.hasNext()) {
            throw new NoSuchElementException();
        }
        int iP = ((BaseGalleryTileDelegate) it9.next()).getD();
        while (it9.hasNext()) {
            int iP2 = ((BaseGalleryTileDelegate) it9.next()).getD();
            if (iP < iP2) {
                iP = iP2;
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f55807c = new GalleryGridLayoutManager(context, iQ, iP);
        Intrinsics.checkNotNullParameter(delegates2, "delegates");
        boolean z = false;
        this.i = new d(new koi.c(delegates2), z, z, 4);
        GalleryGridLayoutManager galleryGridLayoutManager = this.f55807c;
        if (galleryGridLayoutManager == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        setLayoutManager(galleryGridLayoutManager);
        d dVar = this.i;
        if (dVar == null) {
            Intrinsics.r("galleryAdapter");
            throw null;
        }
        setAdapter(dVar);
        d dVar2 = this.i;
        if (dVar2 == null) {
            Intrinsics.r("galleryAdapter");
            throw null;
        }
        dVar2.f8216j = new an4.f(this, 20);
        this.f55810j = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryPickerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryPickerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = new l(this);
        this.e = new Matrix();
        this.f = new Matrix();
        this.f55809h = new c(context, new aq0.h(this, 0), new aq0.h(this, 1), new aq0.h(this, 2), new zjh.i(this, 5));
        this.f55811l = new OverScroller(context);
        this.o = 1.0f;
        this.f55816r = true;
        setHasFixedSize(true);
    }

    public /* synthetic */ GalleryPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
