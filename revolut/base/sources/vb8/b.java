package vb8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public final ContactImage a(p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        String str = recurringPayment.f249318c;
        String str2 = recurringPayment.k;
        vua.a aVar = recurringPayment.f249330s;
        return new ContactImage(str, aVar != null ? aVar.e : null, aVar != null ? aVar.f : null, (String) null, (String) null, str2, (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3544);
    }
}
