package wo2;

import cli.y;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreen;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import wk2.x;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingRequestStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingRequestStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ProgressStepVerticalV2Delegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProgressStepVerticalV2Delegate.Model model = (ProgressStepVerticalV2Delegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarD3 = this.v.d();
        Object obj3 = model.f53016n;
        m mVar = (m) hVarD3;
        y yVar = mVar.f298875r;
        yo2.f fVar = obj3 instanceof yo2.f ? (yo2.f) obj3 : null;
        int i = fVar == null ? -1 : k.f298870a[fVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                yo2.i iVar = (yo2.i) ((g) ((j2) yVar.f22677a).getValue()).f298868b.getContent();
                if (iVar != null) {
                    mVar.C1(new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.NewRequest(iVar.f315546a)));
                }
            } else if (i == 2) {
                yo2.i iVar2 = (yo2.i) ((g) ((j2) yVar.f22677a).getValue()).f298868b.getContent();
                if (iVar2 != null) {
                    wn2.d dVar = iVar2.f315549g;
                    if (dVar == null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.b(rd0.c.WARNING, "BankAccountSwitchingRequestStatusScreenModel", "Tried to open Review Payments without a Switch Preference", null, null, 16);
                    } else {
                        mVar.f2(new BankAccountSwitchingPaymentsReviewScreen(new BankAccountSwitchingPaymentsReviewScreenContract$InputData(mVar.o.f63958a, iVar2.f315546a, dVar, iVar2.f315547b)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new x(mVar, 19));
                    }
                }
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f186387a;
    }
}
