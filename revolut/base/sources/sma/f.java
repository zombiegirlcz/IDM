package sma;

import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import cvf.y;
import ft3.h1;
import gim.i;
import h93.f0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nq.i0;
import oli.l;
import oli.m;
import om4.d0;
import qua.p;
import suf.h;
import t80.j;
import t80.v;
import t9e.w;
import tk6.k;
import tof.a3;
import ts5.n;
import ts6.s0;
import tv4.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f264405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f264406x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f264407y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f264405w = obj2;
        this.f264407y = obj3;
        this.f264406x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((com.revolut.feature.profile.impl.ui.details.email.c) this.f264405w, (String) this.f264406x, (String) this.f264407y, continuation, 0);
            case 1:
                return new f((h) this.f264405w, (bxf.c) this.f264406x, (y) this.f264407y, continuation, 1);
            case 2:
                return new f((com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a) this.f264407y, continuation, 2);
            case 3:
                return new f((com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) this.f264405w, (String) this.f264406x, (String) this.f264407y, continuation, 3);
            case 4:
                f fVar = new f((com.revolut.camerakit.revolut.ui.flow.steps.camera.a) this.f264406x, (dv.b) this.f264407y, continuation, 4);
                fVar.f264405w = obj2;
                return fVar;
            case 5:
                return new f((com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a) this.f264405w, (ChatTransferRecipient) this.f264406x, (kz9.d) this.f264407y, continuation, 5);
            case 6:
                return new f(6, (t24.f) this.f264405w, (h1) this.f264407y, (String) this.f264406x, continuation);
            case 7:
                f fVar2 = new f((t28.e) this.f264407y, (String) this.f264406x, continuation);
                fVar2.f264405w = obj2;
                return fVar2;
            case 8:
                return new f(8, (g) this.f264405w, (Function0) this.f264407y, (String) this.f264406x, continuation);
            case 9:
                return new f((g) this.f264405w, (s63.g) this.f264406x, (f0) this.f264407y, continuation, 9);
            case 10:
                return new f((g) this.f264405w, (f0) this.f264406x, (Function0) this.f264407y, continuation, 10);
            case 11:
                return new f((d0) this.f264405w, (String) this.f264406x, (ArrayList) this.f264407y, continuation, 11);
            case 12:
                return new f((l) this.f264405w, (v) this.f264406x, (j) this.f264407y, continuation, 12);
            case 13:
                return new f(13, (v) this.f264405w, (m) this.f264407y, (String) this.f264406x, continuation);
            case 14:
                return new f((w) this.f264405w, (a3) this.f264406x, (p) this.f264407y, continuation, 14);
            case 15:
                return new f((tb9.g) this.f264406x, (i0) this.f264407y, continuation, 15);
            case 16:
                return new f((com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a) this.f264405w, (PortfolioRecurringOrder) this.f264406x, (k4l.d0) this.f264407y, continuation, 16);
            case 17:
                return new f((com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a) this.f264405w, (b93.f) this.f264406x, (pi3.h) this.f264407y, continuation, 17);
            case 18:
                return new f((th6.d) this.f264405w, (String) this.f264406x, (String) this.f264407y, continuation, 18);
            case 19:
                return new f((tjb.g) this.f264405w, (String) this.f264406x, (String) this.f264407y, continuation, 19);
            case 20:
                f fVar3 = new f((k) this.f264407y, continuation, 20);
                fVar3.f264406x = obj2;
                return fVar3;
            case 21:
                f fVar4 = new f((k) this.f264406x, (sak.c) this.f264407y, continuation, 21);
                fVar4.f264405w = obj2;
                return fVar4;
            case 22:
                return new f((com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a) this.f264405w, (Function0) this.f264406x, (com.revolut.feature.credit_card.autopay.api.models_v3.c) this.f264407y, continuation, 22);
            case 23:
                f fVar5 = new f((tpd.f) this.f264407y, continuation, 23);
                fVar5.f264406x = obj2;
                return fVar5;
            case 24:
                f fVar6 = new f((n) this.f264407y, continuation, 24);
                fVar6.f264406x = obj2;
                return fVar6;
            case 25:
                return new f((s0) this.f264405w, (String) this.f264406x, (NaviCommand) this.f264407y, continuation, 25);
            case 26:
                return new f((com.revolut.feature.widgets.impl.ui.flow.selection.a) this.f264405w, (xsh.e) this.f264406x, (yki.b) this.f264407y, continuation, 26);
            case 27:
                return new f((tub.i) this.f264406x, (tub.a) this.f264407y, continuation, 27);
            case 28:
                return new f((tuj.g) this.f264405w, (String) this.f264406x, (puj.g) this.f264407y, continuation, 28);
            default:
                return new f((o) this.f264406x, this.f264407y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x0579, code lost:
    
        if (r3 != r2) goto L260;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0577  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sma.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264405w = obj2;
        this.f264406x = obj3;
        this.f264407y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264406x = obj2;
        this.f264407y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264407y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t28.e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f264407y = eVar;
        this.f264406x = str;
    }
}
