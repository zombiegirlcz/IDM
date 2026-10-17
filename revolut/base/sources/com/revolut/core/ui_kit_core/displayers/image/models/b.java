package com.revolut.core.ui_kit_core.displayers.image.models;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static CdnImage a(ez0.a app, ImageTransformations transformations) {
        UrlImageDrawable.Shimmering.Companion companion = UrlImageDrawable.Shimmering.INSTANCE;
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        String strA = app.a();
        if (transformations.d == null) {
            transformations = ImageTransformations.a(transformations, null, null, gz0.b.CenterInside, LDSFile.EF_SOD_TAG);
        }
        return new CdnImage(strA, "mobile/apps", null, transformations, companion, null, 196);
    }

    public static CdnImage b(String id10) {
        gz0.b bVar = gz0.b.CenterInside;
        ImageTransformations transformations = new ImageTransformations(null, null, null, bVar, null, null, null, LDSFile.EF_SOD_TAG);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        String lowerCase = id10.toLowerCase(Locale.ROOT);
        String strP = t61.a.p(lowerCase, "toLowerCase(...)", "img_", lowerCase);
        if (transformations.d == null) {
            transformations = ImageTransformations.a(transformations, null, null, bVar, LDSFile.EF_SOD_TAG);
        }
        return new CdnImage(strP, "mobile/3d_icons", null, transformations, null, null, 196);
    }

    public static CdnImage c(String id10, ImageTransformations transformations, UrlImageDrawable.Shimmering.Companion companion, String str, int i) {
        if ((i & 2) != 0) {
            transformations = new ImageTransformations(null, null, null, gz0.b.CenterInside, null, null, null, LDSFile.EF_SOD_TAG);
        }
        UrlImageDrawable.Shimmering.Companion companion2 = (i & 4) != 0 ? null : companion;
        if ((i & 8) != 0) {
            str = "mobile/3d_images";
        }
        String path = str;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(path, "path");
        String lowerCase = id10.toLowerCase(Locale.ROOT);
        String strP = t61.a.p(lowerCase, "toLowerCase(...)", "img_", lowerCase);
        if (transformations.d == null) {
            transformations = ImageTransformations.a(transformations, null, null, gz0.b.CenterInside, LDSFile.EF_SOD_TAG);
        }
        return new CdnImage(strP, path, null, transformations, companion2, null, 196);
    }
}
