package fx0;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$attr;
import com.revolut.core.ui_kit.R$integer;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieColorOverride;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private b() {
    }

    public static List a(Context context) {
        a aVar;
        Intrinsics.checkNotNullParameter(context, "context");
        int integer = context.getResources().getInteger(R$integer.internal_confettiTinting_accent);
        int integer2 = context.getResources().getInteger(R$integer.internal_confettiTinting_pride);
        int i = R$attr.internal_confettiTinting;
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true) || typedValue.type == 16) {
            integer = typedValue.data;
        }
        if (integer == integer2) {
            aVar = new a(new Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorDeepPurple), new Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorOrange), new Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorRed), new Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorYellow), new Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorColdBlue), new Color.Solid(com.revolut.core.ui_kit_resources.R$attr.uikit_colorGreen));
        } else {
            int iS = kli.a.s(com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent, context);
            float[] fArr = new float[3];
            android.graphics.Color.colorToHSV(iS, fArr);
            fArr[1] = f.f(fArr[1] - 0.2f, BitmapDescriptorFactory.HUE_RED, 1.0f);
            int iHSVToColor = android.graphics.Color.HSVToColor(fArr);
            android.graphics.Color.colorToHSV(iS, fArr);
            fArr[1] = f.f(fArr[1] - 0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f);
            int iHSVToColor2 = android.graphics.Color.HSVToColor(fArr);
            aVar = new a(new Color.SolidInt(iS), new Color.SolidInt(iS), new Color.SolidInt(iHSVToColor), new Color.SolidInt(iHSVToColor), new Color.SolidInt(iHSVToColor2), new Color.SolidInt(iHSVToColor2));
        }
        Float f = null;
        int i2 = 12;
        ez0.f fVar = null;
        return v.k(new LottieColorOverride(v.k("Color1", "**"), aVar.f138716a, null, null, 12), new LottieColorOverride(v.k("Color2", "**"), aVar.f138717b, fVar, f, i2), new LottieColorOverride(v.k("Color3", "**"), aVar.f138718c, fVar, f, i2), new LottieColorOverride(v.k("Color4", "**"), aVar.d, fVar, f, i2), new LottieColorOverride(v.k("Color5", "**"), aVar.e, fVar, f, i2), new LottieColorOverride(v.k("Color6", "**"), aVar.f, fVar, f, i2));
    }
}
