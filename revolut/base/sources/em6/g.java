package em6;

import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData, com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData = this.u;
        boolean z = crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData instanceof CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Institution;
        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar = this.v;
        if (z) {
            CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Institution institution = (CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Institution) crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
            CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Institution.PaymentInfo paymentInfo = institution.e;
            eVar.n2(new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.d(eVar, institution.f72257a, institution.f72258b, new se6.b(paymentInfo.f72260a, paymentInfo.f72261b, paymentInfo.f72262c, paymentInfo.d, institution.d), institution.f, null), new whi.b(6));
        } else {
            if (!(crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData instanceof CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Branch)) {
                throw new NoWhenBranchMatchedException();
            }
            CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Branch branch = (CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.Branch) crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e.I2(eVar, branch.e, branch.f, branch.f72255g, branch.f72256h, branch.f72252a);
        }
        return Unit.f186387a;
    }
}
