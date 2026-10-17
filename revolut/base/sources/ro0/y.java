package ro0;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;

/* JADX INFO: loaded from: classes19.dex */
public final class y extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to0.d f255790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f255791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f255792c;
    public RecyclerView d;
    public String e;
    public BitmapDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OneShotPreDrawListener f255793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OneShotPreDrawListener f255794h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f255795j;
    public final androidx.camera.viewfinder.a k;

    public y(to0.d delegateBlurProcessor, o0 excludeHolder) {
        Intrinsics.checkNotNullParameter(delegateBlurProcessor, "delegateBlurProcessor");
        Intrinsics.checkNotNullParameter(excludeHolder, "excludeHolder");
        this.f255790a = delegateBlurProcessor;
        this.f255791b = excludeHolder;
        this.f255792c = new LinkedHashMap();
        this.k = new androidx.camera.viewfinder.a(this, 23);
    }

    public final void a(RecyclerView recyclerView, String str, long j2) {
        if (d(recyclerView, str, j2)) {
            if (recyclerView.isAnimating()) {
                or0.g.b(recyclerView, new kp0.f0(this, recyclerView, str, j2));
                return;
            }
            w wVarF = f(recyclerView);
            BitmapDrawable bitmapDrawableA = ((to0.f) this.f255790a).a(str, recyclerView, wVarF.hashCode(), new v(this, recyclerView, 0));
            if (d(recyclerView, str, j2)) {
                this.f = bitmapDrawableA;
                this.f255795j = wVarF;
                for (View view : ViewGroupKt.getChildren(recyclerView)) {
                    if (!e(recyclerView, view)) {
                        LinkedHashMap linkedHashMap = this.f255792c;
                        if (!linkedHashMap.containsKey(view)) {
                            linkedHashMap.put(view, Integer.valueOf(view.getVisibility()));
                        }
                        view.setVisibility(4);
                    }
                }
                recyclerView.invalidateItemDecorations();
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        this.f = null;
        LinkedHashMap linkedHashMap = this.f255792c;
        for (View view : zhm.d0.d1(linkedHashMap.keySet())) {
            Integer num = (Integer) linkedHashMap.remove(view);
            if (num != null) {
                view.setVisibility(num.intValue());
            }
        }
        recyclerView.invalidateItemDecorations();
    }

    public final void c() {
        OneShotPreDrawListener oneShotPreDrawListener = this.f255793g;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.f255793g = null;
        OneShotPreDrawListener oneShotPreDrawListener2 = this.f255794h;
        if (oneShotPreDrawListener2 != null) {
            oneShotPreDrawListener2.removeListener();
        }
        this.f255794h = null;
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            b(recyclerView);
            androidx.camera.viewfinder.a aVar = this.k;
            recyclerView.removeOnLayoutChangeListener(aVar);
            Iterator it8 = ViewGroupKt.getChildren(recyclerView).iterator();
            while (it8.hasNext()) {
                ((View) it8.next()).removeOnLayoutChangeListener(aVar);
            }
            recyclerView.removeOnChildAttachStateChangeListener(this);
            recyclerView.removeItemDecoration(this);
        }
        this.d = null;
        this.e = null;
        this.f255795j = null;
    }

    public final boolean d(RecyclerView recyclerView, String str, long j2) {
        return this.i == j2 && this.d == recyclerView && Intrinsics.f(this.e, str);
    }

    public final boolean e(RecyclerView recyclerView, View view) {
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        Intrinsics.checkNotNullExpressionValue(childViewHolder, "getChildViewHolder(...)");
        return ((Boolean) this.f255791b.invoke(childViewHolder)).booleanValue();
    }

    public final w f(RecyclerView recyclerView) {
        return new w(recyclerView.getWidth(), recyclerView.getHeight(), nkm.y.J(nkm.y.x(nkm.y.n(ViewGroupKt.getChildren(recyclerView), new v(this, recyclerView, 1)), new rnd.k(17))));
    }

    public final void g() {
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            return;
        }
        OneShotPreDrawListener oneShotPreDrawListener = this.f255794h;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.f255794h = OneShotPreDrawListener.add(recyclerView, new r8.d(2, recyclerView, false, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            return;
        }
        if (recyclerView != null && e(recyclerView, view)) {
            view.addOnLayoutChangeListener(this.k);
        }
        if (this.f != null && !e(recyclerView, view)) {
            LinkedHashMap linkedHashMap = this.f255792c;
            if (!linkedHashMap.containsKey(view)) {
                linkedHashMap.put(view, Integer.valueOf(view.getVisibility()));
            }
            view.setVisibility(4);
        }
        g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this.k);
        Integer num = (Integer) this.f255792c.remove(view);
        if (num != null) {
            view.setVisibility(num.intValue());
        }
        g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        BitmapDrawable bitmapDrawable = this.f;
        if (bitmapDrawable == null) {
            return;
        }
        canvas.save();
        for (View view : ViewGroupKt.getChildren(parent)) {
            if (e(parent, view)) {
                canvas.clipOutRect(view.getTranslationX() + view.getLeft(), view.getTranslationY() + view.getTop(), view.getTranslationX() + view.getRight(), view.getTranslationY() + view.getBottom());
            }
        }
        bitmapDrawable.setBounds(0, 0, parent.getWidth(), parent.getHeight());
        bitmapDrawable.draw(canvas);
        canvas.restore();
    }
}
