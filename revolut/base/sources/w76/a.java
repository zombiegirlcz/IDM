package w76;

import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import w85.h;
import w8a.j;
import wa4.e;
import wdb.n;
import wf0.u0;
import wff.x;
import wkg.f;
import wlh.k;
import wm3.l;
import wna.t;
import wo2.m;
import wp4.i0;
import wp5.c1;
import wq1.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f295484w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f295484w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((b) this.f295484w, continuation, 0);
            case 1:
                return new a((h) this.f295484w, continuation, 1);
            case 2:
                return new a((j) this.f295484w, continuation, 2);
            case 3:
                return new a((e) this.f295484w, continuation, 3);
            case 4:
                return new a((com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a) this.f295484w, continuation, 4);
            case 5:
                return new a((n) this.f295484w, continuation, 5);
            case 6:
                return new a((u0) this.f295484w, continuation, 6);
            case 7:
                return new a((x) this.f295484w, continuation, 7);
            case 8:
                return new a((d) this.f295484w, continuation, 8);
            case 9:
                return new a((wg2.h) this.f295484w, continuation, 9);
            case 10:
                return new a((com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) this.f295484w, continuation, 10);
            case 11:
                return new a((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.d) this.f295484w, continuation, 11);
            case 12:
                return new a((wh8.b) this.f295484w, continuation, 12);
            case 13:
                return new a((wh8.j) this.f295484w, continuation, 13);
            case 14:
                return new a((c) this.f295484w, continuation, 14);
            case 15:
                return new a((su9.c) this.f295484w, continuation, 15);
            case 16:
                return new a((com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a) this.f295484w, continuation, 16);
            case 17:
                return new a((com.revolut.feature.atm.impl.ui.redesign.v2.map.a) this.f295484w, continuation, 17);
            case 18:
                return new a((f) this.f295484w, continuation, 18);
            case 19:
                return new a((com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a) this.f295484w, continuation, 19);
            case 20:
                return new a((k) this.f295484w, continuation, 20);
            case 21:
                return new a((l) this.f295484w, continuation, 21);
            case 22:
                return new a((wma.f) this.f295484w, continuation, 22);
            case 23:
                return new a((t) this.f295484w, continuation, 23);
            case 24:
                return new a((m) this.f295484w, continuation, 24);
            case 25:
                return new a((com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) this.f295484w, continuation, 25);
            case 26:
                return new a((wol.t) this.f295484w, continuation, 26);
            case 27:
                return new a((i0) this.f295484w, continuation, 27);
            case 28:
                return new a((c1) this.f295484w, continuation, 28);
            default:
                return new a((q) this.f295484w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05cc  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w76.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
