package com.revolut.core.ui_kit.drawables;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import sdl.y;
import sp0.e;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/AnimatedDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Companion", "sp0/e", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnimatedDrawable extends Drawable implements Animatable {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f55746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55747c;
    public final Object d;

    public static final class a {
        private a() {
        }
    }

    public AnimatedDrawable(List layers, Function0 animatorFactory) {
        y onAnimationEnd = new y(29);
        Intrinsics.checkNotNullParameter(layers, "layers");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        Intrinsics.checkNotNullParameter(animatorFactory, "animatorFactory");
        this.f55745a = layers;
        this.f55746b = onAnimationEnd;
        this.f55747c = 255;
        this.d = w.y0(new s86.a(animatorFactory, this, 23));
        int size = layers.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) layers.get(i);
            eVar.getClass();
            Intrinsics.checkNotNullParameter(this, "host");
            eVar.d = this;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AnimatedDrawable animatedDrawable = this;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        List list = animatedDrawable.f55745a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            e eVar = (e) list.get(i);
            Rect bounds = animatedDrawable.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            int i2 = animatedDrawable.f55747c;
            Drawable drawable = eVar.f264861a;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            e eVar2 = eVar.f264863c;
            float f = eVar2 != null ? eVar2.e : 1.0f;
            float f4 = eVar2 != null ? eVar2.f : 1.0f;
            float f5 = eVar2 != null ? eVar2.f264864g : 1.0f;
            float f6 = eVar.e * f;
            float f32 = eVar.f * f4;
            float f35 = eVar.f264864g * f5;
            if (f6 > BitmapDescriptorFactory.HUE_RED && f32 > BitmapDescriptorFactory.HUE_RED && f35 > BitmapDescriptorFactory.HUE_RED) {
                drawable.setAlpha(f.g((int) (i2 * f35), 0, 255));
                canvas.save();
                if (eVar2 != null) {
                    canvas.scale(f, f4, (bounds.width() * eVar2.f264862b) + bounds.left, (bounds.height() * 0.5f) + bounds.top);
                }
                canvas.scale(eVar.e, eVar.f, (bounds.width() * eVar.f264862b) + bounds.left, (bounds.height() * 0.5f) + bounds.top);
                drawable.draw(canvas);
                canvas.restore();
            }
            i++;
            animatedDrawable = this;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Integer num;
        Iterator it8 = this.f55745a.iterator();
        if (it8.hasNext()) {
            Integer numValueOf = Integer.valueOf(((e) it8.next()).f264861a.getIntrinsicHeight());
            while (it8.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((e) it8.next()).f264861a.getIntrinsicHeight());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Integer num;
        Iterator it8 = this.f55745a.iterator();
        if (it8.hasNext()) {
            Integer numValueOf = Integer.valueOf(((e) it8.next()).f264861a.getIntrinsicWidth());
            while (it8.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((e) it8.next()).f264861a.getIntrinsicWidth());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return ((Animator) this.d.getValue()).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        List list = this.f55745a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((e) list.get(i)).f264861a.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55747c = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        List list = this.f55745a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((e) list.get(i)).f264861a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        List list = this.f55745a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((e) list.get(i)).f264861a.setTintList(colorStateList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ?? r06 = this.d;
        if (((Animator) r06.getValue()).isRunning()) {
            ((Animator) r06.getValue()).cancel();
        }
        ((Animator) r06.getValue()).start();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ((Animator) this.d.getValue()).cancel();
    }
}
