package e38;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.terms.api.model.TermsScope;
import dej.z0;
import e4k.c0;
import eg2.n;
import eg2.u;
import ehk.g;
import ej9.e0;
import er9.x;
import et6.h3;
import et6.i2;
import etj.o;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import lhk.z;
import nii.n1;
import nq.i0;
import nq.j0;
import zh9.w0;
import zjh.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f122204w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f122205x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f122206y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b bVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f122204w = bVar;
        this.f122205x = str;
        this.f122206y = (i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((nh7.d) this.f122205x, (f) this.f122206y, continuation, 0);
                cVar.f122204w = obj2;
                return cVar;
            case 1:
                return new c((com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b) this.f122204w, (String) this.f122205x, (Function1) this.f122206y, continuation);
            case 2:
                return new c((j) this.f122204w, (String) this.f122205x, (x35.e) this.f122206y, continuation, 2);
            case 3:
                return new c((j) this.f122205x, (String) this.f122206y, continuation, 3);
            case 4:
                return new c((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.f122204w, (yof.b) this.f122205x, (c0) this.f122206y, continuation, 4);
            case 5:
                return new c((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.f122206y, continuation, 5);
            case 6:
                c cVar2 = new c((com.revolut.feature.global_markets.impl.ui.flow.index_details.b) this.f122206y, continuation, 6);
                cVar2.f122204w = obj2;
                return cVar2;
            case 7:
                c cVar3 = new c((ebk.b) this.f122205x, (sak.j) this.f122206y, continuation, 7);
                cVar3.f122204w = obj2;
                return cVar3;
            case 8:
                return new c((ec9.b) this.f122204w, (String) this.f122205x, (String) this.f122206y, continuation, 8);
            case 9:
                return new c((TermsScope) this.f122205x, (zjh.i) this.f122206y, continuation, 9);
            case 10:
                c cVar4 = new c((List) this.f122205x, (zjh.i) this.f122206y, continuation, 10);
                cVar4.f122204w = obj2;
                return cVar4;
            case 11:
                c cVar5 = new c((u) this.f122205x, (n) this.f122206y, continuation, 11);
                cVar5.f122204w = obj2;
                return cVar5;
            case 12:
                c cVar6 = new c((com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) this.f122206y, continuation, 12);
                cVar6.f122204w = obj2;
                return cVar6;
            case 13:
                c cVar7 = new c((g) this.f122205x, (z) this.f122206y, continuation, 13);
                cVar7.f122204w = obj2;
                return cVar7;
            case 14:
                c cVar8 = new c((z) this.f122206y, continuation, 14);
                cVar8.f122204w = obj2;
                return cVar8;
            case 15:
                return new c((e0) this.f122205x, (w0) this.f122206y, continuation, 15);
            case 16:
                c cVar9 = new c((gpk.c) this.f122205x, (Throwable) this.f122206y, continuation, 16);
                cVar9.f122204w = obj2;
                return cVar9;
            case 17:
                return new c((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) this.f122204w, (String) this.f122205x, (z0) this.f122206y, continuation, 17);
            case 18:
                return new c((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f122204w, (xi0.b) this.f122205x, (l1j.e) this.f122206y, continuation, 18);
            case 19:
                return new c((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f122204w, (xi0.b) this.f122205x, (CryptoAddress) this.f122206y, continuation, 19);
            case 20:
                return new c((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f122204w, (String) this.f122205x, (CryptoAddress) this.f122206y, continuation, 20);
            case 21:
                return new c((x) this.f122204w, (String) this.f122205x, (xi0.b) this.f122206y, continuation, 21);
            case 22:
                return new c((x) this.f122205x, (String) this.f122206y, continuation, 22);
            case 23:
                c cVar10 = new c((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f122205x, (j0) this.f122206y, continuation, 23);
                cVar10.f122204w = obj2;
                return cVar10;
            case 24:
                c cVar11 = new c((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f122205x, (i0) this.f122206y, continuation, 24);
                cVar11.f122204w = obj2;
                return cVar11;
            case 25:
                return new c((com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a) this.f122204w, (CardOwner) this.f122205x, (gpf.a) this.f122206y, continuation, 25);
            case 26:
                c cVar12 = new c((i2) this.f122206y, continuation, 26);
                cVar12.f122204w = obj2;
                return cVar12;
            case 27:
                c cVar13 = new c((h3) this.f122206y, continuation, 27);
                cVar13.f122204w = obj2;
                return cVar13;
            case 28:
                c cVar14 = new c((o) this.f122206y, continuation, 28);
                cVar14.f122204w = obj2;
                return cVar14;
            default:
                c cVar15 = new c((o) this.f122205x, (Subaccount) this.f122206y, continuation, 29);
                cVar15.f122204w = obj2;
                return cVar15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((ur.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:539:0x0b02, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() == false) goto L550;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:598:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:610:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:623:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v15 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e38.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122204w = obj2;
        this.f122205x = obj3;
        this.f122206y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122205x = obj2;
        this.f122206y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122206y = obj2;
    }
}
