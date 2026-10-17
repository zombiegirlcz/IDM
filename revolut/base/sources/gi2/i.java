package gi2;

import android.print.PrintDocumentAdapter;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkData;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import gk9.o;
import gld.f0;
import gq4.r;
import hh6.p;
import hi2.n;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f144068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f144069x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Continuation continuation, l lVar) {
        super(1, continuation);
        this.u = i;
        this.f144068w = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v43, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((com.revolut.feature.apm.wero.impl.ui.pay.b) this.f144069x, (String) this.f144068w, continuation, 0);
            case 1:
                return new i((gic.h) this.f144069x, (String) this.f144068w, continuation, 1);
            case 2:
                return new i((gjh.e) this.f144069x, (WealthAccount) this.f144068w, continuation, 2);
            case 3:
                return new i(3, continuation, (o) this.f144068w);
            case 4:
                return new i(4, continuation, (com.revolut.feature.external_accounts.impl.ui.consents_kompot.c) this.f144068w);
            case 5:
                return new i((f0) this.f144069x, (Function1) this.f144068w, continuation);
            case 6:
                return new i((gm7.d) this.f144069x, (String) this.f144068w, continuation, 6);
            case 7:
                return new i((r) this.f144069x, (gq4.h) this.f144068w, continuation, 7);
            case 8:
                return new i((gq9.f) this.f144069x, (File) this.f144068w, continuation, 8);
            case 9:
                return new i((gqh.e) this.f144069x, (String) this.f144068w, continuation, 9);
            case 10:
                return new i((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) this.f144069x, (vzi.a) this.f144068w, continuation, 10);
            case 11:
                return new i((gu1.o) this.f144069x, (c02.j) this.f144068w, continuation, 11);
            case 12:
                return new i((com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f144069x, (String) this.f144068w, continuation, 12);
            case 13:
                return new i((gvj.b) this.f144069x, (puj.g) this.f144068w, continuation, 13);
            case 14:
                return new i((gw1.e) this.f144069x, (Alias) this.f144068w, continuation, 14);
            case 15:
                return new i(15, continuation, (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) this.f144068w);
            case 16:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.f144069x, (l84.e) this.f144068w, continuation, 16);
            case 17:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.f144069x, (Ref$BooleanRef) this.f144068w, continuation, 17);
            case 18:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.f144069x, (ks8.i) this.f144068w, continuation, 18);
            case 19:
                return new i(19, continuation, (h64.c) this.f144068w);
            case 20:
                return new i((h96.j) this.f144069x, (PrintDocumentAdapter) this.f144068w, continuation, 20);
            case 21:
                return new i((Function2) this.f144069x, (hba.l) this.f144068w, continuation);
            case 22:
                return new i((com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d) this.f144069x, (String) this.f144068w, continuation, 22);
            case 23:
                return new i((com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) this.f144069x, (TransferArrivalRequest) this.f144068w, continuation, 23);
            case 24:
                return new i((com.revolut.feature.retail.reverywhere.impl.onboarding.a) this.f144069x, (List) this.f144068w, continuation, 24);
            case 25:
                return new i((com.revolut.feature.retail.salary_account.impl.salary_hub.a) this.f144069x, (Function0) this.f144068w, continuation, 25);
            case 26:
                return new i((com.revolut.feature.shared_separate_favourites.converter.ui.flow.b) this.f144069x, (igd.c) this.f144068w, continuation, 26);
            case 27:
                return new i(27, continuation, (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b) this.f144068w);
            case 28:
                return new i((p) this.f144069x, (hh6.i) this.f144068w, continuation, 28);
            default:
                return new i((n) this.f144069x, (CreateRequestLinkData) this.f144068w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v96, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b] */
    /* JADX WARN: Type inference failed for: r8v5, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi2.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(f0 f0Var, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 5;
        this.f144069x = f0Var;
        this.f144068w = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f144069x = obj2;
        this.f144068w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Function2 function2, hba.l lVar, Continuation continuation) {
        super(1, continuation);
        this.u = 21;
        this.f144069x = (gim.i) function2;
        this.f144068w = lVar;
    }
}
