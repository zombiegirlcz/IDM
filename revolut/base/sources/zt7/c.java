package zt7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final RowDelegate.Model.MainImage.Image24 a(f01.a aVar, String resKey, Integer num) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        int iA = aVar.a(resKey);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            numValueOf = null;
        }
        ResourceImage resourceImage = numValueOf != null ? new ResourceImage(numValueOf.intValue(), (Integer) null, (Integer) null, num, (List) null, (ImageTransformations) null, (Clause) null, 246) : null;
        if (resourceImage != null) {
            return new RowDelegate.Model.MainImage.Image24(resourceImage, false, false, 6);
        }
        return null;
    }
}
