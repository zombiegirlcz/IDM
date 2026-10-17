package ro0;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Looper;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f255743a = yhm.j.b(new rm0.k(11));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f255744b = yhm.j.b(new rm0.k(12));

    private d0() {
    }

    public static RenderEffect a(int i, int i2, List list, int i3, float f) {
        RuntimeShader runtimeShaderG = b0.g(f255743a.getValue());
        runtimeShaderG.setFloatUniform("width", i);
        runtimeShaderG.setFloatUniform("height", i2);
        runtimeShaderG.setIntUniform("passDirection", i3);
        int iMin = Math.min(list.size(), 10);
        if (list.size() > 1) {
            Integer numValueOf = Integer.valueOf(((qo0.e) zhm.d0.b0(list)).f247969a);
            int size = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                Integer numValueOf2 = Integer.valueOf(((qo0.e) list.get(i5)).f247969a);
                if (cim.b.b(numValueOf2, numValueOf) < 0) {
                    list = zhm.d0.P0(list, new c0());
                    break;
                }
                i5++;
                numValueOf = numValueOf2;
            }
        }
        float[] fArr = new float[40];
        for (int i6 = 0; i6 < iMin; i6++) {
            qo0.e eVar = (qo0.e) list.get(i6);
            int i21 = i6 * 4;
            fArr[i21] = eVar.f247969a;
            int i22 = eVar.f247970b;
            if (i22 == Integer.MAX_VALUE) {
                i22 = i2;
            }
            fArr[i21 + 1] = i22;
            fArr[i21 + 2] = eVar.f247971c * f;
            fArr[i21 + 3] = eVar.d * f;
        }
        runtimeShaderG.setFloatUniform("layers", fArr);
        runtimeShaderG.setIntUniform("layerCount", iMin);
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShaderG, "src");
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateRuntimeShaderEffect, "run(...)");
        return renderEffectCreateRuntimeShaderEffect;
    }

    public static RenderEffect b(float f) {
        float f4 = f * 1.5f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f4, f4, Shader.TileMode.CLAMP);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        return renderEffectCreateBlurEffect;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    public static RenderEffect c(Context context, h style, float f, float f4) {
        RenderEffect renderEffectCreateColorFilterEffect;
        ColorMatrix colorMatrix;
        float[] fArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        float f5 = kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fL = kli.a.l(context, f4) * f5;
        RenderEffect renderEffectCreateColorFilterEffect2 = null;
        if (fL <= BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        RenderEffect renderEffectB = b(fL);
        float[] fArrB = style.b();
        if (fArrB != null) {
            if (f5 != 1.0f) {
                h.Companion.getClass();
                float[] fArr2 = (float[]) b.f255736b.getValue();
                if (Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
                    fArr = ksj.b.f189468b;
                    if (fArr == null) {
                        fArr = new float[20];
                        ksj.b.f189468b = fArr;
                    }
                } else {
                    fArr = new float[20];
                }
                int length = fArr.length;
                for (int i = 0; i < length; i++) {
                    float f6 = fArr2[i];
                    fArr[i] = j6.a.a(fArrB[i], f6, f5, f6);
                }
                fArrB = fArr;
            }
            if (Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
                colorMatrix = ksj.b.f189467a;
                if (colorMatrix == null) {
                    colorMatrix = new ColorMatrix();
                    ksj.b.f189467a = colorMatrix;
                }
            } else {
                colorMatrix = new ColorMatrix();
            }
            colorMatrix.set(fArrB);
            renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        } else {
            renderEffectCreateColorFilterEffect = null;
        }
        Integer numA = style.a();
        int iIntValue = (int) ((numA != null ? numA.intValue() >>> 24 : 0) * f5);
        if (iIntValue > 0 && numA != null) {
            renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(ColorUtils.setAlphaComponent(numA.intValue(), iIntValue), BlendMode.SRC_OVER));
        }
        if (renderEffectCreateColorFilterEffect != null) {
            renderEffectB = RenderEffect.createChainEffect(renderEffectB, renderEffectCreateColorFilterEffect);
        }
        Intrinsics.h(renderEffectB);
        if (renderEffectCreateColorFilterEffect2 == null) {
            return renderEffectB;
        }
        RenderEffect renderEffectCreateChainEffect = RenderEffect.createChainEffect(renderEffectCreateColorFilterEffect2, renderEffectB);
        Intrinsics.h(renderEffectCreateChainEffect);
        return renderEffectCreateChainEffect;
    }
}
