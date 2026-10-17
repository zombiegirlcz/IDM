package mx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c {
    public static final ApmDescriptor a(qx1.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String type = jVar.getType();
        int iHashCode = type.hashCode();
        if (iHashCode != -1371765123) {
            if (iHashCode != 66081660) {
                if (iHashCode == 76105038 && type.equals("PHONE")) {
                    return new ApmDescriptor.Phone(jVar.getExternalIdentifier());
                }
            } else if (type.equals("EMAIL")) {
                return new ApmDescriptor.Email(jVar.getExternalIdentifier());
            }
        } else if (type.equals("TAX_NUMBER")) {
            return new ApmDescriptor.TaxNumber(jVar.getExternalIdentifier());
        }
        return new ApmDescriptor.ExternalId(jVar.getExternalIdentifier(), jVar.getType());
    }
}
