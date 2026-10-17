package mtd;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.k;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mtl.p;
import mu8.l;
import n1g.r;
import n87.q;
import nm9.m;
import o92.h;
import oc9.b0;
import ohb.j;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f208822w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f208822w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((f) this.f208822w, continuation, 0);
            case 1:
                return new e((p) this.f208822w, continuation, 1);
            case 2:
                return new e((l) this.f208822w, continuation, 2);
            case 3:
                return new e((r) this.f208822w, continuation, 3);
            case 4:
                return new e((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f208822w, continuation, 4);
            case 5:
                return new e((n5c.e) this.f208822w, continuation, 5);
            case 6:
                return new e((q) this.f208822w, continuation, 6);
            case 7:
                return new e((n9e.i) this.f208822w, continuation, 7);
            case 8:
                return new e((com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) this.f208822w, continuation, 8);
            case 9:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.f208822w, continuation, 9);
            case 10:
                return new e((nhe.f) this.f208822w, continuation, 10);
            case 11:
                return new e((m) this.f208822w, continuation, 11);
            case 12:
                return new e((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b) this.f208822w, continuation, 12);
            case 13:
                return new e((nsl.i) this.f208822w, continuation, 13);
            case 14:
                return new e((nt4.g) this.f208822w, continuation, 14);
            case 15:
                return new e((com.revolut.feature.second_device_login.impl.ui.flow.a) this.f208822w, continuation, 15);
            case 16:
                return new e((ntf.r) this.f208822w, continuation, 16);
            case 17:
                return new e((com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a) this.f208822w, continuation, 17);
            case 18:
                return new e((o75.i) this.f208822w, continuation, 18);
            case 19:
                return new e((h) this.f208822w, continuation, 19);
            case 20:
                return new e((com.revolut.feature.onboarding.impl.onboarding.plan_selection.a) this.f208822w, continuation, 20);
            case 21:
                return new e((b0) this.f208822w, continuation, 21);
            case 22:
                return new e((oh4.l) this.f208822w, continuation, 22);
            case 23:
                return new e((j) this.f208822w, continuation, 23);
            case 24:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c) this.f208822w, continuation, 24);
            case 25:
                return new e((k) this.f208822w, continuation, 25);
            case 26:
                return new e((opl.d) this.f208822w, continuation, 26);
            case 27:
                return new e((ow6.j) this.f208822w, continuation, 27);
            case 28:
                return new e((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c) this.f208822w, continuation, 28);
            default:
                return new e((com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) this.f208822w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:434:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mtd.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
