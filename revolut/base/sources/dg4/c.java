package dg4;

import bg4.u;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import dk9.a0;
import dn8.f;
import dpd.k;
import dr2.m;
import dz6.q;
import e0a.w;
import e65.v;
import e8e.x;
import e9d.z;
import gim.i;
import io.fotoapparat.exception.camera.CameraException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import m1c.l0;
import mr6.g;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f114579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f114580x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(dyb.a aVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 15;
        this.f114579w = aVar;
        this.f114580x = (i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a) this.f114579w, (u) this.f114580x, continuation, 0);
            case 1:
                return new c((d) this.f114579w, (String) this.f114580x, continuation, 1);
            case 2:
                return new c((a0) this.f114579w, (String) this.f114580x, continuation, 2);
            case 3:
                return new c((com.revolut.feature.contacts.impl.ui.contact.screen.details.a) this.f114579w, (iy9.b) this.f114580x, continuation, 3);
            case 4:
                return new c((f) this.f114580x, continuation, 4);
            case 5:
                return new c((com.revolut.feature.user_declarations.shared.flows.pep.a) this.f114579w, (com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.a) this.f114580x, continuation, 5);
            case 6:
                return new c((dpd.c) this.f114579w, (k) this.f114580x, continuation, 6);
            case 7:
                return new c((com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a) this.f114580x, continuation, 7);
            case 8:
                return new c((m) this.f114579w, (CameraException) this.f114580x, continuation, 8);
            case 9:
                return new c((com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a) this.f114579w, (JuniorBankingProfile) this.f114580x, continuation, 9);
            case 10:
                return new c((com.revolut.feature.credit.card.impl.ui.instalment.hub.a) this.f114579w, (yx4.b) this.f114580x, continuation, 10);
            case 11:
                return new c((com.revolut.feature.insurance_credit.impl.ui.flow.a) this.f114579w, (String) this.f114580x, continuation, 11);
            case 12:
                return new c((dtl.m) this.f114579w, (InvestOrder) this.f114580x, continuation, 12);
            case 13:
                return new c((com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) this.f114579w, (String) this.f114580x, continuation, 13);
            case 14:
                return new c((com.revolut.feature.freelancer.impl.ui.extension.a) this.f114579w, (g) this.f114580x, continuation, 14);
            case 15:
                return new c((dyb.a) this.f114579w, (Function1) this.f114580x, continuation);
            case 16:
                return new c((q) this.f114579w, this.f114580x, continuation, 16);
            case 17:
                return new c((dzb.i) this.f114579w, (l0) this.f114580x, continuation, 17);
            case 18:
                return new c((e0a.q) this.f114579w, (cu9.b) this.f114580x, continuation, 18);
            case 19:
                return new c((w) this.f114579w, (du9.a) this.f114580x, continuation, 19);
            case 20:
                return new c((P2PChatItem) this.f114579w, (w) this.f114580x, continuation, 20);
            case 21:
                return new c((e0c.a) this.f114580x, continuation, 21);
            case 22:
                return new c((e0c.a) this.f114580x, continuation, 22);
            case 23:
                return new c((v) this.f114579w, (String) this.f114580x, continuation, 23);
            case 24:
                return new c((e69.u) this.f114579w, (ApmPaymentAuthorisationPendingAction) this.f114580x, continuation, 24);
            case 25:
                return new c((com.revolut.feature.apm.multibanco.impl.ui.pay.a) this.f114579w, (String) this.f114580x, continuation, 25);
            case 26:
                return new c((x) this.f114579w, (List) this.f114580x, continuation, 26);
            case 27:
                return new c((x) this.f114579w, (sua.b) this.f114580x, continuation, 27);
            case 28:
                return new c((z) this.f114579w, this.f114580x, continuation, 28);
            default:
                return new c((z) this.f114579w, (String) this.f114580x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:320:0x0652, code lost:
    
        if (r2.equals("id_credit_card_instalment_action_overdue") == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x068c, code lost:
    
        if (r2.equals("id_action_item_new") != false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06fe, code lost:
    
        if (r2.equals("id_credit_card_instalment_action_overdue_exceeded") == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0701, code lost:
    
        r0.C2(new ds4.o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x072c, code lost:
    
        if (r2.equals("id_button_create") == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x072f, code lost:
    
        r0.C2(ds4.i.f117212a);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x09c2  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r9v36, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dg4.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f114579w = obj2;
        this.f114580x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f114580x = obj2;
    }
}
