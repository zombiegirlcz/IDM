package pnf;

import bw0.m;
import com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import ft3.d1;
import gim.i;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pqg.i0;
import ptf.l;
import pti.u;
import puk.s;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f237753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f237754x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237753w = obj2;
        this.f237754x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((h) this.f237753w, (File) this.f237754x, continuation, 0);
            case 1:
                return new f((com.revolut.feature.wealth.ui.impl.trades.b) this.f237753w, (dfl.e) this.f237754x, continuation, 1);
            case 2:
                return new f((vkm.d) this.f237753w, (po9.a) this.f237754x, continuation, 2);
            case 3:
                return new f((vkm.d) this.f237753w, (po9.b) this.f237754x, continuation, 3);
            case 4:
                return new f((vkm.d) this.f237753w, (po9.c) this.f237754x, continuation, 4);
            case 5:
                return new f((vkm.d) this.f237753w, (po9.d) this.f237754x, continuation, 5);
            case 6:
                f fVar = new f((com.revolut.feature.payments.air.widget.impl.ui.chat.b) this.f237754x, continuation, 6);
                fVar.f237753w = obj2;
                return fVar;
            case 7:
                return new f((com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.a) this.f237753w, (wok.f) this.f237754x, continuation, 7);
            case 8:
                return new f((i0) this.f237753w, (m) this.f237754x, continuation, 8);
            case 9:
                return new f((prg.a) this.f237753w, (String) this.f237754x, continuation, 9);
            case 10:
                return new f((com.revolut.feature.payments.groups.impl.ui_chat.settings.d) this.f237753w, (File) this.f237754x, continuation, 10);
            case 11:
                return new f((com.revolut.feature.widgets.impl.ui.flow.carousel.a) this.f237753w, (xsh.e) this.f237754x, continuation, 11);
            case 12:
                return new f((pt4.h) this.f237753w, (xp3.d) this.f237754x, continuation, 12);
            case 13:
                f fVar2 = new f((com.revolut.feature.rev10_main_screen.impl.ui.a) this.f237754x, continuation, 13);
                fVar2.f237753w = obj2;
                return fVar2;
            case 14:
                return new f((com.revolut.feature.rev10_main_screen.impl.ui.a) this.f237753w, (List) this.f237754x, continuation, 14);
            case 15:
                return new f((com.revolut.feature.rev10_main_screen.impl.ui.a) this.f237753w, (String) this.f237754x, continuation, 15);
            case 16:
                return new f((l) this.f237753w, (String) this.f237754x, continuation, 16);
            case 17:
                return new f((u) this.f237754x, continuation, 17);
            case 18:
                return new f((s) this.f237753w, (String) this.f237754x, continuation, 18);
            case 19:
                return new f((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) this.f237753w, (String) this.f237754x, continuation, 19);
            case 20:
                return new f((d67.u) this.f237753w, (com.revolut.feature.kyc.impl.flow.kyc.a) this.f237754x, continuation, 20);
            case 21:
                return new f((com.revolut.feature.kyc.impl.flow.kyc.a) this.f237753w, (ht8.a) this.f237754x, continuation, 21);
            case 22:
                return new f((com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) this.f237753w, (th1.d) this.f237754x, continuation, 22);
            case 23:
                return new f((com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) this.f237753w, (StreetModeInfo) this.f237754x, continuation, 23);
            case 24:
                return new f((String) this.f237753w, (px1.i) this.f237754x, continuation, 24);
            case 25:
                return new f((pz1.b) this.f237753w, (ApmAcceptMoneyRequest) this.f237754x, continuation, 25);
            case 26:
                return new f((pz4.c) this.f237753w, (d1) this.f237754x, continuation, 26);
            case 27:
                f fVar3 = new f((com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b) this.f237754x, continuation, 27);
                fVar3.f237753w = obj2;
                return fVar3;
            case 28:
                return new f((pzh.c) this.f237753w, (ty0.a) this.f237754x, continuation, 28);
            default:
                return new f((com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f237753w, (s5b.i) this.f237754x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pnf.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237754x = obj2;
    }
}
