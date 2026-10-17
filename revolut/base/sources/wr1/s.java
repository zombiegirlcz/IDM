package wr1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import x0f.y;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f299506w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f299506w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s((u) this.f299506w, continuation, 0);
            case 1:
                return new s((wrj.l) this.f299506w, continuation, 1);
            case 2:
                return new s((wsc.d) this.f299506w, continuation, 2);
            case 3:
                return new s((wt4.n) this.f299506w, continuation, 3);
            case 4:
                return new s((wt7.i) this.f299506w, continuation, 4);
            case 5:
                return new s((wtc.e) this.f299506w, continuation, 5);
            case 6:
                return new s((tb4.t) this.f299506w, continuation, 6);
            case 7:
                return new s((com.revolut.feature.workflow.engine.product_closures.screen.a) this.f299506w, continuation, 7);
            case 8:
                return new s((uc.d) this.f299506w, continuation, 8);
            case 9:
                return new s((wv2.n) this.f299506w, continuation, 9);
            case 10:
                return new s((wvl.g) this.f299506w, continuation, 10);
            case 11:
                return new s((wx6.j) this.f299506w, continuation, 11);
            case 12:
                return new s((com.revolut.feature.statements.impl.ui.account.a) this.f299506w, continuation, 12);
            case 13:
                return new s((wyk.b) this.f299506w, continuation, 13);
            case 14:
                return new s((com.revolut.feature.rev_points.impl.ui.points_expiry.home.a) this.f299506w, continuation, 14);
            case 15:
                return new s((wzh.e) this.f299506w, continuation, 15);
            case 16:
                return new s((com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b) this.f299506w, continuation, 16);
            case 17:
                return new s((y) this.f299506w, continuation, 17);
            case 18:
                return new s((x1a.g) this.f299506w, continuation, 18);
            case 19:
                return new s((x22.f) this.f299506w, continuation, 19);
            case 20:
                return new s((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) this.f299506w, continuation, 20);
            case 21:
                return new s((b9k.f) this.f299506w, continuation, 21);
            case 22:
                return new s((x52.d) this.f299506w, continuation, 22);
            case 23:
                return new s((com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) this.f299506w, continuation, 23);
            case 24:
                return new s((x84.q) this.f299506w, continuation, 24);
            case 25:
                return new s((com.revolut.feature.credit.loan.impl.ui.statements.flow.a) this.f299506w, continuation, 25);
            case 26:
                return new s((fn2.c) this.f299506w, continuation, 26);
            case 27:
                return new s((ang.c) this.f299506w, continuation, 27);
            case 28:
                return new s((kka.j) this.f299506w, continuation, 28);
            default:
                return new s((nfb.b) this.f299506w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0666 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:509:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v11 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wr1.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
