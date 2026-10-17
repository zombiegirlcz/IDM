package lji;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import au0.m1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import hx7.e;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import ny0.i;
import org.jetbrains.annotations.NotNull;
import ro0.d;
import ro0.d0;
import ro0.h;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f195673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to0.a f195674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f195675c;
    public final ImageView d;
    public Lazy e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m1 f195676g;

    public c(com.revolut.kompot.navigable.a controller, to0.c bitmapBlurProcessor) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(bitmapBlurProcessor, "bitmapBlurProcessor");
        this.f195673a = controller;
        this.f195674b = bitmapBlurProcessor;
        ImageView imageView = new ImageView(controller.D2().getContext());
        imageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        i.e(imageView);
        this.d = imageView;
    }

    public final BitmapDrawable a(Bitmap bitmap, View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new IllegalStateException("parentControllerView expected to have non-zero dimens");
        }
        ro0.b bVar = h.Companion;
        ImageView imageView = this.d;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        bVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        h hVar = kli.a.q(context) ? ro0.c.f255737a : d.f255740a;
        float f = f.f(((bitmap.getHeight() / height) + (bitmap.getWidth() / width)) / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new BitmapDrawable(this.f195673a.D2().getResources(), this.f195674b.a(context2, bitmap, hVar, f));
    }

    public final Drawable b(Bitmap bitmap, View view) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            objA = a(bitmap, view);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.h(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) objA;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        Context context = this.d.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ColorDrawable(kli.a.s(R$attr.uikit_windowBackground, context));
    }

    public final void c(float f) {
        View view;
        m1 m1Var;
        if (!this.f) {
            throw new IllegalStateException("Not initialised");
        }
        float f4 = f.f((f - 0.75f) / 0.25f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        ro0.b bVar = h.Companion;
        ImageView imageView = this.d;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        bVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        h style = kli.a.q(context) ? ro0.c.f255737a : d.f255740a;
        imageView.setAlpha(f4);
        imageView.setVisibility(imageView.getAlpha() == BitmapDescriptorFactory.HUE_RED ? 8 : 0);
        if (!this.f) {
            throw new IllegalStateException("Not initialised");
        }
        Lazy lazy = this.e;
        if (lazy == null) {
            throw new IllegalStateException("snapshotDrawableLazy expected");
        }
        if (imageView.getVisibility() == 0 && imageView.getDrawable() == null) {
            m1 m1Var2 = this.f195676g;
            if (m1Var2 != null) {
                m1Var2.cancel();
            }
            com.revolut.kompot.navigable.a aVar = this.f195673a.f98405m;
            View viewD2 = aVar != null ? aVar.D2() : imageView;
            if (!ViewCompat.isLaidOut(viewD2) || viewD2.isLayoutRequested()) {
                m1 m1Var3 = new m1(viewD2, this, lazy, 3);
                viewD2.addOnLayoutChangeListener(m1Var3);
                m1Var = m1Var3;
            } else {
                imageView.setImageDrawable((Drawable) lazy.getValue());
                m1Var = null;
            }
            this.f195676g = m1Var;
        }
        WeakReference weakReference = this.f195675c;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Lazy lazy2 = d0.f255743a;
        if (imageView.getAlpha() == 1.0f) {
            f = 0.0f;
        }
        float fC = style.c();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(style, "style");
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setRenderEffect(d0.c(context2, style, f, fC));
    }
}
