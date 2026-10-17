package p40;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pkf.v2;
import q43.o0;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f232800w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f232800w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v((com.revolut.chat.ui.chat_profile.profile_screen.b) this.f232800w, continuation, 0);
            case 1:
                return new v((pea.l) this.f232800w, continuation, 1);
            case 2:
                return new v((com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) this.f232800w, continuation, 2);
            case 3:
                return new v((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e) this.f232800w, continuation, 3);
            case 4:
                return new v((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) this.f232800w, continuation, 4);
            case 5:
                return new v((pj4.k) this.f232800w, continuation, 5);
            case 6:
                return new v((v2) this.f232800w, continuation, 6);
            case 7:
                return new v((pmk.v) this.f232800w, continuation, 7);
            case 8:
                return new v((com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a) this.f232800w, continuation, 8);
            case 9:
                return new v((po8.h) this.f232800w, continuation, 9);
            case 10:
                return new v((pp6.k) this.f232800w, continuation, 10);
            case 11:
                return new v((com.revolut.feature.payments.groups.impl.ui_chat.settings.d) this.f232800w, continuation, 11);
            case 12:
                return new v((pt9.i) this.f232800w, continuation, 12);
            case 13:
                return new v((com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) this.f232800w, continuation, 13);
            case 14:
                return new v((com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) this.f232800w, continuation, 14);
            case 15:
                return new v((o0) this.f232800w, continuation, 15);
            case 16:
                return new v((com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f232800w, continuation, 16);
            case 17:
                return new v((q50.j) this.f232800w, continuation, 17);
            case 18:
                return new v((com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) this.f232800w, continuation, 18);
            case 19:
                return new v((qba.n) this.f232800w, continuation, 19);
            case 20:
                return new v((qg5.c) this.f232800w, continuation, 20);
            case 21:
                return new v((qm8.d) this.f232800w, continuation, 21);
            case 22:
                return new v((com.revolut.feature.payments.air.widget.impl.ui.flow.a) this.f232800w, continuation, 22);
            case 23:
                return new v((qp6.g) this.f232800w, continuation, 23);
            case 24:
                return new v((qu4.u) this.f232800w, continuation, 24);
            case 25:
                return new v((qv4.n) this.f232800w, continuation, 25);
            case 26:
                return new v((com.revolut.feature_retail_user_declarations.email.flow.d) this.f232800w, continuation, 26);
            case 27:
                return new v((rbh.m) this.f232800w, continuation, 27);
            case 28:
                return new v((re2.i) this.f232800w, continuation, 28);
            default:
                return new v((com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b) this.f232800w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:292:0x05ec  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p40.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
