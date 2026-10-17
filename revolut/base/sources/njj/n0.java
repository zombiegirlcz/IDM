package njj;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f216581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f216582x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i, Continuation continuation, yji.l lVar) {
        super(2, continuation);
        this.u = i;
        this.f216582x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n0((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) this.f216581w, (String) this.f216582x, continuation, 0);
            case 1:
                n0 n0Var = new n0((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) this.f216581w, continuation);
                n0Var.f216582x = obj2;
                return n0Var;
            case 2:
                return new n0(2, continuation, (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) this.f216582x);
            case 3:
                n0 n0Var2 = new n0(3, continuation, (nk2.d) this.f216582x);
                n0Var2.f216581w = obj2;
                return n0Var2;
            case 4:
                return new n0((kl.c0) this.f216581w, (String) this.f216582x, continuation, 4);
            case 5:
                return new n0((nm5.b) this.f216581w, (String) this.f216582x, continuation, 5);
            case 6:
                return new n0((nm6.j) this.f216581w, (String) this.f216582x, continuation, 6);
            case 7:
                n0 n0Var3 = new n0(7, continuation, (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) this.f216582x);
                n0Var3.f216581w = obj2;
                return n0Var3;
            case 8:
                return new n0((com.revolut.feature.contacts_chooser.impl.ui.a) this.f216581w, (List) this.f216582x, continuation, 8);
            case 9:
                return new n0((com.revolut.feature.contacts_chooser.impl.ui.a) this.f216581w, (ty0.a) this.f216582x, continuation, 9);
            case 10:
                return new n0((nnd.i0) this.f216581w, (nnd.i) this.f216582x, continuation, 10);
            case 11:
                return new n0((nnd.i0) this.f216581w, (AnalyticsAccountsSelection) this.f216582x, continuation, 11);
            case 12:
                return new n0((com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c) this.f216581w, (dej.y) this.f216582x, continuation, 12);
            case 13:
                return new n0((nob.i) this.f216581w, (hpg.j) this.f216582x, continuation, 13);
            case 14:
                n0 n0Var4 = new n0(14, continuation, (noe.k) this.f216582x);
                n0Var4.f216581w = obj2;
                return n0Var4;
            case 15:
                return new n0((PopupMenuItem) this.f216581w, (nsh.o) this.f216582x, continuation, 15);
            case 16:
                return new n0((nsh.o) this.f216581w, (tw0.m0) this.f216582x, continuation, 16);
            case 17:
                return new n0((nsh.o) this.f216581w, (nsh.a) this.f216582x, continuation, 17);
            case 18:
                return new n0((com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) this.f216581w, (nt9.h) this.f216582x, continuation, 18);
            case 19:
                return new n0((com.revolut.feature.second_device_login.impl.ui.flow.a) this.f216581w, (yki.l) this.f216582x, continuation, 19);
            case 20:
                return new n0((com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) this.f216581w, (a3) this.f216582x, continuation, 20);
            case 21:
                return new n0((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) this.f216581w, (lui.e) this.f216582x, continuation, 21);
            case 22:
                return new n0((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) this.f216581w, (String) this.f216582x, continuation, 22);
            case 23:
                return new n0((com.revolut.feature.credit.card.impl.ui.statement.export.b) this.f216581w, (LocalDate) this.f216582x, continuation, 23);
            case 24:
                return new n0((nv7.l) this.f216581w, (String) this.f216582x, continuation, 24);
            case 25:
                return new n0((String) this.f216582x, (nx1.u) this.f216581w, continuation);
            case 26:
                return new n0((til.r) this.f216581w, (com.revolut.feature.card_design.impl.card_design.d) this.f216582x, continuation, 26);
            case 27:
                return new n0((com.revolut.feature.referrals.impl.personalized_tracking.a) this.f216581w, (String) this.f216582x, continuation, 27);
            case 28:
                return new n0((com.revolut.feature.referrals.impl.personalized_tracking.a) this.f216581w, (ty0.a) this.f216582x, continuation, 28);
            default:
                return new n0((ny4.k) this.f216581w, (String) this.f216582x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0794  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f216581w = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f216581w = obj2;
        this.f216582x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(String str, nx1.u uVar, Continuation continuation) {
        super(2, continuation);
        this.u = 25;
        this.f216582x = str;
        this.f216581w = uVar;
    }
}
