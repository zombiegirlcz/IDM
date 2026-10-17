package n8a;

import com.revolut.feature.crypto.tfr.validation.impl.data.models.CounterpartyUpdateData;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestPosition;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nfj.j0;
import nfj.m1;
import nfj.s2;
import nfj.u0;
import nxa.g0;
import nxa.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f213345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f213346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f213347y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f213347y = obj2;
        this.f213346x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r((s) this.f213345w, (String) this.f213346x, (g8a.a) this.f213347y, continuation, 0);
            case 1:
                return new r((s) this.f213345w, (String) this.f213346x, (dj0.d) this.f213347y, continuation, 1);
            case 2:
                r rVar = new r((com.revolut.feature_move_money.impl.topup.a) this.f213347y, continuation, 2);
                rVar.f213346x = obj2;
                return rVar;
            case 3:
                r rVar2 = new r((n97.g) this.f213346x, (n97.k) this.f213347y, continuation, 3);
                rVar2.f213345w = obj2;
                return rVar2;
            case 4:
                return new r((naf.k) this.f213345w, (TransferRequestPosition) this.f213346x, (ej0.b) this.f213347y, continuation, 4);
            case 5:
                r rVar3 = new r((ndh.d) this.f213347y, continuation, 5);
                rVar3.f213346x = obj2;
                return rVar3;
            case 6:
                return new r((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) this.f213345w, (dx4.y) this.f213346x, (e54.p) this.f213347y, continuation, 6);
            case 7:
                return new r((j0) this.f213345w, (String) this.f213346x, (Set) this.f213347y, continuation, 7);
            case 8:
                return new r(8, (u0) this.f213347y, (String) this.f213346x, continuation);
            case 9:
                return new r((m1) this.f213345w, (String) this.f213346x, (dej.m1) this.f213347y, continuation, 9);
            case 10:
                return new r((s2) this.f213346x, (dej.k) this.f213347y, continuation, 10);
            case 11:
                return new r(11, (s2) this.f213347y, (String) this.f213346x, continuation);
            case 12:
                return new r((s2) this.f213345w, (String) this.f213346x, (String) this.f213347y, continuation, 12);
            case 13:
                r rVar4 = new r(13, (ni1.i) this.f213347y, (String) this.f213346x, continuation);
                rVar4.f213345w = obj2;
                return rVar4;
            case 14:
                r rVar5 = new r((String) this.f213346x, (com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a) this.f213347y, continuation, 14);
                rVar5.f213345w = obj2;
                return rVar5;
            case 15:
                r rVar6 = new r(15, (nk.f) this.f213347y, (String) this.f213346x, continuation);
                rVar6.f213345w = obj2;
                return rVar6;
            case 16:
                return new r((nm5.b) this.f213345w, (String) this.f213346x, (CounterpartyUpdateData) this.f213347y, continuation, 16);
            case 17:
                r rVar7 = new r((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) this.f213347y, continuation, 17);
                rVar7.f213346x = obj2;
                return rVar7;
            case 18:
                return new r((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) this.f213345w, (String) this.f213346x, (com.revolut.analytics.ads.model.a) this.f213347y, continuation, 18);
            case 19:
                r rVar8 = new r((nnd.c0) this.f213346x, (List) this.f213347y, continuation, 19);
                rVar8.f213345w = obj2;
                return rVar8;
            case 20:
                return new r((nnf.l) this.f213345w, (dj0.d) this.f213347y, (String) this.f213346x, continuation);
            case 21:
                return new r((nnk.h) this.f213345w, (String) this.f213346x, (PricingPlanTerms) this.f213347y, continuation, 21);
            case 22:
                r rVar9 = new r((Duration) this.f213346x, (Duration) this.f213347y, continuation, 22);
                rVar9.f213345w = obj2;
                return rVar9;
            case 23:
                r rVar10 = new r((nsh.o) this.f213347y, continuation, 23);
                rVar10.f213346x = obj2;
                return rVar10;
            case 24:
                return new r((nv7.l) this.f213345w, (String) this.f213346x, (dl7.a) this.f213347y, continuation, 24);
            case 25:
                return new r((nw9.d) this.f213346x, (jf0.c) this.f213347y, continuation, 25);
            case 26:
                r rVar11 = new r((nx.b) this.f213347y, continuation, 26);
                rVar11.f213346x = obj2;
                return rVar11;
            case 27:
                r rVar12 = new r((nx1.u) this.f213346x, (qx1.g) this.f213347y, continuation, 27);
                rVar12.f213345w = obj2;
                return rVar12;
            case 28:
                return new r((com.revolut.feature.referrals.impl.personalized_tracking.a) this.f213345w, (String) this.f213346x, (pwa.n) this.f213347y, continuation, 28);
            default:
                return new r((com.revolut.feature.referrals.impl.personalized_tracking.a) this.f213345w, (t0) this.f213346x, (g0) this.f213347y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:554:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0231 -> B:113:0x020b). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n8a.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213345w = obj2;
        this.f213346x = obj3;
        this.f213347y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213346x = obj2;
        this.f213347y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213347y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(nnf.l lVar, dj0.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 20;
        this.f213345w = lVar;
        this.f213347y = dVar;
        this.f213346x = str;
    }
}
