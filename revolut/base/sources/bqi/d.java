package bqi;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface d {
    static void H(d dVar, float f, String title) {
        c cVar = (c) dVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        cVar.N(title, null, null, Float.valueOf(f), false);
    }

    static void w(d dVar, LottieImage image, String title, String str) {
        c cVar = (c) dVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        cVar.N(title, str, image, null, true);
    }
}
