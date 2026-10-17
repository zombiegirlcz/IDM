package fkg;

import android.content.Context;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xjg.j;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f135826a;

    public c(a colorProvider) {
        Intrinsics.checkNotNullParameter(colorProvider, "colorProvider");
        this.f135826a = colorProvider;
    }

    public final Image a(j colorTheme, boolean z, Context context) {
        Float fValueOf = Float.valueOf(24.0f);
        Context context2 = (Context) this.f135826a.f135824b;
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        if (b.f135825a[colorTheme.ordinal()] == 1) {
            if (z) {
                throw new IllegalStateException("premium label is not supported for the dynamic theme");
            }
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i = R$drawable.uikit_icn_24_smartphone;
            Integer numValueOf = Integer.valueOf(R$attr.uikit_colorWhite);
            Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
            if (context == null) {
                context = context2;
            }
            return LayeredImage.Companion.c(companion, i, numValueOf, new Color.SolidInt(colorTheme.a(context)), 8.0f, fValueOf, 32);
        }
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        if (context == null) {
            context = context2;
        }
        int iA = colorTheme.a(context);
        if (!z) {
            return new ResourceImage(R$drawable.uikit_icn_circle_background, (Integer) null, Integer.valueOf(iA), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        }
        LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
        int i2 = R$drawable.uikit_icn_24_premium;
        int i3 = R$attr.uikit_colorWhite;
        Color.SolidInt backgroundColor = new Color.SolidInt(iA);
        companion2.getClass();
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return LayeredImage.Companion.m(i2, new Color.Solid(i3), backgroundColor, 8.0f, 8.0f, 8.0f, 8.0f, fValueOf, null);
    }
}
