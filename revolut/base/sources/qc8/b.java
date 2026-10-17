package qc8;

import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreen;
import gim.i;
import jul.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import om4.d0;
import qcc.m;
import qgd.f;
import qh2.h;
import qh4.b0;
import qk2.g;
import ql9.d;
import qmg.l;
import qq4.e;
import qv4.n;
import qxd.k;
import r0a.y;
import r78.c;
import r84.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f244607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244607w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((o) this.f244607w, continuation, 0);
            case 1:
                return new b((m) this.f244607w, continuation, 1);
            case 2:
                return new b((com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.a) this.f244607w, continuation, 2);
            case 3:
                return new b((com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a) this.f244607w, continuation, 3);
            case 4:
                return new b((f) this.f244607w, continuation, 4);
            case 5:
                return new b((h) this.f244607w, continuation, 5);
            case 6:
                return new b((b0) this.f244607w, continuation, 6);
            case 7:
                return new b((com.revolut.feature.pay_later.impl.ui.help.a) this.f244607w, continuation, 7);
            case 8:
                return new b((g) this.f244607w, continuation, 8);
            case 9:
                return new b((d) this.f244607w, continuation, 9);
            case 10:
                return new b((qm8.d) this.f244607w, continuation, 10);
            case 11:
                return new b((l) this.f244607w, continuation, 11);
            case 12:
                return new b((qp6.g) this.f244607w, continuation, 12);
            case 13:
                return new b((com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a) this.f244607w, continuation, 13);
            case 14:
                return new b((e) this.f244607w, continuation, 14);
            case 15:
                return new b((n) this.f244607w, continuation, 15);
            case 16:
                return new b((qvh.g) this.f244607w, continuation, 16);
            case 17:
                return new b((k) this.f244607w, continuation, 17);
            case 18:
                return new b((qz9.n) this.f244607w, continuation, 18);
            case 19:
                return new b((y) this.f244607w, continuation, 19);
            case 20:
                return new b((r0e.m) this.f244607w, continuation, 20);
            case 21:
                return new b((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) this.f244607w, continuation, 21);
            case 22:
                b bVar = new b((PayoutScenarioScreen) this.f244607w, continuation, 22);
                bVar.v = ((Number) obj2).intValue();
                return bVar;
            case 23:
                return new b((r6d.g) this.f244607w, continuation, 23);
            case 24:
                return new b((c) this.f244607w, continuation, 24);
            case 25:
                return new b((j) this.f244607w, continuation, 25);
            case 26:
                return new b((com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b) this.f244607w, continuation, 26);
            case 27:
                return new b((d0) this.f244607w, continuation, 27);
            case 28:
                return new b((rb6.m) this.f244607w, continuation, 28);
            default:
                return new b((rbg.j) this.f244607w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 22:
                break;
        }
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qc8.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
