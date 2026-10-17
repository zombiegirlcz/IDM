package j54;

import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import k50.j4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.k3;

/* JADX INFO: loaded from: classes22.dex */
public final class v0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f171572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f171573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f171574y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i, Object obj2, String str, Continuation continuation, oki.h hVar) {
        super(1, continuation);
        this.u = i;
        this.f171573x = hVar;
        this.f171574y = obj2;
        this.f171572w = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0464 A[EDGE_INSN: B:257:0x0464->B:194:0x0464 BREAK  A[LOOP:1: B:185:0x0445->B:258:?]] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022a  */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.v0.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        llb.f fVar = (llb.f) this.f171573x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            hlb.j jVar = fVar.f196697p;
            String str = (String) this.f171572w;
            String str2 = fVar.o.f83212a.f86509b;
            this.v = 1;
            obj2 = ((hlb.d) jVar).Z2(this.f171574y, str, str2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        hlb.i iVar = (hlb.i) obj2;
        if (!Intrinsics.f(iVar, hlb.g.f153430a)) {
            if (!Intrinsics.f(iVar, hlb.h.f153431a)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar.B2();
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        lnk.n nVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            lnk.n nVar2 = (lnk.n) this.f171572w;
            ufm.i iVarC = ((rre.d) nVar2.f197305r).c((TermsScope) this.f171574y, null);
            this.f171573x = nVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (lnk.n) this.f171573x;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return nVar.C1(zh9.u0.b((NaviCommand) obj2));
    }

    private final Object o(Object obj2) {
        ly6.c cVar = (ly6.c) this.f171573x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        tji.f fVarQ2 = cVar.q2();
        ly6.b bVar = new ly6.b(cVar, (FreelancerInvoiceSettings) this.f171572w, (jy6.h) this.f171574y, null);
        this.v = 1;
        Object objB0 = zh9.u0.b0(fVarQ2, "BUTTON_TAG_SAVE", bVar, this);
        return objB0 == aVar ? aVar : objB0;
    }

    private final Object p(Object obj2) {
        ChatTransferRecipient chatTransferRecipient = (ChatTransferRecipient) this.f171572w;
        m0a.k kVar = (m0a.k) this.f171573x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = 1;
            obj2 = m0a.k.Z2(kVar, chatTransferRecipient, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        m0a.d dVar = (m0a.d) obj2;
        if (dVar instanceof m0a.a) {
            return kVar.A2(zh9.u0.b(((m0a.a) dVar).f201111a));
        }
        if (dVar instanceof m0a.c) {
            kVar.f201127p.Z2(((m0a.c) dVar).f201113a);
            return Unit.f186387a;
        }
        if (Intrinsics.f(dVar, m0a.b.f201112a)) {
            return kVar.r2().M0(new m0a.e(chatTransferRecipient, (ChatItem) this.f171574y));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v0((y0) this.f171573x, (String) this.f171572w, (til.r) this.f171574y, continuation, 0);
            case 1:
                return new v0((com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) this.f171573x, (String) this.f171572w, (String) this.f171574y, continuation, 1);
            case 2:
                return new v0((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d) this.f171573x, (String) this.f171572w, (xy3.x) this.f171574y, continuation, 2);
            case 3:
                return new v0((jh6.g) this.f171573x, (String) this.f171572w, (dj0.d) this.f171574y, continuation, 3);
            case 4:
                return new v0((jh9.p) this.f171573x, (PaymentData) this.f171572w, (TransferScheduleData) this.f171574y, continuation, 4);
            case 5:
                return new v0((com.revolut.feature.external_accounts.impl.ui.flow.link_external.b) this.f171573x, (String) this.f171574y, continuation);
            case 6:
                return new v0((jt4.i) this.f171573x, (String) this.f171572w, (String) this.f171574y, continuation, 6);
            case 7:
                return new v0((j4) this.f171573x, (UUID) this.f171572w, (t50.i) this.f171574y, continuation, 7);
            case 8:
                return new v0((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b) this.f171573x, (mh4.o) this.f171572w, (CreditToRefinanceSelectionScreen) this.f171574y, continuation, 8);
            case 9:
                return new v0((com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) this.f171573x, (String) this.f171572w, (wk5.a) this.f171574y, continuation, 9);
            case 10:
                return new v0((kkk.t) this.f171572w, (TermsScope) this.f171574y, continuation, 10);
            case 11:
                return new v0((kkk.t) this.f171572w, (hha.d) this.f171574y, continuation, 11);
            case 12:
                return new v0((ks9.b0) this.f171573x, (PaymentGroup) this.f171572w, (ArrayList) this.f171574y, continuation, 12);
            case 13:
                return new v0((ks9.f0) this.f171573x, (PaymentGroup) this.f171572w, (st9.b) this.f171574y, continuation, 13);
            case 14:
                return new v0((k3) this.f171573x, (TopupMethodType) this.f171572w, (dj0.d) this.f171574y, continuation, 14);
            case 15:
                return new v0((k3) this.f171573x, (vye.d) this.f171572w, (dj0.d) this.f171574y, continuation, 15);
            case 16:
                return new v0((com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) this.f171573x, (String) this.f171572w, (Function1) this.f171574y, continuation);
            case 17:
                return new v0((l7j.z) this.f171573x, (Exception) this.f171572w, (ExchangeOrderDraft) this.f171574y, continuation, 17);
            case 18:
                return new v0((z87.f) this.f171573x, (aii.r) this.f171572w, (o97.b) this.f171574y, continuation, 18);
            case 19:
                return new v0(19, (BackendFlowFile) this.f171574y, (String) this.f171572w, continuation, (com.revolut.core.backend_flow.impl.ui.form_screen.a) this.f171573x);
            case 20:
                return new v0((ldh.m) this.f171573x, (nel.t0) this.f171572w, (ArrayList) this.f171574y, continuation, 20);
            case 21:
                return new v0((com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.a) this.f171573x, (wi0.b) this.f171572w, (ybi.b) this.f171574y, continuation, 21);
            case 22:
                return new v0((lhk.e0) this.f171573x, (zfk.m) this.f171572w, (lhk.k) this.f171574y, continuation, 22);
            case 23:
                return new v0((com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a) this.f171573x, (Set) this.f171572w, (Set) this.f171574y, continuation, 23);
            case 24:
                return new v0((ll9.f) this.f171572w, (File) this.f171574y, continuation, 24);
            case 25:
                llb.f fVar = (llb.f) this.f171573x;
                return new v0(25, this.f171574y, (String) this.f171572w, continuation, fVar);
            case 26:
                return new v0((lnk.n) this.f171572w, (TermsScope) this.f171574y, continuation, 26);
            case 27:
                return new v0((ly6.c) this.f171573x, (FreelancerInvoiceSettings) this.f171572w, (jy6.h) this.f171574y, continuation, 27);
            case 28:
                return new v0((m0a.k) this.f171573x, (ChatTransferRecipient) this.f171572w, (ChatItem) this.f171574y, continuation, 28);
            default:
                return new v0((mg7.g) this.f171572w, (mg7.u) this.f171574y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x019e  */
    /* JADX WARN: Type inference failed for: r5v42, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar, String str, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 16;
        this.f171573x = bVar;
        this.f171572w = str;
        this.f171574y = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.u = 5;
        this.f171573x = bVar;
        this.f171574y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f171573x = obj2;
        this.f171572w = obj3;
        this.f171574y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f171572w = obj2;
        this.f171574y = obj3;
    }
}
