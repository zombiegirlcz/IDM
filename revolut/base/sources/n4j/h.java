package n4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o71.a f212457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zq.a f212458b;

    public h(o71.a beneficiaryRepository, zq.a formattingValidator, j searchListSelectionUtils) {
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(formattingValidator, "formattingValidator");
        Intrinsics.checkNotNullParameter(searchListSelectionUtils, "searchListSelectionUtils");
        this.f212457a = beneficiaryRepository;
        this.f212458b = formattingValidator;
    }

    public static BeneficiaryInfoState a(BeneficiaryInfoState beneficiaryInfoState, List list, s4j.b bVar) {
        if (beneficiaryInfoState instanceof BeneficiaryInfoState.BankRecipient) {
            return BeneficiaryInfoState.BankRecipient.z((BeneficiaryInfoState.BankRecipient) beneficiaryInfoState, null, null, null, list, bVar, null, 39);
        }
        if (beneficiaryInfoState instanceof BeneficiaryInfoState.CreditCardBeneficiary) {
            if (bVar == s4j.b.Personal) {
                return BeneficiaryInfoState.CreditCardBeneficiary.z((BeneficiaryInfoState.CreditCardBeneficiary) beneficiaryInfoState, null, null, list, 7);
            }
            throw new IllegalStateException("Can't patch CreditCardBeneficiary with Business account type");
        }
        if (beneficiaryInfoState instanceof BeneficiaryInfoState.MobileWallet) {
            return BeneficiaryInfoState.MobileWallet.z((BeneficiaryInfoState.MobileWallet) beneficiaryInfoState, null, null, null, list, bVar, 23);
        }
        if (!(beneficiaryInfoState instanceof BeneficiaryInfoState.PaymentVendor)) {
            throw new NoWhenBranchMatchedException();
        }
        if (bVar == s4j.b.Personal) {
            return BeneficiaryInfoState.PaymentVendor.z((BeneficiaryInfoState.PaymentVendor) beneficiaryInfoState, null, null, null, list, 23);
        }
        throw new IllegalStateException("Can't patch PaymentVendor with Business account type");
    }

    public static BeneficiaryInfoState b(BeneficiaryInfoState infoState, Field$BackendDefinition updatedField) {
        Intrinsics.checkNotNullParameter(infoState, "infoState");
        Intrinsics.checkNotNullParameter(updatedField, "updatedField");
        List listB = infoState.getF99711g();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (Object obj2 : listB) {
            if (Intrinsics.f(((Field$BackendDefinition) obj2).getF99718a(), updatedField.getF99718a())) {
                obj2 = updatedField;
            }
            arrayList.add(obj2);
        }
        return a(infoState, arrayList, infoState.getF99705c());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b A[LOOP:0: B:36:0x0125->B:38:0x012b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0104 -> B:35:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r18, wi0.b r19, java.util.Map r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4j.h.c(java.util.List, wi0.b, java.util.Map, gim.c):java.lang.Object");
    }
}
