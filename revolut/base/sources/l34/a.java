package l34;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import e6b.c;
import ft3.h1;
import gim.i;
import jx1.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l3l.s;
import l40.q;
import l40.r;
import l7j.z;
import l97.l0;
import l97.n;
import lhk.r0;
import li5.d;
import lk9.y;
import m64.f;
import nii.m0;
import nii.w;
import v20.j;
import zm3.e;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f191847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f191848x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191847w = obj2;
        this.f191848x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((b) this.f191847w, (h1) this.f191848x, continuation, 0);
            case 1:
                return new a((s) this.f191847w, (String) this.f191848x, continuation, 1);
            case 2:
                return new a((q) this.f191847w, (j) this.f191848x, continuation, 2);
            case 3:
                return new a((q) this.f191847w, (r) this.f191848x, continuation, 3);
            case 4:
                return new a((com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) this.f191847w, (g) this.f191848x, continuation, 4);
            case 5:
                return new a((com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) this.f191848x, continuation, 5);
            case 6:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.b) this.f191847w, (f) this.f191848x, continuation, 6);
            case 7:
                return new a((com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_switch.a) this.f191847w, (c) this.f191848x, continuation, 7);
            case 8:
                return new a((z) this.f191847w, (w) this.f191848x, continuation, 8);
            case 9:
                return new a((z) this.f191847w, (m0) this.f191848x, continuation, 9);
            case 10:
                return new a((z) this.f191847w, (ChargeBreakdown) this.f191848x, continuation, 10);
            case 11:
                return new a((n) this.f191847w, (l0) this.f191848x, continuation, 11);
            case 12:
                a aVar = new a((n) this.f191848x, continuation, 12);
                aVar.f191847w = obj2;
                return aVar;
            case 13:
                return new a((efm.r) this.f191847w, (ukm.q) this.f191848x, continuation, 13);
            case 14:
                return new a((com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) this.f191847w, (String) this.f191848x, continuation, 14);
            case 15:
                return new a((com.revolut.feature_retail_user_declarations.credit_consent.flow.a) this.f191847w, (String) this.f191848x, continuation, 15);
            case 16:
                a aVar2 = new a((lck.f) this.f191848x, continuation, 16);
                aVar2.f191847w = obj2;
                return aVar2;
            case 17:
                a aVar3 = new a((le3.i) this.f191848x, continuation, 17);
                aVar3.f191847w = obj2;
                return aVar3;
            case 18:
                return new a((com.revolut.feature.junior_coparent.impl.ui.invitation.b) this.f191847w, (e) this.f191848x, continuation, 18);
            case 19:
                return new a((com.revolut.feature.junior_coparent.impl.ui.invitation.b) this.f191847w, (zm3.f) this.f191848x, continuation, 19);
            case 20:
                return new a((lfg.e) this.f191847w, (String) this.f191848x, continuation, 20);
            case 21:
                return new a((com.revolut.feature.external_accounts.impl.mandate.update_limits.a) this.f191847w, (String) this.f191848x, continuation, 21);
            case 22:
                return new a((r0) this.f191847w, (PricingPlanSubscription) this.f191848x, continuation, 22);
            case 23:
                return new a((d) this.f191847w, (yh5.c) this.f191848x, continuation, 23);
            case 24:
                a aVar4 = new a((li5.f) this.f191848x, continuation, 24);
                aVar4.f191847w = obj2;
                return aVar4;
            case 25:
                return new a((lic.g) this.f191847w, (kic.f) this.f191848x, continuation, 25);
            case 26:
                return new a((lic.i) this.f191847w, (kic.e) this.f191848x, continuation, 26);
            case 27:
                return new a((y) this.f191847w, (String) this.f191848x, continuation, 27);
            case 28:
                return new a((y) this.f191847w, (zh9.y) this.f191848x, continuation, 28);
            default:
                return new a((y) this.f191847w, (bi9.f) this.f191848x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0655  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l34.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191848x = obj2;
    }
}
