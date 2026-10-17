package d72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationTerms;
import e72.f;
import e72.g;
import e72.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final MultibancoRegistrationStatus a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String status = gVar.getStatus();
        int iHashCode = status.hashCode();
        if (iHashCode != -1384838526) {
            if (iHashCode != -526380146) {
                if (iHashCode == 35394935 && status.equals("PENDING")) {
                    return MultibancoRegistrationStatus.Pending.f61944a;
                }
            } else if (status.equals("NOT_REGISTERED")) {
                h terms = gVar.getTerms();
                if (terms != null) {
                    return new MultibancoRegistrationStatus.NotRegistered(new MultibancoRegistrationTerms(terms.getId(), terms.getUrl()));
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (status.equals("REGISTERED")) {
            f details = gVar.getDetails();
            if (details == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String pin = details.getPin();
            String ids = details.getIds();
            String participantCode = details.getParticipantCode();
            String applicationCode = details.getApplicationCode();
            String bankHash = details.getBankHash();
            String revolutCardId = details.getRevolutCardId();
            if (revolutCardId == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String serviceCardNumber = details.getServiceCardNumber();
            if (serviceCardNumber != null) {
                return new MultibancoRegistrationStatus.Registered(pin, ids, participantCode, applicationCode, bankHash, revolutCardId, serviceCardNumber);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException(j6.a.q("Unknown Multibanco user registration status: ", gVar.getStatus()));
    }
}
