package dl9;

import aii.e;
import aii.g;
import aii.u;
import al9.h;
import com.revolut.feature.pay_with_photo.api.PayWithPhotoApi$Toggles$PayWithPhoto;
import com.revolut.feature.pay_with_photo.api.PayWithPhotoApi$Toggles$PayWithPhotoSaveFileAttachment;
import com.revolut.feature.pay_with_photo.api.PayWithPhotoApi$Toggles$PayWithPhotoTransactionDetailsFileAttachment;
import com.revolut.feature.pay_with_photo.impl.ui.preview.PayWithPhotoPreviewController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof h)) {
            return null;
        }
        h hVar = (h) descriptor;
        return hVar.a(new PayWithPhotoPreviewController(hVar.f6169a));
    }

    @Override // nte.a
    public final List e() {
        return v.k(PayWithPhotoApi$Toggles$PayWithPhoto.f78941c, PayWithPhotoApi$Toggles$PayWithPhotoTransactionDetailsFileAttachment.f78943c, PayWithPhotoApi$Toggles$PayWithPhotoSaveFileAttachment.f78942c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
