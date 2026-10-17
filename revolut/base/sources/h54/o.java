package h54;

import android.print.PrintDocumentAdapter;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.junior_coparent.api.models.InvitationAcceptanceResponse;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import h93.l0;
import h93.y0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f149486x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f149485w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.f149485w, (Ref$BooleanRef) this.f149486x, continuation, 0);
            case 1:
                o oVar = new o((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.f149485w, continuation);
                oVar.f149486x = obj2;
                return oVar;
            case 2:
                return new o((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.f149485w, (ks8.i) this.f149486x, continuation, 2);
            case 3:
                o oVar2 = new o((h66.e) this.f149486x, continuation, 3);
                oVar2.f149485w = obj2;
                return oVar2;
            case 4:
                return new o((com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card.a) this.f149485w, (e6b.c) this.f149486x, continuation, 4);
            case 5:
                return new o((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b) this.f149485w, (e54.p) this.f149486x, continuation, 5);
            case 6:
                return new o((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b) this.f149485w, (b74.i) this.f149486x, continuation, 6);
            case 7:
                return new o((h87.l) this.f149485w, (h87.f) this.f149486x, continuation, 7);
            case 8:
                return new o((h96.j) this.f149485w, (PrintDocumentAdapter) this.f149486x, continuation, 8);
            case 9:
                return new o((h9f.b) this.f149485w, (String) this.f149486x, continuation, 9);
            case 10:
                return new o((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.b) this.f149485w, (Throwable) this.f149486x, continuation, 10);
            case 11:
                return new o((ha3.x) this.f149485w, (l0) this.f149486x, continuation, 11);
            case 12:
                return new o((ha3.x) this.f149485w, (a7l.a) this.f149486x, continuation, 12);
            case 13:
                return new o((ha3.x) this.f149485w, (List) this.f149486x, continuation, 13);
            case 14:
                return new o((ha3.x) this.f149485w, (y0) this.f149486x, continuation, 14);
            case 15:
                return new o((hba.l) this.f149485w, (rp0.y) this.f149486x, continuation, 15);
            case 16:
                return new o((hbb.b) this.f149485w, (rn0.b) this.f149486x, continuation, 16);
            case 17:
                return new o((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) this.f149485w, (nii.y0) this.f149486x, continuation, 17);
            case 18:
                return new o((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) this.f149485w, (rei.g) this.f149486x, continuation, 18);
            case 19:
                return new o((com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d) this.f149485w, (String) this.f149486x, continuation, 19);
            case 20:
                return new o((com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a) this.f149485w, (InvitationAcceptanceResponse) this.f149486x, continuation, 20);
            case 21:
                o oVar3 = new o((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f149486x, continuation, 21);
                oVar3.f149485w = obj2;
                return oVar3;
            case 22:
                return new o((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f149485w, (String) this.f149486x, continuation, 22);
            case 23:
                return new o((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f149485w, (io3.d) this.f149486x, continuation, 23);
            case 24:
                return new o((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f149485w, (mn2.a) this.f149486x, continuation, 24);
            case 25:
                return new o((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f149485w, (CheckoutParams) this.f149486x, continuation, 25);
            case 26:
                return new o((com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) this.f149485w, (TransferArrivalRequest) this.f149486x, continuation, 26);
            case 27:
                return new o((hf6.i) this.f149485w, (x61.g) this.f149486x, continuation, 27);
            case 28:
                return new o((hf6.i) this.f149485w, (String) this.f149486x, continuation, 28);
            default:
                return new o((com.revolut.feature.retail.reverywhere.impl.onboarding.a) this.f149485w, (List) this.f149486x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((c84.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                if (obj2 == null) {
                    return ((o) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                }
                throw new ClassCastException();
            case 4:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((o) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v0, types: [ft3.z0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h54.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149485w = obj2;
        this.f149486x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(oki.h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149486x = hVar;
    }
}
