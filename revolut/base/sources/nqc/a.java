package nqc;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;
import kqc.f;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final UrlImage a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String d = fVar.getD();
        if (d != null) {
            return new UrlImage(d, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
        }
        return null;
    }
}
