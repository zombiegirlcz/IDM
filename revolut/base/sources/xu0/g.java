package xu0;

import android.os.Handler;
import androidx.core.view.GestureDetectorCompat;
import androidx.customview.widget.ViewDragHelper;
import bx0.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vu0.r;
import vu0.s;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionLayout f308862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zu0.e f308863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yu0.c f308864c;
    public final Handler d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vf.c f308865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f308866h;
    public r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f308867j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f308868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f308869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ViewDragHelper f308870n;
    public final GestureDetectorCompat o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vu0.d f308871p;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [xu0.d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [xu0.d] */
    public g(SwipeToActionLayout layout, zu0.e layoutController, yu0.c itemController, Handler mainHandler) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(layoutController, "layoutController");
        Intrinsics.checkNotNullParameter(itemController, "itemController");
        Intrinsics.checkNotNullParameter(mainHandler, "mainHandler");
        this.f308862a = layout;
        this.f308863b = layoutController;
        this.f308864c = itemController;
        this.d = mainHandler;
        this.i = r.NONE;
        this.f308867j = -1.0f;
        float f = ((Boolean) jo0.g.O.getValue()).booleanValue() ? 1.0f : 0.5f;
        this.k = f;
        this.f308868l = f;
        b bVar = new b(layout, layoutController, itemController, this, new c(this, 0));
        this.f308869m = bVar;
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(layout, 1.0f, bVar);
        viewDragHelperCreate.setEdgeTrackingEnabled(1);
        Intrinsics.checkNotNullExpressionValue(viewDragHelperCreate, "apply(...)");
        this.f308870n = viewDragHelperCreate;
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(layout.getContext(), new q(this));
        gestureDetectorCompat.setIsLongpressEnabled(false);
        this.o = gestureDetectorCompat;
        c cVar = new c(this, 1);
        final int i = 0;
        ?? r87 = new Function1(this) { // from class: xu0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f308860b;

            {
                this.f308860b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r5) {
                /*
                    r4 = this;
                    int r0 = r2
                    android.view.MotionEvent r5 = (android.view.MotionEvent) r5
                    switch(r0) {
                        case 0: goto L63;
                        default: goto L7;
                    }
                L7:
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    xu0.g r0 = r4.f308860b
                    com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout r1 = r0.f308862a
                    vu0.u r1 = r1.getState()
                    vu0.u r2 = vu0.u.CLOSE
                    r3 = 1
                    if (r1 == r2) goto L1a
                    goto L5e
                L1a:
                    float r1 = r0.f308867j
                    float r2 = r0.a()
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 <= 0) goto L2e
                    float r1 = r0.f308867j
                    float r2 = r0.b()
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 < 0) goto L5d
                L2e:
                    float r5 = r5.getX()
                    com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout r1 = r0.f308862a
                    vu0.s r1 = r1.getDragDirection()
                    int[] r2 = xu0.f.f308861a
                    int r1 = r1.ordinal()
                    r1 = r2[r1]
                    if (r1 == r3) goto L56
                    r2 = 2
                    if (r1 == r2) goto L4f
                    r5 = 3
                    if (r1 != r5) goto L49
                    goto L5e
                L49:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                L4f:
                    float r0 = r0.f308867j
                    int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                    if (r5 <= 0) goto L5d
                    goto L5e
                L56:
                    float r0 = r0.f308867j
                    int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                    if (r5 >= 0) goto L5d
                    goto L5e
                L5d:
                    r3 = 0
                L5e:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
                    return r5
                L63:
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    xu0.g r0 = r4.f308860b
                    com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout r1 = r0.f308862a
                    vu0.u r1 = r1.getState()
                    vu0.u r2 = vu0.u.CLOSE
                    if (r1 != r2) goto L8f
                    float r1 = r5.getX()
                    float r2 = r0.a()
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 <= 0) goto L8f
                    float r5 = r5.getX()
                    float r0 = r0.b()
                    int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                    if (r5 < 0) goto L8d
                    goto L8f
                L8d:
                    r5 = 0
                    goto L90
                L8f:
                    r5 = 1
                L90:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: xu0.d.invoke(java.lang.Object):java.lang.Object");
            }
        };
        final int i2 = 1;
        vu0.d dVar = new vu0.d(layout, new vu0.a(null, cVar, r87, new Function1(this) { // from class: xu0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f308860b;

            {
                this.f308860b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object v) {
                /*
                    this = this;
                    int r0 = r2
                    android.view.MotionEvent r5 = (android.view.MotionEvent) r5
                    switch(r0) {
                        case 0: goto L63;
                        default: goto L7;
                    }
                L7:
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    xu0.g r0 = r4.f308860b
                    com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout r1 = r0.f308862a
                    vu0.u r1 = r1.getState()
                    vu0.u r2 = vu0.u.CLOSE
                    r3 = 1
                    if (r1 == r2) goto L1a
                    goto L5e
                L1a:
                    float r1 = r0.f308867j
                    float r2 = r0.a()
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 <= 0) goto L2e
                    float r1 = r0.f308867j
                    float r2 = r0.b()
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 < 0) goto L5d
                L2e:
                    float r5 = r5.getX()
                    com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout r1 = r0.f308862a
                    vu0.s r1 = r1.getDragDirection()
                    int[] r2 = xu0.f.f308861a
                    int r1 = r1.ordinal()
                    r1 = r2[r1]
                    if (r1 == r3) goto L56
                    r2 = 2
                    if (r1 == r2) goto L4f
                    r5 = 3
                    if (r1 != r5) goto L49
                    goto L5e
                L49:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                L4f:
                    float r0 = r0.f308867j
                    int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                    if (r5 <= 0) goto L5d
                    goto L5e
                L56:
                    float r0 = r0.f308867j
                    int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                    if (r5 >= 0) goto L5d
                    goto L5e
                L5d:
                    r3 = 0
                L5e:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
                    return r5
                L63:
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    xu0.g r0 = r4.f308860b
                    com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout r1 = r0.f308862a
                    vu0.u r1 = r1.getState()
                    vu0.u r2 = vu0.u.CLOSE
                    if (r1 != r2) goto L8f
                    float r1 = r5.getX()
                    float r2 = r0.a()
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 <= 0) goto L8f
                    float r5 = r5.getX()
                    float r0 = r0.b()
                    int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                    if (r5 < 0) goto L8d
                    goto L8f
                L8d:
                    r5 = 0
                    goto L90
                L8f:
                    r5 = 1
                L90:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: xu0.d.invoke(java.lang.Object):java.lang.Object");
            }
        }, null, 49));
        dVar.f292141j = viewDragHelperCreate.getTouchSlop();
        this.f308871p = dVar;
    }

    public final float a() {
        SwipeToActionLayout swipeToActionLayout = this.f308862a;
        return (swipeToActionLayout.getDragDirection() == s.FROM_START_TO_END || swipeToActionLayout.getDragDirection() == s.BOTH) ? swipeToActionLayout.getWidth() * this.k : BitmapDescriptorFactory.HUE_RED;
    }

    public final float b() {
        SwipeToActionLayout swipeToActionLayout = this.f308862a;
        if (swipeToActionLayout.getDragDirection() != s.FROM_END_TO_START && swipeToActionLayout.getDragDirection() != s.BOTH) {
            return swipeToActionLayout.getWidth();
        }
        return (1 - this.f308868l) * swipeToActionLayout.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu0.g.c(android.view.MotionEvent):boolean");
    }

    public final void d() {
        vf.c cVar = this.f308865g;
        if (cVar != null) {
            this.d.removeCallbacks(cVar);
        }
        this.f308865g = null;
        this.f = false;
    }
}
