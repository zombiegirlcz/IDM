package rak;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import sak.h;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final Image a(PaymentMethodDetails.Creditor creditor) {
        Intrinsics.checkNotNullParameter(creditor, "<this>");
        String str = creditor.d;
        return str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902) : h.f261451a;
    }
}
