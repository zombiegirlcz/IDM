package ga9;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.onboarding.api.onboarding.models.EmailData;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.cards.model.SharedRevolutCard;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f142104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f142105x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(aii.r rVar, com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142105x = rVar;
        this.f142104w = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v((com.revolut.feature.onboarding.impl.onboarding.v) this.f142104w, (EmailData) this.f142105x, continuation, 0);
            case 1:
                return new v((aii.r) this.f142105x, (com.revolut.feature.onboarding.impl.onboarding.v) this.f142104w, continuation, 1);
            case 2:
                return new v((aii.r) this.f142105x, (com.revolut.feature.onboarding.impl.onboarding.v) this.f142104w, continuation, 2);
            case 3:
                return new v((aii.r) this.f142105x, (com.revolut.feature.onboarding.impl.onboarding.v) this.f142104w, continuation, 3);
            case 4:
                return new v((com.revolut.feature.onboarding.impl.onboarding.v) this.f142104w, (mb9.d) this.f142105x, continuation, 4);
            case 5:
                return new v((com.revolut.feature.onboarding.impl.onboarding.v) this.f142104w, (vja.n) this.f142105x, continuation, 5);
            case 6:
                return new v((com.revolut.feature.onboarding.impl.onboarding.v) this.f142104w, continuation, (Function1) this.f142105x);
            case 7:
                return new v((gaf.k) this.f142104w, (gaf.e) this.f142105x, continuation, 7);
            case 8:
                return new v((gah.e) this.f142104w, (d1h.a) this.f142105x, continuation, 8);
            case 9:
                v vVar = new v((gai.b) this.f142105x, continuation, 9);
                vVar.f142104w = obj2;
                return vVar;
            case 10:
                return new v((gb0.f) this.f142104w, (String) this.f142105x, continuation, 10);
            case 11:
                return new v((com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow.a) this.f142104w, (hb4.h) this.f142105x, continuation, 11);
            case 12:
                return new v((gc1.q) this.f142104w, (CardReaderDevice) this.f142105x, continuation, 12);
            case 13:
                return new v((gcd.g) this.f142104w, (String) this.f142105x, continuation, 13);
            case 14:
                return new v((gcg.e0) this.f142104w, (jxf.a) this.f142105x, continuation, 14);
            case 15:
                return new v((gcg.e0) this.f142104w, (lcg.a) this.f142105x, continuation, 15);
            case 16:
                return new v((gck.w) this.f142104w, (String) this.f142105x, continuation, 16);
            case 17:
                return new v((gck.w) this.f142104w, (List) this.f142105x, continuation, 17);
            case 18:
                return new v((gdk.g) this.f142104w, (ProducerScope) this.f142105x, continuation, 18);
            case 19:
                return new v((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.a) this.f142104w, (String) this.f142105x, continuation, 19);
            case 20:
                return new v((gh1.i) this.f142104w, (SharedRevolutCard) this.f142105x, continuation, 20);
            case 21:
                return new v((gh3.l) this.f142104w, (String) this.f142105x, continuation, 21);
            case 22:
                v vVar2 = new v((com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) this.f142105x, continuation, 22);
                vVar2.f142104w = obj2;
                return vVar2;
            case 23:
                return new v((com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) this.f142104w, (ty0.a) this.f142105x, continuation, 23);
            case 24:
                return new v((com.revolut.feature.apm.wero.impl.ui.pay.b) this.f142104w, (String) this.f142105x, continuation, 24);
            case 25:
                return new v((gjh.e) this.f142104w, (WealthAccount) this.f142105x, continuation, 25);
            case 26:
                return new v((gk5.a) this.f142104w, (qj5.b) this.f142105x, continuation, 26);
            case 27:
                return new v((gkk.k) this.f142104w, (TermsScope) this.f142105x, continuation, 27);
            case 28:
                return new v((gkk.k) this.f142104w, (ggk.a) this.f142105x, continuation, 28);
            default:
                return new v((bld.i) this.f142104w, (gld.f0) this.f142105x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:462:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v10, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga9.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.u = 6;
        this.f142105x = (gim.i) function1;
        this.f142104w = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142104w = obj2;
        this.f142105x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142105x = obj2;
    }
}
