package wx1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ApmDescriptor a(String str, String value) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (str.hashCode()) {
            case -1371765123:
                if (str.equals("TAX_NUMBER")) {
                    return new ApmDescriptor.TaxNumber(value);
                }
                break;
            case 2240262:
                if (str.equals("IBAN")) {
                    return new ApmDescriptor.BankAccount.IBAN(value);
                }
                break;
            case 66081660:
                if (str.equals("EMAIL")) {
                    return new ApmDescriptor.Email(value);
                }
                break;
            case 76105038:
                if (str.equals("PHONE")) {
                    return new ApmDescriptor.Phone(value);
                }
                break;
            case 1176976827:
                if (str.equals("ACCOUNT_NUMBER")) {
                    return new ApmDescriptor.BankAccount.AccountNumber(value);
                }
                break;
        }
        return new ApmDescriptor.ExternalId(value, str);
    }

    public static final ApmIdentifier b(String str, String value) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return Intrinsics.f(str, "ID") ? new ApmIdentifier.Uuid(value) : a(str, value);
    }

    public static final String c(ApmDescriptor apmDescriptor) {
        Intrinsics.checkNotNullParameter(apmDescriptor, "<this>");
        return apmDescriptor.getF62102a();
    }

    public static final String d(ApmIdentifier apmIdentifier) {
        Intrinsics.checkNotNullParameter(apmIdentifier, "<this>");
        if (apmIdentifier instanceof ApmIdentifier.Uuid) {
            return "ID";
        }
        if (apmIdentifier instanceof ApmDescriptor) {
            return ((ApmDescriptor) apmIdentifier).getF62102a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ApmContact.SimpleState e(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = e.f300734b[bVar.ordinal()];
        if (i == 1) {
            return ApmContact.State.ACTIVE.f62099a;
        }
        if (i == 2) {
            return ApmContact.State.DELETED.f62100a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final b f(ApmContact.SimpleState simpleState) {
        Intrinsics.checkNotNullParameter(simpleState, "<this>");
        if (Intrinsics.f(simpleState, ApmContact.State.ACTIVE.f62099a)) {
            return b.ACTIVE;
        }
        if (Intrinsics.f(simpleState, ApmContact.State.DELETED.f62100a)) {
            return b.DELETED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
