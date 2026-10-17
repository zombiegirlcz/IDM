package qx1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final iy1.a a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        ApmDescriptor apmDescriptorA = mx1.c.a(aVar.getContact());
        ApmContact.SimpleState simpleStateB = b(aVar, "Aani");
        if (simpleStateB == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String alias = eVar != null ? eVar.getAlias() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        String contactName = eVar2 != null ? eVar2.getContactName() : null;
        e eVar3 = (e) aVar.getAttributeBag();
        return new iy1.a(beneficiaryId, apmDescriptorA, contactName, alias, simpleStateB, eVar3 != null ? Intrinsics.f(eVar3.getCanBePayer(), Boolean.TRUE) : false);
    }

    public static final ApmContact.SimpleState b(a aVar, String tag2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        String state = aVar.getState();
        int iHashCode = state.hashCode();
        if (iHashCode != -2026521607) {
            if (iHashCode != -526380146) {
                if (iHashCode == 1925346054 && state.equals("ACTIVE")) {
                    return ApmContact.State.ACTIVE.f62099a;
                }
            } else if (state.equals("NOT_REGISTERED")) {
                return null;
            }
        } else if (state.equals("DELETED")) {
            if (aVar.getBeneficiaryId() != null) {
                return ApmContact.State.DELETED.f62100a;
            }
            String externalIdentifier = aVar.getContact().getExternalIdentifier();
            String type = aVar.getContact().getType();
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.w(p.a.t(tag2, " contact DELETED state without id: externalIdentifier=", externalIdentifier, ", contactType=", type), ", beneficiaryId=", aVar.getBeneficiaryId(), ", state=", aVar.getState()));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(a0.d.s("Unknown ", tag2, " contact discovery state: ", aVar.getState()));
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jy1.c c(qx1.a r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qx1.b.c(qx1.a):jy1.c");
    }

    public static final iy1.b d(a aVar) {
        ApmContact.SimpleState simpleStateB;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        j contact = aVar.getContact();
        Intrinsics.checkNotNullParameter(contact, "<this>");
        ApmDescriptor.Phone phone = Intrinsics.f(contact.getType(), "PHONE") ? new ApmDescriptor.Phone(contact.getExternalIdentifier()) : null;
        if (phone == null || (simpleStateB = b(aVar, "Blik")) == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String alias = eVar != null ? eVar.getAlias() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        return new iy1.b(beneficiaryId, phone, eVar2 != null ? eVar2.getContactName() : null, alias, simpleStateB);
    }

    public static final iy1.c e(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        ApmDescriptor apmDescriptorA = mx1.c.a(aVar.getContact());
        ApmContact.SimpleState simpleStateB = b(aVar, "Bre-B");
        if (simpleStateB == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String alias = eVar != null ? eVar.getAlias() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        String contactName = eVar2 != null ? eVar2.getContactName() : null;
        e eVar3 = (e) aVar.getAttributeBag();
        return new iy1.c(beneficiaryId, apmDescriptorA, contactName, alias, simpleStateB, eVar3 != null ? eVar3.getIssuingEntityName() : null);
    }

    public static final iy1.d f(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        ApmDescriptor apmDescriptorA = mx1.c.a(aVar.getContact());
        ApmContact.SimpleState simpleStateB = b(aVar, "Iris");
        if (simpleStateB == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String alias = eVar != null ? eVar.getAlias() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        String contactName = eVar2 != null ? eVar2.getContactName() : null;
        e eVar3 = (e) aVar.getAttributeBag();
        return new iy1.d(beneficiaryId, apmDescriptorA, contactName, alias, simpleStateB, eVar3 != null ? eVar3.getIdentityType() : null);
    }

    public static final iy1.e g(a aVar) {
        ApmContact.SimpleState simpleStateB;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        j contact = aVar.getContact();
        Intrinsics.checkNotNullParameter(contact, "<this>");
        ApmDescriptor.Phone phone = Intrinsics.f(contact.getType(), "PHONE") ? new ApmDescriptor.Phone(contact.getExternalIdentifier()) : null;
        if (phone == null || (simpleStateB = b(aVar, "Multibanco")) == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String alias = eVar != null ? eVar.getAlias() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        return new iy1.e(beneficiaryId, phone, eVar2 != null ? eVar2.getContactName() : null, alias, simpleStateB);
    }

    public static final iy1.f h(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        ApmDescriptor apmDescriptorA = mx1.c.a(aVar.getContact());
        ApmContact.SimpleState simpleStateB = b(aVar, "Pix");
        if (simpleStateB == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String contactName = eVar != null ? eVar.getContactName() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        String alias = eVar2 != null ? eVar2.getAlias() : null;
        String aliasResolutionId = aVar.getAliasResolutionId();
        e eVar3 = (e) aVar.getAttributeBag();
        String issuingEntityName = eVar3 != null ? eVar3.getIssuingEntityName() : null;
        e eVar4 = (e) aVar.getAttributeBag();
        String identityType = eVar4 != null ? eVar4.getIdentityType() : null;
        e eVar5 = (e) aVar.getAttributeBag();
        String identificationValue = eVar5 != null ? eVar5.getIdentificationValue() : null;
        e eVar6 = (e) aVar.getAttributeBag();
        return new iy1.f(beneficiaryId, apmDescriptorA, contactName, simpleStateB, alias, aliasResolutionId, issuingEntityName, identityType, identificationValue, eVar6 != null ? Intrinsics.f(eVar6.getContactChanged(), Boolean.TRUE) : false);
    }

    public static final iy1.h i(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        ApmDescriptor apmDescriptorA = mx1.c.a(aVar.getContact());
        ApmContact.SimpleState simpleStateB = b(aVar, "Qvik");
        ApmRecipientSettings apmRecipientSettings = null;
        if (simpleStateB == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String alias = eVar != null ? eVar.getAlias() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        String contactName = eVar2 != null ? eVar2.getContactName() : null;
        e eVar3 = (e) aVar.getAttributeBag();
        boolean z = !(eVar3 != null ? Intrinsics.f(eVar3.getCanBePayer(), Boolean.FALSE) : false);
        e eVar4 = (e) aVar.getAttributeBag();
        if (eVar4 != null) {
            Intrinsics.checkNotNullParameter(eVar4, "<this>");
            if (Intrinsics.f(eVar4.getRequestBlockingSupported(), Boolean.TRUE)) {
                Boolean blockIncomingMoneyRequest = eVar4.getBlockIncomingMoneyRequest();
                apmRecipientSettings = new ApmRecipientSettings(new ApmRecipientSettingsValue.BlockIncomingMoneyRequests(blockIncomingMoneyRequest != null ? blockIncomingMoneyRequest.booleanValue() : false));
            }
        }
        return new iy1.h(beneficiaryId, apmDescriptorA, contactName, alias, simpleStateB, z, apmRecipientSettings);
    }

    public static final iy1.i j(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        ApmDescriptor apmDescriptorA = mx1.c.a(aVar.getContact());
        ApmContact.SimpleState simpleStateB = b(aVar, "Spin");
        if (simpleStateB == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String alias = eVar != null ? eVar.getAlias() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        return new iy1.i(beneficiaryId, apmDescriptorA, eVar2 != null ? eVar2.getContactName() : null, alias, simpleStateB);
    }

    public static final iy1.j k(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String beneficiaryId = aVar.getBeneficiaryId();
        ApmDescriptor apmDescriptorA = mx1.c.a(aVar.getContact());
        ApmContact.SimpleState simpleStateB = b(aVar, "Wero");
        if (simpleStateB == null) {
            return null;
        }
        e eVar = (e) aVar.getAttributeBag();
        String alias = eVar != null ? eVar.getAlias() : null;
        e eVar2 = (e) aVar.getAttributeBag();
        String contactName = eVar2 != null ? eVar2.getContactName() : null;
        e eVar3 = (e) aVar.getAttributeBag();
        return new iy1.j(beneficiaryId, apmDescriptorA, contactName, alias, simpleStateB, eVar3 != null ? Intrinsics.f(eVar3.getCanBePayer(), Boolean.TRUE) : false);
    }
}
