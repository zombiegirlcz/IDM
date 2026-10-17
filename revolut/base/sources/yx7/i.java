package yx7;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CdnImage a(String str) {
        return com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, new ImageTransformations(null, null, null, null, null, 70, 70, 31), null, null, 28);
    }
}
