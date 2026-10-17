package zr5;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import java.io.File;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zzb.t;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f324596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f324597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324596w = obj2;
        this.f324597x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((vkm.d) this.f324596w, (m) this.f324597x, continuation, 0);
            case 1:
                return new k((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) this.f324596w, (yld.c) this.f324597x, continuation, 1);
            case 2:
                return new k((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) this.f324596w, (String) this.f324597x, continuation, 2);
            case 3:
                k kVar = new k((zt2.c) this.f324597x, continuation, 3);
                kVar.f324596w = obj2;
                return kVar;
            case 4:
                return new k((ztc.f) this.f324596w, (String) this.f324597x, continuation, 4);
            case 5:
                return new k((zue.a) this.f324596w, (String) this.f324597x, continuation, 5);
            case 6:
                return new k((zuh.o) this.f324596w, (WorkflowName) this.f324597x, continuation, 6);
            case 7:
                return new k((zuh.o) this.f324596w, (Map) this.f324597x, continuation, 7);
            case 8:
                return new k((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) this.f324596w, (String) this.f324597x, continuation, 8);
            case 9:
                return new k((zv6.k) this.f324597x, continuation, 9);
            case 10:
                return new k((com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) this.f324597x, continuation, 10);
            case 11:
                return new k((zw5.n) this.f324597x, continuation, 11);
            case 12:
                return new k((cx3.a) this.f324596w, (BackendFlow) this.f324597x, continuation, 12);
            case 13:
                return new k((cx3.a) this.f324596w, (String) this.f324597x, continuation, 13);
            case 14:
                return new k((cx3.a) this.f324596w, (File) this.f324597x, continuation, 14);
            case 15:
                return new k((zx6.o) this.f324596w, (FreelancerInvoiceSettings) this.f324597x, continuation, 15);
            case 16:
                k kVar2 = new k((zy.f) this.f324597x, continuation, 16);
                kVar2.f324596w = obj2;
                return kVar2;
            case 17:
                return new k((zyb.h) this.f324596w, this.f324597x, continuation, 17);
            case 18:
                return new k((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) this.f324596w, (Throwable) this.f324597x, continuation, 18);
            case 19:
                k kVar3 = new k((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) this.f324597x, continuation, 19);
                kVar3.f324596w = obj2;
                return kVar3;
            case 20:
                return new k((t) this.f324596w, (fub.b) this.f324597x, continuation, 20);
            case 21:
                k kVar4 = new k((t) this.f324597x, continuation, 21);
                kVar4.f324596w = obj2;
                return kVar4;
            case 22:
                return new k((com.revolut.feature.statements.impl.ui.documents_hub.a) this.f324596w, (String) this.f324597x, continuation, 22);
            case 23:
                return new k((com.revolut.feature.statements.impl.ui.documents_hub.a) this.f324596w, (wxd.o) this.f324597x, continuation, 23);
            default:
                k kVar5 = new k((com.revolut.feature.topup_screen.impl.google_pay.flow.b) this.f324597x, continuation, 24);
                kVar5.f324596w = obj2;
                return kVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a2  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [xi0.b] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zr5.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324597x = obj2;
    }
}
