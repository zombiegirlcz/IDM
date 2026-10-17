package joi;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.i1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends RecyclerView.ItemDecoration implements Drawable.Callback {

    @NotNull
    private static final o Companion = new o();
    public static final int[] k = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f177113l = {R.attr.state_enabled};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f177114m = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f177115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f177116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fp0.l f177117c;
    public RecyclerView d;
    public f e;
    public RippleDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f177118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f177119h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f177120j;

    public p(Context context) {
        int color;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            int i = typedValue.resourceId;
            color = i != 0 ? ContextCompat.getColor(context, i) : typedValue.data;
        } else {
            color = 0;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        this.f177115a = colorStateListValueOf;
        this.f177116b = new Rect();
        this.f177117c = new fp0.l(this, 18);
        this.f177119h = 1.0f;
    }

    public final void a() {
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(this.f177117c);
        }
        RippleDrawable rippleDrawable = this.f;
        if (rippleDrawable != null) {
            rippleDrawable.setCallback(null);
        }
        RippleDrawable rippleDrawable2 = this.f;
        if (rippleDrawable2 != null) {
            rippleDrawable2.setState(f177114m);
        }
        this.f = null;
        this.e = null;
        this.f177118g = false;
        this.f177116b.setEmpty();
        RecyclerView recyclerView2 = this.d;
        if (recyclerView2 != null) {
            recyclerView2.invalidate();
        }
        this.d = null;
    }

    public final void b(f section) {
        Intrinsics.checkNotNullParameter(section, "section");
        if (this.e != section) {
            return;
        }
        this.f177118g = true;
        RippleDrawable rippleDrawable = this.f;
        if (rippleDrawable != null) {
            c(section, rippleDrawable);
        }
        RippleDrawable rippleDrawable2 = this.f;
        if (rippleDrawable2 != null) {
            rippleDrawable2.setState(f177113l);
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            fp0.l lVar = this.f177117c;
            recyclerView.removeCallbacks(lVar);
            recyclerView.postDelayed(lVar, 650L);
            recyclerView.invalidate();
        }
    }

    public final boolean c(f fVar, RippleDrawable rippleDrawable) {
        View view;
        ArrayList arrayList;
        fVar.getClass();
        View view2 = fVar.f177095b;
        Rect out = this.f177116b;
        Intrinsics.checkNotNullParameter(out, "out");
        ArrayList arrayList2 = fVar.f177096c;
        int size = arrayList2.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i = 0;
        boolean z = false;
        while (i < size) {
            View view3 = ((n) arrayList2.get(i)).f177110a;
            if (view3.getParent() != null) {
                Rect clipBounds = view3.getClipBounds();
                float x3 = view3.getX() + (clipBounds != null ? clipBounds.left : 0);
                view = view2;
                float y2 = view3.getY() + (clipBounds != null ? clipBounds.top : 0);
                arrayList = arrayList2;
                float x5 = view3.getX() + (clipBounds != null ? clipBounds.right : view3.getWidth());
                float y5 = view3.getY() + (clipBounds != null ? clipBounds.bottom : view3.getHeight());
                if (x3 < x5 && y2 < y5) {
                    if (z) {
                        x3 = Math.min(f, x3);
                        y2 = Math.min(f4, y2);
                        x5 = Math.max(f5, x5);
                        y5 = Math.max(f6, y5);
                    } else {
                        z = true;
                    }
                    f4 = y2;
                    f5 = x5;
                    f6 = y5;
                    f = x3;
                }
            } else {
                view = view2;
                arrayList = arrayList2;
            }
            i++;
            view2 = view;
            arrayList2 = arrayList;
        }
        View view4 = view2;
        if (!z) {
            return false;
        }
        out.set((int) Math.floor(f), (int) Math.floor(f4), (int) Math.ceil(f5), (int) Math.ceil(f6));
        this.f177119h = i1.b(1.0f, 1.015f, fVar.e);
        this.i = view4.getPivotX() + view4.getTranslationX() + view4.getLeft();
        this.f177120j = view4.getPivotY() + view4.getTranslationY() + view4.getTop();
        rippleDrawable.setBounds(out);
        rippleDrawable.setHotspotBounds(out.left, out.top, out.right, out.bottom);
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        RippleDrawable rippleDrawable;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        f fVar = this.e;
        if (fVar == null || (rippleDrawable = this.f) == null) {
            return;
        }
        if (c(fVar, rippleDrawable) || (this.f177118g && !this.f177116b.isEmpty())) {
            int iSave = canvas.save();
            float f = this.f177119h;
            canvas.scale(f, f, this.i, this.f177120j);
            rippleDrawable.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable who, Runnable what, long j2) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.postDelayed(what, Math.max(0L, j2 - SystemClock.uptimeMillis()));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable who, Runnable what) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(what);
        }
    }
}
