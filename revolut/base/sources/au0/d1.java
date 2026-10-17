package au0;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 {
    private d1() {
    }

    public static void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fL = kli.a.l(context, 150.0f);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fL, fL, Shader.TileMode.CLAMP);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        float height = view.getHeight();
        RenderEffect renderEffectF = a41.g0.f(new LinearGradient(BitmapDescriptorFactory.HUE_RED, height - (0.3f * height), BitmapDescriptorFactory.HUE_RED, height, Color.argb(0, 0, 0, 0), Color.argb(255, 0, 0, 0), tileMode));
        Intrinsics.checkNotNullExpressionValue(renderEffectF, "createShaderEffect(...)");
        BlendMode unused = BlendMode.DST_OUT;
        RenderEffect renderEffectG = a41.g0.g(renderEffectCreateBlurEffect, renderEffectF);
        Intrinsics.checkNotNullExpressionValue(renderEffectG, "createBlendModeEffect(...)");
        view.setRenderEffect(renderEffectG);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setAlpha(kli.a.q(context2) ? 0.5f : 0.2f);
    }
}
