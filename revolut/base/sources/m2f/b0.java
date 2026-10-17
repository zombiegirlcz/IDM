package m2f;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.io.File;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m8d.h0;
import mhd.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f201963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f201964x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f201963w = obj2;
        this.f201964x = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v37, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0((com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) this.f201964x, continuation, 0);
                b0Var.f201963w = obj2;
                return b0Var;
            case 1:
                return new b0((m4c.h) this.f201963w, (String) this.f201964x, continuation, 1);
            case 2:
                return new b0((m50.k) this.f201963w, (UUID) this.f201964x, continuation, 2);
            case 3:
                return new b0((m50.k) this.f201963w, (e60.i) this.f201964x, continuation, 3);
            case 4:
                return new b0((m50.l) this.f201963w, (v30.c0) this.f201964x, continuation, 4);
            case 5:
                return new b0((com.revolut.feature.joint.impl.ui.withdraw.b) this.f201963w, (AccountId) this.f201964x, continuation, 5);
            case 6:
                return new b0((m75.j) this.f201963w, (n75.c) this.f201964x, continuation, 6);
            case 7:
                return new b0((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.c) this.f201963w, (String) this.f201964x, continuation, 7);
            case 8:
                return new b0((com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.a) this.f201963w, (oc4.f) this.f201964x, continuation, 8);
            case 9:
                return new b0((m8c.q) this.f201963w, (String) this.f201964x, continuation, 9);
            case 10:
                b0 b0Var2 = new b0((h0) this.f201964x, continuation, 10);
                b0Var2.f201963w = obj2;
                return b0Var2;
            case 11:
                return new b0((h0) this.f201963w, (String) this.f201964x, continuation, 11);
            case 12:
                b0 b0Var3 = new b0((m98.p) this.f201964x, continuation, 12);
                b0Var3.f201963w = obj2;
                return b0Var3;
            case 13:
                b0 b0Var4 = new b0((mb2.b) this.f201964x, continuation, 13);
                b0Var4.f201963w = obj2;
                return b0Var4;
            case 14:
                return new b0((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a) this.f201963w, (File) this.f201964x, continuation, 14);
            case 15:
                return new b0((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a) this.f201963w, (yki.l) this.f201964x, continuation, 15);
            case 16:
                b0 b0Var5 = new b0((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d) this.f201964x, continuation, 16);
                b0Var5.f201963w = obj2;
                return b0Var5;
            case 17:
                return new b0((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d) this.f201963w, (String) this.f201964x, continuation, 17);
            case 18:
                return new b0((md8.q) this.f201963w, (Function1) this.f201964x, continuation);
            case 19:
                return new b0((mek.g) this.f201963w, (com.revolut.retail.feature.pod_nominees.impl.edit.d) this.f201964x, continuation, 19);
            case 20:
                return new b0((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) this.f201963w, (pf4.n) this.f201964x, continuation, 20);
            case 21:
                return new b0((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) this.f201963w, (oc4.f) this.f201964x, continuation, 21);
            case 22:
                b0 b0Var6 = new b0((mfl.o) this.f201964x, continuation, 22);
                b0Var6.f201963w = obj2;
                return b0Var6;
            case 23:
                return new b0((mfl.o) this.f201963w, (wbl.j) this.f201964x, continuation, 23);
            case 24:
                return new b0((mg2.p) this.f201963w, (Long) this.f201964x, continuation, 24);
            case 25:
                return new b0((mg2.p) this.f201964x, continuation, 25);
            case 26:
                return new b0((mg7.u) this.f201963w, (mg7.g) this.f201964x, continuation, 26);
            case 27:
                b0 b0Var7 = new b0((mg7.u) this.f201964x, continuation, 27);
                b0Var7.f201963w = obj2;
                return b0Var7;
            case 28:
                return new b0((q0) this.f201963w, (WatchlistItem) this.f201964x, continuation, 28);
            default:
                return new b0((q0) this.f201963w, (gfd.e) this.f201964x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:459:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Type inference failed for: r12v19, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2f.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f201964x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(md8.q qVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 18;
        this.f201963w = qVar;
        this.f201964x = (gim.i) function1;
    }
}
