package ix0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener, LifecycleEventObserver {

    @NotNull
    private static final m2 Companion = new m2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f169270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2 f169271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f169272c;
    public boolean d;
    public Lifecycle e;
    public Lifecycle f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewTreeObserver f169273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f169274h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.view.d f169275j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f169276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f169277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f169278n;

    public o2(View view, l2 callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f169270a = view;
        this.f169271b = callback;
        this.f169275j = new androidx.view.d(this, 14);
        this.f169277m = -1;
        this.f169278n = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 56.0f);
    }

    public static boolean d(View view) {
        x1 x1VarR = te0.w.R(view);
        return (x1VarR != null ? ((nji.j) x1VarR).a() : null) == v1.EXIT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x005c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.o2.a():void");
    }

    public final void b() {
        int i;
        if (this.f169276l > 0 || (i = this.f169277m) == -1) {
            return;
        }
        this.f169277m = -1;
        if (i == 0) {
            f();
        } else {
            if (i != 1) {
                return;
            }
            c();
        }
    }

    public final void c() {
        if (this.f169276l > 0) {
            this.f169277m = 1;
            return;
        }
        if (this.d) {
            return;
        }
        this.d = true;
        View view = this.f169270a;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    public final boolean e(View view) {
        Drawable foreground;
        if (!(view instanceof fu0.e) && view.getVisibility() == 0) {
            int width = view.getWidth();
            int i = this.f169278n;
            if (width > i && view.getHeight() > i && view.getAlpha() != BitmapDescriptorFactory.HUE_RED) {
                Drawable background = view.getBackground();
                if ((background == null || background.getAlpha() == 0 || ((background instanceof ColorDrawable) && ((ColorDrawable) background).getColor() == 0)) && ((foreground = view.getForeground()) == null || foreground.getAlpha() == 0 || ((foreground instanceof ColorDrawable) && ((ColorDrawable) foreground).getColor() == 0))) {
                    if (view instanceof ViewGroup) {
                        if (!d(view)) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            int childCount = viewGroup.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = viewGroup.getChildAt(i2);
                                Intrinsics.h(childAt);
                                if (!e(childAt)) {
                                }
                            }
                        }
                    }
                } else if (view instanceof ViewGroup) {
                    return !d(view);
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f169276l > 0) {
            this.f169277m = 0;
        } else if (this.d) {
            this.d = false;
            View view = this.f169270a;
            onViewDetachedFromWindow(view);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public final void g(boolean z) {
        if (this.f169272c == z) {
            return;
        }
        this.f169272c = z;
        this.f169276l++;
        this.f169271b.a(z);
        this.f169276l--;
        b();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a();
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = n2.f169268a[event.ordinal()];
        androidx.view.d dVar = this.f169275j;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Lifecycle lifecycle = source.getLifecycle();
            if (Intrinsics.f(lifecycle, this.f)) {
                this.f169274h = false;
                if (this.k) {
                    this.k = false;
                    Lazy lazy = h1.f169241a;
                    h1.e(dVar);
                }
            }
            if (Intrinsics.f(lifecycle, this.e)) {
                this.i = false;
                a();
                return;
            }
            return;
        }
        Lifecycle lifecycle2 = source.getLifecycle();
        if (Intrinsics.f(lifecycle2, this.f)) {
            this.f169274h = true;
            if (this.i) {
                a();
            } else if (!this.k) {
                this.k = true;
                Lazy lazy2 = h1.f169241a;
                h1.b(dVar);
            }
        }
        if (Intrinsics.f(lifecycle2, this.e)) {
            this.i = true;
            a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f169276l++;
        View view = this.f169270a;
        this.e = te0.w.A(view);
        this.f = or0.u.g(view);
        Lifecycle lifecycle = this.e;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        Lifecycle lifecycle2 = this.f;
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        this.f169273g = viewTreeObserver;
        this.f169276l--;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewDetachedFromWindow(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.Lifecycle r4 = r3.e
            if (r4 == 0) goto Ld
            r4.removeObserver(r3)
        Ld:
            androidx.lifecycle.Lifecycle r4 = r3.f
            if (r4 == 0) goto L14
            r4.removeObserver(r3)
        L14:
            r4 = 0
            r3.f169274h = r4
            r3.i = r4
            r0 = 0
            r3.e = r0
            r3.f = r0
            android.view.ViewTreeObserver r1 = r3.f169273g
            if (r1 == 0) goto L2b
            boolean r2 = r1.isAlive()
            if (r2 == 0) goto L29
            r0 = r1
        L29:
            if (r0 != 0) goto L31
        L2b:
            android.view.View r0 = r3.f169270a
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
        L31:
            r0.removeOnPreDrawListener(r3)
            boolean r0 = r3.k
            if (r0 == 0) goto L41
            r3.k = r4
            kotlin.Lazy r0 = ix0.h1.f169241a
            androidx.activity.d r0 = r3.f169275j
            ix0.h1.e(r0)
        L41:
            r3.g(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.o2.onViewDetachedFromWindow(android.view.View):void");
    }
}
