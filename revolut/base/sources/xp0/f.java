package xp0;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import es0.k;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import or0.q;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f307876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js0.b f307877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final js0.b f307878c;
    public final g d;
    public ValueAnimator e;
    public k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f307879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public uk.a f307880h;
    public x.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final js0.b f307881j;
    public final RuntimeShader k;

    public f(View view, js0.b onWhenViewReadyToBind, js0.b onEnd, g parameters) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onWhenViewReadyToBind, "onWhenViewReadyToBind");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f307876a = view;
        this.f307877b = onWhenViewReadyToBind;
        this.f307878c = onEnd;
        this.d = parameters;
        this.f307881j = new js0.b(new c(this, 1));
        this.k = t.a.c();
    }

    public final void a(View view, BitmapShader bitmapShader, float f, float f4, g gVar) {
        this.k.setInputShader("beforeTex", bitmapShader);
        this.k.setFloatUniform("resolution", view.getWidth(), view.getHeight());
        this.k.setFloatUniform("uProgress", f);
        this.k.setFloatUniform("uTime", f4);
        this.k.setFloatUniform("uDeformationIntensity", gVar.b());
        this.k.setFloatUniform("uTintIntensity", gVar.d());
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(this.k, "src");
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateRuntimeShaderEffect, "createRuntimeShaderEffect(...)");
        view.setRenderEffect(renderEffectCreateRuntimeShaderEffect);
    }

    public final void b() {
        uk.a aVar = this.f307880h;
        View view = this.f307876a;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
        this.f307880h = null;
        x.b bVar = this.i;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        this.i = null;
        k kVar = this.f;
        if (kVar != null) {
            view.removeOnAttachStateChangeListener(kVar);
        }
        this.f = null;
        this.f307881j.run();
        view.setRenderEffect(null);
        this.f307877b.run();
        this.f307878c.run();
    }

    public final void c() {
        View view = this.f307876a;
        try {
            Bitmap bitmapE = q.e(view, null);
            this.f307879g = bitmapE;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmapE, tileMode, tileMode);
            a(view, bitmapShader, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.d);
            this.f307877b.run();
            uk.a aVar = new uk.a(this, bitmapShader, 5);
            this.f307880h = aVar;
            view.postDelayed(aVar, this.d.c());
            k kVar = new k(this, 11);
            view.addOnAttachStateChangeListener(kVar);
            this.f = kVar;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "WaveAnimation", "error trying to copy bitmap for before state", e, h0Var);
            b();
        }
    }
}
