package cpb;

import d6j.n0;
import daa.m;
import db.i0;
import do2.q;
import e65.v;
import e8e.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f107920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f107920w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((k) this.f107920w, continuation, 0);
            case 1:
                return new j((crg.h) this.f107920w, continuation, 1);
            case 2:
                return new j((d2c.j) this.f107920w, continuation, 2);
            case 3:
                return new j((com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) this.f107920w, continuation, 3);
            case 4:
                return new j((n0) this.f107920w, continuation, 4);
            case 5:
                return new j((d6k.g) this.f107920w, continuation, 5);
            case 6:
                return new j((com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a) this.f107920w, continuation, 6);
            case 7:
                return new j((m) this.f107920w, continuation, 7);
            case 8:
                return new j((i0) this.f107920w, continuation, 8);
            case 9:
                return new j((com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.b) this.f107920w, continuation, 9);
            case 10:
                return new j((df4.g) this.f107920w, continuation, 10);
            case 11:
                return new j((com.revolut.feature.junior_onboarding.impl.ui.onboarding.b) this.f107920w, continuation, 11);
            case 12:
                return new j((dj8.c) this.f107920w, continuation, 12);
            case 13:
                return new j((q) this.f107920w, continuation, 13);
            case 14:
                return new j((ds2.i) this.f107920w, continuation, 14);
            case 15:
                return new j((com.revolut.feature.credit.card.impl.ui.instalment.hub.a) this.f107920w, continuation, 15);
            case 16:
                return new j((com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a) this.f107920w, continuation, 16);
            case 17:
                return new j((e07.j) this.f107920w, continuation, 17);
            case 18:
                return new j((e0a.i) this.f107920w, continuation, 18);
            case 19:
                return new j((e0c.a) this.f107920w, continuation, 19);
            case 20:
                return new j((e0c.a) this.f107920w, continuation, 20);
            case 21:
                return new j((e0c.a) this.f107920w, continuation, 21);
            case 22:
                return new j((e0c.a) this.f107920w, continuation, 22);
            case 23:
                return new j((e0c.a) this.f107920w, continuation, 23);
            case 24:
                return new j((com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) this.f107920w, continuation, 24);
            case 25:
                return new j((e2l.g) this.f107920w, continuation, 25);
            case 26:
                return new j((com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c) this.f107920w, continuation, 26);
            case 27:
                return new j((v) this.f107920w, continuation, 27);
            case 28:
                return new j((com.revolut.feature.giro.impl.ui.review.a) this.f107920w, continuation, 28);
            default:
                return new j((x) this.f107920w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0787  */
    /* JADX WARN: Type inference failed for: r0v130, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v59, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cpb.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
