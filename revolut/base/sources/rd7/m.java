package rd7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public abstract class m {
    public static final Image a(h hVar, gz0.b scaleType) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (hVar instanceof f) {
            return new FileImage(new File(((f) hVar).f253364a), FileImage.Placeholder.Shimmering.f59921a, new ImageTransformations(null, null, null, scaleType, null, null, null, LDSFile.EF_SOD_TAG), 8);
        }
        if (!(hVar instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        g gVar = (g) hVar;
        String str = gVar.f253366a;
        boolean z = gVar.f253367b;
        return new UrlImage(str, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, gVar.f253368c, (Integer) null, (Integer) null, (ez0.h) null, (Image) ShimmerImage.f60002a, z, false, new ImageTransformations(null, null, null, scaleType, null, null, null, LDSFile.EF_SOD_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 514522);
    }
}
