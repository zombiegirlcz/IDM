package t02;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDestinationContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class e {
    public static final ApmPaymentDestinationContact a(ApmContact apmContact) {
        Intrinsics.checkNotNullParameter(apmContact, "<this>");
        return new ApmPaymentDestinationContact(apmContact.getF62158b().getF62112a(), apmContact.getF62158b().getF62102a(), apmContact.getDisplayName(), apmContact.getF62130g().getType());
    }

    public static final String b(ApmContact apmContact) {
        Intrinsics.checkNotNullParameter(apmContact, "<this>");
        ApmIdentifier f62095a = apmContact.getF62157a();
        ApmIdentifier.Uuid uuid = f62095a instanceof ApmIdentifier.Uuid ? (ApmIdentifier.Uuid) f62095a : null;
        if (uuid != null) {
            return uuid.f62112a;
        }
        return null;
    }
}
