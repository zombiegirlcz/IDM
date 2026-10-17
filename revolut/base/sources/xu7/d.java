package xu7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final RowDelegate.Model.MainImage.Image24 a(f01.a aVar, String resKey, Integer num) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        ResourceImage resourceImageB = b(aVar, resKey, num);
        if (resourceImageB != null) {
            return new RowDelegate.Model.MainImage.Image24(resourceImageB, false, false, 6);
        }
        return null;
    }

    public static final ResourceImage b(f01.a aVar, String resKey, Integer num) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        Integer numC = c(aVar, resKey);
        if (numC != null) {
            return new ResourceImage(numC.intValue(), (Integer) null, (Integer) null, num, (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        return null;
    }

    public static final Integer c(f01.a aVar, String resKey) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        int iA = aVar.a(resKey);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            return null;
        }
        return numValueOf;
    }
}
