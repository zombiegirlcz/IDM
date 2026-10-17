package com.airbnb.lottie;

import a5h.g;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.a0;
import d7.b;
import d7.f0;
import d7.j;
import d7.l0;
import d7.m0;
import d7.o;
import d7.p;
import d7.w;
import d7.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.i;
import n7.h;
import p7.s;
import r7.d;
import r7.e;
import s7.c;
import zjh.f;

/* JADX INFO: loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final List S = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor T = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d());
    public Bitmap A;
    public Canvas B;
    public Rect C;
    public RectF D;
    public e7.a E;
    public Rect F;
    public Rect G;
    public RectF H;
    public RectF I;
    public Matrix J;
    public final float[] K;
    public Matrix L;
    public boolean M;
    public d7.a N;
    public final w O;
    public final Semaphore P;
    public final androidx.view.d Q;
    public float R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f25588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f25589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25590c;
    public boolean d;
    public boolean e;
    public a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f25591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j7.a f25592h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f25593j;
    public Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f25594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f25595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f25596n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n7.d f25598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25601t;
    public boolean u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m0 f25603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f25604y;
    public final Matrix z;

    public LottieDrawable() {
        e eVar = new e();
        this.f25589b = eVar;
        this.f25590c = true;
        this.d = false;
        this.e = false;
        this.f = a0.NONE;
        this.f25591g = new ArrayList();
        this.f25596n = new f();
        this.o = false;
        this.f25597p = true;
        this.f25599r = 255;
        this.f25602w = false;
        this.f25603x = m0.AUTOMATIC;
        this.f25604y = false;
        this.z = new Matrix();
        this.K = new float[9];
        this.M = false;
        w wVar = new w(this, 0);
        this.O = wVar;
        this.P = new Semaphore(1);
        this.Q = new androidx.view.d(this, 8);
        this.R = -3.4028235E38f;
        eVar.addUpdateListener(wVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean k(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final void A(final float f) {
        j jVar = this.f25588a;
        if (jVar == null) {
            this.f25591g.add(new z() { // from class: d7.y
                @Override // d7.z
                public final void run() {
                    List list = LottieDrawable.S;
                    this.f111730a.A(f);
                }
            });
        } else {
            d7.a aVar = d7.d.f111646a;
            this.f25589b.i(r7.g.f(jVar.f111683l, jVar.f111684m, f));
        }
    }

    public final boolean B() {
        j jVar = this.f25588a;
        if (jVar == null) {
            return false;
        }
        float f = this.R;
        float fA = this.f25589b.a();
        this.R = fA;
        return Math.abs(fA - f) * jVar.b() >= 50.0f;
    }

    public final void a(final k7.f fVar, final Object obj2, final c cVar) {
        n7.d dVar = this.f25598q;
        if (dVar == null) {
            this.f25591g.add(new z() { // from class: d7.s
                @Override // d7.z
                public final void run() {
                    List list = LottieDrawable.S;
                    this.f111717a.a(fVar, obj2, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (fVar == k7.f.f181766c) {
            dVar.f(obj2, cVar);
        } else {
            k7.g gVar = fVar.f181768b;
            if (gVar != null) {
                gVar.f(obj2, cVar);
            } else {
                List listO = o(fVar);
                for (int i = 0; i < listO.size(); i++) {
                    ((k7.f) listO.get(i)).f181768b.f(obj2, cVar);
                }
                zIsEmpty = true ^ listO.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj2 == f0.C) {
                A(this.f25589b.a());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.d) {
            return true;
        }
        if (!this.f25590c) {
            return false;
        }
        d7.d.d.getClass();
        return p96.a.i(context) == i7.a.STANDARD_MOTION;
    }

    public final void c() {
        j jVar = this.f25588a;
        if (jVar == null) {
            return;
        }
        cpi.g gVar = s.f233499a;
        Rect rect = jVar.k;
        List list = Collections.EMPTY_LIST;
        n7.d dVar = new n7.d(this, new h(list, jVar, "__container", -1L, n7.f.PRE_COMP, -1L, null, list, new l7.f(), 0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rect.width(), rect.height(), null, null, list, n7.g.NONE, null, false, null, null, m7.h.NORMAL), jVar.f111682j, jVar);
        this.f25598q = dVar;
        if (this.f25601t) {
            dVar.o(true);
        }
        this.f25598q.N = this.f25597p;
    }

    public final void d() {
        e eVar = this.f25589b;
        if (eVar.f251943m) {
            eVar.cancel();
            if (!isVisible()) {
                this.f = a0.NONE;
            }
        }
        this.f25588a = null;
        this.f25598q = null;
        this.f25592h = null;
        this.R = -3.4028235E38f;
        eVar.f251942l = null;
        eVar.f251941j = -2.1474836E9f;
        eVar.k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        n7.d dVar = this.f25598q;
        if (dVar == null) {
            return;
        }
        d7.a aVar = this.N;
        if (aVar == null) {
            aVar = d7.d.f111646a;
        }
        boolean z = aVar == d7.a.ENABLED;
        androidx.view.d dVar2 = this.Q;
        ThreadPoolExecutor threadPoolExecutor = T;
        e eVar = this.f25589b;
        Semaphore semaphore = this.P;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                d7.a aVar2 = d7.d.f111646a;
                if (!z) {
                    return;
                }
                semaphore.release();
                if (dVar.M == eVar.a()) {
                    return;
                }
            } catch (Throwable th10) {
                d7.a aVar3 = d7.d.f111646a;
                if (z) {
                    semaphore.release();
                    if (dVar.M != eVar.a()) {
                        threadPoolExecutor.execute(dVar2);
                    }
                }
                throw th10;
            }
        }
        d7.a aVar4 = d7.d.f111646a;
        if (z && B()) {
            A(eVar.a());
        }
        if (this.e) {
            try {
                if (this.f25604y) {
                    n(canvas, dVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                r7.c.f251932a.b();
            }
        } else if (this.f25604y) {
            n(canvas, dVar);
        } else {
            g(canvas);
        }
        this.M = false;
        d7.a aVar5 = d7.d.f111646a;
        if (z) {
            semaphore.release();
            if (dVar.M == eVar.a()) {
                return;
            }
            threadPoolExecutor.execute(dVar2);
        }
    }

    public final void e() {
        j jVar = this.f25588a;
        if (jVar == null) {
            return;
        }
        m0 m0Var = this.f25603x;
        int i = jVar.o;
        m0Var.getClass();
        int i2 = l0.f111698a[m0Var.ordinal()];
        boolean z = false;
        if (i2 != 1 && (i2 == 2 || i > 4)) {
            z = true;
        }
        this.f25604y = z;
    }

    public final void g(Canvas canvas) {
        n7.d dVar = this.f25598q;
        j jVar = this.f25588a;
        if (dVar == null || jVar == null) {
            return;
        }
        Matrix matrix = this.z;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / jVar.k.width(), r3.height() / jVar.k.height());
        }
        dVar.g(canvas, matrix, this.f25599r, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f25599r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        j jVar = this.f25588a;
        if (jVar == null) {
            return -1;
        }
        return jVar.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        j jVar = this.f25588a;
        if (jVar == null) {
            return -1;
        }
        return jVar.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final g i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f25593j == null) {
            g gVar = new g(getCallback(), this.f25595m);
            this.f25593j = gVar;
            String str = this.f25594l;
            if (str != null) {
                gVar.E0(str);
            }
        }
        return this.f25593j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.M) {
            return;
        }
        this.M = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        e eVar = this.f25589b;
        if (eVar == null) {
            return false;
        }
        return eVar.f251943m;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j7.a j() {
        /*
            r4 = this;
            j7.a r0 = r4.f25592h
            if (r0 == 0) goto L1d
            android.content.Context r1 = r4.h()
            android.content.Context r0 = r0.f171823a
            if (r1 != 0) goto Lf
            if (r0 != 0) goto L1a
            goto L1d
        Lf:
            boolean r2 = r0 instanceof android.app.Application
            if (r2 == 0) goto L17
            android.content.Context r1 = r1.getApplicationContext()
        L17:
            if (r1 != r0) goto L1a
            goto L1d
        L1a:
            r0 = 0
            r4.f25592h = r0
        L1d:
            j7.a r0 = r4.f25592h
            if (r0 != 0) goto L34
            j7.a r0 = new j7.a
            android.graphics.drawable.Drawable$Callback r1 = r4.getCallback()
            java.lang.String r2 = r4.i
            d7.j r3 = r4.f25588a
            java.util.Map r3 = r3.c()
            r0.<init>(r1, r2, r3)
            r4.f25592h = r0
        L34:
            j7.a r0 = r4.f25592h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieDrawable.j():j7.a");
    }

    public final void l() {
        this.f25591g.clear();
        e eVar = this.f25589b;
        eVar.h(true);
        Iterator it8 = eVar.f251938c.iterator();
        while (it8.hasNext()) {
            ((Animator.AnimatorPauseListener) it8.next()).onAnimationPause(eVar);
        }
        if (isVisible()) {
            return;
        }
        this.f = a0.NONE;
    }

    public final void m() {
        if (this.f25598q == null) {
            this.f25591g.add(new z() { // from class: d7.x
                @Override // d7.z
                public final void run() {
                    List list = LottieDrawable.S;
                    this.f111729a.m();
                }
            });
            return;
        }
        e();
        boolean zB = b(h());
        e eVar = this.f25589b;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f251943m = true;
                boolean zE = eVar.e();
                Iterator it8 = eVar.f251937b.iterator();
                while (it8.hasNext()) {
                    ((Animator.AnimatorListener) it8.next()).onAnimationStart(eVar, zE);
                }
                eVar.i((int) (eVar.e() ? eVar.b() : eVar.c()));
                eVar.f = 0L;
                eVar.i = 0;
                if (eVar.f251943m) {
                    eVar.h(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f = a0.NONE;
            } else {
                this.f = a0.PLAY;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it9 = S.iterator();
        i iVarD = null;
        while (it9.hasNext()) {
            iVarD = this.f25588a.d((String) it9.next());
            if (iVarD != null) {
                break;
            }
        }
        if (iVarD != null) {
            r((int) iVarD.f181772b);
        } else {
            r((int) (eVar.d < BitmapDescriptorFactory.HUE_RED ? eVar.c() : eVar.b()));
        }
        eVar.h(true);
        eVar.f(eVar.e());
        if (isVisible()) {
            return;
        }
        this.f = a0.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.graphics.Canvas r12, n7.d r13) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieDrawable.n(android.graphics.Canvas, n7.d):void");
    }

    public final List o(k7.f fVar) {
        if (this.f25598q == null) {
            r7.c.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f25598q.c(fVar, 0, arrayList, new k7.f(new String[0]));
        return arrayList;
    }

    public final void p() {
        if (this.f25598q == null) {
            this.f25591g.add(new z() { // from class: d7.u
                @Override // d7.z
                public final void run() {
                    List list = LottieDrawable.S;
                    this.f111723a.p();
                }
            });
            return;
        }
        e();
        boolean zB = b(h());
        e eVar = this.f25589b;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f251943m = true;
                eVar.h(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f = 0L;
                if (eVar.e() && eVar.f251940h == eVar.c()) {
                    eVar.i(eVar.b());
                } else if (!eVar.e() && eVar.f251940h == eVar.b()) {
                    eVar.i(eVar.c());
                }
                Iterator it8 = eVar.f251938c.iterator();
                while (it8.hasNext()) {
                    ((Animator.AnimatorPauseListener) it8.next()).onAnimationResume(eVar);
                }
                this.f = a0.NONE;
            } else {
                this.f = a0.RESUME;
            }
        }
        if (b(h())) {
            return;
        }
        r((int) (eVar.d < BitmapDescriptorFactory.HUE_RED ? eVar.c() : eVar.b()));
        eVar.h(true);
        eVar.f(eVar.e());
        if (isVisible()) {
            return;
        }
        this.f = a0.NONE;
    }

    public final boolean q(j jVar) {
        if (this.f25588a == jVar) {
            return false;
        }
        this.M = true;
        d();
        this.f25588a = jVar;
        c();
        e eVar = this.f25589b;
        boolean z = eVar.f251942l == null;
        eVar.f251942l = jVar;
        if (z) {
            eVar.j(Math.max(eVar.f251941j, jVar.f111683l), Math.min(eVar.k, jVar.f111684m));
        } else {
            eVar.j((int) jVar.f111683l, (int) jVar.f111684m);
        }
        float f = eVar.f251940h;
        eVar.f251940h = BitmapDescriptorFactory.HUE_RED;
        eVar.f251939g = BitmapDescriptorFactory.HUE_RED;
        eVar.i((int) f);
        eVar.g();
        A(eVar.getAnimatedFraction());
        ArrayList arrayList = this.f25591g;
        Iterator it8 = new ArrayList(arrayList).iterator();
        while (it8.hasNext()) {
            z zVar = (z) it8.next();
            if (zVar != null) {
                zVar.run();
            }
            it8.remove();
        }
        arrayList.clear();
        jVar.f111677a.f111688a = this.f25600s;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void r(int i) {
        if (this.f25588a != null) {
            this.f25589b.i(i);
        } else {
            this.f25591g.add(new p(this, i, 0));
        }
    }

    public final void s(int i) {
        if (this.f25588a == null) {
            this.f25591g.add(new p(this, i, 1));
        } else {
            e eVar = this.f25589b;
            eVar.j(eVar.f251941j, i + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f25599r = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        r7.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z3) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z3);
        if (z) {
            a0 a0Var = this.f;
            if (a0Var == a0.PLAY) {
                m();
                return visible;
            }
            if (a0Var == a0.RESUME) {
                p();
                return visible;
            }
        } else {
            if (this.f25589b.f251943m) {
                l();
                this.f = a0.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f = a0.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f25591g.clear();
        e eVar = this.f25589b;
        eVar.h(true);
        eVar.f(eVar.e());
        if (isVisible()) {
            return;
        }
        this.f = a0.NONE;
    }

    public final void t(String str) {
        j jVar = this.f25588a;
        if (jVar == null) {
            this.f25591g.add(new o(this, str, 1));
        } else {
            i iVarD = jVar.d(str);
            if (iVarD == null) {
                throw new IllegalArgumentException(p.a.p("Cannot find marker with name ", str, "."));
            }
            s((int) (iVarD.f181772b + iVarD.f181773c));
        }
    }

    public final void u(final int i, final int i2) {
        if (this.f25588a == null) {
            this.f25591g.add(new z() { // from class: d7.r
                @Override // d7.z
                public final void run() {
                    List list = LottieDrawable.S;
                    this.f111714a.u(i, i2);
                }
            });
        } else {
            this.f25589b.j(i, i2 + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(String str) {
        j jVar = this.f25588a;
        if (jVar == null) {
            this.f25591g.add(new o(this, str, 0));
            return;
        }
        i iVarD = jVar.d(str);
        if (iVarD == null) {
            throw new IllegalArgumentException(p.a.p("Cannot find marker with name ", str, "."));
        }
        int i = (int) iVarD.f181772b;
        u(i, ((int) iVarD.f181773c) + i);
    }

    public final void w(final String str, final String str2, final boolean z) {
        j jVar = this.f25588a;
        if (jVar == null) {
            this.f25591g.add(new z() { // from class: d7.v
                @Override // d7.z
                public final void run() {
                    List list = LottieDrawable.S;
                    this.f111724a.w(str, str2, z);
                }
            });
            return;
        }
        i iVarD = jVar.d(str);
        if (iVarD == null) {
            throw new IllegalArgumentException(p.a.p("Cannot find marker with name ", str, "."));
        }
        int i = (int) iVarD.f181772b;
        i iVarD2 = this.f25588a.d(str2);
        if (iVarD2 == null) {
            throw new IllegalArgumentException(p.a.p("Cannot find marker with name ", str2, "."));
        }
        u(i, (int) (iVarD2.f181772b + (z ? 1.0f : BitmapDescriptorFactory.HUE_RED)));
    }

    public final void x(final float f, final float f4) {
        j jVar = this.f25588a;
        if (jVar == null) {
            this.f25591g.add(new z() { // from class: d7.q
                @Override // d7.z
                public final void run() {
                    List list = LottieDrawable.S;
                    this.f111711a.x(f, f4);
                }
            });
        } else {
            int iF = (int) r7.g.f(jVar.f111683l, jVar.f111684m, f);
            j jVar2 = this.f25588a;
            u(iF, (int) r7.g.f(jVar2.f111683l, jVar2.f111684m, f4));
        }
    }

    public final void y(int i) {
        if (this.f25588a == null) {
            this.f25591g.add(new p(this, i, 2));
        } else {
            this.f25589b.j(i, (int) r0.k);
        }
    }

    public final void z(String str) {
        j jVar = this.f25588a;
        if (jVar == null) {
            this.f25591g.add(new o(this, str, 2));
        } else {
            i iVarD = jVar.d(str);
            if (iVarD == null) {
                throw new IllegalArgumentException(p.a.p("Cannot find marker with name ", str, "."));
            }
            y((int) iVarD.f181772b);
        }
    }
}
