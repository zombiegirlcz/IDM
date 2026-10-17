package joe;

import com.revolut.feature.tax_residency.impl.v2.models.Checkmark;
import com.revolut.feature.tax_residency.impl.v2.models.Exemption;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.feature.tax_residency.impl.v2.models.Popup;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class q {
    public static final Checkmark a(ioe.a aVar) {
        kpe.a aVar2;
        String type = aVar.getType();
        kpe.a[] aVarArrValues = kpe.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar2 = null;
                break;
            }
            aVar2 = aVarArrValues[i];
            if (a0.z(aVar2.name(), type, true)) {
                break;
            }
            i++;
        }
        if (aVar2 == null) {
            aVar2 = kpe.a.POINT;
        }
        return new Checkmark(aVar2, aVar.getLocalisation());
    }

    public static final Exemption b(ioe.f fVar) {
        ExemptionReason exemptionReason;
        String reason = fVar.getReason();
        ExemptionReason[] exemptionReasonArrValues = ExemptionReason.values();
        int length = exemptionReasonArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                exemptionReason = null;
                break;
            }
            exemptionReason = exemptionReasonArrValues[i];
            if (a0.z(exemptionReason.name(), reason, true)) {
                break;
            }
            i++;
        }
        if (exemptionReason == null) {
            return null;
        }
        ioe.h beforeSubmitPopup = fVar.getBeforeSubmitPopup();
        return new Exemption(exemptionReason, beforeSubmitPopup != null ? c(beforeSubmitPopup) : null);
    }

    public static final Popup c(ioe.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new Popup(hVar.getTitle(), hVar.getSubtitle(), hVar.getPrimaryAction(), hVar.getSecondaryAction());
    }
}
