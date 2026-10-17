package gvc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f147136w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f147136w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((com.revolut.feature.security_hub.impl.ui.secure_account.a) this.f147136w, continuation, 0);
            case 1:
                return new m((com.revolut.feature.topup_screen.impl.flow.init_top_up.a) this.f147136w, continuation, 1);
            case 2:
                return new m((h07.j) this.f147136w, continuation, 2);
            case 3:
                return new m((com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b) this.f147136w, continuation, 3);
            case 4:
                return new m((com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a) this.f147136w, continuation, 4);
            case 5:
                return new m((com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a) this.f147136w, continuation, 5);
            case 6:
                return new m((h5b.m) this.f147136w, continuation, 6);
            case 7:
                return new m((h64.c) this.f147136w, continuation, 7);
            case 8:
                return new m((h66.e) this.f147136w, continuation, 8);
            case 9:
                return new m((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.b) this.f147136w, continuation, 9);
            case 10:
                return new m((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.b) this.f147136w, continuation, 10);
            case 11:
                return new m((com.revolut.feature.wealth.impl.ui.flows.add_money.b) this.f147136w, continuation, 11);
            case 12:
                return new m((hde.c) this.f147136w, continuation, 12);
            case 13:
                return new m((hde.f) this.f147136w, continuation, 13);
            case 14:
                return new m((hg4.u) this.f147136w, continuation, 14);
            case 15:
                return new m((hg9.m) this.f147136w, continuation, 15);
            case 16:
                return new m((com.revolut.feature.shared_separate_favourites.converter.ui.flow.b) this.f147136w, continuation, 16);
            case 17:
                return new m((com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b) this.f147136w, continuation, 17);
            case 18:
                return new m((hh6.p) this.f147136w, continuation, 18);
            case 19:
                return new m((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) this.f147136w, continuation, 19);
            case 20:
                return new m((hi2.n) this.f147136w, continuation, 20);
            case 21:
                return new m((com.revolut.feature.shops.impl.flow.checkout.b) this.f147136w, continuation, 21);
            case 22:
                return new m((com.revolut.sso.impl.ui.consent.qr.b) this.f147136w, continuation, 22);
            case 23:
                return new m((hp2.j) this.f147136w, continuation, 23);
            case 24:
                return new m((hq1.g) this.f147136w, continuation, 24);
            case 25:
                return new m((hs4.o) this.f147136w, continuation, 25);
            case 26:
                return new m((htf.r) this.f147136w, continuation, 26);
            case 27:
                return new m((com.revolut.feature.security_hub.impl.ui.flow.m) this.f147136w, continuation, 27);
            case 28:
                return new m((hw1.u) this.f147136w, continuation, 28);
            default:
                return new m((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) this.f147136w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gvc.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
