package fm2;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.WallpaperImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import em2.d;
import em2.e;
import em2.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import oz0.b;
import oz0.c;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final NavBarWithContainerBackground a(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            return new NavBarWithContainerBackground.ImageBackground(new WallpaperImage(dVar.f127578b, dVar.f127579c, null, dVar.f, dVar.d, dVar.e), dVar.f127581h, (Color.SolidRes) null, 12);
        }
        if (eVar instanceof f) {
            f fVar = (f) eVar;
            return new NavBarWithContainerBackground.VideoBackground(new UrlVideo(fVar.f127584b, fVar.f127585c, fVar.f, b.CENTER_CROP, false, (c) null, 112), new UrlImage(fVar.d, fVar.e, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 507900), (VideoShutter) null, fVar.f127586g, 20);
        }
        if (!(eVar instanceof em2.c)) {
            if (Intrinsics.f(eVar, e.a.f127582a)) {
                return NavBarWithContainerBackground.TransparentBackground.f57882a;
            }
            throw new NoWhenBranchMatchedException();
        }
        em2.c cVar = (em2.c) eVar;
        return new NavBarWithContainerBackground.ImageBackground(cVar.f127575b, cVar.e, cVar.f127576c, cVar.d);
    }
}
