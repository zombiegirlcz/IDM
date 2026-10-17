package guf;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k71.i f146927w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c cVar, k71.i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f146927w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, this.f146927w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            TransferRequestApprovalData transferRequestApprovalData = cVar.f92477t.f79597a;
            if (transferRequestApprovalData instanceof TransferRequestApprovalData.GroupBillsApproval) {
                cVar.C1(u0.b(gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))));
                return Unit.f186387a;
            }
            if (!(transferRequestApprovalData instanceof TransferRequestApprovalData.MoneyRequestApproval)) {
                throw new NoWhenBranchMatchedException();
            }
            b bVar = cVar.u;
            MoneyRequest moneyRequest = ((TransferRequestApprovalData.MoneyRequestApproval) transferRequestApprovalData).f92452b;
            this.u = 1;
            obj2 = ((m) bVar).g(moneyRequest, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ManualTransferRecipient manualTransferRecipient = (ManualTransferRecipient) obj2;
        if (manualTransferRecipient instanceof ManualTransferRecipient.Apm) {
            cVar.C1(u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((v3a.b) cVar.v).e(this.f146927w, new ChatTransferRecipient.ApmTransferRecipient(((ManualTransferRecipient.Apm) manualTransferRecipient).f92458a)))));
        } else if (manualTransferRecipient instanceof ManualTransferRecipient.Internal) {
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c.O2(cVar, new SocialPaymentsFeatureConfig.PaymentsProfileChat(((ManualTransferRecipient.Internal) manualTransferRecipient).f92460a, (TransferMoneyPocket) null, (StartAction.ShowBottomDialog) null, false, 30));
        } else if (manualTransferRecipient instanceof ManualTransferRecipient.BankBeneficiary) {
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c.O2(cVar, new SocialPaymentsFeatureConfig.TransferOnlyChat(new ChatTransferRecipient.BeneficiaryRecipient(((ManualTransferRecipient.BankBeneficiary) manualTransferRecipient).f92459a, null)));
        } else {
            if (manualTransferRecipient != null) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.C1(u0.b(gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))));
        }
        return Unit.f186387a;
    }
}
