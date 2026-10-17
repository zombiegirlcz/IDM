package isf;

import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonRecipientIdentification;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import gk3.i;
import hx7.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.f;
import zm3.l;
import zm3.n;
import zm3.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static TransferReasonsRequest a(bsf.e input) {
        TransferReasonRecipientIdentification beneficiaryId;
        String strS;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof bsf.b) {
            beneficiaryId = new TransferReasonRecipientIdentification.BeneficiaryId(((bsf.b) input).e.f132329a);
        } else {
            TransferReasonRecipientIdentification.Code code = null;
            if (!(input instanceof bsf.c)) {
                if (input instanceof bsf.d) {
                    zm3.a aVar = ((bsf.d) input).e;
                    if (aVar instanceof l) {
                        String code2 = ((l) aVar).getCode();
                        if (code2.length() <= 0) {
                            code2 = null;
                        }
                        if (code2 != null) {
                            code = new TransferReasonRecipientIdentification.Code(code2);
                        }
                    } else if (!(aVar instanceof f) && !(aVar instanceof o) && !(aVar instanceof zm3.e) && !(aVar instanceof n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(input instanceof bsf.a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            beneficiaryId = code;
        }
        if (beneficiaryId != null) {
            return new TransferReasonsRequest.ForTransferWithIdentification(input.d(), input.b(), b(input), beneficiaryId, input.a().f92240a, null);
        }
        long jD = input.d();
        xi0.b bVarB = input.b();
        String str = input.a().f92240a;
        i iVarB = b(input);
        if (input instanceof bsf.b) {
            strS = f5j.c.b(((bsf.b) input).e);
            if (strS == null) {
                strS = "";
            }
        } else if (input instanceof bsf.c) {
            strS = ((bsf.c) input).e.f81493g.e;
        } else if (input instanceof bsf.d) {
            strS = q.s(((bsf.d) input).e);
        } else {
            if (!(input instanceof bsf.a)) {
                throw new NoWhenBranchMatchedException();
            }
            strS = ((bsf.a) input).e.f297794a;
        }
        return new TransferReasonsRequest.ForTransferWithCountry(jD, bVarB, iVarB, strS, str, null);
    }

    public static i b(bsf.e eVar) {
        if (eVar instanceof bsf.b) {
            return i.BANK_TRANSFER;
        }
        if (eVar instanceof bsf.c) {
            return i.CARD_TRANSFER;
        }
        if (eVar instanceof bsf.d) {
            return ((bsf.d) eVar).e instanceof l ? i.INTERNAL_TRANSFER : i.TRANSFER_LINK;
        }
        if (eVar instanceof bsf.a) {
            return i.BANK_TRANSFER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
