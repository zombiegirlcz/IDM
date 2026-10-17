package fu0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.app.AppCompatActivity;
import au0.n4;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.h1;
import ix0.i2;
import ix0.j2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends View implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f138054m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f138055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f138056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f138057c;
    public final Paint d;
    public final Paint e;
    public ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f138058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f138059h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f138060j;
    public Runnable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f138061l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f138055a = context;
        this.f138056b = new AccelerateInterpolator();
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(kli.a.s(R$attr.uikit_colorGroupedBackground_80, context));
        this.e = paint2;
        fp0.l lVar = new fp0.l(this, 1);
        this.f138059h = new int[2];
        this.f138061l = -1;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setAlpha(0.001f);
        setLayerType(1, null);
        setOnClickListener(this);
        j2.Companion.getClass();
        i2.a(this, lVar);
    }

    public final void a(boolean z) {
        a aVar = this.f138057c;
        if (aVar != null) {
            aVar.remove();
        }
        this.f138057c = null;
        Activity activityI = z92.f.i(this.f138055a);
        if (activityI == null || activityI.isDestroyed() || activityI.isFinishing() || this.f == null) {
            return;
        }
        Runnable runnable = this.k;
        if (runnable != null) {
            h1.e(runnable);
        }
        this.k = null;
        this.f = null;
        if (!isInLayout()) {
            b(z);
            return;
        }
        n4 n4Var = new n4(this, z, 1);
        h1.b(n4Var);
        this.k = n4Var;
    }

    public final void b(boolean z) {
        this.k = null;
        if (z) {
            this.f138061l = 0;
            c cVar = new c(this);
            animate().alpha(0.001f).setDuration(300L).setInterpolator(this.f138056b).setListener(cVar).setUpdateListener(cVar).start();
            return;
        }
        if (!this.i) {
            this.i = true;
            b bVar = this.f138060j;
            if (bVar != null) {
                rr0.g gVar = (rr0.g) bVar;
                Intrinsics.checkNotNullParameter(this, "view");
                if (gVar.d == null) {
                    rr0.g.h(gVar, false, false, 2);
                }
            }
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public final boolean c() {
        return this.i;
    }

    public final void d() {
        if (this.f138061l == 0) {
            return;
        }
        this.f138061l = 1;
        animate().cancel();
        animate().alpha(1.0f).setDuration(300L).setInterpolator(this.f138056b).setListener(null).setUpdateListener(new d(this)).start();
    }

    public final void e(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Activity activityI = z92.f.i(this.f138055a);
        AppCompatActivity appCompatActivity = activityI instanceof AppCompatActivity ? (AppCompatActivity) activityI : null;
        if (this.f138057c == null && appCompatActivity != null) {
            a aVar = new a(this, 0);
            this.f138057c = aVar;
            appCompatActivity.getOnBackPressedDispatcher().addCallback(aVar);
        }
        if (this.f138061l == 0) {
            animate().cancel();
            if (getAlpha() != 0.001f) {
                setAlpha(0.001f);
                invalidate();
            }
        }
        this.f138061l = -1;
        if (Intrinsics.f(this.f, parent)) {
            return;
        }
        this.f = parent;
        Runnable runnable = this.k;
        if (runnable != null) {
            h1.e(runnable);
        }
        this.k = null;
        if (parent.isInLayout()) {
            d0.c cVar = new d0.c(this, parent, 17);
            h1.b(cVar);
            this.k = cVar;
            return;
        }
        this.k = null;
        this.i = false;
        ViewParent parent2 = getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        parent.addView(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f138060j;
        if (bVar != null) {
            ((rr0.g) bVar).d(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g[] gVarArrB;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (getAlpha() > 0.001f) {
            canvas.drawPaint(this.e);
            h hVar = this.f138058g;
            if (hVar == null || (gVarArrB = hVar.b()) == null) {
                return;
            }
            for (g gVar : gVarArrB) {
                gVar.b(canvas, this.d);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setCallback(@NotNull b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f138060j = callback;
    }

    public final void setTarget(h hVar) {
        if (hVar == this.f138058g) {
            return;
        }
        this.f138058g = hVar;
        p.q(0, this.f138059h);
        invalidate();
    }
}
