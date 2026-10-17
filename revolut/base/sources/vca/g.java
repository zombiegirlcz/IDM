package vca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements j8a.b {
    public final PixIdentifiedType.Valid a(ApmDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ApmDescriptor.Email) {
            return new PixIdentifiedType.Valid.Email(((ApmDescriptor.Email) descriptor).f62107b);
        }
        if (descriptor instanceof ApmDescriptor.Phone) {
            return new PixIdentifiedType.Valid.Phone(((ApmDescriptor.Phone) descriptor).f62110b, false);
        }
        if (!(descriptor instanceof ApmDescriptor.ExternalId)) {
            return null;
        }
        ApmDescriptor.ExternalId externalId = (ApmDescriptor.ExternalId) descriptor;
        String str = externalId.f62108b;
        String str2 = externalId.f62109c;
        int iHashCode = str2.hashCode();
        if (iHashCode == 66937) {
            if (str2.equals("CPF")) {
                return new PixIdentifiedType.Valid.Cpf(str);
            }
            return null;
        }
        if (iHashCode == 69055) {
            if (str2.equals("EVP")) {
                return new PixIdentifiedType.Valid.Random(str);
            }
            return null;
        }
        if (iHashCode == 2073509 && str2.equals("CNPJ")) {
            return new PixIdentifiedType.Valid.Cnpj(str);
        }
        return null;
    }

    public final ApmDescriptor b(PixIdentifiedType.Valid identifiedType) {
        Intrinsics.checkNotNullParameter(identifiedType, "identifiedType");
        if (identifiedType instanceof PixIdentifiedType.Valid.Email) {
            return new ApmDescriptor.Email(((PixIdentifiedType.Valid.Email) identifiedType).f50355b);
        }
        if (identifiedType instanceof PixIdentifiedType.Valid.Phone) {
            return new ApmDescriptor.Phone(((PixIdentifiedType.Valid.Phone) identifiedType).f50356b);
        }
        if ((identifiedType instanceof PixIdentifiedType.Valid.Cnpj) || (identifiedType instanceof PixIdentifiedType.Valid.Cpf) || (identifiedType instanceof PixIdentifiedType.Valid.Random)) {
            return new ApmDescriptor.ExternalId(identifiedType.getF50358b(), identifiedType.f50352a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
