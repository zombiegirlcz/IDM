package jr0;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f177903h = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f177905b;
    public final e d;
    public d e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public es0.k f177907g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f177906c = f0.f322471a;
    public final ihm.f f = v0.a.d("create(...)");

    public g(View view) {
        this.f177904a = view;
        this.d = new e(view);
    }

    public final void a() {
        ValueAnimator valueAnimator;
        b bVar = this.f177905b;
        if (bVar != null && (valueAnimator = bVar.d) != null) {
            valueAnimator.cancel();
        }
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    public final void b() {
        f177903h.remove(this);
        if (this.f177905b == null && this.e == null && this.f177906c.isEmpty() && this.f177907g == null) {
            return;
        }
        es0.k kVar = this.f177907g;
        if (kVar != null) {
            this.f177904a.removeOnAttachStateChangeListener(kVar);
        }
        this.f177907g = null;
        d dVar = this.e;
        if (dVar != null) {
            dVar.a();
        }
        this.e = null;
        this.f177905b = null;
        ?? r06 = this.f177906c;
        this.f177906c = f0.f322471a;
        int size = r06.size();
        for (int i = 0; i < size; i++) {
            ((l) r06.get(i)).b();
        }
        this.f.onNext(Boolean.FALSE);
    }

    public final void c() {
        d(new c(this.f177904a));
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    public final void d(c cVar) {
        if (this.f177905b != null) {
            return;
        }
        View view = this.f177904a;
        Context context = view.getContext();
        Intrinsics.h(context);
        Intrinsics.checkNotNullParameter(context, "context");
        kr0.c cVarS = i2b.a.s(context);
        boolean z = cVarS.f188628b;
        int i = cVarS.f188627a;
        this.f177905b = Build.VERSION.SDK_INT >= 33 ? new a(context, i, z) : new k(context, i, z);
        aim.e eVarB = u.b();
        eVarB.add(new m(view));
        if (cVar != null) {
            eVarB.add(cVar);
        }
        this.f177906c = u.a(eVarB);
        e(true);
        int i2 = 5;
        es0.k kVar = new es0.k(this, i2);
        view.addOnAttachStateChangeListener(kVar);
        this.f177907g = kVar;
        f177903h.add(this);
        ?? r142 = this.f177906c;
        int size = r142.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((l) r142.get(i3)).onStart();
        }
        d dVar = new d(view, this);
        View view2 = dVar.f177895a;
        ViewGroup viewGroup = (ViewGroup) view2.getRootView().findViewById(R.id.content);
        if (viewGroup != null) {
            dVar.d = viewGroup;
            viewGroup.getOverlay().add(dVar);
            dVar.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
            viewGroup.addOnLayoutChangeListener(dVar.f);
            if (view2.getViewTreeObserver().isAlive()) {
                view2.getViewTreeObserver().addOnPreDrawListener(dVar.e);
            }
        }
        this.e = dVar;
        this.f.onNext(Boolean.TRUE);
        b bVar = this.f177905b;
        if (bVar != null) {
            Rect bounds = this.d.f177902h;
            jnf.d onUpdate = new jnf.d(this, i2);
            jj2.a onEnd = new jj2.a(this, 9);
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(onEnd, "onEnd");
            ValueAnimator valueAnimator = bVar.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            Context context2 = bVar.f177886a;
            Intrinsics.checkNotNullParameter(bounds, "<this>");
            long jI = (long) (kotlin.ranges.f.i((long) (((Math.log((((double) kli.a.z((bounds.height() + bounds.width()) * 2, context2)) * 0.0086d) + 1.5d) * 1.042d) + 0.5d) * ((double) 1000)), 2000L, 4000L) * 1.2f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(bVar, onUpdate, 16));
            valueAnimatorOfFloat.addListener(new l5(onEnd, 11));
            valueAnimatorOfFloat.setDuration(jI);
            valueAnimatorOfFloat.setInterpolator(null);
            bVar.d = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        }
    }

    public final void e(boolean z) {
        b strategy = this.f177905b;
        if (strategy != null) {
            e eVar = this.d;
            PathMeasure pathMeasure = eVar.d;
            RectF rectF = eVar.e;
            Path path = eVar.f177900c;
            Rect rect = eVar.f177902h;
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Rect rect2 = eVar.f177899b;
            Outline outline = eVar.f177898a;
            outline.setEmpty();
            View view = eVar.f177901g;
            if (view.getClipToOutline()) {
                ViewOutlineProvider outlineProvider = view.getOutlineProvider();
                if (outlineProvider != null) {
                    outlineProvider.getOutline(view, outline);
                }
            } else {
                Drawable background = view.getBackground();
                if (background != null) {
                    if (background.getBounds().left != 0 || background.getBounds().top != 0 || background.getBounds().right != view.getWidth() || background.getBounds().bottom != view.getHeight()) {
                        background.setBounds(0, 0, view.getWidth(), view.getHeight());
                    }
                    background.getOutline(outline);
                }
            }
            if (!outline.getRect(rect2)) {
                rect2.set(0, 0, view.getWidth(), view.getHeight());
            }
            boolean zIsEmpty = outline.isEmpty();
            float radius = BitmapDescriptorFactory.HUE_RED;
            if (!zIsEmpty && outline.getRadius() >= BitmapDescriptorFactory.HUE_RED) {
                radius = outline.getRadius();
            }
            if (!z && Intrinsics.f(rect2, rect) && radius == eVar.f) {
                return;
            }
            rect.set(rect2);
            eVar.f = radius;
            rectF.set(rect);
            path.reset();
            path.addRoundRect(rectF, radius, radius, Path.Direction.CW);
            pathMeasure.setPath(path, false);
            strategy.b(pathMeasure, pathMeasure.getLength(), rect, radius);
        }
    }
}
